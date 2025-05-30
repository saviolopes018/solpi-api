package com.api.solpi.controllers;

import com.api.solpi.record.ColaboradorDTO;
import com.api.solpi.services.ColaboradorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @GetMapping
    public ResponseEntity<List<ColaboradorDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.colaboradorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ColaboradorDTO> getById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.colaboradorService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ColaboradorDTO> create(@RequestBody ColaboradorDTO colaborador) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.colaboradorService.create(colaborador));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody ColaboradorDTO colaborador) {
        this.colaboradorService.update(colaborador);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID id) {
        this.colaboradorService.delete(id);
    }
}
