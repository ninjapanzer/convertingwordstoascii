/*
Assignment Notes
 */
package convertingwordstoascii;

/*
Gary A. Newsome
CPT 163_27 Java Programming 1
Paul Scarrone
 */
public class ConvertingWordsToASCII {
    public static void main(String[] args) {
        // Declarations
        char charG = 'G';
        char charA = 'A';
        char charR = 'R';
        char charY = 'Y';
        int intG = (int)charG;
        int intA = (int)charA;
        int intR = (int)charR;
        int intY = (int)charY;
        
        // Introduction
        System.out.println("For this exercise,\n the word I have chosen is...\n");
        System.out.println(charG);
        System.out.println(charA);
        System.out.println(charR);
        System.out.println(charY);
        System.out.println("\nor...\n");
        System.out.print(charG);
        System.out.print(charA);
        System.out.print(charR);
        System.out.println(charY);
        System.out.println("\n...as it were. \n");
        System.out.println("Go figure.\n");
        
        // Output
        System.out.println("The ASCII number for the character " + charG + " is " + intG + ".");
        System.out.println("The ASCII number for the character " + charA + " is " + intA + ".");
        System.out.println("The ASCII number for the character " + charR + " is " + intR + ".");
        System.out.println("The ASCII number for the character " + charY + " is " + intY + ".");
        System.out.println("\nThe grand total of these ASCII numbers is " + (charG + charA + charR + charY) + ".");
        
        
                
    }
    
}
