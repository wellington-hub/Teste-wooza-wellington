package CasosTestes;
import ftor_junit.SIGPM2Utils;
import org.junit.Test;
import ftor_junit.ConfigureExecution;
public class _0176ExclusaoComprovanteRendimentos extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0176() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0176");
		}

		// Método de Teste
		public void test0176ExclusaoComprovanteRendimentos() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarExclusaoComprovanteRendimentos();
			exclusao();
			
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}






