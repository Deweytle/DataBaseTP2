import javax.naming.*;
import packlivre.*;

class Client{
  Client(){

  }

  public static void main(String[] args){

    try{
      InitialContext initcont = new InitialContext();
      GestionLivreInterface gLivre = (GestionLivreInterface) initcont.lookup("packlivre.GestionLivreInterface");
      gLivre.nouveauLivre("123","L'ecume des jours");
    }
    catch(NamingException e){
      System.err.println("error");
    }
  }

}
