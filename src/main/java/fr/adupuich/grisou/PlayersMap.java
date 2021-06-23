package fr.adupuich.grisou;

import java.util.ArrayList;

public class PlayersMap {

	public static void main(String[] args) throws Exception {

		PlayersList players = new PlayersList();
		ArrayList<String> joueurs = players.Liste();
		EnregistreLeFichier readyPourEnregistrer = new EnregistreLeFichier(joueurs);
		readyPourEnregistrer.EnregistreLeFichier(joueurs);

	}
}