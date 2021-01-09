package CasosTestes;
import ftor_junit.SIGPM2Utils;
import org.junit.Test;
import ftor_junit.ConfigureExecution;
public class _0180TermoUso extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0180() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0180");
		}

		// Método de Teste
		public void test0180TermoUso () throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarTermoUso();
			clicarContinuar();
			
			
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}









