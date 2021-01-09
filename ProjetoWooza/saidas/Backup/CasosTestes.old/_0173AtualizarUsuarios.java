package CasosTestes;
import ftor_junit.SIGPM2Utils;

import org.junit.Test;
import ftor_junit.ConfigureExecution;

public class _0173AtualizarUsuarios extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0173() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0173");
		}

		// Método de Teste
		public void test0173AtualizarUsuarios() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarAtualizarUsuarios();

			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}




