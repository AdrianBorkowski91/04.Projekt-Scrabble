package model;

public class Word {

	private String word;
	private int length;
	private int value;
	
	public Word(String word) {
		this.word = word;
		this.length = word.length();
		setValue(word);
	}
	
	public Word(){}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getLength() {
		return length;
	}

	public void setLength(String word) {
		this.length = word.length();
	}

	public int getValue() {
		return value;
	}

	public void setValue(String word) {
		int value=0;
		char[] letters= word.toCharArray();
		for(int j=0; j<letters.length; j++)
			value+=getValue(letters[j]);
		
		this.value=value;
	}
	
	private int getValue(char l){
		
		switch (l) {
		case 'a':
			return 1;
		case 'b':
			return 3;
		case 'c':
			return 3;
		case 'd':
			return 2;
		case 'e':
			return 1;
		case 'f':
			return 4;					  
		case 'g':
			return 2;
		case 'h':
			return 4;
		case 'i':
			return 1;
		case 'j':
			return 8;
		case 'k':
			return 5;
		case 'l':
			return 1;
		case 'm':
			return 3;
		case 'n':
			return 1;
		case 'o':
			return 1;
		case 'p':
			return 3;
		case 'q':
			return 10;
		case 'r':
			return 1;
		case 's':
			return 1;			  
		case 't':
			return 1;	
		case 'u':
			return 1;	
		case 'v':
			return 4;	
		case 'w':
			return 4;	
		case 'x':
			return 8;	
		case 'y':
			return 4;	
		case 'z':
			return 10;	
		case ' ':
			return 0;	
		}

	return 0;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", length=" + length + ", value=" + value + "]";
	}
	
}
