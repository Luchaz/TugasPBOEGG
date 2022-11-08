/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspboegg;

class GenericClass<F> {
    // variable of F type
    final private F data;

    public GenericClass(F data) {
        this.data = data;
    }
    
    <F> void genericDisplay(F element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    
    public F getData() {
        return this.data;
    }
}

public class TugasPBOEGG {
    enum Makan {
        Burger,
        Salad,
        Kue
    }

    public static void main(String[] args) {
        Makan tesMakan = Makan.Burger;
        System.out.println("Aku suka Makan " + tesMakan);
        GenericClass tesKelas = new GenericClass<String>("hai");
        tesKelas.genericDisplay(15.124);
    }
