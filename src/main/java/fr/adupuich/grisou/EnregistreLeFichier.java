package fr.adupuich.grisou;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EnregistreLeFichier implements IFichier {

	public EnregistreLeFichier(ArrayList<String> joueurs) throws IOException {

		final FileWriter writer = new FileWriter("howManyLetters.txt");
		Integer nombreDeLettres;
		final String Newligne = System.getProperty("line.separator");

		for (final String str : joueurs) {

			try {
				nombreDeLettres = str.length();
				writer.write(str + " : " + nombreDeLettres + Newligne);

			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
		writer.close();
	}

	@Override
	public void EnregistreLeFichier(ArrayList<String> joueurs) {
		// TODO Auto-generated method stub

	}

}
