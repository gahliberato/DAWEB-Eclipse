package business.service;

import java.util.Scanner;

public class ReaderService {
	private Scanner scanner = new Scanner(System.in);
	public String nextLine() {
		String result = scanner.nextLine();
		scanner.nextLine();
		return result;
		
	}
	
	public int nextInt() {
		return scanner.nextInt();
	}
}
