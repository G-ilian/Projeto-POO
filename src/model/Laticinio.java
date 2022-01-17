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
public class Laticinio {
    //Atributos do Laticinio
    private String nomeLaticinio;
    private String localizacao;
    private String cnpj;
    //Associação do Laticinio
    Produtor p;
    Vendas v;
    
    //Construtor da função do Laticinio
    public Laticinio(String nome,String cnpj, String localizacao)
    {
        this.nomeLaticinio=nome;
        this.cnpj=cnpj;
        this.localizacao=localizacao;
    }

    //Encapsulamento

    public String getNomeLaticinio() {
        return nomeLaticinio;
    }

    public void setNomeLaticinio(String nomeLaticinio) {
        this.nomeLaticinio = nomeLaticinio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }    
}
