package br.com.fiap.beans;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_ANIMAL")
public class Animal {
	
	@Coluna(nome = "cd_animal",nullable = false)
	private int codigo;
	
	@Coluna(nome = "quant_patas",nullable = true)
	private int qtdPatas;
	
	@Coluna(nome = "ds_especie",nullable = false)
	private String especie;
	
	@Coluna(nome = "ds_voador",nullable = false)
	private boolean voador;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isVoador() {
		return voador;
	}
	public void setVoador(boolean voador) {
		this.voador = voador;
	}
	
	
}
