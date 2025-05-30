package com.api.solpi.record;

import com.api.solpi.entity.Projeto;

import java.util.Date;
import java.util.UUID;

public record ProjetoDTO(UUID id, Integer status, String nomeProjeto, Long clienteId,
        Date dataInicioProjeto, String endereco, Integer quantidadeTorres, Integer quantidadeApartamentos,
        String tipoApartamentos, String peDireito, String acabamento, String material, String observacoes) {

    public static ProjetoDTO fromEntity(Projeto projeto) {
        return new ProjetoDTO(projeto.getId(), projeto.getStatus(), projeto.getNomeProjeto(), projeto.getClienteId(),
                projeto.getDataInicioProjeto(), projeto.getEndereco(), projeto.getQuantidadeTorres(), projeto.getQuantidadeApartamentos(),
                projeto.getTipoApartamentos(), projeto.getPeDireito(), projeto.getAcabamento(), projeto.getMaterial(), projeto.getObservacoes());
    }
}
