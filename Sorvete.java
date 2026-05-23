/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtos;

public class Sorvete extends Produtos {
    private String sabor;

    public Sorvete(String nome, double preco, String sabor){
        super(nome, preco);
        this.sabor = sabor;
    }
}

