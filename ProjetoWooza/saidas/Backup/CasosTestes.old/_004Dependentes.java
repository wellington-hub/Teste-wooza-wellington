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
import ftor_junit.SIGPMUtils;

public class _004Dependentes extends SIGPMUtils {
	
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
			acessarURLSIGPM();
			preencherCPF();
			clicarBotaoProximo();
			preencherSenha();
			clicarBotaoEntrar();
			clicarMenuDependentes();
			clicarCadastrodeDependentes();
			escolhaAnexo();
			dddtel();//obrigatorio e foi encontrado problema 03072020
			marcarOpcoes();
			nomeCompleto();
			dataNascimento();
			cpf();
			tipoDependente();
			escolhaSolicitacao();
			declaracaoResponsabilidade();
			enviarInformaçõesDependentes();
			clicarMenuDependentes();
			clicarMenuConsultaDependentes();

			/************************************************
			 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
			 * relatório.
			 ************************************************/
			adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
		}

}
