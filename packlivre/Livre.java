package packlivre;

import javax.naming.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "livre")
public class Livre implements Serializable{

  @Id private String isbn;
  private String titre;
  private int dispo;

  public Livre(){
    dispo = 1;
  }

  public Livre(String isbnIn, String titreIn){
    this.isbn = isbnIn;
    this.titre = titreIn;
    this.dispo = 1;
  }
}
