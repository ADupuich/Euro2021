package grisou;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EnregistreLeFichier implements TableauJoueurs {

	public EnregistreLeFichier(ArrayList<String> joueurs) {

		for (String joueur : joueurs) {

			try {

				final FileWriter writer = new FileWriter("howManyLetters.txt");
				Integer nombreDeLettres;
				final Iterator<String> iterator = joueurs.iterator();
				final String Newligne = System.getProperty("line.separator");
				while (iterator.hasNext()) {
					joueur = iterator.next();
					nombreDeLettres = joueur.length() - joueur.replace("a", "").length();
					writer.write(joueur + " : " + nombreDeLettres + Newligne);
				}
				writer.close();
			} catch (final IOException e) {
				e.printStackTrace();
			}

			return;
		}
	}
}
