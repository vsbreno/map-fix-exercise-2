package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the file path: "); // D:\test\vendas.csv
		String path = scan.nextLine();

		Map<String, Integer> sales = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String nameProduct = fields[0].trim();
				int quantitySold = Integer.parseInt(fields[1].trim());

				sales.put(nameProduct, sales.getOrDefault(nameProduct, 0) + quantitySold);
				
				line = br.readLine();
			}
			for (String product : sales.keySet()) {
				System.out.println(product + ": " + sales.get(product));
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		scan.close();
	}

}
