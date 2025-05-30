package com.api.solpi.services;

import com.api.solpi.entity.Cliente;
import com.api.solpi.record.ClienteDTO;
import com.api.solpi.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteDTO create(ClienteDTO cliente) {
        Cliente clienteEntity = new Cliente(cliente);

        clienteEntity = clienteRepository.save(clienteEntity);

        return ClienteDTO.fromEntity(clienteEntity);
    }

    public List<ClienteDTO> getAll() {
        List<Cliente> clienteEntity = this.clienteRepository.findAll();
        return clienteEntity.stream().map(ClienteDTO::fromEntity).toList();
    }

    public ClienteDTO getById(UUID id) {
        Cliente clienteEntity = this.clienteRepository.getReferenceById(id);
        return ClienteDTO.fromEntity(clienteEntity);
    }

    public void update(ClienteDTO cliente){
        this.clienteRepository.saveAndFlush(new Cliente(cliente));
    }

    public void delete(UUID id){
        this.clienteRepository.deleteById(id);
    }

}
