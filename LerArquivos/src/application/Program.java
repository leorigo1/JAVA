package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = null;

		File file = new File ("C:\\temptemp\\in.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
