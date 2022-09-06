package com.projeto.paciente.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.projeto.paciente.model.Paciente;
import com.projeto.paciente.model.exception.ResponseNotFoundException;

@Repository
public class PacienteRepository {
    
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    private Integer ultimoId = 0;

    public ArrayList<Paciente> obterTodos() {
        return pacientes;
    }

    public Optional<Paciente> obterPorId(Integer id){
        return pacientes
                    .stream()
                    .filter(paciente -> paciente.getId() == id)
                    .findFirst();
    }

    public Paciente adicionar(Paciente paciente) {
        ultimoId++;

        paciente.setId(ultimoId);
        pacientes.add(paciente);

        return paciente;
    }

    public void deletar(Integer id){
        pacientes.removeIf(paciente -> paciente.getId() == id);
    }

    public Paciente atualizar(Paciente paciente){

        Optional<Paciente> pacienteEncontrado = obterPorId(paciente.getId());
        
        if(pacienteEncontrado.isEmpty()){
            throw new ResponseNotFoundException("Paciente não encontrado");
        
        }

        deletar(paciente.getId());
        pacientes.add(paciente);

        return paciente;

    }

}