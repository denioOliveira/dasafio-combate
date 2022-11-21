package util;

public class Champion {
	private String nome;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String nome, int life, int attack, int armor) {
		this.nome = nome;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	public void takeDamage(Champion other) {
		int demage = other.attack - armor;
		life -= demage;
		
	}
	public String toString() {
		return nome
				+ ": "
				+ String.format("%d", life)
				+ " de vida";				
	}
	
}
