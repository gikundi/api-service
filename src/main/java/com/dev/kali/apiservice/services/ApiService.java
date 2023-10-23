package com.dev.kali.apiservice.services;

import com.dev.kali.apiservice.dtos.ProtocolsResponse;
import com.dev.kali.apiservice.models.Protocols;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public ProtocolsResponse retrieveSupportedProtocols (){

        ProtocolsResponse protocolsResponse = new ProtocolsResponse();

        Protocols protocols = new Protocols();
        protocols.setName("HTTP");
        protocols.setDescription("HTTP Protocol");


        protocolsResponse.setStatus("Success");
        protocolsResponse.setData(protocols);

        return protocolsResponse;




    }
}
