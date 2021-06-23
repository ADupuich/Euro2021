package fr.adupuich.grisou;

import java.util.ArrayList;

public class PlayersMap {

	public static void main(String[] args) throws Exception {

		final PlayersList players = new PlayersList();
		final ArrayList<String> joueurs = players.Liste();
		final EnregistreLeFichier readyPourEnregistrer = new EnregistreLeFichier();
		readyPourEnregistrer.enregistre(joueurs);

	}
}