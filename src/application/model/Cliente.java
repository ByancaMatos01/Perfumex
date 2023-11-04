package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario{

	private String cpf;
	private ArrayList<Carrinho> carrinhos;

	public Cliente(int id, String nome, String sobrenome, String email, String senha, String telefone, String status,
			LocalDate dataCriacao, LocalDate dataUltimaModificacao, String cpf) {
		super(id, nome, sobrenome, email, senha, telefone, status, dataCriacao, dataUltimaModificacao);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Carrinho> getCarrinhos() {
		return carrinhos;
	}

	public void setCarrinhos(ArrayList<Carrinho> carrinhos) {
		this.carrinhos = carrinhos;
	}

	
}
