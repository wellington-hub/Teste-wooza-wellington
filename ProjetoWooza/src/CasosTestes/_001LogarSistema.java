/**
 * Script Name	 : <b> ScriptLogarSistema</b>
 * Generated	 : <b>11/03/2020 16:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 *  
 * @since  2020/03/11
 * @author f912629
 * 
 * 3.1	Autenticação do Usuário
 *Eu, como empregado acesso o App Sou Caixa ou via Web, com acesso previamente cadastrado no próprio App, 
 *na opção “Cadastre-se” redireciona ao cadastro do login.caixa.gov.br.

 *Critério de aceitação:
 *
 *Cenário 1: Login Empregado
 *Dado um usuário que está na tela de login informa os campos abaixo e clica no botão “Entrar
•	Campo CPF ou e-mail (Login).
•	Senha
 *
 * Cenário 2: Logo Empregado
 *Dado um usuário que estiver no ambiente com a autenticação validada, o empregado poderá fechar ou efetuar 
 *logoff de sua conta por meio da opção “Sair”.

 * Cenário 3: Valida os dados no SISRH
 *Dado um usuário que estiver no ambiente, valida a informações com a matricula e senha através da funcionalidade
 * Cabeçalho SISRH e SAP
 *
 * 
 */
package CasosTestes;

import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.WOOZAUtils;

public class _001LogarSistema extends WOOZAUtils {

	// Caso de Teste
	@Test
	public void testar001() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("001");
	}

	// Método de Teste
	public void test001LogarSistema() throws Exception {

		/**********************
		 * Teste
		 ********************/
		acessarURLClaro();
		

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
		 * relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}
}
