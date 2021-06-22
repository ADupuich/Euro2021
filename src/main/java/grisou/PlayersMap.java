package grisou;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PlayersMap {

	public static void main(String[] args) throws IOException {

		final ArrayList<String> joueurs = new ArrayList<String>();

		try {
			final BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\Amaur\\Documents\\Euro2021\\src\\main\\java\\Joueurs.txt"));
			String line = reader.readLine();

			while (line != null) {
				joueurs.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}

		final FileWriter writer = new FileWriter("howManyLetters.txt");
		Integer nombreDeLettres;
		final String Newligne = System.getProperty("line.separator");

		for (String str : joueurs) {

			try {
				nombreDeLettres = str.length();
				writer.write(str + " : " + nombreDeLettres + Newligne);

			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
		writer.close();
	}

}
