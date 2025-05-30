package com.api.solpi.services;

import com.api.solpi.entity.Fornecedor;
import com.api.solpi.record.FornecedorDTO;
import com.api.solpi.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public FornecedorDTO create(FornecedorDTO fornecedor) {
        Fornecedor fornecedorEntity = new Fornecedor(fornecedor);

        fornecedorEntity = fornecedorRepository.save(fornecedorEntity);

        return FornecedorDTO.fromEntity(fornecedorEntity);
    }

    public List<FornecedorDTO> getAll() {
        List<Fornecedor> fornecedorEntity = this.fornecedorRepository.findAll();
        return fornecedorEntity.stream().map(FornecedorDTO::fromEntity).toList();
    }

    public FornecedorDTO getById(UUID id) {
        Fornecedor fornecedorEntity = this.fornecedorRepository.getReferenceById(id);
        return FornecedorDTO.fromEntity(fornecedorEntity);
    }

    public void update(FornecedorDTO fornecedor){
        this.fornecedorRepository.saveAndFlush(new Fornecedor(fornecedor));
    }

    public void delete(UUID id){
        this.fornecedorRepository.deleteById(id);
    }

}
