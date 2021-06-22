package grisou;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class PlayersMap {

	public static void main(String[] args) {

		final ArrayList<String> joueurs = new ArrayList<String>();

		try {
			final BufferedReader reader = new BufferedReader(
					new FileReader("/home/amaury/eclipse-workspace/grisou/src/main/java/Joueurs.txt"));
			String line = reader.readLine();

			while (line != null) {
				joueurs.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}

		for (String str : joueurs) {
//test
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
