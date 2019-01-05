package Model;

import java.util.ArrayList;
import java.util.List;

public interface IPeriodicTable {
	
	/*
	 * Aufbau principle after the Hund's rules (Aufbauprinzip nach den Hundschen Regeln)
	 */
	static String[] AufbauPrinciple = new String[] {"1s","2s","2p","3s","3p","4s","3d","4p","5s","4d","5p","6s","4f","5d","6p","7s","5f","6d","7p","8s","5g","6f","7d","8p","9s","6g","7f","8d","9p"};
	
	/*
	 *  ArrayList<Element> is used as anonymous inner class. 
	 *  Defines the list of all elements in periodic table.
	 */
	static List<Element> Elements = new ArrayList<Element>() {
		private static final long serialVersionUID = 1L;
		{
			add(new Element("H", 1,1,1,"Wasserstoff"));
			add(new Element("He",2,1,18,"Helium"));
			add(new Element("Li",3,2,1,"Lithium"));
			add(new Element("Be",4,2,2,"Beryllium"));
			add(new Element("B", 5,2,13,"Bor"));
			add(new Element("C", 6,2,14,"Kohlenstoff"));
			add(new Element("N", 7,2,15,"Stickstoff"));
			add(new Element("O", 8,2,16,"Sauerstoff"));
			add(new Element("F", 9,2,17,"Fluor"));
			add(new Element("Ne",10,2,18,"Neon"));
			add(new Element("Na",11,3,1,"Natrium"));
			add(new Element("Mg",12,3,2,"Magnesium"));
			add(new Element("Al",13,3,13,"Aluminium"));
			add(new Element("Si",14,3,14,"Silicium"));
			add(new Element("P", 15,3,15,"Phosphor"));
			add(new Element("S", 16,3,16,"Schwefel"));
			add(new Element("Cl",17,3,17,"Chlor"));
			add(new Element("Ar",18,3,18,"Argon"));
			add(new Element("K", 19,4,1,"Kalium"));
			add(new Element("Ca",20,4,2,"Calcium"));
			add(new Element("Sc",21,4,3,"Scandium"));
			add(new Element("Ti",22,4,4,"Titan"));
			add(new Element("V", 23,4,5,"Vanadium"));
			add(new Element("Cr",24,4,6,"Chrom"));
			add(new Element("Mn",25,4,7,"Mangan"));
			add(new Element("Fe",26,4,8,"Eisen"));
			add(new Element("Co",27,4,9,"Cobalt"));
			add(new Element("Ni",28,4,10,"Nickel"));
			add(new Element("Cu",29,4,11,"Kupfer"));
			add(new Element("Zn",30,4,12,"Zink"));
			add(new Element("Ga",31,4,13,"Gallium"));
			add(new Element("Ge",32,4,14,"Germanium"));
			add(new Element("As",33,4,15,"Arsen"));
			add(new Element("Se",34,4,16,"Selen"));
			add(new Element("Br",35,4,17,"Brom"));
			add(new Element("Kr",36,4,18,"Krypton"));
			add(new Element("Rb",37,5,1,"Rubidium"));
			add(new Element("Sr",38,5,2,"Strontium"));
			add(new Element("Y", 39,5,3,"Yttrium"));
			add(new Element("Zr",40,5,4,"Zirconium"));
			add(new Element("Nb",41,5,5,"Niob"));
			add(new Element("Mo",42,5,6,"Molybd�n"));
			add(new Element("Tc",43,5,7,"Technetium"));
			add(new Element("Ru",44,5,8,"Ruthenium"));
			add(new Element("Rh",45,5,9,"Rhodium"));
			add(new Element("Pd",46,5,10,"Palladium"));
			add(new Element("Ag",47,5,11,"Silber"));
			add(new Element("Cd",48,5,12,"Cadmium"));
			add(new Element("In",49,5,13,"Indium"));
			add(new Element("Sn",50,5,14,"Zinn"));
			add(new Element("Sb",51,5,15,"Antimon"));
			add(new Element("Te",52,5,16,"Tellur"));
			add(new Element("I", 53,5,17,"Iod"));
			add(new Element("Xe",54,5,18,"Xenon"));
			add(new Element("Cs",55,6,1,"Caesium"));
			add(new Element("Ba",56,6,2,"Barium"));
			add(new Element("La",57,6,3,"Lanthan"));
			add(new Element("Ce",58,6,3,"Cer"));
			add(new Element("Pr",59,6,3,"Praseodym"));
			add(new Element("Nd",60,6,3,"Neodym"));
			add(new Element("Pm",61,6,3,"Promethium"));
			add(new Element("Sm",62,6,3,"Samarium"));
			add(new Element("Eu",63,6,3,"Europium"));
			add(new Element("Gd",64,6,3,"Gadolinium"));
			add(new Element("Tb",65,6,3,"Terbium"));
			add(new Element("Dy",66,6,3,"Dysprosium"));
			add(new Element("Ho",67,6,3,"Holmium"));
			add(new Element("Er",68,6,3,"Erbium"));
			add(new Element("Tm",69,6,3,"Thulium"));
			add(new Element("Yb",70,6,3,"Ytterbium"));
			add(new Element("Lu",71,6,3,"Lutetium"));
			add(new Element("Hf",72,6,4,"Hafnium"));
			add(new Element("Ta",73,6,5,"Tantal"));
			add(new Element("W", 74,6,6,"Wolfram"));
			add(new Element("Re",75,6,7,"Rhenium"));
			add(new Element("Os",76,6,8,"Osmium"));
			add(new Element("Ir",77,6,9,"Iridium"));
			add(new Element("Pt",78,6,10,"Platin"));
			add(new Element("Au",79,6,11,"Gold"));
			add(new Element("Hg",80,6,12,"Quecksilber"));
			add(new Element("Tl",81,6,13,"Thallium"));
			add(new Element("Pb",82,6,14,"Blei"));
			add(new Element("Bi",83,6,15,"Bismut"));
			add(new Element("Po",84,6,16,"Polonium"));
			add(new Element("At",85,6,17,"Astat"));
			add(new Element("Rn",86,6,18,"Radon"));
			add(new Element("Fr",87,7,1,"Francium"));
			add(new Element("Ra",88,7,2,"Radium"));
			add(new Element("Ac",89,7,3,"Actinium"));
			add(new Element("Th",90,7,3,"Thorium"));
			add(new Element("Pa",91,7,3,"Protactinium"));
			add(new Element("U", 92,7,3,"Uran"));
			add(new Element("Np",93,7,3,"Neptunium"));
			add(new Element("Pu",94,7,3,"Plutonium"));
			add(new Element("Am",95,7,3,"Americium"));
			add(new Element("Cm",96,7,3,"Curium"));
			add(new Element("Bk",97,7,3,"Berkelium"));
			add(new Element("Cf",98,7,3,"Californium"));
			add(new Element("Es",99,7,3,"Einsteinium"));
			add(new Element("Fm",100,7,3,"Fermium"));
			add(new Element("Md",101,7,3,"Mendelevium"));
			add(new Element("No",102,7,3,"Nobelium"));
			add(new Element("Lr",103,7,3,"Lawrencium"));
			add(new Element("Rf",104,7,4,"Rutherfordium"));
			add(new Element("Db",105,7,5,"Dubnium"));
			add(new Element("Sg",106,7,6,"Seaborgium"));
			add(new Element("Bh",107,7,7,"Bohrium"));
			add(new Element("Hs",108,7,8,"Hassium"));
			add(new Element("Mt",109,7,9,"Meitnerium"));
			add(new Element("Ds",110,7,10,"Darmstadtium"));
			add(new Element("Rg",111,7,11,"Roentgenium"));
			add(new Element("Cn",112,7,12,"Corpernicium"));
			add(new Element("Nh",113,7,13,"Nihonium"));
			add(new Element("Fl",114,7,14,"Flerovium"));
			add(new Element("Mc",115,7,15,"Moscovium"));
			add(new Element("Lv",116,7,16,"Livermorium"));
			add(new Element("Ts",117,7,17,"Tenness"));
			add(new Element("Og",118,7,18,"Oganesson","Uuo","Ununoctium"));
		}
	};
	
}
