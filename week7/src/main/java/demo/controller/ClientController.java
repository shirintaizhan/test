package com.shop.demo.controller;

import com.shop.demo.model.Client;;
import com.shop.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.String;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
   ClientRepository ClientRepository;

    @PostMapping("/Client/save")
    public Client saveClient(@RequestBody Client client){

        ClientRepository.save(client);

        return client;

    }

    @GetMapping("/client/{clientId}/view")
    public String view (@PathVariable("clientId") int clientId){

        Optional<Client> client = ClientRepository.findById(clientId);

        return  client.toString();

    }

    @PutMapping("/Client/update")

    public String updateClient(@RequestBody Client client){

        ClientRepository.save(client);

        return "updated";

    }

    @GetMapping ("/client/list")
    public String list (){

        List<Client> list =ClientRepository.findAll();

        return list.toString();

    }

    @DeleteMapping("/Client/{ClientId}/delete")
    public String deleteClient(@PathVariable("ClientId") int ClientId){

        ClientRepository.deleteById(ClientId);

        return "Successful deleted!";

    }

}
