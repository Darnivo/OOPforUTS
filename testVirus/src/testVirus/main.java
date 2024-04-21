package testVirus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class main {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Virus> VirusList = new ArrayList<>();
	static ArrayList<ResistantVirus> ResistantVirusList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		SimpleVirus new1 = new SimpleVirus("Virus A",23);
		SimpleVirus new2 = new SimpleVirus("Virus B",34);
		SimpleVirus new3 = new SimpleVirus("Virus C",45);
		
		VirusList.add(new1);
		VirusList.add(new2);
		VirusList.add(new3);
		
		int choice=0;
//		test = scan.nextInt();
		
		while(choice!=4) {
			printCom();
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
				case 1:
					// prompt user to input virus name and population number.
					String nm;
					int pop;
					System.out.print("Input virus name: ");
					nm = scan.nextLine();
					System.out.print("Input population number: ");
					pop = scan.nextInt();
					scan.nextLine();
					
					SimpleVirus newVir = new SimpleVirus(nm,pop);
					VirusList.add(newVir);
					break;
				case 2:
					
					if(VirusList.isEmpty()) {
						System.out.println("No viruses present");
					}else {
						for(int i=0;i<VirusList.size();i++) {
							System.out.printf("%d. %s %d\n",i,VirusList.get(i).getName(),VirusList.get(i).getPopulation());
						}
						
						System.out.println();
						System.out.print("Input index of simple virus for experiment: ");
						int index=-1;
						index = scan.nextInt();
						scan.nextLine();
						
						

						System.out.print("Input drug name: ");
						String drug;
						drug= scan.nextLine();
						
		
						Random rand = new Random();
						int rng = rand.nextInt(101);
//						System.out.println("RNG ="+ rng);
						if(rng>=50) {
							ResistantVirus newResist = new ResistantVirus(VirusList.get(index).getName(), VirusList.get(index).getPopulation(), drug);
							VirusList.remove(index);
							ResistantVirusList.add(newResist);
							System.out.println("Virus became resistant");
						}else {
							VirusList.remove(index);
							System.out.println("Virus successfully treated by "+ drug);
						}
						
					}
					
					/* 1. display list of simple viruses
						^ (print list index, virus information which consists of name and population).
					   2. Prompt user to input index of simple virus and drug used for experiment
					   3. Use random probability from 0 to 100 to determine whether virus
					   becomes resistant or not. If random probability is greater than 50 then 
					   virus becomes resistant
					   4.  Virus is removed from the list of experiment whether 
					   because it is successfully treated with drug or evolve to become resistant virus.
					 */
					break;
				case 3:
					/*display list of resistant viruses (print list index, virus
						information which consists of name, population and drug that caused 
						virus to become resistant).
					*/
					if(ResistantVirusList.isEmpty()) {
						System.out.println("No resistant viruses present");
					}else {
						for(int i=0;i<ResistantVirusList.size();i++) {
							System.out.printf("%d. %s %d\n",i,ResistantVirusList.get(i).getName(),ResistantVirusList.get(i).getPopulation(),ResistantVirusList.get(i).getDrug());
						}
					
					}
					break;
			}		
			System.out.println("");
		}
	}
	
	public static void printCom() {
		System.out.println("Virus Treatment Simulation");
		System.out.println("1. Generate Simple Virus");
		System.out.println("2. Experiment with Simple Virus");
		System.out.println("3. List of Resistant Virus");
		System.out.println("4. Exit");
		System.out.print("Choose menu: ");
	}
}
