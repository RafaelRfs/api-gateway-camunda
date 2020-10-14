package com.app.rfs.camunda.api_gateway.config.jwtutil;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.app.rfs.camunda.api_gateway.constants.Assets;
import com.app.rfs.camunda.api_gateway.domain.Users;
import com.app.rfs.camunda.api_gateway.utils.HelpersUtils;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Component
@Slf4j
public class JwtRequestFilter extends OncePerRequestFilter {
	private JwtUtil jwtUtil;

	private Integer returnInt(String vl) {
		Integer val = -999;
		try {
			val = null == vl ? -999 : Integer.parseInt(vl.trim());
		} catch (Exception e) {
			log.error("ERROR {}", e);
		}
		return val;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		final String authorizationHeader = request.getHeader("Authorization");
		String username = null;
		String jwt = null;
		Claims claims = null;
		Users usr = null;
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			jwt = authorizationHeader.substring(7);
			claims = jwtUtil.extractAllClaims(jwt);
			username = jwtUtil.extractUsername(jwt);
		}

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			if (jwtUtil.isTokenExpired(jwt)) {
				throw new IOException("Token expirado ");
			}
			List<LinkedHashMap<String, String>> levels = (List<LinkedHashMap<String, String>>) claims.get("Level",
					List.class);
			usr = new Users();
			usr.setEmail(username);
			usr.setSenha("");
			String hash = levels.get(0).get("authority");
			Map<String, String> dataToken = HelpersUtils.decodeBase64(hash);
			usr.setId(returnInt(dataToken.get(Assets.ID)));
			usr.setTipo(returnInt(dataToken.get(Assets.TIPO)));
			usr.setNome(dataToken.get(Assets.NOME));
			usr.setSobrenome(dataToken.get(Assets.SOBRENOME));
			Authentication auth = new UsernamePasswordAuthenticationToken(usr.getEmail(), jwt);
			Set authorities = new HashSet<>();
			authorities.add(new SimpleGrantedAuthority(usr.getTipo().toString()));
			authorities.add(new SimpleGrantedAuthority(usr.getId().toString()));
			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
					new UsernamePasswordAuthenticationToken(
					auth.getName(), auth.getCredentials(), authorities);
			usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
			SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
		}
		chain.doFilter(request, response);
	}

}