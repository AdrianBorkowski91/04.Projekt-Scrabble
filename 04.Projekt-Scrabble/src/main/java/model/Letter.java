package model;

public class Letter {
	
	private char letter;
	private int value;
	private int quantity;
	
	public Letter(char letter, int value, int quantity) {
		this.letter = letter;
		this.value = value;
		this.quantity = quantity;
	}
	
	public Letter(){}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Letter [letter=" + letter + ", value=" + value + ", quantity=" + quantity + "]";
	}
	
	
}
