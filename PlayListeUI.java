import java.util.ArrayList;


public class PlayListeUI {


	public static void main(String[] args) {
	
		
		MusiqueImpl music1 = new MusiqueImpl("Billie Jean", "MJ", "interprete1", "POP");
		MusiqueImpl music2 = new MusiqueImpl("Godzilla","Eminem", "interprete2", "RAP");
		MusiqueImpl music3 = new MusiqueImpl("Keys to Imagination", "YANNI", "interprete3", "INSTRUMENTAL");
		ArrayList<MusiqueImpl> list = new ArrayList<>() ;
		
		PlayListe PlayListe=new PlayListeImpl("My Hits", "Hits",5,list);
		
		 PlayListe.AjouterMusiquePlaylist(music1);
		 PlayListe.AjouterMusiquePlaylist(music2);
		 PlayListe.AjouterMusiquePlaylist(music3);
		 PlayListe.afficherPlayListe();
	}
   
}