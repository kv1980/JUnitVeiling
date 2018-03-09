package be.vdab.valueobjects;

import static org.junit.Assert.*;
import org.junit.Test;

public class VeilingTest {

	@Test
	public void hoogste_bod_is_nul_voor_eerste_bieding() {
		assertEquals(0,new Veiling().getHoogsteBod());
	}
	
	@Test
	public void hoogste_bod_is_gelijk_aan_het_bedrag_van_het_eerste_bod() {
		Veiling veiling = new Veiling();
		veiling.doeBod(200);
		assertEquals(200,veiling.getHoogsteBod());
	}
	
	@Test
	public void hoogste_bod_is_gelijk_aan_het_bedrag_van_het_hoogste_bod_na_meerdere_biedingen() {
		Veiling veiling = new Veiling();
		veiling.doeBod(100);
		veiling.doeBod(200);
		assertEquals(200,veiling.getHoogsteBod());
	}

}
