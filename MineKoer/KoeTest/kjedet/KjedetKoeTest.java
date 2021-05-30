package kjedet;

import Koeene.KjedetKoe;
import Koeene.KoeADT;
import adt.KoeADTTest;


public class KjedetKoeTest extends KoeADTTest {
	
	protected KoeADT<Integer> reset(){
		return new KjedetKoe<Integer>();
	}

}
