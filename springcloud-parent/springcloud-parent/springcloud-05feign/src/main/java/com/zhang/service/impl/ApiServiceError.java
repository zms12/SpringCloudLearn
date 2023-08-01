package com.zhang.service.impl;

import com.zhang.service.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "发生故障";
    }
}
