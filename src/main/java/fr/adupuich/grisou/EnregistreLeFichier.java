package fr.adupuich.grisou;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EnregistreLeFichier implements IFichier {

	@Override
	public void EnregistreLeFichier(ArrayList<String> joueurs) {

		Integer nombreDeLettres;
		final String Newligne = System.getProperty("line.separator");

		for (final String str : joueurs) {

			final FileWriter writer = new FileWriter("howManyLetters.txt");

			try {
				nombreDeLettres = str.length();
				writer.write(str + " : " + nombreDeLettres + Newligne);
				while (iterator.hasNext()) {
					joueurs = iterator.next();
				}

				writer.close();
			} catch (final IOException e) {
				e.printStackTrace();
			}

		}

	}

}
