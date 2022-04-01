package com.Bridgelabz.deckOfCard1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;

public class DeckOfCard {

	private static final String[] SUIT = { "Spades", "Hearts", "Diamond", "Clubs" };
	private static final String[] RANK = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private static final String[][] deckOfCards = { SUIT, RANK };
	private static final Card[] card_deck = new Card[52];
	private static final List<Player> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);
	Map<String, HashMap<String, Integer>> playerCardInfo = new HashMap<>();

	public void setupDeckOfCards() {
		int i = 0;
		for (String s : deckOfCards[0]) {
			for (String value : deckOfCards[1]) {
				card_deck[i++] = new Card(s, value);
			}
		}
	}
	public void addPlayer(int numberOfPlayers) {
		System.out.println("Enter Players Details");
		
			for (int i = 0; i < numberOfPlayers; i++) {
				System.out.println("Enter first name");
				String first_name = sc.nextLine();
				System.out.println("Enter second name");
				String second_name = sc.nextLine();
				System.out.println("Enter player turn");
				int playerTurn = sc.nextInt();
				Player player = new Player(second_name, first_name, playerTurn);
				list.add(player);
				for (Player value : list) {
					System.out.println(value);
				}
			}
	}
	public void orderPlayerTurn(int numberOfPlayers) {
		System.out.println("Enter players order");
		for (int i = 0; i < numberOfPlayers; i++) {
			int turn = sc.nextInt();
			list.get(i).setPlayerTurn(turn);
		}
	}
	public void shuffle() {
		Random rand = new Random();
		for (int i = 0; i < deckOfCards.length; i++) {
			String[] tempArray = deckOfCards[i];
			for (int j = 0; j < tempArray.length; j++) {
				int random = j + rand.nextInt(tempArray.length - j);
				String temp = tempArray[random];
				tempArray[random] = tempArray[j];
				tempArray[j] = temp;
			}
			deckOfCards[i] = tempArray;
		}
	}

}