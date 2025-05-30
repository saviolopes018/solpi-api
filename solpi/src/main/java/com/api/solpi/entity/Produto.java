package com.api.solpi.entity;

import com.api.solpi.record.ProdutoDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nomeProduto;
    private String fornecedorId;

    public Produto(ProdutoDTO produto) {
        this.id = produto.id();
        this.nomeProduto = produto.nomeProduto();
        this.fornecedorId = produto.fornecedorId();
    }

    public Produto() {}

    public UUID getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getFornecedorId() {
        return fornecedorId;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setFornecedorId(String fornecedorId) {
        this.fornecedorId = fornecedorId;
    }
}
