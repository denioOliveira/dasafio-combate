package jogo;

import java.util.Locale;
import java.util.Scanner;

import util.Champion;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int z = 0;
		int fim = 0;
		System.out.println("Digite os dados do primeiro capeão: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ateque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();
		Champion champ = new Champion(nome,life,attack,armor);
		
		System.out.println("Digite os dados do primeiro capeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ateque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		System.out.println();
		
		Champion champ2 = new Champion(nome2,life2,attack2,armor2);
		
		System.out.print("Quantos turno você deseja executar? ");
		int quant = sc.nextInt();
		System.out.println();
		
		for(int i=0;i < quant; i++) {
			System.out.println("Resultado do turno: " + (i+1));
			fim += 1; 
			if (champ.getAttack() > champ2.getArmor()) {
				champ.takeDamage(champ2);
				if (champ.getLife() <= 0) {
					i = quant;
					champ.setLife(z);
					System.out.println( champ.toString()+"(morreu)");
					champ2.setLife(life2-fim);
					System.out.println(champ2.toString());
					System.out.println();
					System.out.println("FIM DE COMBATE");
				}
				else {
					System.out.println(champ.toString());
					champ2.takeDamage(champ);
					System.out.println(champ2.toString());
				}	
			}
			if (champ.getAttack() < champ2.getArmor()) {
				champ.takeDamage(champ2);
				if (champ.getLife() <= 0) {
					i = quant;
					champ.setLife(z);
					System.out.println( champ.toString()+"(morreu)");
					champ2.setLife(life2-fim);
					System.out.println(champ2.toString());
					System.out.println();
					System.out.println("FIM DE COMBATE");
				}
				else {
					System.out.println(champ.toString());
					champ2.takeDamage(champ);
					champ2.setLife(life2-i-1);
					System.out.println(champ2.toString());	
				}
		
			}
			
			if (fim >= quant) {
				System.out.println();
				System.out.println("FIM DE COMBATE");
			}
				
		}
			
		sc.close();
	}

}
