package fr.adupuich.grisou;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EnregistreLeFichier implements IFichier {

	@Override
	public void EnregistreLeFichier(final ArrayList<String> joueurs) {

		for (String str : joueurs) {
			try {

				final FileWriter writer = new FileWriter("howManyLetters.txt");
				Integer nombreDeLettres;
				final Iterator<String> iterator = joueurs.iterator();
				final String Newligne = System.getProperty("line.separator");
				while (iterator.hasNext()) {
					str = iterator.next();
					nombreDeLettres = str.length() - str.replace("a", "").length();
					writer.write(str + " : " + nombreDeLettres + Newligne);
				}
				writer.close();
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}

	}

}
