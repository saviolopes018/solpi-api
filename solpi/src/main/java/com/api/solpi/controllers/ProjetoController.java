package com.api.solpi.controllers;

import com.api.solpi.record.ProjetoDTO;
import com.api.solpi.services.ProjetoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    private final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping
    public ResponseEntity<List<ProjetoDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.projetoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoDTO> getById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.projetoService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ProjetoDTO> create(@RequestBody ProjetoDTO projeto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.projetoService.create(projeto));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody ProjetoDTO projeto) {
        this.projetoService.update(projeto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable UUID id) {
        this.projetoService.delete(id);
    }


}
