package com.projeto.paciente.model;

public class Paciente {
    
    private Integer id;
    private String nome;
    private Integer idade;
    private String genero;
    private String dtNascimento;
    private String raca;
    private String doenca;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setId(String genero) {
        this.genero = genero;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca){
        this.doenca = doenca;
    }
    
}