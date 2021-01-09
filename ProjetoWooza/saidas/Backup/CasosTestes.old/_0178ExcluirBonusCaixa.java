package CasosTestes;
import ftor_junit.SIGPM2Utils;
import org.junit.Test;
import ftor_junit.ConfigureExecution;
public class _0178ExcluirBonusCaixa extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0178() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0178");
		}

		// Método de Teste
		public void test0178ExcluirBonusCaixa () throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarExcluirBonusCaixa();
			exclusaoBonusCaixa();
			
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}








