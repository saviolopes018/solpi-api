package com.api.solpi.services;

import com.api.solpi.entity.Projeto;
import com.api.solpi.record.ProjetoDTO;
import com.api.solpi.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjetoService {

    private final ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public ProjetoDTO create(ProjetoDTO projeto) {
        Projeto projetoEntity = new Projeto(projeto);

        projetoEntity = projetoRepository.save(projetoEntity);

        return ProjetoDTO.fromEntity(projetoEntity);
    }

    public List<ProjetoDTO> getAll() {
        List<Projeto> projetoEntity = this.projetoRepository.findAll();
        return projetoEntity.stream().map(ProjetoDTO::fromEntity).toList();
    }

    public ProjetoDTO getById(UUID id) {
        Projeto projetoEntity = this.projetoRepository.getReferenceById(id);
        return ProjetoDTO.fromEntity(projetoEntity);
    }

    public void update(ProjetoDTO projeto){
        this.projetoRepository.saveAndFlush(new Projeto(projeto));
    }

    public void delete(UUID id){
        this.projetoRepository.deleteById(id);
    }
}
