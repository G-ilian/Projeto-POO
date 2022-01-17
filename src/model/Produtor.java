/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel
 */
public class Produtor {

    //Atributos de um produtor
    private String cpf;
    private String nome;
    private int idade;
    
    //Associações com um Produtor
    //Relacionamento 1:1
    public Endereco e;
    //Relacionamento 1:N
    public Animais a;
    //Construtor 
    public Produtor(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        e=new Endereco();
        a=new Animais();
    }

    //Metódos
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
