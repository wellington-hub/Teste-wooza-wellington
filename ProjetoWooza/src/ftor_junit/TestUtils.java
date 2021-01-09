package ftor_junit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**********************************************************************************************************************
 * TestUtils -> Classe responsável por conter o atributo driver, da interface
 * WebDriver (API do Selenium WebDriver) e objeto util (classe Utils.java);
 * 
 * -> Chamadas aos métodos de inicialização/término da instância do navegador, finalização da gravação do relatório
 * em vídeo e método gravarTelaRQM que tem a função de adicionar imagem (evidência de teste) ao campo ‘Capturas de Tela’
 * do log do IBM RQM;
 * 
 * -> Contém as anotações @Before (o que será executado antes do Caso de Teste)
 * e @After (o que será executado após o Caso de Teste) do JUnit.
 **********************************************************************************************************************/
public class TestUtils {

	public static WebDriver driver;
	static Utils util = new Utils();

	@Before
	public void setUp() throws Exception {
		
		//Browser.executarComFirefox52();
		//Browser.executarComFirefox57();
		//Browser.executarComIE11();
		Browser.executarComChrome69();
	}

	@After
	public void tearDown() throws Exception {

		/*********************************************************
		 * -->Finaliza a gravação do relatório em vídeo;
		 * -->Adiciona imagem ao campo'Capturas de Tela' do log do RQM;
		 * -->Finaliza a instância do navegador
		 *********************************************************/
		ReportLog.finalizarGravacaoVideoExecucaoCasoTeste();
		util.gravarTelaRQM();
		Browser.fecharInstancia();
	}
}
