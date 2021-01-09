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

public class _014Consultas extends SIGPMUtils {

	// Caso de Teste
		@Test
		public void testar014() throws Exception {

			ConfigureExecution.configurarExecucaoCasosTeste("014");
		}

		// Método de Teste
		public void test014Consultas() throws Exception {

			/**********************
			 * Teste
			 ********************/
			acessarURLSIGPM();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			//Simulando Férias
			clicarMenuConsultas();
			adiantamento();
			escalaDeFerias();
			//bonusCaixa(); //Senhor usuário, ocorreu um erro ao consultar o Bônus Caixa. - ERRO: 500 * data:24072020
			dependentes();
			dadosCadastrais();

			


			
			
			
			

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

	}
