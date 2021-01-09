/**
 * Script Name	 : <b> ScriptAtestadoMedico</b>
 * Generated	 : <b>03/07/2020 16:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 * 
 * @since  2020/07/03
 * @author f912629
 * 
 */

package CasosTestes;
import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.WOOZAUtils;

public class _005CadastrarEmailInvalido extends WOOZAUtils {
	
	// Caso de Teste
			@Test
			public void testar005() throws Exception {

				ConfigureExecution.configurarExecucaoCasosTeste("005");
			}

			// Método de Teste
			public void test005Atestado_Medico() throws Exception {

				/**********************
				 * Teste
				 ********************/
				acessarURLClaro();
				cadastrarEmailInvalido();
//				preencherCPF();
//				clicarBotaoProximo();
//				preencherSenha();
//				clicarBotaoEntrar();
//				// abaixo os menus
//				clicarAtestado();
//				preencherAtestado();
//				dddtel();
//				email();
//				enviar();
//				clicarAtestado();
//				meusAtestados();
//			
//				
//				
				
				
				

				/************************************************
				 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
				 * relatório.
				 ************************************************/
				adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
			}

	}