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

public class _020Fique_Bem extends SIGPMUtils {

	// Caso de Teste
		@Test
		public void testar020() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("020");
		}

		// Método de Teste
		public void test020Fique_Bem() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			//Simulando Férias
//			clicarMenuSimularFérias();
//			inserirDataInicioFerias();
//			inserirDiasGozo();
//			inserirQtdAbonoP();
//			parcelamento();
			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}


