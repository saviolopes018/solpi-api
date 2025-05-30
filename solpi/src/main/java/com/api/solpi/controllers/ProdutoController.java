package com.api.solpi.controllers;

import com.api.solpi.record.ProdutoDTO;
import com.api.solpi.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.produtoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> getById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.produtoService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> create(@RequestBody ProdutoDTO produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.produtoService.create(produto));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody ProdutoDTO produto) {
        this.produtoService.update(produto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID id) {
        this.produtoService.delete(id);
    }

}
