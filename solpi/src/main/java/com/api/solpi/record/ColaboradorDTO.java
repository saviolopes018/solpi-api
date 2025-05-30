package com.api.solpi.record;

import com.api.solpi.entity.Colaborador;

import java.util.UUID;

public record ColaboradorDTO(UUID id, String nome, String cpf, String endereco,
        String telefone, String email, Long perfil) {

    public static ColaboradorDTO fromEntity(Colaborador colaborador) {
        return new ColaboradorDTO(colaborador.getId(), colaborador.getNome(), colaborador.getNome(), colaborador.getEndereco(),
                colaborador.getTelefone(), colaborador.getEmail(), colaborador.getPerfil());
    }
}
