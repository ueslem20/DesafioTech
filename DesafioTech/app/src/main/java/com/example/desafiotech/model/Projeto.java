package com.example.desafiotech.model;

public class Projeto {
    private int idProjeto;
    private String nomeProjeto;
    private String descricaoProjeto;
    private String key;

    public Projeto(int idProjeto, String nomeProjeto, String descricaoProjeto, String key) {
        this.idProjeto = idProjeto;
        this.nomeProjeto = nomeProjeto;
        this.descricaoProjeto = descricaoProjeto;
        this.key = key;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricaoProjeto() {
        return descricaoProjeto;
    }

    public void setDescricaoProjeto(String descricaoProjeto) {
        this.descricaoProjeto = descricaoProjeto;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    @Override
    public String toString() {
        return "Nome do projeto:"+nomeProjeto+
                "\nDescricao do projeto:"+descricaoProjeto+
                "\nChave do projeto:"+key+
                "\nID do projeto:"+idProjeto;
    }
}
