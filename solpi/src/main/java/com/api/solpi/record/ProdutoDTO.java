package com.api.solpi.record;

import com.api.solpi.entity.Produto;

import java.util.UUID;

public record ProdutoDTO(UUID id, String nomeProduto, String fornecedorId) {

    public static ProdutoDTO fromEntity(Produto produto) {
        return new ProdutoDTO(produto.getId(), produto.getNomeProduto(), produto.getFornecedorId());
    }

}
