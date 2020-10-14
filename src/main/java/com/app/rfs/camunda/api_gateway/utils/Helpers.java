package com.app.rfs.camunda.api_gateway.utils;


import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Helpers {

    public long convertToLong(Object val){
        return null == val ? 0l : (long) val;
    }

    public boolean validateStringNullOrEmpty(String val){
        return null != val && !val.trim().isEmpty();
    }
   
}

