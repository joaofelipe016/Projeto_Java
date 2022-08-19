package com.projeto.paciente.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.paciente.model.Paciente;
import com.projeto.paciente.services.PacienteServices;

@RestController
@RequestMapping("api/paciente")
public class PacienteController {

    @Autowired
    private PacienteServices pacienteServices;

    @GetMapping
    public List<Paciente> obterTodos(){
        return pacienteServices.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Paciente> obterPorId(@PathVariable Integer id) {
        return pacienteServices.obterPorId(id);
    }

    @PostMapping("/adicionar")
    public Paciente adicionar(@RequestBody Paciente paciente) {
        return pacienteServices.adicionar(paciente);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Integer id) {
        pacienteServices.deletar(id);
    }

    @PutMapping("/atualizar/{id}")
    public Paciente atualizar(@RequestBody Paciente paciente, @PathVariable Integer id) {
        return pacienteServices.atualizar(id, paciente);
    }

}