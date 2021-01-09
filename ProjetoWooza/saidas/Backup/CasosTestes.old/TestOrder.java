package CasosTestes;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import ftor_junit.TestUtils;


//import CasosTestesNegativos._021LogarSistemaNegativo;

/***********************************************************************************************
 * TestOrder -> Classe responsável pela ordenação dos casos de teste. 
 * Por padrão o JUnit não ordena corretamente os casos de teste, então utilizamos esta classe
 * juntamente da anotação @FixMethodOrder(MethodSorters.NAME_ASCENDING). 
 ***********************************************************************************************/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrder extends TestUtils {

	@Test
	public void CT01_LogarSistema() throws Exception {
		_001LogarSistema Teste001 = new _001LogarSistema();
		Teste001.testar001();
		pausar(2000);
	}
	
	@Test
	public void CT02_ContraCheque() throws Exception {
		_002ContraCheque Teste002 = new _002ContraCheque();
		Teste002.testar002();
		pausar(2000);
	}
	
	@Test
	public void CT03_Comprovante_de_Rendimentos() throws Exception {
		_003Comprovante_de_Rendimentos Teste003 = new _003Comprovante_de_Rendimentos();
		Teste003.testar003();
		pausar(2000);
	}
	
	@Test
	public void CT04_Dependentes() throws Exception {
		_004Dependentes Teste004 = new _004Dependentes();
		Teste004.testar004();
		pausar(2000);
	}
	
	
	
	@Test
	public void CT005_Atestado_Medico() throws Exception {
		_005Atestado_Medico Teste005 = new _005Atestado_Medico();
		Teste005.testar005();
		pausar(2000);
	}
	
	//@Ignore
	@Test
	public void CT006_Licenca_Maternidade_Paternidade() throws Exception {
		_006Licenca_Maternidade_Paternidade Teste006 = new _006Licenca_Maternidade_Paternidade();
		Teste006.testar006();
		pausar(2000);
	}
	
	@Test
	public void CT007_Dados_Cadastrais() throws Exception {
		_007Dados_Cadastrais Teste007 = new _007Dados_Cadastrais();
		Teste007.testar007();
		pausar(2000);
	}
	
	@Test
	public void CT008_APIP_LP() throws Exception {
		_008APIP_LP Teste008 = new _008APIP_LP();
		Teste008.testar008();
		pausar(2000);
	}
	
	@Test
	public void CT009_Auxilio_Alimentacao() throws Exception {
		_009Auxilio_Alimentacao Teste009 = new _009Auxilio_Alimentacao();
		Teste009.testar009();
		pausar(2000);
	}
	
	@Test
	public void CT010_Simular_Ferias() throws Exception {
		_010Simular_Ferias Teste010 = new _010Simular_Ferias();
		Teste010.testar010();
		pausar(2000);
	}
	
	@Test
	public void CT011_Alter_Prev_Priv() throws Exception {
		_011Alter_Prev_Priv Teste011 = new _011Alter_Prev_Priv();
		Teste011.testar011();
		pausar(2000);
	}
	
	@Test
	public void CT012_Calendario_Afastamentos() throws Exception {
		_012Calendario_Afastamentos Teste012 = new _012Calendario_Afastamentos();
		Teste012.testar012();
		pausar(2000);
	}
	
	@Test
	public void CT013_Aviso_Ferias() throws Exception {
		_013Aviso_Ferias_Digital Teste013 = new _013Aviso_Ferias_Digital();
		Teste013.testar013();
		pausar(2000);
	}
	
	@Test
	public void CT014_Consultas() throws Exception {
		_014Consultas Teste014 = new _014Consultas();
		Teste014.testar014();
		pausar(2000);
	}
	
	@Test
	public void CT015_Mensagens() throws Exception {
		_015Mensagens Teste015 = new _015Mensagens();
		Teste015.testar015();
		pausar(2000);
	}
	
	@Test
	public void CT016_Fica_Dica() throws Exception {
		_016Fica_Dica Teste016 = new _016Fica_Dica();
		Teste016.testar016();
		pausar(2000);
	}
	
	@Test
	public void CT017_Administracao() throws Exception {
		_017Administracao Teste017 = new _017Administracao();
		Teste017.testar017();
		pausar(2000);
	}
	
	@Test
	public void CT018_Cracha() throws Exception {
		_018Cracha Teste018 = new _018Cracha();
		Teste018.testar018();
		pausar(2000);
	}
	
	@Test
	public void CT019_Requerimento_Pessoal() throws Exception {
		_019Requerimento_Pessoal Teste019 = new _019Requerimento_Pessoal();
		Teste019.testar019();
		pausar(2000);
	}
	
	@Test
	public void CT020_Fique_Bem() throws Exception {
		_020Fique_Bem Teste020 = new _020Fique_Bem();
		Teste020.testar020();
		pausar(2000);
	}
// Exemplo	
	
//	@Test
//	public void CT011_Alter_Prev_Priv() throws Exception {
//		_011Alter_Prev_Priv Teste011 = new _011Alter_Prev_Priv();
//		Teste011.testar011();
//		pausar(2000);
//	}
	
	
	// Pausa a execução do teste de acordo com o tempo (milissegundos) passado
		// por parâmetro.
		public void pausar(int tempo) {
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
}
