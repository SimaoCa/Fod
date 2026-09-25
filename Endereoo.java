/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class Endereoo {

        private int id;
       private static int proximoId =1;
       private String lograDouro;
       private String numero;
       private String bairro;
       private String cidade;
       private String estado;
       private String cep;
       public Endereoo(){
           
       }public  Endereoo(String lograDouro, String numero, String bairro, String cidade, String estado, String cep){
           this.id = proximoId++;
           this.lograDouro = lograDouro;
           this.numero = numero;
           this.bairro = bairro;
           this.cidade = cidade;
           this.estado = estado;
           this.cep = cep;
       } 

    public int getId() {
        return id;
    }

    public static int getProximoId() {
        return proximoId;
    }


    public String getLograDouro() {
        return lograDouro;
    }

    public void setLograDouro(String lograDouro) {
        if(lograDouro.trim().isEmpty()){
            throw new IllegalArgumentException("logradouro não deve estar vazio");
                }
        this.lograDouro = lograDouro;
    }

    public String getNumero() {
      
        return numero;
    }

    public void setNumero(String numero) {
          if(numero.trim().isEmpty()){
            throw new IllegalArgumentException("Numero não deve estar vazio");
        }
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(bairro.trim().isEmpty()){
            throw new IllegalArgumentException("Bairro não deve estar vazio");
        }
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade.trim().isEmpty()){
            throw new IllegalArgumentException("Cidade não deve estar vazia");
        }
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.trim().isEmpty()){
            throw new IllegalArgumentException("Estado não deve estar vazio");
        }
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep.trim().isEmpty()){
            throw new IllegalArgumentException("Cep não deve estar vazio");
        }
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereoo{" + "id=" + id + ", lograDouro=" + lograDouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + '}';
    }
    }
    

