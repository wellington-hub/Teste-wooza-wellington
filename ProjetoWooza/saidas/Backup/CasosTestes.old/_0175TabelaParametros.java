package CasosTestes;

import ftor_junit.SIGPM2Utils;

import org.junit.Test;
import ftor_junit.ConfigureExecution;

public class _0175TabelaParametros extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0175() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0175");
		}

		// Método de Teste
		public void test0175TabelaParametros() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarTabelaParametros();
			clicarNovoParametro();
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}





