package org.lessons.abstractAnimals;

public class Passerotto extends Animale implements AnimaliVolatili{

    public Passerotto(String nome, String famiglia) {
	this.nome = nome;
	this.famiglia = famiglia;
    }
    
    @Override
    public void verso() {
	System.out.println("Io cinguetto");
	
    }
    
    @Override
    public void mangia() {
	System.out.println("Mi nutro di noci, nocciole, uvette e frutta");
	
    }
    @Override
    public void eseguiMovimento() {
   	vola();
       }
    
    public void vola() {
	System.out.println("Sto volando!!");
	
    }

    

}
