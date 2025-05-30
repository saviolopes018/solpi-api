package com.api.solpi.record;

import com.api.solpi.entity.Fornecedor;

import java.util.UUID;

public record FornecedorDTO(UUID id,
                            String razaoSocial,
                            String endereco,
                            String responsavel,
                            String telefone,
                            String email) {

    public static FornecedorDTO fromEntity(Fornecedor fornecedor) {
        return new FornecedorDTO(fornecedor.getId(), fornecedor.getRazaoSocial(), fornecedor.getEndereco(),
                fornecedor.getResponsavel(), fornecedor.getTelefone(), fornecedor.getEmail());
    }
}
