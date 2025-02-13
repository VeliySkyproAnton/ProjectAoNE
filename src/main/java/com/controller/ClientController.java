package com.controller;

import com.entity.Client;
import com.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<?> registerClient(@Valid @RequestBody Client client) {
        return ResponseEntity.ok(clientService.registerClient(client));
    }

@GetMapping
    public ResponseEntity<Client> findClientById(@PathVariable Long id) {
        Client client = clientService.findClientById(id);
    if (client != null) {
        return ResponseEntity.ok(client);
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

@GetMapping
public ResponseEntity<List<Client>> findAllClients() {
    return ResponseEntity.ok(clientService.findAllClients());
}
}