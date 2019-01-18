package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    // l'autowired permet de spécifier une variable d'instance à renseigner par spring
    // pour regarder si un bean correspond à cette interface 
    
	@Autowired
    IPays pays;
	
	@Autowired
	IPersonne personnes;
    	//Liste des pays qui a été crée
	@Test
    public void testcreerPays(){
		Pays cameroon = new Pays("cameroon");
        pays.save(cameroon);
        Pays zimbabwe = new Pays("zimbabwe");
        pays.save(zimbabwe);
        Pays guinee = new Pays("guinee");
        pays.save(guinee);
        Pays mali = new Pays("mali");
        pays.save(mali);
        Pays togo = new Pays("togo");
        pays.save(togo);
        Pays nigeria = new Pays("nigeria");
        pays.save(nigeria);
      
    }
   
    //public void testAjouterPersonne() {
     //Personne Henry = new Personne("Henry", "Grenot", null);
      //personne.save("Henry");
      //personne Carine = new Personne("Carine","MPAKA", null);
      //personne.save("Carine");
      //Personne Jenyfer = new Personne("Jenyfer","Mansoni", null);
      //personne.save("Jenyfer");
      //Personne Adrien = new Personne("Adrien","Mansoni", null);
      //personne.save("Adrien");
      //Personne Herve = new Personne("Herve","Mansoni", null);
      //personne.save("Herve");
      
      
}

