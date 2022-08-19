package com.projeto.paciente.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.paciente.model.Paciente;
import com.projeto.paciente.repository.PacienteRepository;

@Service
public class PacienteServices {
    
    @Autowired
    private PacienteRepository pacienteRepository;

    public ArrayList<Paciente> obterTodos(){
        return pacienteRepository.obterTodos();
    }

    public  Optional<Paciente> obterPorId(Integer id) {
        return pacienteRepository.obterPorId(id);
    }

    public Paciente adicionar(Paciente paciente){
        return pacienteRepository.adicionar(paciente);
    }

    public void deletar(Integer id){
        pacienteRepository.deletar(id);
    }

    public Paciente atualizar(Integer id, Paciente paciente) {
        paciente.setId(id);
        return pacienteRepository.atualizar(paciente);
    }

}