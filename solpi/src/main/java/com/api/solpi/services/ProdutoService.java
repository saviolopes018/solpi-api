package com.api.solpi.services;

import com.api.solpi.entity.Produto;
import com.api.solpi.record.ProdutoDTO;
import com.api.solpi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDTO create(ProdutoDTO fornecedor) {
        Produto produtoEntity = new Produto(fornecedor);

        produtoEntity = produtoRepository.save(produtoEntity);

        return ProdutoDTO.fromEntity(produtoEntity);
    }

    public List<ProdutoDTO> getAll() {
        List<Produto> produtoEntity = this.produtoRepository.findAll();
        return produtoEntity.stream().map(ProdutoDTO::fromEntity).toList();
    }

    public ProdutoDTO getById(UUID id) {
        Produto produtoEntity = this.produtoRepository.getReferenceById(id);
        return ProdutoDTO.fromEntity(produtoEntity);
    }

    public void update(ProdutoDTO produto){
        this.produtoRepository.saveAndFlush(new Produto(produto));
    }

    public void delete(UUID id){
        this.produtoRepository.deleteById(id);
    }

}
