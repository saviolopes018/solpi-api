package com.api.solpi.services;

import com.api.solpi.entity.Colaborador;
import com.api.solpi.record.ColaboradorDTO;
import com.api.solpi.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ColaboradorService {

    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorService(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    public ColaboradorDTO create(ColaboradorDTO colaborador) {
        Colaborador colaboradorEntity = new Colaborador(colaborador);

        colaboradorEntity = colaboradorRepository.save(colaboradorEntity);

        return ColaboradorDTO.fromEntity(colaboradorEntity);
    }

    public List<ColaboradorDTO> getAll() {
        List<Colaborador> colaboradorEntity = this.colaboradorRepository.findAll();
        return colaboradorEntity.stream().map(ColaboradorDTO::fromEntity).toList();
    }

    public ColaboradorDTO getById(UUID id) {
        Colaborador colaboradorEntity = this.colaboradorRepository.getReferenceById(id);
        return ColaboradorDTO.fromEntity(colaboradorEntity);
    }

    public void update(ColaboradorDTO colaborador){
        this.colaboradorRepository.saveAndFlush(new Colaborador(colaborador));
    }

    public void delete(UUID id){
        this.colaboradorRepository.deleteById(id);
    }

}
