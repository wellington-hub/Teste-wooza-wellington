package CasosTestes;
import ftor_junit.SIGPM2Utils;
import org.junit.Test;
import ftor_junit.ConfigureExecution;
public class _0181AlterTermoUso extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0181() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0181");
		}

		// Método de Teste
		public void test0181AlterTermoUso () throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			clicarAlterTermoUso();
			//clicarContinuarAlter();
			
			
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}










