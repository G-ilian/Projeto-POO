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
public class Animais {
    static int i=0;
    private int id;
    private String nome;
    private int nLitros;
    private int idade;
    private String vacinou;
    
    //Métodos internos da classe de animais
    public Animais()
    {
        i++;
        id=i;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnLitros() {
        return nLitros;
    }

    public void setnLitros(int nLitros) {
        this.nLitros = nLitros;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVacinou() {
        return vacinou;
    }

    public void setVacinou(String vacinou) {
        this.vacinou = vacinou;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
