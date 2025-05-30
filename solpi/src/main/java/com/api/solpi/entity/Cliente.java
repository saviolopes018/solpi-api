package com.api.solpi.entity;

import com.api.solpi.record.ClienteDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String cnpj;
    private String razaoSocial;
    private String endereco;
    private String responsavel;
    private String telefone;
    private String email;

    public Cliente(ClienteDTO cliente) {
        this.id = cliente.id();
        this.cnpj = cliente.cnpj();
        this.razaoSocial = cliente.razaoSocial();
        this.endereco = cliente.endereco();
        this.responsavel = cliente.responsavel();
        this.telefone = cliente.telefone();
        this.email = cliente.email();
    }

    public Cliente() {}

    public UUID getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
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

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
