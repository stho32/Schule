import java.util.Scanner;
public class TimZobel_FS93_Lernsituation4_Pr�fziffer
{
  public static void main(String[] args) 
  {
    Scanner einlesen = new Scanner (System.in);
    
    long[] pr�fziffern = {};
    pr�fziffern = new long[12];
    
    long[] pr�fziffernReverse = {};
    pr�fziffernReverse = new long[12];
    
    long zwischenGerade = 0;
    
    long zwischenGerade1 = 0;
    
    long zwischenUngerade = 0;
    
    long zwischenUngerade1 = 0;
    
    long zwischen = 0;       
    
    int k = 0;
    
    int ziffer = 0;
  
    long testZahl = einlesen.nextLong();
  
    int nummer = 0;
    while (testZahl / Math.pow( 10, nummer) > 1) {
      nummer++;
      
    } // end of while
    for (int j = nummer - 1; j >= 0; j--) {
      //System.out.println( (int) (testZahl / Math.pow(10, j) % 10));
      ziffer = (int) (testZahl / Math.pow(10, j) % 10);
   
      pr�fziffern[j] = ziffer;
      
      System.out.println(pr�fziffern[j]);
    
    } // end of for
    
    System.out.println("Ausgabe Array komplett");
   
    String pr�fziffernString = java.util.Arrays.toString(pr�fziffern);
    
    System.out.println(pr�fziffernString);
   
    System.out.println("Ausgabe der einzelnen Ziffern");
    
     for (k = 0; k < pr�fziffern.length ; k++ ) {
      System.out.println(pr�fziffern[k]);
      
    } // end of for      
    
    System.out.println("Ausgabe der einzelnen Ziffern in Reverse Order");
    
    for (k = pr�fziffern.length - 1; k >= 0 ; k-- ) {
      
      System.out.println(pr�fziffern[k]);
      pr�fziffernReverse[k] = pr�fziffern[k]; 
    } // end of for
    
    System.out.println("last test");
     for (k = 0; k < pr�fziffern.length ; k++ ) {
      System.out.println(pr�fziffern[k]);
      
    } // end of for                                                         
      
    System.out.println("");
    System.out.println("");
    
    System.out.println("Array Reverse abspeichern");
     
        int j = pr�fziffern.length; 
        for (int i = 0; i < pr�fziffern.length; i++) { 
            pr�fziffernReverse[j - 1] = pr�fziffern[i]; 
            j = j - 1; 
        }
    
            System.out.println("Reversed array is: \n"); 
        for ( k = 0; k < pr�fziffern.length; k++) {      
      if (k % 2 == 1) {
        zwischenGerade1 = pr�fziffernReverse[k] * 3;
        zwischenGerade = zwischenGerade + zwischenGerade1;
        System.out.println(zwischenGerade1);
      } // end of if     
      if (k % 2 != 1) {
        zwischenUngerade1 = pr�fziffernReverse[k] * 1;
        zwischenUngerade = zwischenUngerade + zwischenUngerade1;
        System.out.println(zwischenUngerade1);
      } // end of if
        } 
  
    System.out.println("");
      
    System.out.println(zwischenGerade);
    System.out.println(zwischenUngerade);
    
    long zwischenGesamt = zwischenGerade + zwischenUngerade;
    
    System.out.println("");
    
    System.out.println(zwischenGesamt);

    System.out.println("");
    System.out.println("");
    
    zwischenGesamt = zwischenGesamt % 10;
    
    System.out.println(10 - zwischenGesamt);
    
    zwischenGesamt = 10 - zwischenGesamt;
    
    System.out.println("Programm");
    
    System.out.println("");
    System.out.println("");
    System.out.println("Eingegebene Zahl am Anfang: " + testZahl);
   
    String testZahlErgebnis = "";
    
  
    System.out.println("Die gesuchte Pr�fnummer lautet: " + zwischenGesamt);
    
    System.out.println("");
    System.out.println("");
    System.out.println("Der komplette EAN13 Code lautet also: " + String.valueOf(testZahl) + String.valueOf(zwischenGesamt));
    }
 }
