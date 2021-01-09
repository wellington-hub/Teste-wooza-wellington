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

public class _007Dados_Cadastrais extends SIGPMUtils {
	
	// Caso de Teste
				@Test
				public void testar007() throws Exception {

					ConfigureExecution.configurarExecucaoCasosTeste("007");
				}

				// Método de Teste
				public void test007Dados_Cadastrais() throws Exception {

					/**********************
					 * Teste
					 ********************/
					acessarURLSIGPM();
					preencherCPF();
					clicarBotaoProximo();
					preencherSenha();
					clicarBotaoEntrar();
					clicarDadosCadastrais();
					justificativa();
					dddtel();
					email();
					enviarDadosCadastrais();
					fecharDados();
				    ConsultaDadosCadastrais();
					
					
					
					

					/************************************************
					 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
					 * relatório.
					 ************************************************/
					adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
				}

		}