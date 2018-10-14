package packlivre;

import javax.ejb.Remote;

@Remote
public interface GestionLivreInterface{
  public void nouveauLivre(String newIsbn, String newTitre);
}
