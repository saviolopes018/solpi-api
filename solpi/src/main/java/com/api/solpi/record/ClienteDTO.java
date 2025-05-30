package com.api.solpi.record;

import com.api.solpi.entity.Cliente;

import java.util.UUID;

public record ClienteDTO(UUID id,
                         String cnpj,
                         String razaoSocial,
                         String endereco,
                         String responsavel,
                         String telefone,
                         String email) {

    public static ClienteDTO fromEntity(Cliente cliente) {
        return new ClienteDTO(cliente.getId(), cliente.getCnpj(), cliente.getRazaoSocial(), cliente.getEndereco(),
                cliente.getResponsavel(), cliente.getTelefone(), cliente.getEmail());
    }
}
