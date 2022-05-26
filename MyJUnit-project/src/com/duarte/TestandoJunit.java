package com.duarte;
public class TestandoJunit {
	//method square
	public int quadrado(int number_for_square) {
		//return square
		return number_for_square*number_for_square;
	}

	public int contadorDeLetras(String palavra) {
		// TODO Auto-generated method stub
		int count_repeated_letter = 0;
		for(int letter_position = 0; letter_position < palavra.length(); letter_position++) 
			if(palavra.charAt(letter_position) =='e' || palavra.charAt(letter_position) == 'E') 
				count_repeated_letter ++;
		return count_repeated_letter;
	}

}
