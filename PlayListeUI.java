package Moez;


import java.util.ArrayList;

public class PlayListeUI {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Musiqueimpl music1 = new Musiqueimpl("music", "author", "interprete", "Hits1");
		Musiqueimpl music2 = new Musiqueimpl("music2","author2", "interprete2", "Hits2");
		Musiqueimpl music3 = new Musiqueimpl("music3", "author3", "interprete3", "Hits3");
		ArrayList<Musiqueimpl> list = new ArrayList<>() ;
		
		PlayListe PlayListe=new PlayListeimpl("My Hits", "Hits",5,list);
		
		 PlayListe.Ajouter(music1);
		 PlayListe.Ajouter(music2);
		 PlayListe.Ajouter(music3);
		 PlayListe.afficherPlayListe();
	}
   
}

