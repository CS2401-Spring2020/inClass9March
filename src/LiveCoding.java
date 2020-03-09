
public class LiveCoding {
    
    /********************************************************************************
     *                                                                              *
     *                                                                              *
     *       posted to https://github.com/CS2401-Spring2020/inClass9March.git       *
     *                                                                              *
     *                                                                              *
     ********************************************************************************/

    public static void main(String[] args) {
        System.out.println(AminoAcidResources.getAminoAcidFromCodon("GUC")); 
        String[] codonList = AminoAcidResources.getCodonListForAminoAcid('C');
        for(int i=0; i<codonList.length; i++) {
        	
        	if(i == codonList.length-1) {
        		System.out.println(codonList[i]);
        	}else {
        		System.out.print(codonList[i] + ",");
        	}
        }
        

        //given a codon cdn, print all other codons that encode the same aa
        String cdn = "ACU";
        String[] derivedList = AminoAcidResources.getCodonListForAminoAcid(AminoAcidResources.getAminoAcidFromCodon(cdn));
        for(int j=0; j<derivedList.length; j++) {
        	if(j == derivedList.length-1) {
        		System.out.println(derivedList[j]);
        	}else {
        		System.out.print(derivedList[j] + ",");
        	}
        }
    }

}
