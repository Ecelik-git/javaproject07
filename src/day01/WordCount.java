package day01;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		wordCount(str);
		scan.close();
	}
	public static void wordCount(String str) {
		HashMap<String, Integer> map = new HashMap<>();
		String arr[]= str.split(" ");
		for(String w: arr) {
			map.computeIfPresent(w, (key, value)->value+=1);
			map.computeIfAbsent(w, k->1);
			
			
		}
		System.out.println(map);
	}
}
