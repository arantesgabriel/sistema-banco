package com.pxt.banco.repository;

import java.util.ArrayList;
import java.util.List;

import com.pxt.banco.domain.Conta;

public class ContaRepositoryImpl implements ContaRepositoryInt {

	static List<Conta> listaContas = new ArrayList<Conta>();

	public Integer gerarNumeroConta() {
		return listaContas.size();

	}

	public Conta gerarNovaConta(Conta conta) {
		listaContas.add(conta);
		return conta;

	}

}
