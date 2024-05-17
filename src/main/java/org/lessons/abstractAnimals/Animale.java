package org.lessons.abstractAnimals;

public abstract class Animale  {
    
    protected String nome;
    protected String famiglia;
    
    public abstract void verso();
    
    public abstract void mangia();
    
    public void dormi() {
	    System.out.println("Adesso dormo...Zzz");
    }
    
    public void presentazione() {
	System.out.println("Ciao sono " + nome + " della famiglia " + famiglia);
    }
   
    public void eseguiMovimento() {
	
    }
   
}
