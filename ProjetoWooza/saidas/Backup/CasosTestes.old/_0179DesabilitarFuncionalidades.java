package CasosTestes;
import ftor_junit.SIGPM2Utils;
import org.junit.Test;
import ftor_junit.ConfigureExecution;
public class _0179DesabilitarFuncionalidades extends SIGPM2Utils {

	// Caso de Teste
		@Test
		public void testar0179() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("0179");
		}

		// Método de Teste
		public void test0179DesabilitarFuncionalidades () throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM2();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarAdministracao();
			desabilitarFuncionalidade();
			//desabFiqueBem();
			
			
			
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}









