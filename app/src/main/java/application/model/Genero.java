package application.model;

 import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence.Id;
 import jakarta.persistence.Table;

 @Entity
 @Table(name="generos")

public class Genero {
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private string nome;

   public int getId(){
    return id;
   }
   public void setId(int id){
    this.id = id;
   }
   



}



