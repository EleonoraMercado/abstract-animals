package org.lessons.abstractAnimals;

public class Cane extends Animale{

    public Cane(String nome, String famiglia) {
	this.nome = nome;
	this.famiglia = famiglia;
    }
    
    @Override
    public void verso() {
	System.out.println("Io abbaio");
    }
    @Override
    public void mangia() {
	System.out.println("Sono onnivoro magio tutto");
    }


    

}
