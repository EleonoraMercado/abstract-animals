package org.lessons.abstractAnimals;

public class Delfino extends Animale implements AnimaliNuotanti{

    public Delfino(String nome, String famiglia) {
	this.nome = nome;
	this.famiglia = famiglia;
    }
    
    @Override
    public void verso() {
	System.out.println("Il mio verso è a impulsi sonori");
	
    }
    @Override
    public void mangia() {
	System.out.println("Mi nutro di pesci e molluschi");
	
    }
    @Override
    public void eseguiMovimento() {
   	nuota();
       }

    public void nuota() {
	System.out.println("Sto nuotando!!");
	
    }

    

}
