package com.bridgelabz.practiceproblems;
import java.util.Random;
public class DeckOfCards {
    int[][] cards = new int[4][13];

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();

        for (int playerCardsNum = 1; playerCardsNum <= 4; playerCardsNum++) {
            deckOfCards.allotCards(playerCardsNum);
            System.out.println("Player " + playerCardsNum + " cards: ");
            deckOfCards.printCard(playerCardsNum);
        }
    }

    // allotting cards to one player
    void allotCards(int playerCardsNum) {
        for (int i = 0; i < 9; i++) {
            allotOneCard(playerCardsNum);
        }
    }

    // allotting cards to one randomly
    void allotOneCard(int playerCardsNum) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cards[suit][rank] != 0) {
            allotOneCard(playerCardsNum);
        } else {
            cards[suit][rank] = playerCardsNum;
        }
    }

    //prints card in ascending  order
    void printCard(int playerCardsNum) {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if (cards[suit][rank] == playerCardsNum) {
                    System.out.print(getSuit(suit) + " " + getRank(rank) + " ");
                }
            }
        }
        System.out.println(" ");
    }

    // returns rank of the card number
    String getRank(int rankNumber) {
        switch (rankNumber) {
            case 0:
                return "2";
            case 1:
                return "3";
            case 2:
                return "4";
            case 3:
                return "5";
            case 4:
                return "6";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                return "";
        }
    }

    //returns suit name from numbers
    String getSuit(int suitNumber) {
        switch (suitNumber) {
            case 0:
                return "Clubs";
            case 1:
                return "Diamonds";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            default:
                return "";
        }
    }
}
