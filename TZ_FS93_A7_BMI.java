import java.util.Scanner;
public class TZ_FS93_A7_BMI
{
  public static void main (String[] args)
  {
    Scanner einlesen = new Scanner(System.in);
    
    double Gewicht = 0 , Gr��e = 0 , G = 0, BMI = 0;
    
    System.out.println("Bitte Ihr Gewicht in kg angeben.");
    Gewicht = einlesen.nextDouble();
    
    System.out.println("Bitte Ihre Gr��e in m angeben.");
    Gr��e = einlesen.nextDouble();
    
    System.out.println("Bitte Geschlecht angeben: 1 f�r M�nnlich, 2 f�r Weiblich");
    G = einlesen.nextDouble();
    
    BMI = Gewicht / (Gr��e * Gr��e);
    System.out.println("Ihr BMI betr�gt:  " + BMI);
    
    if (G == 1)
    {
      if (BMI < 20)
      {
        System.out.println("Untergewicht");
      }
      if (BMI > 25)
      {
        System.out.println("�bergewicht");
      }
      else 
      {
        System.out.println("Normalgewicht");
      }  
    }  
    if (G == 2)
    {
      if (BMI < 19)
      {
        System.out.println("Untergewicht");
      }
      if (BMI > 24)
      {
        System.out.println("�bergewicht");
      }
      else
      {
        System.out.println("Normalgewicht");
      }
    }
    if (G > 2)
    {
      System.out.println("Ung�ltiges Geshlecht");
    }  
  }
}    
