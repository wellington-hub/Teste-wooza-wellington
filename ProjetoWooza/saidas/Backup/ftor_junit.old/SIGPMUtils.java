package ftor_junit;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/
public class SIGPMUtils extends Utils {

	// Pre requisito para todas as Funcionaldiades do sistema

	public void acessarURLSIGPM() throws Exception {
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
	// Abaixo Funcionalidade clicarMenuContraCheque

	public void clicarMenuContraCheque2018() throws Exception {

		clicarElemento(By.xpath("//*[@id='btiContrachequepng']"), "Contracheque");

		// testes com mes set e ano 2018
		clicarElemento(By.xpath("//*[@id='cmbMs2']"), "Setembro");

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbMs2']"), DataDriven.mes1, "Setembro");

		//

		clicarElemento(By.xpath("//*[@id='cmbAno2']"), "2018");

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbAno2']"), DataDriven.ano1, "2018");
		pausar(2000);
		clicarElemento(By.xpath("//*[@id='btnConsultar2']"), "Consultar");

		pausar(20000);

		refreshPagina();

	}

	public void clicarMenuContraCheque2019() throws Exception {

		// 2 teste Outubro e 2019

		clicarElemento(By.xpath("//*[@id='btiContrachequepng']"), "Contracheque");

		pausar(3000);

		clicarElemento(By.xpath("//*[@id='cmbMs2']"), "Outubro");

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbMs2']"), DataDriven.mes2, "Outubro");

		pausar(200);

		clicarElemento(By.xpath("//*[@id='cmbAno2']"), "2019");

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbAno2']"), DataDriven.ano2, "2019");

		pausar(200);

		clicarElemento(By.xpath("//*[@id='btnConsultar2']"), "Consultar");

	}

	// Abaixo Funcionalidade comprovanteRendimentos
	public void comprovanteRendimentos() throws Exception {

		driver.findElement(By.xpath("//div[@id='menu']/div/div/div/ul/li[5]/a/span")).click();
		driver.findElement(By.id("cmbAnobase")).click();
		new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("cmbAnobase"))).selectByVisibleText("2018");
		driver.findElement(By.id("cmbAnobase")).click();
		driver.findElement(By.id("matricula")).click();
		driver.findElement(By.id("matricula")).clear();
		driver.findElement(By.id("matricula")).sendKeys("C112460");
		driver.findElement(By.id("matricula")).clear();
		driver.findElement(By.id("matricula")).sendKeys("C112460");
		driver.findElement(By.xpath("//button[@id='btnConsultar2']/span")).click();

	}

	// Abaixo Funcionalidade Dependentes

	public void clicarMenuDependentes() throws Exception {

		// *[@id="menu"]/div/div/div/ul/li[6]/a/span[1]
		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[6]/a/span[1]"), "Dependentes");
		pausar(2000);
	}

	public void clicarCadastrodeDependentes() throws Exception {

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[6]/ul/li[1]/a/span"), "Cadastro de Dependentes");

		pausar(2000);

	}

	public void escolhaAnexo() throws Exception {

		fileUpload(By.xpath("//*[@id='uplArquivoDependente']/input"), "teste33.pdf", "Escolher arquivo");

	}

	public void marcarOpcoes() throws Exception {
		clicarElemento(By.id("txtInformeseuemailparticular"), "Informeseuemailparticular");
		driver.findElement(By.id("txtInformeseuemailparticular")).clear();
		driver.findElement(By.id("txtInformeseuemailparticular")).sendKeys("wellpm@gmail.com");
		pausar(2000);
		// check
		fazTAB(By.id("txtInformeseuemailparticular"));

		fazEspaco(By.xpath("//form[@id='formMain']/div/div/div[12]/div/div/label/input"));
		fazEnter(By.id("txtNomecompletododependente"));

	}

	public void nomeCompleto() throws Exception {
		escreverTexto(By.xpath("// *[@id='txtNomecompletododependente']"), DataDriven.ncompleto, "Nome Completo");
		pausar(2000);

	}

	public void dataNascimento() throws Exception {
		escreverTexto(By.xpath("//*[@id='dtDatanascimento2']"), DataDriven.dtnascimento, "data Nascimento");
		pausar(2000);

	}

	public void cpf() throws Exception {
		escreverTexto(By.xpath("// *[@id='numCpf2']"), DataDriven.cpf, "CPF");
		pausar(2000);

	}

	public void tipoDependente() throws Exception {
		//
		clicarElemento(By.xpath("//*[@id='formMain']/div/div[1]/div[16]/div/div/select"), "COMPANHEIRO");

		selecionarElementoPorTexto(By.xpath("//*[@id='formMain']/div/div[1]/div[16]/div/div/select"),
				DataDriven.tipodepende, "COMPANHEIRO");

	}

	public void escolhaSolicitacao() throws Exception {
		clicarElemento(By.xpath("//*[@id='formMain']/div/div[1]/div[19]/div/div/select"), "INCLUSAO ");

		selecionarElementoPorTexto(By.xpath("//*[@id='formMain']/div/div[1]/div[19]/div/div/select"),
				DataDriven.inclusao, "INCLUSAO");

	}

	public void declaracaoResponsabilidade() throws Exception {
		// check
		fazTAB(By.xpath("//*[@id='formMain']/div/div[1]/div[19]/div/div/select"));

		fazEspaco(By.xpath("/html/body/div[1]/div[2]/div[2]/div/form/div/div[1]/div[21]/div/label/input"));

		// driver.findElement(By.xpath("//*[@id='formMain']/div/div[1]/div[21]/div/label/input")).click();
		// full
		// /html/body/div[1]/div[2]/div[2]/div/form/div/div[1]/div[21]/div/label/input

	}

	public void enviarInformaçõesDependentes() throws Exception {

		// fazTAB(By by)
		// fazTAB(By.id("txtInformeseuemailparticular"));

		// fazEnter(By by)
		// *[@id="btnEnviarinformaces"]
		fazEnter(By.xpath("//*[@id='btnEnviarinformaces'][@ng-hide='processando']"));

		// aceitarAlerta();
		pausar(20000);

		refreshPagina();

	}

	public void clicarMenuConsultaDependentes() throws Exception {

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[6]/ul/li[3]/a/span"), "Consulta de Dependentes");
		pausar(2000);

	}

	// Abaixo Funcionalidade Atestado Medico

	public void clicarAtestado() throws Exception {
		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[8]/a/span[1]"), "Atestado");

	}

	public void preencherAtestado() throws Exception {
		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[8]/ul/li[1]/a/span"), "Enviar Atestado");

		// Selecionar Arquivo
		// fileUpload(By by, String arquivo, String nomeElemento)

		// *[@id="uplArquivoAtestado"]/input

		fileUpload(By.xpath("//*[@id='uplArquivoAtestado']/input"), "teste33.pdf", "Escolha o Arquivo");

		// driver.findElement(By.id("optSelecioneaopcao")).click();
		pausar(2000);
	}

	public void dddtel() throws Exception {

		clicarElemento(By.xpath("//*[@id='ddd']"), "ddd");
		escreverTexto(By.xpath("//*[@id='ddd']"), DataDriven.ddd, "ddd");
		pausar(2000);
		// *[@id="numInformeumnumerodetelefone"]
		clicarElemento(By.xpath("//*[@id='numInformeumnumerodetelefone']"), "Telefone");
		escreverTexto(By.xpath("//*[@id='numInformeumnumerodetelefone']"), DataDriven.telefone, "Telefone");
		pausar(2000);
	}

	public void email() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		clicarElemento(By.id("txtInformeseuemailparticular"), "Informeseuemailparticular");
		driver.findElement(By.id("txtInformeseuemailparticular")).clear();
		driver.findElement(By.id("txtInformeseuemailparticular")).sendKeys("wellpm@gmail.com");
		pausar(2000);
	}

	public void enviar() throws Exception {

		// fazTAB(By by)
		fazTAB(By.id("txtInformeseuemailparticular"));

		// fazEnter(By by)
		fazEnter(By.xpath("//*[@id='btnEnviar'][@ng-hide='enviandoAtestado']"));

		// aceitarAlerta();

		pausar(20000);

		refreshPagina();
	}

	public void meusAtestados() throws Exception {

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[8]/ul/li[2]/a/span"), "Meus Atestados");
	}

	// Abaixo Funcionalidade Licencas Maternidades

	public void clicarLicencas() throws Exception {

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[9]/a/span[1]"), "Licenças");
	}

	public void clicarLicencasMaternidades() throws Exception {
		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[9]/ul/li[1]/a/span"), "Licença Maternidade");
		pausar(2000);

		fileUpload(By.xpath("//*[@id='uplArquivoLicencaMaternidade']/input"), "teste33.pdf", "Escolha o Arquivo");

		pausar(2000);

		// tipo documento

		// selecionarElementoPorTexto(By by, String texto, String nomeElemento
		// selecionarElementoPorTexto(By.xpath("//*[@id='cmbAno2']"),
		// DataDriven.ano, "2018");
		selecionarElementoPorTexto(By.xpath("//*[@id='idTipoDocumento']"), "Certidão de nascimento",
				"Certidão de nascimento");
		pausar(2000);

		// descrição
		// *[@id="idDescricao"]
		clicarElemento(By.xpath("//*[@id='idDescricao']"), "Descrição");
		escreverTexto(By.xpath("//*[@id='idDescricao']"), DataDriven.ddd, "21");

		// continuar
		// *[@id="formMain"]/div[2]/div[4]/button
		clicarElemento(By.xpath("//*[@id='formMain']/div[2]/div[4]/button"), "Continuar");

	}

	// check
	public void check() throws Exception {
		// clicarElemento(By.xpath("//*[@id='formMain']/div/div[1]/div[9]/div/label/input"),"Solicito
		// também a prorrogação da Lei Empresa Cidadã.");
		// *[@id="formMain"]/div/div[1]/div[9]/div/label/input
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

	public void enviarInformaçoesLicencaMaternidade() throws Exception {

		// exemplo
		// :fazEnter(By.xpath("//*[@id='btnEnviar'][@ng-hide='enviandoAtestado']"));

		// *[@id="btnEnviarinformaces"]
		fazEnter(By.xpath("//*[@id='btnEnviarinformaces'][@ng-hide='enviandoLicencaMaternidade']"));

	}

	public void fechar() throws Exception {

		// clicarElemento(By.xpath("//*[@id='AlertFooter']"),"Fechar");
		clicarElemento(By.xpath("//*[@id='AlertFooter']/button[4]"), "Fechar");
		pausar(2000);
		fazEnter(By.id("btnVoltar"));
	}

	// Abaixo Funcionalidade Licencas Paternidades

	public void clicarLicencasPaternidades() throws Exception {

		clicarElemento(By.xpath("//*[@id='btnLicencaPat']"), "Licença Paternidade");
		// clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[10]/ul/li[1]/a/span"),
		// "Licença Paternidade");
		pausar(2000);

		fileUpload(By.xpath("//*[@id='uplArquivoLicencaPaternidade']/input"), "teste33.pdf", "Escolha o Arquivo");

		pausar(2000);

		selecionarElementoPorTexto(By.xpath("//*[@id='idTipoDocumento']"), "Certidão de nascimento",
				"Certidão de nascimento");
		pausar(2000);

		// descrição

		clicarElemento(By.xpath("//*[@id='idDescricao']"), "Descrição");
		escreverTexto(By.xpath("//*[@id='idDescricao']"), DataDriven.ddd, "21");

		// continuar

		clicarElemento(By.xpath("//*[@id='formMain']/div[2]/div[4]/button"), "Continuar");

	}

	// check
	public void checkP() throws Exception {

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

	public void checkOpcao20() throws Exception {

		fazEnter(By.xpath("//*[@id='optSelecioneaopcao'][@ng-click='licencaPaternidade.icProrrogacao=true']"));
		// 10 dias
		// *[@id="optSelecioneaopcao"]

		// 20 dias
		// *[@id="optSelecioneaopcao"] input-icProrrogacao:20 dias
	}

	public void enviarInformaçoesLicencaPaternidade() throws Exception {
		fazEnter(By.xpath("//*[@id='btnEnviarinformaces'][@ng-hide='enviandoLicencaPaternidade']"));

		// 21/07/2020
		pausar(20000);

		refreshPagina();
	}

	public void minhasLicencas() throws Exception {

		clicarElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[9]/ul/li[3]/a/span"), "Minhas Licenças");
	}

	// Abaixo Funcionalidade Dados Cadastrais

	public void clicarDadosCadastrais() throws Exception {
		driver.findElement(By.xpath("//div[@id='menu']/div/div/div/ul/li[10]/a/span")).click();
		driver.findElement(By.linkText("Enviar Atualização")).click();

		pausar(2000);

		fileUpload(By.xpath("//*[@id='uplArquivoDadosCadastrais']"), "teste33.pdf", "Escolha o Arquivo");
		// *[@id="uplArquivoDadosCadastrais"]
		pausar(2000);
		selecionarElementoPorTexto(By.xpath("//*[@id='idTipoDocumento']"), "Certidão de nascimento",
				"Certidão de nascimento");
		pausar(2000);

		// descrição

		clicarElemento(By.xpath("//*[@id='idDescricao']"), "Descrição");
		escreverTexto(By.xpath("//*[@id='idDescricao']"), DataDriven.ddd, "21");

		// continuar

		clicarElemento(By.xpath("//*[@id='formMain']/div[2]/div[4]/button"), "Continuar");

	}

	public void justificativa() throws Exception {
		// *[@id="formMain"]/div/div[1]/div[10]/div/div/textarea
		driver.findElement(By.xpath("//*[@id='formMain']/div/div[1]/div[10]/div/div/textarea"))
				.sendKeys("Justificativa de Teste");

	}

	public void enviarDadosCadastrais() throws Exception {

		// fazTAB(By by)
		fazTAB(By.id("txtInformeseuemailparticular"));

		// fazEnter(By by)
		fazEnter(By.xpath("//*[@id='btnEnviar'][@ng-hide='enviandoFuncionario']"));

		// aceitarAlerta();

		// refreshPagina();
		// pausar(2000);

	}

	public void fecharDados() throws Exception {

		fazEnter(By.xpath("//*[@id='AlertFooter']/button[4]"));
		pausar(2000);
		fazEnter(By.id("btnVoltar"));

	}

	public void ConsultaDadosCadastrais() throws Exception {

		clicarElemento(By.xpath("//*[@id='btnDadosCadastrias']/span"), "Consulta Dados Cadastrais");

	}

	// Abaixo Funcionalidade AuxilioAlimentacao

	public void clicarAuxilioAlimentacao() throws Exception {
		driver.findElement(By.xpath("//*[@id='menu']/div/div/div/ul/li[12]/a/span")).click();
		pausar(20000);

	}

	public void parcelaAlimentacao() throws Exception {

		clicarElemento((By.xpath("//*[@id='percAlimentacao']")), "Perc. Alimentação");
		pausar(2000);
		driver.findElement(By.id("percAlimentacao")).click();
		driver.findElement(By.id("percAlimentacao")).clear();
		driver.findElement(By.id("percAlimentacao")).sendKeys("80");

		fazTAB(By.id("percAlimentacao"));
		fazTAB(By.id("percRefeicao"));

		pausar(2000);

	}

	public void enviarAlimentacao() throws Exception {
		fazEnter(By.id("btnEnviar"));
		refreshPagina();
		pausar(3000);

	}

	// Abaixo Funcionalidade AuxilioRefeicao

	public void clicarAuxilioRefeicao() throws Exception {

		driver.findElement(By.xpath("//*[@id='menu']/div/div/div/ul/li[12]/a/span")).click();
		pausar(20000);
	}

	//
	public void parcelaRefeicao() throws Exception {
		clicarElemento((By.xpath("//*[@id='percRefeicao']")), "Perc. Refeicao");
		pausar(2000);
		driver.findElement(By.id("percRefeicao")).click();
		driver.findElement(By.id("percRefeicao")).clear();
		driver.findElement(By.id("percRefeicao")).sendKeys("30");

		// fazTAB(By.id("percAlimentacao"));
		fazTAB(By.id("percRefeicao"));

		pausar(2000);
	}

	public void enviarRefeicao() throws Exception {
		fazEnter(By.id("btnEnviar"));
		refreshPagina();
		pausar(2000);

	}

	// Abaixo Funcionalidade APIP_LP
	public void clicarMenuAPIP_LP() throws Exception {
		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[11]/a/span")), "Conversão APIP/LP");
		pausar(2000);

	}

	public void escolhaOpcaoAPIP_LP() throws Exception {

		pausar(2000);
		driver.findElement(By.id("txtApiplp")).click();
		driver.findElement(By.id("txtApiplp")).clear();
		driver.findElement(By.id("txtApiplp")).sendKeys("15");

	}

	public void enviarApip() throws Exception {

		fazEnter(By.id("btnEnviar"));
		refreshPagina();
		pausar(2000);

	}
	// Abaixo Funcionalidade MenuLP

	public void clicarMenuLP() throws Exception {
		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[11]/a/span")), "Conversão APIP/LP");
		pausar(2000);
	}

	// escolhaOpcaoLP

	public void escolhaOpcaoLP() throws Exception {
		pausar(2000);
		driver.findElement(By.xpath("(//button[@id='optSelecioneaopcao'])[2]")).click();
		driver.findElement(By.id("txtApiplp")).clear();
		driver.findElement(By.id("txtApiplp")).sendKeys("10");

	}

	public void enviarLP() throws Exception {

		fazEnter(By.id("btnEnviar"));
		refreshPagina();
		pausar(2000);
	}

	// Abaixo Funcionalidade SimularFérias

	public void clicarMenuSimularFérias() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[13]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[13]/a/span"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[13]/a/span")), "Simulador de Férias");
		pausar(20000);

	}

	public void inserirDataInicioFerias() throws Exception {
		// aguardarPorElemento(By.xpath("//*[@id='dtInicioFerias']"));
		mouseScrollBuscaElemento(By.xpath("//*[@id='dtInicioFerias']"));
		clicarElemento(By.xpath("//*[@id='dtInicioFerias']"), "Selecione a data de início das férias");
		escreverTexto(By.xpath("//*[@id='dtInicioFerias']"), DataDriven.dtferias,
				"Selecione a data de início das férias");
		pausar(2000);

	}

	public void inserirDiasGozo() throws Exception {
		aguardarPorElemento(By.xpath("//*[@id='diasGozo']"));
		clicarElemento(By.xpath("//*[@id='diasGozo']"), "Informe a quantidade de dias de gozo");
		escreverTexto(By.xpath("//*[@id='diasGozo']"), DataDriven.diasgozo, "Informe a quantidade de dias de gozo");
		pausar(2000);

	}

	public void inserirQtdAbonoP() throws Exception {
		aguardarPorElemento(By.xpath("//*[@id='qtdAbonoPecuniario']"));
		clicarElemento(By.xpath("//*[@id='qtdAbonoPecuniario']"), "Informe a quantidade de abono pecuniário");
		escreverTexto(By.xpath("//*[@id='qtdAbonoPecuniario']"), DataDriven.qtdabonop,
				"Informe a quantidade de abono pecuniário");

		pausar(20000);

	}

	public void parcelamento() throws Exception {

		fazTAB(By.id("qtdAbonoPecuniario"));
		fazEspaco(By.id("cmbParcelamento"));
		// combobox
		selecionarElementoPorTexto(By.xpath("//*[@id='cmbParcelamento']"), DataDriven.parcela, "2");

		pausar(2000);

	}

	public void enviarFerias() throws Exception {

		fazEnter(By.id("btnSimular2"));
		refreshPagina();
		pausar(2000);
	}

	// Abaixo Funcionalidade ALT PREv PRIV

	// fora do ar

	// Abaixo Funcionalidade calendario Afastamentos

	public void clicar_Menu_Calendario_Afastamentos() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[15]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[15]/a/span"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[15]/a/span")), "Calendário de Afastamentos");
		pausar(2000);

	}

	public void mesInicialFinal() throws Exception {

		// testes com mes Nov e Dez
		clicarElemento(By.xpath("//*[@id='cmbMesInicial']"), "MesInicial");

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbMesInicial']"), DataDriven.mes3, "Novembro");

		// pausar(2000);
		// clicarElemento(By.xpath("//*[@id='cmbAnoInicial']]"), "AnoInicial");
		//
		// selecionarElementoPorTexto(By.xpath("//*[@id='cmbAnoInicial']"),
		// DataDriven.ano3, "2020");

		pausar(2000);
	}

	public void anoInicialFinal() throws Exception {

		// testes com ano 2020

		// mouseScrollBuscaElemento(By.xpath("//*[@id='cmbAnoInicial']]"));

		clicarElemento(By.xpath("//*[@id='cmbMesFinal']"), "MesFinal");

		selecionarElementoPorTexto(By.xpath("//*[@id='cmbMesFinal']"), DataDriven.mes4, "Dezembro");
		pausar(2000);

		// clicarElemento(By.xpath("//*[@id='cmbAnoFinal']"), "AnoFinal");
		//
		// selecionarElementoPorTexto(By.xpath("//*[@id='cmbAnoFinal']"),
		// DataDriven.ano3, "2020");
		//
		// pausar(2000);
	}

	public void enviarCalendarioAfasamentos() throws Exception {

		fazEnter(By.id("btnEnviar"));
		refreshPagina();
		pausar(2000);

	}

	// Abaixo Funcionalidade Consultas

	public void clicarMenuConsultas() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]")), "Consultas");
		pausar(2000);

	}

	public void adiantamento() throws Exception {
		// Adiantamento

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[1]/a/span"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[1]/a/span")), "Adiantamento");
		pausar(2000);

		fazEnter(By.id("btnVoltar2"));
		refreshPagina();
		pausar(20000);

	}
	// Escala Ferias

	public void escalaDeFerias() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]")), "Consultas");
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[2]/a/span"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[2]/a/span")), "Escala de Férias");
		pausar(2000);

		fazEnter(By.id("btnVoltar2"));
		refreshPagina();
		pausar(20000);

		// Bonux caixa
	}

	public void bonusCaixa() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]")), "Consultas");
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[3]/a/span"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[3]/a/span")), "Bônus Caixa");
		pausar(2000);

		fazEnter(By.id("btnVoltar2"));
		refreshPagina();
		pausar(20000);

	}
	// Dependentes timeout

	public void dependentes() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));
		pausar(200);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]")), "Consultas");
		pausar(200);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[4]/a/span"));

		clicarElemento((By.xpath("///*[@id='menu']/div/div/div/ul/li[17]/ul/li[4]/a/span")), "Dependentes");
		pausar(200);

		fazEnter(By.id("btnVoltar2"));
		refreshPagina();
		pausar(200);

	}
	// Dados Cadastrais

	public void dadosCadastrais() throws Exception {

		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/a/span[1]")), "Consultas");
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[17]/ul/li[5]/a/span"));

		clicarElemento((By.xpath("///*[@id='menu']/div/div/div/ul/li[17]/ul/li[5]/a/span")), "Dados Cadastrais");
		pausar(2000);

		fazEnter(By.id("btnVoltar2"));
		refreshPagina();
		pausar(20000);

	}
	
	// funcionalidade Aviso Ferias Digital();
	
	public void clicarMenuAvisoFeriasDigital() throws Exception{
		mouseScrollBuscaElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[16]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='menu']/div/div/div/ul/li[16]/a/span"));

		clicarElemento((By.xpath("//*[@id='menu']/div/div/div/ul/li[16]/a/span")), "Aviso de Férias Digital");
		pausar(2000);
		
	}
	
	public void assinarConsultarAvisodeFérias() throws Exception {
		
		mouseScrollBuscaElemento(By.xpath("//*[@id='btnEnviarAvisoFerias']"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//*[@id='btnEnviarAvisoFerias']"));

		clicarElemento((By.xpath("//*[@id='btnEnviarAvisoFerias']")), "Clique aqui para assinar seu aviso de férias");
		refreshPagina();
		
		
	}
	
	public void mensagens () throws Exception {
		
		mouseScrollBuscaElemento(By.xpath("//div[@id='div-qtdmensagens']/i"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//div[@id='div-qtdmensagens']/i"));

		clicarElemento((By.xpath("//div[@id='div-qtdmensagens']/i")), "qtd Mensagens");
		
	}
	
	
	public void clicarMenuFicaDica()throws Exception {
		
		mouseScrollBuscaElemento(By.xpath("//div[@id='menu']/div/div/div/ul/li[18]/a/span"));
		pausar(2000);

		aguardarPorElemento(By.xpath("//div[@id='menu']/div/div/div/ul/li[18]/a/span"));

		clicarElemento((By.xpath("//div[@id='menu']/div/div/div/ul/li[18]/a/span")), "FICADICA");
		
		
		pausar(2000);
	}
		
		public void norma()throws Exception {
	
		//testes
		aguardarPorElemento(By.xpath("//*[@id='btnFormacoesNorma']"));
		clicarElemento(By.xpath("//*[@id='btnFormacoesNorma']"), "Norma");
		pausar(2000);
		aguardarPorElemento(By.xpath("//*[@id='btnExibirInformacoes']/span"));
		clicarElemento(By.xpath("//*[@id='btnExibirInformacoes']/span"), "Ausências Permitidas");
	    pausar(20000);
	    
	    
	    // voltar
	    mouseScrollBuscaElemento(By.id("btnVoltar"));
	    aguardarPorElemento(By.id("btnVoltar"));
	    clicarElemento(By.id("btnVoltar"),"Voltar");
	    refreshPagina();
	    pausar(2000);
		
		
	}
		
		public void dica()throws Exception {
			
			//testes  
			aguardarPorElemento(By.xpath("//*[@id='btnInformacoesDica']"));
			clicarElemento(By.xpath("//*[@id='btnInformacoesDica']"), "Dica");
			pausar(2000);
			aguardarPorElemento(By.xpath("//*[@id='btnExibirInformacoes']/span"));
			clicarElemento(By.xpath("//*[@id='btnExibirInformacoes']/span"), "TESTE EM 24/06/2020");
		    pausar(20000);
		    
		    
		    // voltar
		    mouseScrollBuscaElemento(By.id("btnVoltar"));
		    aguardarPorElemento(By.id("btnVoltar"));
		    clicarElemento(By.id("btnVoltar"),"Voltar");
		    refreshPagina();
			
		}

}
