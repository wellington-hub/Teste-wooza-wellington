package CasosTestes;
import ftor_junit.SIGPM2Utils;
import org.junit.Test;
import ftor_junit.ConfigureExecution;
public class _0177ExcluirContraCheque extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0177() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0177");
		}

		// Método de Teste
		public void test0177ExcluirContraCheque () throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarExcluirContraCheque();
			exclusaoContraCheque();
			
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}







