package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		
		int bruttolønn = Integer.parseInt(showInputDialog("Kva er din bruttolønn?"));
		
		if (bruttolønn < 0) { 
			System.out.print("Tullebukk, det går ikkje ann å tjene mindre enn 0");
			
		} else if (bruttolønn <= 208050 && bruttolønn >= 0) {
			System.out.print("Du trenger ikkje betale noko skatt");
		} else if (bruttolønn >= 1350001) {
			double trinn5 = ((292850-208051)*1.7/100) + ((670000-292851)*4.0/100) + ((937900-670001)*13.6/100) + ((1350000-937901)*16.6/100) + ((bruttolønn-1350001)*17.6/100);
			System.out.print("Du må betale " + (int)(trinn5+0.5) + " i samla trinnskatt");
		} else if (bruttolønn >= 937901) {
			double trinn4 = ((292850-208051)*1.7/100)+((670000-292851)*4.0/100)+((937900-670001)*13.6/100)+((bruttolønn-937901)*16.6/100);
			System.out.print("Du må betale " + (int)(trinn4+0.5) + " i samla trinnskatt");
		} else if (bruttolønn >= 670001) {
			double trinn3 = ((292850-208051)*1.7/100)+((670000-292851)*4.0/100)+((bruttolønn-670001)*13.6/100);
			System.out.print("Du må betale " + (int)(trinn3+0.5) + " i samla trinnskatt");
		} else if (bruttolønn >= 292851) {
			double trinn2 = ((292850-208051)*1.7/100)+((bruttolønn-292851)*4.0/100);
			System.out.print("Du må betale " + (int)(trinn2+0.5) + " i samla trinnskatt");
		} else if (bruttolønn >= 208051) {
			double trinn1 = ((bruttolønn-208051)*1.7/100);
			System.out.print("Du må betale " + (int)(trinn1+0.5) + " i samla trinnskatt");
			
		}
		
	}
}
