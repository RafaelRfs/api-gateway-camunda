package com.app.rfs.camunda.api_gateway.utils;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.apache.tomcat.util.codec.binary.Base64;
import com.app.rfs.camunda.api_gateway.constants.Assets;

public class HelpersUtils {
    private HelpersUtils() {}
    public static String encodeBase64(String hash) {
        byte[] byteArray =  Base64.encodeBase64(hash.getBytes(StandardCharsets.UTF_8));
        return new String(byteArray);
    }

    public static Map<String, String> decodeBase64(String hash){
        Map<String,String> ret = new HashMap<String, String>();
        byte[] bit = Base64.decodeBase64(hash.getBytes(StandardCharsets.UTF_8));
        String rc =  new String(bit, StandardCharsets.UTF_8);
        String[] hashrec = rc.split(Assets.DELIMITER_TOKEN);
        ret.put(Assets.TIPO, hashrec[0]);
        ret.put(Assets.NOME, hashrec[1]);
        ret.put(Assets.SOBRENOME, hashrec[2]);
        ret.put(Assets.ID, hashrec[3]);
        return ret;
    }
}