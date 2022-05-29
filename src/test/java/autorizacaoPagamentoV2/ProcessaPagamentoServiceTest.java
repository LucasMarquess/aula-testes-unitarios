package autorizacaoPagamentoV2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ufes.autorizacaopagamento.business.DiretorFinanceiro;
import com.ufes.autorizacaopagamento.business.DiretorGeral;
import com.ufes.autorizacaopagamento.business.GerenteGeral;
import com.ufes.autorizacaopagamento.business.GerenteImediato;
import com.ufes.autorizacaopagamento.business.ProcessaPagamentoService;
import com.ufes.autorizacaopagamento.business.SuperiorHierarquico;
import com.ufes.autorizacaopagamento.business.excecoes.SuperioresIndisponiveisException;
import com.ufes.autorizacaopagamento.business.excecoes.TratadoresVazioException;

class ProcessaPagamentoServiceTest {

	private ProcessaPagamentoService processa;
	private DiretorFinanceiro diretorFinanceiro;
	private DiretorGeral diretorGeral;
	private GerenteGeral gerenteGeral;
	private GerenteImediato gerenteImediato;

	@BeforeEach
	private void beforeEach() {
		this.processa = new ProcessaPagamentoService();
		this.diretorFinanceiro = new DiretorFinanceiro(true);
		this.diretorGeral = new DiretorGeral(true);
		this.gerenteGeral = new GerenteGeral(true);
		this.gerenteImediato = new GerenteImediato(true);

		this.processa.addTratador(gerenteImediato);
		this.processa.addTratador(gerenteGeral);
		this.processa.addTratador(diretorFinanceiro);
		this.processa.addTratador(diretorGeral);

	}

//	@Test
//	void testGerenteGeral() {
//		// given
//		// when
//		String result = this.processa.processaAprovacao(600);
//		// then
//		assertEquals(result,
//				"\r\nGerente imediato não pôde aprovar o pagamento solicitado\r\nGerente Geral autorizando pagamento no valor de R$ 600.0");
//
//	}
//
//	@Test
//	void testGerenteImediato() {
//		// given
//		// when
//		String result = this.processa.processaAprovacao(400);
//		// then
//		assertEquals(result, "\r\nGerente imediato autorizando pagamento no valor de R$ 400.0");
//
//	}
//
//	@Test
//	void testDiretorFinanceiro() {
//		// given
//		// when
//		String result = this.processa.processaAprovacao(1600);
//		// then
//		assertEquals(result,
//				"\r\nGerente imediato não pôde aprovar o pagamento solicitado\r\nGerente Geral não pôde aprovar o pagamento solicitado\r\nDiretor financeiro autorizando pagamento no valor de R$ 1600.0");
//
//	}
//
//	@Test
//	void testDiretorGeral() {
//		// given
//		// when
//		String result = this.processa.processaAprovacao(14999);
//		// then
//		assertEquals(result,
//				"\r\nGerente imediato não pôde aprovar o pagamento solicitado\r\nGerente Geral não pôde aprovar o pagamento solicitado\r\nDiretor financeiro não pôde aprovar o pagamento solicitado\r\nDiretor Geral autorizando pagamento no valor de R$ 14999.0");
//
//	}

//	@Test
//	void testTratadorNulo() {
//		// given
//		ProcessaPagamentoService processaPagamentoService = new ProcessaPagamentoService();
//		// when
//		// then
//		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
//			processaPagamentoService.addTratador(null);
//		});
//		assertEquals("Falha: Instancie um tratador de pagamentos válido!", thrown.getMessage());
//
//	}
//
//	@Test
//	void testValorNegativo() {
//		// given
//		// when
//		// then
//		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
//			this.processa.processaAprovacao(-5);
//		});
//		assertEquals("Falha: Valor de pagamento inválido:\nO valor deve ser > 0", thrown.getMessage());
//
//	}
//
//	@Test
//	void testValorMaiorQuinzeMil() {
//		// given
//		// when
//		// then
//		final IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
//			this.processa.processaAprovacao(20000);
//		});
//		assertEquals("Falha: O pagamento é superior ao autorização e \\nnão pôde ser processado por nenhum superior hierárquico", thrown.getMessage());
//
//	}
//
//	@Test
//	void testSuperioresVazio() {
//		// given
//		ProcessaPagamentoService processaPagamentoService = new ProcessaPagamentoService();
//		// when
//		// then
//		final TratadoresVazioException thrown = assertThrows(TratadoresVazioException.class, () -> {
//			processaPagamentoService.processaAprovacao(6000);
//		});
//		assertEquals(thrown.getMessage(), "Falha: Nenhum superior hierarquico foi adicionado!");
//
//	}
//
//	@Test
//	void todosInativos() {
//		//given
//		ProcessaPagamentoService pagamentoServiceInativos = new ProcessaPagamentoService();
//		pagamentoServiceInativos.addTratador(new GerenteImediato( false ));
//		pagamentoServiceInativos.addTratador(new GerenteGeral( false ));
//		pagamentoServiceInativos.addTratador(new DiretorFinanceiro( false ));
//		pagamentoServiceInativos.addTratador(new DiretorGeral( false ));
//		//when
//		//then
//		final SuperioresIndisponiveisException thrown = assertThrows(SuperioresIndisponiveisException.class, () -> {
//			pagamentoServiceInativos.processaAprovacao(6000);
//		});
//		assertEquals(thrown.getMessage(), "Todos os superiores estão indisponíveis!");
//	}

}
