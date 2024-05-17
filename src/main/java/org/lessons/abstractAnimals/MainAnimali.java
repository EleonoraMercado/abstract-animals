package org.lessons.abstractAnimals;

public class MainAnimali {

    public static void main(String[] args) {
	GestoreMovimentoAnimali movimento = new GestoreMovimentoAnimali();
	
	Animale aquila = new Aquila("Aquila", "Rapace");
	aquila.presentazione();
	aquila.verso();
	aquila.mangia();
	aquila.eseguiMovimento();
	aquila.dormi();
	System.out.println(" ");
	
	
	
	Animale cane = new Cane("Cane", "Canidi");
	cane.presentazione();
	cane.verso();
	cane.mangia();
	cane.dormi();
	System.out.println(" ");
	
	Animale delfino = new Delfino("Delfino", "Cetacei");
	delfino.presentazione();
	delfino.verso();
	delfino.mangia();
	delfino.eseguiMovimento();
	delfino.dormi();
	System.out.println(" ");
	
	Animale passerotto = new Passerotto("Passero", "Passeridi");
	passerotto.presentazione();
	passerotto.verso();
	passerotto.mangia();
	passerotto.eseguiMovimento();
	passerotto.dormi();
	System.out.println(" ");
    }
    
    
}
