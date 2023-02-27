package com.pxt.SistemaBanco.services;

import java.math.BigDecimal;
import java.util.List;

import com.pxt.SistemaBanco.domain.Operacao;
import com.pxt.SistemaBanco.domain.dto.OperacaoDTO;

public interface OperacaoService {

//	public OperacaoDTO efetuarOperacao(OperacaoDTO operacaoDTO);

	public List<Operacao> buscar(Long codop);

	OperacaoDTO efetuarOperacao(OperacaoDTO operacaoDTO);

}