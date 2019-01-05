package Model;

public class ElectronConfiguration {
	
	public ElectronConfiguration() {}
	
	/*
	 * 
	 */
	public String configure(String elementSymbol) {
		int atomicNumber = 0; // Ordnungszahl
		boolean isFound = false;
		/* Retrieves atomic number of element E */
		for ( Element E : IPeriodicTable.Elements ) {
			if ( E.getSymbol().equals(elementSymbol) || E.getOldSymbol().equals(elementSymbol) ) {
				atomicNumber = E.getAtomicNumber();
				isFound = true;
				break;
			}
		}		
		if ( !isFound ) return null;
		/* Build electron configuration of element E */
		String out = "";
		int electrons = 0; // Number of full electrons in orbital (s,p,d,f,g,h,i...)
		for ( int i = 0; i < IPeriodicTable.AufbauPrinciple.length; i++ ) {
			String orbital = IPeriodicTable.AufbauPrinciple[i]; 
			switch ( orbital.charAt(1) ) {
				case 's':
					electrons = 2; // s=1 => 1*2
					break;
				case 'p':
					electrons = 6; // p=3 => 3*2
					break;
				case 'd':
					electrons = 10; // d=5 => 5*2
					break;
				case 'f':
					electrons = 14; // f=7 => 7*2
					break;
				case 'g':
					electrons = 18; // g=9 => 9*2
					break;
				case 'h':
					electrons = 22; // h=11 => 11*2
					break;
				default:
					break;
			}
			if ( atomicNumber == 0 ) break;
			else { // atomicNumber > 0
				if ( atomicNumber >= electrons ) {
					out += orbital + "(" + electrons + ") ";
					atomicNumber -= electrons;
				}
				else {
					out += orbital + "(" + atomicNumber + ")";
					atomicNumber = 0;
				}
			}
		}
		
		return out;
	}
}
