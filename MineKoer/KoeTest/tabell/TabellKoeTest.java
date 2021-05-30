package tabell;

import Koeene.KoeADT;
import Koeene.TabellKoe;
import adt.KoeADTTest;

public class TabellKoeTest  extends KoeADTTest{
	
	protected KoeADT<Integer> reset(){
		return new TabellKoe<Integer>();
	}

}
