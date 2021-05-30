package Koeene;

//********************************************************************
//
//Representerer en samling kø implementer vha kjedet struktur
//********************************************************************

public class KjedetKoe<T> implements KoeADT<T> {
	private int antall;
	private LinearNode<T> foran, bak;

	/******************************************************************
	 * Oppretter en tom kø.
	 ******************************************************************/
	public KjedetKoe() {
		antall = 0;
		foran = bak = null;
	}

	/******************************************************************
	 * Legger inn et spesifisert element i køen.
	 ******************************************************************/
	public void innKoe(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		if(erTom()){
		    foran=nyNode;
		    bak=foran;
		  }
		else{
		    bak.setNeste(nyNode);
		    bak=bak.getNeste();
		}
		    antall++;
		
	}

	/******************************************************************
	 * Fjerner og returnerer elementet foran i køen.
	 ******************************************************************/
	public T utKoe() {
	    if (erTom()){
		    throw new EmptyCollectionException("koe");
		}
		T resultat = foran.getElement();
		foran = foran.getNeste();
		antall--;
		
		if(erTom()){
		    bak=null;
		}
		return resultat;
	}

	/******************************************************************
	 * Returnerer elementet foran i køen ute å fjerne det.
	 ******************************************************************/
	public T foerste() {
	    if (erTom()){
	        throw new EmptyCollectionException("koe");
	       }
		return foran.getElement();
		
	}

	/******************************************************************
	 * Returnerer sann hvis køen er tom, usann ellers.
	 ******************************************************************/
	public boolean erTom() {
		return (antall == 0);
	}

	/******************************************************************
	 * Returnerer antall elementer i køen.
	 ******************************************************************/
	public int antall() {
		return antall;
	}

	/******************************************************************
	 * Returnerer en strengrepresentasjon av elementene i køen.
	 ******************************************************************/
	public String toString() {
		String resultat = "";
		LinearNode<T> aktuell = foran;

		while (aktuell != null) {
			resultat = resultat + (aktuell.getElement()).toString() + "\n";
			aktuell = aktuell.getNeste();
		}

		return resultat;
	}
}// class
