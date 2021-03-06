package Koeene;

/**
 * @author Ole Olsen
 * @param <T>
 * 
 */
public class SirkulaerKoe<T> implements KoeADT<T> {

	private final static int STDK = 10;
	private int foran, bak, antall;
	private T[] koe;

	public SirkulaerKoe() {
		this(STDK);
	}

	public SirkulaerKoe(int startKapasitet) {
		foran = bak = antall = 0;
		koe = ((T[]) (new Object[startKapasitet]));
	}

	public void innKoe(T element) {
		if (antall() == koe.length){
		    utvid();
		  }
		  koe[bak] = element;
		  bak = (bak+1) % koe.length;
		  antall++;	
	}
	

	public T utKoe()  {
            if (erTom()){
                throw new EmptyCollectionException("koe");
            }
            
            T resultat = koe[foran];
            koe[foran] = null;
            foran = (foran + 1) % koe.length;
            antall--;
            return resultat;
	}

	public T foerste()  {
            if (erTom()){
        	throw new EmptyCollectionException("koe");
            }
                       
            T resultat = koe[foran];
            return resultat;
	}
	

	public boolean erTom() {
		return (antall == 0);
	}

	public int antall() {
		return antall;
	}

	private void utvid() {
            T[] hjelpetabell = (T[])(new Object[koe.length *2]);
            
            for(int soek = 0; soek < antall; soek++){
                hjelpetabell[soek] = koe[foran];
                foran = (foran+1) % koe.length;
            }
            
            foran = 0;
            bak = antall;
            koe = hjelpetabell;
        }// De andre metodene som for vanlig tabellimplementasjon
        
        
        
        public void show() {
		System.out.print("Elemments : ");
		for (int i = 0; i < antall; i++) {
			System.out.print(koe[(foran + i) % koe.length] + " ");
		}
		System.out.println();

		for (T v : koe) {
			System.out.print(v + " ");
		}
	}
	
	
	

}// class

