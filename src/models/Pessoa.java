package models;

abstract class Pessoa {
    protected String nomePessoa;
    protected int idadePessoa;

    public Pessoa(String nome, int idade) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public abstract String getDescricao();
}
