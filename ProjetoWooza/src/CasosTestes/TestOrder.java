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
	public void CT02_DescontosExclusivos() throws Exception {
		_002DescontosExclusivos Teste002 = new _002DescontosExclusivos();
		Teste002.testar002();
		pausar(2000);
	}
	
	@Test
	public void CT03_PesquisaDeProduto() throws Exception {
		_003PesquisaDeProduto Teste003 = new _003PesquisaDeProduto();
		Teste003.testar003();
		pausar(2000);
	}
	
	@Test
	public void CT04_CadastrarEmailValido() throws Exception {
		_004CadastrarEmailValido Teste004 = new _004CadastrarEmailValido();
		Teste004.testar004();
		pausar(2000);
	}
	
	
	
	@Test
	public void CT005_CadatrarEmailInvalido() throws Exception {
		_005CadastrarEmailInvalido Teste005 = new _005CadastrarEmailInvalido();
		Teste005.testar005();
		pausar(2000);
	}
	
	//@Ignore
	@Test
	public void CT006_AcessoMenuAcessibilidade() throws Exception {
		_006AcessoMenuAcessibilidade Teste006 = new _006AcessoMenuAcessibilidade();
		Teste006.testar006();
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
