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

}