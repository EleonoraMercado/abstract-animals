package org.lessons.abstractAnimals;

public class Aquila extends Animale implements AnimaliVolatili{
    
   
    public Aquila(String nome, String famiglia) {
	this.nome = nome;
	this.famiglia = famiglia;
    }


    @Override
    public void verso() {
	System.out.println("Io strido!!");
    }
    @Override
    public void mangia() {
	System.out.println("Solitamente mi nutro di tanti teneri animali");
	
    }
    @Override
    public void eseguiMovimento() {
   	vola();
       }

    public void vola() {
	System.out.println("Sto volando!!");
	
    }
    
    
    
    
    
}
