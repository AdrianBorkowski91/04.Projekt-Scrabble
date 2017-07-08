package main;

import java.util.List;

import controller.GameController;
import model.Letter;
import model.Word;

public class Main {

	public static void main(String[] args) {
		GameController gm= new GameController();
		gm.getLettersList();
		Letter[] l=gm.takeLetters(null);
		System.out.println("LETTERS - VALUE");
		for (Letter letter : l) {
			System.out.println(letter.getLetter()+", value: "+letter.getValue());
		}
		
		List<Word> words= gm.findWordsLength(l);
		List<Word> words2= gm.findWordsValue(l);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WORDS - LENGTH");
		for (Word word : words) {
			System.out.println(word.getWord()+" : "+word.getLength());
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WORDS - VALUE");
		for (Word word : words2) {
			System.out.println(word.getWord()+" : "+word.getValue());
		}
	}

}
