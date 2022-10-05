package com.soprasteria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci nome: ");
		String name = in.nextLine();
		System.out.println("Inserisci cognome: ");
		String surname = in.nextLine();
		System.out.println("Inserisci eta: ");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Inserisci luogo di nascita: ");
		String placeOfBirth = in.nextLine();
		System.out.println("Inserisci altezza: ");
		float height = in.nextFloat();
		System.out.println("Hai la patente? (true/false): ");
		boolean canDrive = in.nextBoolean();
		System.out.println("Inserisci il tuo genere (M/F/A): ");
		String gender = in.nextLine();
		
		System.out.println("Nome: " + name);
		System.out.println("Cognome: " + surname);
		System.out.println("Eta: " + age);
		System.out.println("Luogo di nascita: " + placeOfBirth);
		System.out.println("Altezza: " + height + " m");
		System.out.println("Patente? " + canDrive);
	}
	
}
