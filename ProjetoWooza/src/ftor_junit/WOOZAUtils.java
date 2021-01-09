package ftor_junit;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/
public class WOOZAUtils extends Utils {

	// Pre requisito para todas as Funcionaldiades do sistema

	public void acessarURLClaro() throws Exception {
		acessarURL(DataDriven.url);
	}

	public void insiraSeuNumero() throws Exception {

		clicarElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-accessibility-bar/div/div/div[2]/a"), "Informe seu Numero");
		pausar(2000);
	}

	

	public void preencherTelefone() throws Exception {

		escreverTexto(By.xpath("//*[@id='area_code']"), DataDriven.areacod, "Area Cod");
		pausar(2000);
		escreverTexto(By.xpath("//*[@id='number']"), DataDriven.telefone, "telefone");
		pausar(2000);
		
	}
	
	public void clicarBotaoOK() throws Exception {
		clicarElemento(By.xpath("//*[@id='login-container']/div[1]/form/input[4]"), "ok");
		pausar(2000);
		
	}
	
	public void pesquisaDeProduto() throws Exception {
		mouseScrollBuscaElemento(By.xpath("//*[@id='mat-input-0']"));
		pausar(2000);
		aguardarPorElemento(By.xpath("//*[@id='mat-input-0']"));

		clicarElemento(By.xpath("//*[@id='mat-input-0']"), "motorola razr");
		pausar(2000);
		
		escreverTexto(By.xpath("//*[@id='mat-input-0']"), DataDriven.produto, "telefone");
		pausar(2000);
		
		fazEnter(By.xpath("//*[@id='mat-input-0']"));
		
		
	}
	
	public void cadastrarEmailValido() throws Exception {
		mouseScrollBuscaElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"));
		pausar(2000);
		aguardarPorElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"));

		clicarElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"), "motorola razr");
		pausar(2000);
		
		escreverTexto(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"), DataDriven.email, "Deixe aqui seu E-mail");
		pausar(2000);
		
		fazEnter(By.xpath("//*[@id='button']"));
		pausar(20000);
		
	}
	
	public void cadastrarEmailInvalido() throws Exception {
		mouseScrollBuscaElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"));
		pausar(2000);
		aguardarPorElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"));

		clicarElemento(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"), "motorola razr");
		pausar(2000);
		
		escreverTexto(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/app-lead-pickup/div/div/div/form/input"), DataDriven.email, "Deixe aqui seu E-mail");
		pausar(2000);
		
		fazEnter(By.xpath("//*[@id='button']"));
		pausar(20000);
		
	}

}
