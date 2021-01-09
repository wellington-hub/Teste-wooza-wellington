package ftor_junit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/

public class SIGPM2Utils extends Utils {

	// Pre requisito para todas as Funcionaldiades do sistema

	public void acessarURLSIGPM2() throws Exception {
		acessarURL(DataDriven.url);
	}

	public void preencherCPF() throws Exception {

		escreverTexto(By.xpath("//*[@id='username']"), DataDriven.usuario, "Usuário");
		pausar(2000);
	}

	public void clicarBotaoProximo() throws Exception {

		clicarElemento(By.xpath("//*[@id='button-submit']"), "Próximo");

	}

	public void preencherSenha() throws Exception {

		escreverTexto(By.xpath("//*[@id='password']"), DataDriven.senha, "Senha");
		pausar(2000);
	}

	public void clicarBotaoEntrar() throws Exception {

		clicarElemento(By.xpath("//*[@id='template-section']/form/div[2]/button"), "Entrar");

		refreshPagina();
		pausar(20000);

	}

	public void clicarAdministracao() throws Exception {
		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/a/span[1]"));
		pausar(2000);
		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/a/span[1]"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/a/span[1]"), "Administração");
		pausar(2000);
	}

	public void clicarLogErros() throws Exception {

		aguardarPorElemento(By.xpath("// *[@id='menu']/div/div/div/ul/li[19]/ul/li[1]/a/span"));

		clicarElemento(By.xpath("// *[@id='menu']/div/div/div/ul/li[19]/ul/li[1]/a/span"), "Log de Erros");
		pausar(2000);
	}

	public void funcionalidade() throws Exception {

		clicarElemento(By.xpath("//*[@id='cmbFuncionalidade']"), "Funcionalidade");
		pausar(2000);

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbFuncionalidade']"), DataDriven.funcionalidade,
				"Funcionalidade");
		pausar(2000);
	}

	public void selecioneData() throws Exception {

		clicarElemento(By.id("dtSelecioneadata"), "Selecione a data");
		escreverTexto(By.xpath("//*[@id='dtSelecioneadata']"), DataDriven.dtfunc, "Selecione a data");
		pausar(2000);

		fazTAB(By.id("dtSelecioneadata"));
		pausar(2000);
	}

	public void pesquisar() throws Exception {

		fazEnter(By.xpath("//*[@id='formMain']/div/div[5]/button[1]"));
		// refreshPagina();
		// pausar(2000);

	}

	public void clicarUsuarios() throws Exception {

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[2]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[2]/a/span"), "Usuários");
		pausar(20000);

	}

	public void inserirMatricula() throws Exception {

		driver.findElement(By.id("txtMatricula")).click();
		driver.findElement(By.id("txtMatricula")).clear();
		driver.findElement(By.id("txtMatricula")).sendKeys("c126039");
		// driver.findElement(By.id("dtPesquisa")).click();
		// driver.findElement(By.xpath("//div[2]/div[3]/div/button")).click();
		// driver.findElement(By.xpath("//form[@id='formMain']/div/div/div[3]/div[3]/button")).click();

		//
		// mouseScrollBuscaElemento(By.xpath("/html/body/div[1]/div[2]/div[2]/div/form/div/div/div[3]/div[1]/div/input"));
		// pausar(2000);
		// aguardarPorElemento(By.xpath("/html/body/div[1]/div[2]/div[2]/div/form/div/div/div[3]/div[1]/div/input"));
		// pausar(2000);
		// clicarElemento(By.xpath("/html/body/div[1]/div[2]/div[2]/div/form/div/div/div[3]/div[1]/div/input"),
		// "Informe a Matrícula");
		// pausar(200);
		// escreverTexto(By.xpath("/html/body/div[1]/div[2]/div[2]/div/form/div/div/div[3]/div[1]/div/input"),
		// DataDriven.matriculac, "Informe a Matrícula");
		pausar(2000);
	}

	public void inserirPeriodo() throws Exception {
		// *[@id="dtPesquisa"]
		aguardarPorElemento(By.xpath("//*[@id='dtPesquisa']"));
		clicarElemento(By.xpath("//*[@id='dtPesquisa']"), "Selecione a data");
		escreverTexto(By.xpath("//*[@id='dtPesquisa']"), DataDriven.periodo, "Selecione a data");
		fazTAB(By.id("dtPesquisa"));
		pausar(2000);
	}

	public void pesquisarUsuarios() throws Exception {
		fazEnter(By.xpath("//*[@id='formMain']/div/div/div[3]/div[3]/button[1]"));
		// refreshPagina();
		// pausar(2000);
		// *[@id="formMain"]/div/div/div[3]/div[3]/button[1]
		pausar(2000);
	}

	public void clicarAtualizarUsuarios() throws Exception {

		// *[@id="menu"]/div/div/div/ul/li[19]/ul/li[3]/a/span
		// *[@id="menu"]/div/div/div/ul/li[19]/ul/li[3]/a

		mouseScrollBuscaElemento(By.xpath("//div[@id='menu']/div/div/div/ul/li[19]/ul/li[3]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//div[@id='menu']/div/div/div/ul/li[19]/ul/li[3]/a/span"));

		clicarElemento(By.xpath("//button[@id='btnAtualizarusuarios']/span"), "Atualizarusuarios");
		pausar(2000);

		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();

	}

	public void clicarArquivoFunc() throws Exception {

		// *[@id="menu"]/div/div/div/ul/li[19]/ul/li[4]/a/span

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[4]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[4]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[4]/a/span"), "Arquivo Funcionário");
		pausar(2000);

	}

	public void consultarArquivoFunc() throws Exception {

		driver.findElement(By.id("txtMatricula")).click();
		driver.findElement(By.id("txtMatricula")).clear();
		driver.findElement(By.id("txtMatricula")).sendKeys("c126039");
		driver.findElement(By.xpath("//form[@id='formMain']/div/div[4]/div/select")).click();
		new Select(driver.findElement(By.xpath("//form[@id='formMain']/div/div[4]/div/select")))
				.selectByVisibleText("Contracheque");
		driver.findElement(By.xpath("//form[@id='formMain']/div/div[4]/div/select")).click();
		driver.findElement(By.id("cmbAno")).click();
		new Select(driver.findElement(By.id("cmbAno"))).selectByVisibleText("2018");
		driver.findElement(By.id("cmbAno")).click();
		driver.findElement(By.id("cmbMes")).click();
		new Select(driver.findElement(By.id("cmbMes"))).selectByVisibleText("Setembro");
		driver.findElement(By.id("cmbMes")).click();

		pausar(2000);

	}

	public void consultarArquivo() throws Exception {

		fazEnter(By.id("btnConsultar2"));
		pausar(2000);

		mouseScrollBuscaElemento(By.xpath("//td[2]/a/i"));

		driver.findElement(By.xpath("//td[2]/a/i")).click();
		pausar(2000);

		driver.findElement(By.xpath("//div/div/div/button/span")).click();
		pausar(20000);

		driver.findElement(By.xpath("(//button[@id='btnVoltar'])[2]")).click();
		pausar(20000);

		driver.findElement(By.xpath("//button[@id='btnVoltar']/span")).click();
		pausar(2000);
	}

	public void clicarTabelaParametros() throws Exception {

		// *[@id="menu"]/div/div/div/ul/li[19]/ul/li[5]/a/span

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[5]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[5]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[5]/a/span"), "Tabela de Parâmetros");
		pausar(2000);

	}

	public void clicarNovoParametro() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//form[@id='formMain']/div/div/div[3]/button"));
		pausar(20000);

		aguardarPorElemento(By.xpath("//form[@id='formMain']/div/div/div[3]/button"));

		clicarElemento(By.xpath("//form[@id='formMain']/div/div/div[3]/button"), "novoParametro");
		pausar(2000);

		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("teste");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		/// gerarNumeroRandomico()

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("123445678910");

		driver.findElement(By.xpath("//form[@id='formMain']/div/div/div[3]/button")).click();

		pausar(2000);
		refreshPagina();

	}

	public void clicarExclusaoComprovanteRendimentos() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[6]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[6]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[6]/a/span"), "Excluir Comprovantes IR");
		pausar(2000);

	}

	public void exclusao() throws Exception {
		// matricula
		// *[@id="txtMatricula"]
		driver.findElement(By.id("txtMatricula")).click();
		driver.findElement(By.id("txtMatricula")).clear();
		driver.findElement(By.id("txtMatricula")).sendKeys("c126039");

		// ano
		// *[@id="cmbAnobase"]
		driver.findElement(By.id("cmbAnobase")).click();
		new Select(driver.findElement(By.id("cmbAnobase"))).selectByVisibleText("2019");
		driver.findElement(By.id("cmbAnobase")).click();

		// excluir

		// *[@id="btnExcluir"]
		clicarElemento(By.xpath("//*[@id='btnExcluir']"), "Clique aqui para excluir os comprovantes de rendimentos");
		pausar(2000);
		refreshPagina();
	}

	public void clicarExcluirContraCheque() throws Exception {
		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[7]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[7]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[7]/a/span"), "Excluir Contracheques");
		pausar(2000);

	}

	public void exclusaoContraCheque() throws Exception {
		// matricula
		// *[@id="txtMatricula"]
		driver.findElement(By.id("txtMatricula")).click();
		driver.findElement(By.id("txtMatricula")).clear();
		driver.findElement(By.id("txtMatricula")).sendKeys("c126039");

		// mes
		// *[@id="cmbMs2"]
		driver.findElement(By.id("cmbMs2")).click();
		new Select(driver.findElement(By.id("cmbMs2"))).selectByVisibleText("Setembro");
		driver.findElement(By.id("cmbMs2")).click();

		// ano
		// *[@id="cmbAno2"]
		driver.findElement(By.id("cmbAno2")).click();
		new Select(driver.findElement(By.id("cmbAno2"))).selectByVisibleText("2019");
		driver.findElement(By.id("cmbAno2")).click();

		// excluir

		// *[@id="btnExcluir"]

		clicarElemento(By.xpath("//*[@id='btnExcluir']"), "Clique aqui para excluir os contracheques");
		pausar(2000);
		refreshPagina();

	}

	public void clicarExcluirBonusCaixa() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[8]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[8]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[8]/a/span"), "Excluir Bonus Caixa");
		pausar(2000);

	}

	public void exclusaoBonusCaixa() throws Exception {
		// matricula
		// *[@id="txtMatricula"]
		driver.findElement(By.id("txtMatricula")).click();
		driver.findElement(By.id("txtMatricula")).clear();
		driver.findElement(By.id("txtMatricula")).sendKeys("c126039");

		// excluir

		// *[@id="btnExcluir"]

		clicarElemento(By.xpath("//*[@id='btnExcluir']"), "Clique aqui para excluir os abonos do funcionário");
		pausar(2000);
		refreshPagina();

	}

	public void desabilitarFuncionalidade() throws Exception {

		// *[@id='menu']/div/div/div/ul/li[19]/ul/li[9]/a

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[9]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[9]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[9]/a/span"), "Desabilitar Funcionalidade");
		pausar(20000);

		// *[@id="tbl"]/tbody/tr[20]/td[2]/button
		// clicarElemento(By.id("tbl"),"Fique Bem");
		clicarElemento(By.xpath("//table[@id='tbl']/tbody/tr[20]/td[2]/button"), "Fique Bem");
		// pausar(20000);
		// refreshPagina();
	}

	public void desabFiqueBem() throws Exception {

	}

	public void clicarTermoUso() throws Exception {
		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[10]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[10]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[10]/a/span"), "Termo de Uso");
		pausar(20000);

		// aceita termo

		// *[@id="idChkContinuar"]
		mouseScrollBuscaElemento(By.xpath("//*[@id='idChkContinuar']"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='idChkContinuar']"));

		clicarElemento(By.xpath("//*[@id='idChkContinuar']"), "Li e aceito as condições do termo.");
		pausar(30000);

	}

	public void clicarContinuar() throws Exception {

		fazEnter(By.xpath("//*[@id='btnContinuar']"));

	}

	public void clicarAlterTermoUso() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[11]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[11]/a/span"));

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[19]/ul/li[11]/a/span"), "Alterar Termo de Uso");
		pausar(20000);

		driver.findElement(By.id("txtNomedotermo")).click();
		driver.findElement(By.id("txtNomedotermo")).clear();
		driver.findElement(By.id("txtNomedotermo")).sendKeys("TERMO DE USO");
		pausar(20000);
		mouseScrollBuscaElemento(By.xpath("//*[@id='btnSalvar']"));
		pausar(2000);
		aguardarPorElemento(By.xpath("//*[@id='btnSalvar']"));
		clicarElemento(By.xpath("//*[@id='btnSalvar']"), "Clique aqui para salvar o termo de uso");

		refreshPagina();

	}

}
