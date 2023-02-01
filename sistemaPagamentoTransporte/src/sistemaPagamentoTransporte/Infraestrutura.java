package sistemaPagamentoTransporte;

import java.util.*;

public class Infraestrutura {

//****************************************** ATRIBUTOS ******************************************//
	
	private String local, tipoVeiculosAtendidos; 
	private ArrayList<Integer> linhasAtendidas;
	private int idInfraestrutura;
	
//****************************************** CONSTRUTORES ******************************************//
	
	Infraestrutura(String l, String tV, ArrayList<Integer> lA, int idInfra) {
		
		this.local = l;
		this.tipoVeiculosAtendidos = tV;
		this.linhasAtendidas = lA;
		this.idInfraestrutura = idInfra;		
	}

//*************************************** SETTERS & GETTERS ***************************************//
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipoVeiculosAtendidos() {
		return tipoVeiculosAtendidos;
	}

	public void setTipoVeiculosAtendidos(String tipoVeiculosAtendidos) {
		this.tipoVeiculosAtendidos = tipoVeiculosAtendidos;
	}

	public ArrayList<Integer> getLinhasAtendidas() {
		return linhasAtendidas;
	}

	public void setLinhasAtendidas(ArrayList<Integer> linhasAtendidas) {
		this.linhasAtendidas = linhasAtendidas;
	}

	public int getIdInfraestrutura() {
		return idInfraestrutura;
	}

	public void setIdInfraestrutura(int idInfraestrutura) {
		this.idInfraestrutura = idInfraestrutura;
	}

//******************************************** MÉTODOS ********************************************//	
}
