package edu.cibertec.lp2.entity;

public class Veterinario {
	
	private int idVeterinario;
	private String nomVeterinario;
	
	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veterinario(int idVeterinario, String nomVeterinario) {
		super();
		this.idVeterinario = idVeterinario;
		this.nomVeterinario = nomVeterinario;
	}

	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public String getNomVeterinario() {
		return nomVeterinario;
	}

	public void setNomVeterinario(String nomVeterinario) {
		this.nomVeterinario = nomVeterinario;
	}
	
	

}
