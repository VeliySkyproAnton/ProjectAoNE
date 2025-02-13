package com.controller;

import com.entity.Client;
import com.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;



public class ClientController {
    @Autowired
    private ClientService clientService;

    public ResponseEntity<?> registerClient(Client client) {
        return ResponseEntity.ok(clientService.registerClient(Client));

    }
}
