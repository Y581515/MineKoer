package sirkulaer;

import Koeene.KoeADT;
import Koeene.SirkulaerKoe;
import adt.KoeADTTest;


public class SirkulaerKoeTest extends KoeADTTest {
	
	
	protected KoeADT<Integer> reset(){
		return new SirkulaerKoe<Integer>();
	}

}
