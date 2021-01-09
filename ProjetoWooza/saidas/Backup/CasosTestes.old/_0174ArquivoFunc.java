package CasosTestes;
import ftor_junit.SIGPM2Utils;

import org.junit.Test;
import ftor_junit.ConfigureExecution;

public class _0174ArquivoFunc extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0174() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0174");
		}

		// Método de Teste
		public void test0174ArquivoFunc() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarArquivoFunc();
			consultarArquivoFunc();
			consultarArquivo();
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}




