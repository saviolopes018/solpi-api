package com.api.solpi.controllers;

import com.api.solpi.record.FornecedorDTO;
import com.api.solpi.services.FornecedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    private final FornecedorService fornecedorService;

    FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public ResponseEntity<List<FornecedorDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.fornecedorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedorDTO> getById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.fornecedorService.getById(id));
    }

    @PostMapping
    public ResponseEntity<FornecedorDTO> create(@RequestBody FornecedorDTO fornecedor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.fornecedorService.create(fornecedor));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody FornecedorDTO fornecedor) {
        this.fornecedorService.update(fornecedor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID id) {
        this.fornecedorService.delete(id);
    }

}
