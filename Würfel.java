import java.util.Random;
import java.util.Scanner;
public class W�rfel 
{
  public static void main(String[] args) 
  {
    Random zufall = new Random();
    int W�rfel;
    for (int i = 0; i < 1000; i++) 
    {
      W�rfel = 1 + zufall.nextInt(6);
      System.out.println(i + 1 + ". Wurf: " + W�rfel);
    }
  }
}    
