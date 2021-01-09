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

public class _012Calendario_Afastamentos extends SIGPMUtils {
	// Caso de Teste
	@Test
	public void testar012() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("012");
	}

	// Método de Teste
	public void test012Calendario_Afastamentos() throws Exception {

		/**********************
		 * Teste
		 ********************/
		acessarURLSIGPM();
		preencherCPF();
		clicarBotaoProximo();
		preencherSenha();
		clicarBotaoEntrar();
		// Calendario Afastamentos
		clicar_Menu_Calendario_Afastamentos();
		mesInicialFinal();
		anoInicialFinal();
		enviarCalendarioAfasamentos();

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
		 * relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}

}