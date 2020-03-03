package com.epam.newyeargift;
import java.util.*;

public class Gifts {
	//Declaring Scanner and Map objects
		static Scanner scan = new Scanner(System.in);
		static Map<String, Integer> mp = new HashMap<String, Integer>() 
		{{ 
			put("Silkchocolate", 0); put("Gems", 0); put("Coffee", 0); put("Jamun", 0); put("Modak", 0); put("Kulfi", 0);
		}};
		//main method
		public static void main(String args[]) {
			//creating sweet objects
			Sweet jamun = new Sweet();
			jamun.setWeight(30);
			Sweet chikki = new Sweet();
			chikki.setWeight(45);
			Sweet kulfi = new Sweet();
			kulfi.setWeight(25);
			Silkchocolate dc = new Silkchocolate();
			Germs g = new Germs();
			Mangobite c = new Mangobite();
			//taking input from user
			char areMore = 'y';
			System.out.println("\n1. Silk Chocolate\n2. Gems\n3. Coffee\n4. jamun\n5. chikki\n6. Kulfi");
			while (areMore == 'y') {
				System.out.println("Select what you find: ");
		        int n = scan.nextInt();
		        switch(n) {
		        case 1: mp.put("Silkchocolate", mp.get("Silkchocolate")+1); break;
		        case 2: mp.put("Germs", mp.get("Germs")+1); break;
		        case 3: mp.put("Mangobite", mp.get("Mangobite")+1); break;
		        case 4: mp.put("Jamun", mp.get("Jamun")+1); break;
		        case 5: mp.put("chikki", mp.get("chikki")+1); break;
		        case 6: mp.put("Kulfi", mp.get("Kulfi")+1); break;
		        }
		        System.out.println("Are there more sweets or chocolates? (y/n): ");
		        areMore = scan.next().charAt(0);
			}
			scan.close();
			//calculating total weight and number of candies
			double totalWt = dc.calcWeight(mp.get("Silkchocolate")) + g.calcWeight(mp.get("Germs")) + c.calcWeight(mp.get("Mangobite"));
			totalWt += kulfi.calcWeight(mp.get("Kulfi")) + chikki.calcWeight(mp.get("chikki")) + jamun.calcWeight(mp.get("Jamun"));
			System.out.println("Total gift weight: " + totalWt);
			int quantity = 0;
			System.out.println("Number of individual candies: ");
			for (String candy : mp.keySet()) {
				System.out.println(candy + " : " + mp.get(candy));
				quantity += mp.get(candy);
			}
			System.out.println("Total number of candies: " + quantity);
		}
}
	


