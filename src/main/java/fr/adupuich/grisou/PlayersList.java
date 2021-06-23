package fr.adupuich.grisou;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PlayersList {

	public ArrayList<String> Liste() {

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

		return joueurs;
	}

}