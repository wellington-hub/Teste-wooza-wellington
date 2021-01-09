package CasosTestes;
import ftor_junit.SIGPM2Utils;

import org.junit.Test;
import ftor_junit.ConfigureExecution;

public class _0172Usuarios extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0172() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0172");
		}

		// Método de Teste
		public void test0172Usuarios() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarUsuarios();
			inserirMatricula();
			inserirPeriodo();
			pesquisarUsuarios();
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}



