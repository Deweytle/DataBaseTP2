package packlivre;

import javax.persistence.*;
import javax.ejb.Stateless;



@Stateless
public class GestionLivre implements GestionLivreInterface{

  @PersistenceContext(unitName="BiblioISMIN")
  protected EntityManager em;

  public void nouveauLivre(String newIsbn, String newTitre){
    em.persist(new Livre(newIsbn,newTitre));
  }
}
