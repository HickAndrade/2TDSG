package br.com.fiap.bo.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.bo.CalculadoraBO;

public class CalculadoraBOImpl
				extends UnicastRemoteObject
				implements CalculadoraBO {

	private static final long serialVersionUID = 6581714345932771077L;

	public CalculadoraBOImpl() throws RemoteException {
		super();
	}

	@Override
	public double somar(double n1, double n2) throws RemoteException {
		System.out.println("somando...");
		return n1+n2;
	}

	@Override
	public double subtrair(double n1, double n2) throws RemoteException {
		System.out.println("subtraindo...");
		return n1-n2;
	}

	@Override
	public int fatorial(int n) throws RemoteException {
		System.out.println("Fatorando...");
		
		return	(n==1?1:fatorial(n-1)*n);	
	}
	

}
