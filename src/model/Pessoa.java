package model;


public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa() {
	}


	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", idade: " + idade + "]";
	}


	@Override
	public int hashCode() {
		 if (idade <= 18) return 0;
		 if (idade <= 45) return 1;
		 return 2;
	}

	
}
