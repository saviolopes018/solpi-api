package com.api.solpi.entity;

import com.api.solpi.record.ProjetoDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tb_projeto")
@EqualsAndHashCode(of = "id")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer status;
    private String nomeProjeto;
    private Long clienteId;
    private Date dataInicioProjeto;
    private String endereco;
    private Integer quantidadeTorres;
    private Integer quantidadeApartamentos;
    private String tipoApartamentos;
    private String peDireito;
    private String acabamento;
    private String material;
    private String observacoes;

    public Projeto() {}

    public Projeto(ProjetoDTO projeto) {
        this.id = projeto.id();
        this.status = projeto.status();
        this.nomeProjeto = projeto.nomeProjeto();
        this.clienteId = projeto.clienteId();
        this.dataInicioProjeto = projeto.dataInicioProjeto();
        this.endereco = projeto.endereco();
        this.quantidadeTorres = projeto.quantidadeTorres();
        this.quantidadeApartamentos = projeto.quantidadeApartamentos();
        this.tipoApartamentos = projeto.tipoApartamentos();
        this.peDireito = projeto.peDireito();
        this.acabamento = projeto.acabamento();
        this.material = projeto.material();
        this.observacoes = projeto.observacoes();
    }

    public UUID getId() {
        return id;
    }

    public Integer getStatus() {
        return status;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public Date getDataInicioProjeto() {
        return dataInicioProjeto;
    }

    public String getEndereco() {
        return endereco;
    }

    public Integer getQuantidadeTorres() {
        return quantidadeTorres;
    }

    public Integer getQuantidadeApartamentos() {
        return quantidadeApartamentos;
    }

    public String getTipoApartamentos() {
        return tipoApartamentos;
    }

    public String getPeDireito() {
        return peDireito;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public String getMaterial() {
        return material;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public void setDataInicioProjeto(Date dataInicioProjeto) {
        this.dataInicioProjeto = dataInicioProjeto;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setQuantidadeTorres(Integer quantidadeTorres) {
        this.quantidadeTorres = quantidadeTorres;
    }

    public void setQuantidadeApartamentos(Integer quantidadeApartamentos) {
        this.quantidadeApartamentos = quantidadeApartamentos;
    }

    public void setTipoApartamentos(String tipoApartamentos) {
        this.tipoApartamentos = tipoApartamentos;
    }

    public void setPeDireito(String peDireito) {
        this.peDireito = peDireito;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
