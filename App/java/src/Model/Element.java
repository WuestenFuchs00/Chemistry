package Model;

public class Element {

	private String mSymbol;
	private int mAtomicNumber;
	private int mPeriod;
	private int mGroup;
	private String mName;
	
	private String mOldSymbol;
	private String mOldName;
	
	/*
	 * Constructor
	 * @params
	 * 		symbol
	 * 		atomicNumber : Ordnungszahl des Elements
	 * 		period : Periode (Zeile) = Elemente mit gleicher Hauptquantenzahl
	 * 		group : Gruppe (Spalte)
	 */
	public Element(String symbol, int atomicNumber, int period, int group, String name, String oldSymbol, String oldName) {
		this.mSymbol = symbol;
		this.mAtomicNumber = atomicNumber;
		this.mPeriod = period;
		this.mGroup = group;
		this.mName = name;
		this.mOldSymbol = oldSymbol;
		this.mOldName = oldName;
	}
		
	public Element(String symbol, int atomicNumber, int period, int group, String name) {
		this(symbol, atomicNumber, period, group, name, "", "");
	}
	
	/*=========================================================================================*/
	public int getAtomicNumber() { return mAtomicNumber; }
	
	public String getName() { return mName; 	}
	
	public String getOldName() { return mOldName; }
	
	public String getSymbol() { return mSymbol;	}
	
	public String getOldSymbol() { return mOldSymbol; }
}
