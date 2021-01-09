package CasosTestes;

import org.junit.Test;

import ftor_junit.ConfigureExecution;
//import ftor_junit.SIGPMUtils;
import ftor_junit.SIGPM2Utils;

public class _0171LogErros extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0171() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0171");
		}

		// Método de Teste
		public void test0171LogErros() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarLogErros();
			funcionalidade();
			selecioneData();
			pesquisar();
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}


