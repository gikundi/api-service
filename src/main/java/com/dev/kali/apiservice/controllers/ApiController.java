package com.dev.kali.apiservice.controllers;

import com.dev.kali.apiservice.dtos.ProtocolsResponse;
import com.dev.kali.apiservice.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
public class ApiController {
    @Autowired
    ApiService apiService;

    @GetMapping(value = "/supported/protocols", produces = { "application/json" })
    public ProtocolsResponse supportedProtocols() {
        return apiService.retrieveSupportedProtocols();
    }


}
