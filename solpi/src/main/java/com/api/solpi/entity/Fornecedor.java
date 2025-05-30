package com.api.solpi.entity;

import com.api.solpi.record.FornecedorDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String razaoSocial;
    private String endereco;
    private String responsavel;
    private String telefone;
    private String email;

    public Fornecedor(FornecedorDTO fornecedor) {
        this.id = fornecedor.id();
        this.razaoSocial = fornecedor.razaoSocial();
        this.endereco = fornecedor.endereco();
        this.responsavel = fornecedor.responsavel();
        this.telefone = fornecedor.telefone();
        this.email = fornecedor.email();
    }

    public Fornecedor() {}

    public UUID getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
