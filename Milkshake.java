/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtos;

public class Milkshake extends Produtos {
    private int ml;

    public Milkshake(String nome, double preco, int ml) {
        super(nome, preco);
        this.ml = ml;
    }

    public int getMl() { return ml; }
    public void setMl(int ml) { this.ml = ml; }
}

