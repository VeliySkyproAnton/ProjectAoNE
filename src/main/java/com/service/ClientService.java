package com.service;

import com.entity.Client;
import com.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client registerClient(Client client) {
        return clientRepository.save(client);
    }

    public Client findClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
