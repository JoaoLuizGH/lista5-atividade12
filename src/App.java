
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {
	
	public static String[] letras;
	
	public static Scanner tc = new Scanner(System.in);
	
	public static Random random = new Random();
	
	public static ArrayList<String> array = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		try {
			System.out.print("Favor informar a palavra: ");
			String palavra = tc.nextLine().toUpperCase().trim();
			
			defineLetras(palavra);
			
			letras = array.toArray(new String[array.size()]);
			
			letras = embaralhar(letras);
			
			epalavra(letras);
			
		} catch(Exception e) {
			System.out.println("Falha: " + e.getMessage());
		}
	}
	
	public static void defineLetras(String palavra) {
		for(int i=0; i < palavra.length(); i++) {
			array.add(String.valueOf(palavra.charAt(i)));
		}
	}
	
	public static String[] embaralhar(String[] param) {
		int index = 0;
		String s = "";
		
		for(int i=param.length-1; i > 0; i--) {
			index = random.nextInt(i+1);
			s = param[index];
			param[index] = param[i];
			param[i] = s;
		}
		return param;
	}
	
	public static void epalavra(String[] letras) {
		String npalavra = "";
		for(String letra : letras) {
			npalavra = npalavra + letra;
		}
		System.out.println("\nPalavra embaralhada: "+npalavra);
	}
}