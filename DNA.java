// This program that determines whether there is a protein in a strand of DNA.
public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ / 
        //   / \   \   / \   \  
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;

        int length = dna.length();
        System.out.println("Length " + length);

        int start = dna.indexOf("ATG");
        System.out.println("Start " + start);

        int stop = dna.indexOf("TGA");
        System.out.println("Stop " + stop);
    
  /* Codecademy instructions:
  Inside the if statement, create a String variable named protein.
  And find this protein in the dna by using the substring() string method. 
  Think about where you want the substring to begin
 and where you want the substring to end.
 Remember that a codon is 3 nucleotides long.*/
        if (start != -1 && stop != -1 && (start - stop) % 3 == 0) {
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein:" + protein);
        } else {
            System.out.println("No protein.");
        }
    }
}

  /* Note: if testing code with each DNA strand these would be the results:
  These should be the results:
  dna1: Contains a protein.
  dna2: Does not contain a protein.
  dna3: Contains a protein.*/
