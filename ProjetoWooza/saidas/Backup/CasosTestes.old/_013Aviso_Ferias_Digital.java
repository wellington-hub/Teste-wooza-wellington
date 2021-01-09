/**
 * Script Name	 : <b> ScriptLogarSistema</b>
 * Generated	 : <b>11/03/2020 16:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 * 
 * @since  2020/03/11
 * @author f912629
 * 
 */

package CasosTestes;

import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.SIGPMUtils;

public class _013Aviso_Ferias_Digital extends SIGPMUtils {

	// Caso de Teste
		@Test
		public void testar013() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("013");
		}

		// Método de Teste
		public void test013Aviso_Ferias_Digital() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			//Simulando Férias
			clicarMenuAvisoFeriasDigital();
			assinarConsultarAvisodeFérias();
		
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}


