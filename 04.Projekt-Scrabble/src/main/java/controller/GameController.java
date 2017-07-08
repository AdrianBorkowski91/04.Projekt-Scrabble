package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import model.Letter;
import model.Word;

public class GameController {
	
	private  final char[] letters={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
	
	private List<Letter> lettersList;
	
	public GameController(){
		lettersList= new ArrayList<Letter>();
		
		for(int i=0; i<letters.length; i++){
			switch (letters[i]) {
				case 'a':
					Letter a= new Letter(letters[i], 1, 9);
					for(int j=0; j<a.getQuantity(); j++)
						lettersList.add(a);
					break;
				case 'b':
					Letter b= new Letter(letters[i], 3, 2);
					for(int j=0; j<b.getQuantity(); j++)
						lettersList.add(b);					  
					break;
				case 'c':
					Letter c= new Letter(letters[i], 3, 2);
					for(int j=0; j<c.getQuantity(); j++)
						lettersList.add(c);						  
					break;
				case 'd':
					Letter d= new Letter(letters[i], 2, 4);
					for(int j=0; j<d.getQuantity(); j++)
						lettersList.add(d);		  
					break;
				case 'e':
					Letter e= new Letter(letters[i], 1, 12);
					for(int j=0; j<e.getQuantity(); j++)
						lettersList.add(e);	  
					break;
				case 'f':
					Letter f= new Letter(letters[i], 4, 2);
					for(int j=0; j<f.getQuantity(); j++)
						lettersList.add(f);						  
					break;
				case 'g':
					Letter g= new Letter(letters[i], 2, 3);
					for(int j=0; j<g.getQuantity(); j++)
						lettersList.add(g);							  
					break;
				case 'h':
					Letter h= new Letter(letters[i], 4, 2);
					for(int j=0; j<h.getQuantity(); j++)
						lettersList.add(h);							  
					break;
				case 'i':
					Letter il= new Letter(letters[i], 1, 9);
					for(int j=0; j<il.getQuantity(); j++)
						lettersList.add(il);					  
					break;
				case 'j':
					Letter jl= new Letter(letters[i], 8, 1);
					for(int j=0; j<jl.getQuantity(); j++)
						lettersList.add(jl);  
					break;
				case 'k':
					Letter k= new Letter(letters[i], 5, 1);
					for(int j=0; j<k.getQuantity(); j++)
						lettersList.add(k);  					  
					break;
				case 'l':
					Letter l= new Letter(letters[i], 1, 4);
					for(int j=0; j<l.getQuantity(); j++)
						lettersList.add(l);  					  
					break;
				case 'm':
					Letter m= new Letter(letters[i], 3, 2);
					for(int j=0; j<m.getQuantity(); j++)
						lettersList.add(m);  			  
					break;
				case 'n':
					Letter n= new Letter(letters[i], 1, 6);
					for(int j=0; j<n.getQuantity(); j++)
						lettersList.add(n);  						  
					break;
				case 'o':
					Letter o= new Letter(letters[i], 1, 8);
					for(int j=0; j<o.getQuantity(); j++)
						lettersList.add(o);  		  
					break;
				case 'p':
					Letter p= new Letter(letters[i], 3, 2);
					for(int j=0; j<p.getQuantity(); j++)
						lettersList.add(p);  	
					break;
				case 'q':
					Letter q= new Letter(letters[i], 10, 1);
					for(int j=0; j<q.getQuantity(); j++)
						lettersList.add(q);  	
					break;
				case 'r':
					Letter r= new Letter(letters[i], 1, 6);
					for(int j=0; j<r.getQuantity(); j++)
						lettersList.add(r);  	
					break;
				case 's':
					Letter s= new Letter(letters[i], 1, 4);
					for(int j=0; j<s.getQuantity(); j++)
						lettersList.add(s);  				  
					break;
				case 't':
					Letter t= new Letter(letters[i], 1, 6);
					for(int j=0; j<t.getQuantity(); j++)
						lettersList.add(t);  						  
					break;
				case 'u':
					Letter u= new Letter(letters[i], 1, 4);
					for(int j=0; j<u.getQuantity(); j++)
						lettersList.add(u);  	
					break;
				case 'v':
					Letter v= new Letter(letters[i], 4, 2);
					for(int j=0; j<v.getQuantity(); j++)
						lettersList.add(v);  	 
					break;
				case 'w':
					Letter w= new Letter(letters[i], 4, 2);
					for(int j=0; j<w.getQuantity(); j++)
						lettersList.add(w);  	
					break;
				case 'x':
					Letter x= new Letter(letters[i], 8, 1);
					for(int j=0; j<x.getQuantity(); j++)
						lettersList.add(x);  
					break;
				case 'y':
					Letter y= new Letter(letters[i], 4, 2);
					for(int j=0; j<y.getQuantity(); j++)
						lettersList.add(y);  
					break;
				case 'z':
					Letter z= new Letter(letters[i], 10, 1);
					for(int j=0; j<z.getQuantity(); j++)
						lettersList.add(z);  
					break;
				case ' ':
					Letter all= new Letter(letters[i], 0, 2);
					for(int j=0; j<all.getQuantity(); j++)
						lettersList.add(all);  
					break;
			}
		}		
		Collections.shuffle(lettersList);
	}
	
	public List<Letter> getLettersList() {
		return lettersList;
	}
	
	public Letter[] takeLetters(Letter[] rest){
		int a=0;
		if(rest==null)
			a=6;
		else			
		 a=6-rest.length;
		
		int size= lettersList.size();
		
		Letter[] newLetters=new Letter[a];
		
		for(int i=0; i<a; i++){
			int random= (int)(Math.random()*size);
			newLetters[i]=lettersList.get(random);
			lettersList.remove(random);
			size--;
		}
		
		return newLetters;
	}
	
	public List<Word> findWordsLength(Letter[] l){
		List<String> wordsString= findWords(l);
		List<Word> words= new ArrayList<Word>();
		
		for (String word : wordsString) {
			Word w= new Word(word);
			words.add(w);
		}
		
		Collections.sort(words, new SortLengthWords());
		
		return words;	
	}
	
	public List<Word> findWordsValue(Letter[] l){
		List<String> wordsString= findWords(l);
		List<Word> words= new ArrayList<Word>();
		
		for (String word : wordsString) {
			Word w= new Word(word);
			words.add(w);
		}
		
		Collections.sort(words, new SortValueWords());
		
		return words;	
	}
	
	private List<String> findWords(Letter[] l) {
		List<String> words= new ArrayList<>();
		
		ClassLoader classLoader = getClass().getClassLoader();
		File file= new File(classLoader.getResource("enable1.txt").getFile());
		
		try(Scanner sc = new Scanner(file)) {
			
			while(sc.hasNext()) {
				String word = sc.next();
				char[] lettersWord= word.toCharArray();

				char[] lettersActural=new char[l.length];
				for (int i=0; i<l.length; i++) {
					lettersActural[i]= l[i].getLetter();
				}
				
				if(lettersWord.length<=6)
					if(findWord(lettersWord, lettersActural))
						words.add(word);				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return words;
	}

	private boolean findWord(char[] lettersWord, char[] lettersActural) {
		
		for(int i=0; i<lettersWord.length; i++){
			for(int j=0; j<lettersActural.length; j++){

				if(lettersWord[i]==lettersActural[j]){
					lettersActural[j]='-';
						break;
				}
				else if(lettersActural[j]==' '){
					lettersActural[j]='-';
						break;
				}
				else if(j==lettersActural.length-1){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private class SortLengthWords implements Comparator<Word> {
	    @Override
	    public int compare(Word w1, Word w2) {
	    	
	        return w1.getLength()- w2.getLength();
	    }

	}
	
	private class SortValueWords implements Comparator<Word> {
	    @Override
	    public int compare(Word w1, Word w2) {
	    	
	        return w1.getValue()- w2.getValue();
	    }

	}
}



