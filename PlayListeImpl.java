import java.util.ArrayList;

public class PlayListeImpl implements PlayListe {
	
  final int MAX_MUSIQUE=5;
  private String nom;
  private String genre;
  private int nombreTitres;
  ArrayList<MusiqueImpl> list = new ArrayList<MusiqueImpl>();

	
	
public PlayListeImpl(String nom, String genre, int nombreTitres, ArrayList<MusiqueImpl> list) {
	
	this.nom = nom;
	this.genre = genre;
	this.nombreTitres = nombreTitres;
	this.list = list;
}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNombreTitres() {
		return nombreTitres;
	}

	public void setNombreTitres(int nombreTitres) {
		this.nombreTitres = nombreTitres;
	}
	
	@Override
	public String toString() {
		return "[list=" + list + "]";
	
	}
	@Override
	public void afficherPlayListe() {
	System.out.println(list.toString());	
	}


	@Override
	public void AjouterMusiquePlaylist(MusiqueImpl music) {
		//System.out.println(list.size()) ;
		if (list.size() < MAX_MUSIQUE)
		{
	list.add(music);
		}
	else {
	 System.out.println("la playlist est charg�e");
	}
	}


}
