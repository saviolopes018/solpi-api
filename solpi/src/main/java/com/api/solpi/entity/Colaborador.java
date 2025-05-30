package com.api.solpi.entity;

import com.api.solpi.record.ColaboradorDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Table(name = "tb_colaborador")
@Entity
@EqualsAndHashCode(of = "id")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Long perfil;

    public Colaborador(){}

    public Colaborador(ColaboradorDTO colaborador) {
        this.id = colaborador.id();
        this.nome = colaborador.nome();
        this.cpf = colaborador.cpf();
        this.endereco = colaborador.endereco();
        this.telefone = colaborador.endereco();
        this.email = colaborador.email();
        this.perfil = colaborador.perfil();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Long getPerfil() {
        return perfil;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPerfil(Long perfil) {
        this.perfil = perfil;
    }
}
