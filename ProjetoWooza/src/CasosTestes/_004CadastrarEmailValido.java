/**
 * Script Name	 : <b> ScriptDependentes</b>
 * Generated	 : <b>03/07/2020 16:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 * 
 * @since  2020/07/03
 * @author f912629
 * 
 * dddtel();//obrigatorio e foi encontrado problema 03072020
 * 
 */

package CasosTestes;
import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.WOOZAUtils;

public class _004CadastrarEmailValido extends WOOZAUtils {
	
	// Caso de Teste
		@Test
		public void testar004() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("004");
		}

		// Método de Teste
		public void test004Dependentes() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLClaro();
			cadastrarEmailValido();


			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

}
