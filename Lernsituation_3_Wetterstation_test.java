import java.util.Scanner;
public class Lernsituation_3_Wetterstation_test 
{
  public static void main(String[] args) 
  { 
    int a=1, b=3, c=2, d=7, e=6, f=4;
    System.out.println(a +", "+ b +", "+ c +", "+ d +", "+ e +", "+ f);
    
    int ab= Math.abs(a-b), bc= Math.abs(b-c), cd= Math.abs(c-d), de= Math.abs(d-e), ef= Math.abs(e-f);
  
    //DUCHSCHNITTSTEMPERATUR
    double SU = a + b + c + d + e + f;
    
    double AZ = 6;
    
    double DT = SU / AZ;
    
    System.out.println("Die Durchschnittstemperatur betr�gt " + DT);
    
    System.out.println("");
    
    //H�CHST/TIEFSTETEMPERATUR
    System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, f))))) + " ist die h�chste Temperatur");
    
    if (a>b)
    {
      if (a>c)
      {
        if (a>d)
        {
          if (a>e)
          {
            if (a>f)
            {
              System.out.println(a + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
        else
        {
          if (d>e)
          {
            if (d>f)
            {
              System.out.println(d + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
      }
      else
      {
        if (c>d)
        {
          if (c>e)
          {
            if (c>f)
            {
              System.out.println(c + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
        else
        {
          if (d>e)
          {
            if (d>f)
            {
              System.out.println(d + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
      }
    }
    else
    {
      if (b>c)
      {
        if (b>d)
        {
          if (b>e)
          {
            if (b>f)
            {
              System.out.println(b + " ist die h�chste Temperatur");
            } 
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
        else
        {
          if (d>e)
          {
            if (d>f)
            {
              System.out.println(d + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
      }
      else
      {
        if (c>d)
        {
          if (c>e)
          {
            if (c>f)
            {
              System.out.println(c + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
          }
        }
        else
        {
          if (d>e)
          {
            if (d>f)
            {
              System.out.println(d + " ist die h�chste Temperatur");
            }
          }
          else
          {
            if (e>f)
            {
              System.out.println(e + " ist die h�chste Temperatur");
            }
            else 
            {
              System.out.println(f + " ist die h�chste Temperatur");
            }
          }
        }
      }
    }
    
    System.out.println(Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e, f))))) + " ist die niedrigste Temperatur");
    
    if (a<b)
    {
      if (a<c)
      {
        if (a<d)
        {
          if (a<e)
          {
            if (a<f)
            {
              System.out.println(a + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
        else
        {
          if (d<e)
          {
            if (d<f)
            {
              System.out.println(d + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
      }
      else
      {
        if (c<d)
        {
          if (c<e)
          {
            if (c<f)
            {
              System.out.println(c + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
        else
        {
          if (d<e)
          {
            if (d<f)
            {
              System.out.println(d + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
      }
    }
    else
    {
      if (b<c)
      {
        if (b<d)
        {
          if (b<e)
          {
            if (b<f)
            {
              System.out.println(b + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
        else
        {
          if (d<e)
          {
            if (d<f)
            {
              System.out.println(d + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
      }
      else
      {
        if (c<d)
        {
          if (c<e)
          {
            if (c<f)
            {
              System.out.println(c + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
          }
        }
        else
        {
          if (d<e)
          {
            if (d<f)
            {
              System.out.println(d + " ist die niedrigste Temperatur");
            }
          }
          else
          {
            if (e<f)
            {
              System.out.println(e + " ist die niedrigste Temperatur");
            }
            else 
            {
              System.out.println(f + " ist die niedrigste Temperatur");
            }
          }
        }
      }
    }
    
    System.out.println("");
    
    //GR��TER TEMPERATURUMSCHWUNG 
    
    
    
    
    System.out.println("Der gr��te Temperatursprung betr�gt " + Math.max(ab, Math.max(bc, Math.max(cd, Math.max(de, ef)))));
    
    
    
    if (x == cd) 
    {
      System.out.println("A");
    } 
    
    System.out.println("");
    if (Math.abs(ab)>Math.abs(bc))
    {
      if (Math.abs(ab)>Math.abs(cd))
      {
        if (Math.abs(ab)>Math.abs(de))
        {
          if (Math.abs(ab)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + a + " und " + b + " und betr�gt " + Math.abs(ab));
          }
        }
        else
        {
          if (Math.abs(de)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + d + " und " + e + " und betr�gt " + Math.abs(de));
          }
        }
      }
      else
      {
        if (Math.abs(cd)>Math.abs(de))
        {
          if (Math.abs(cd)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + c + " und " + d + " und betr�gt " + Math.abs(cd));
          }
        }
        else
        {
          if (Math.abs(de)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + d + " und " + e + " und betr�gt " + Math.abs(de));
          }
        }
      }
    }
    else
    {
      if (Math.abs(bc)>Math.abs(cd))
      {
        if (Math.abs(bc)>Math.abs(de))
        {
          if (Math.abs(bc)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + b + " und " + c + " und betr�gt " + Math.abs(bc));
          }
        }
        else
        {
          if (Math.abs(de)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + d + " und " + e + " und betr�gt " + Math.abs(de));
          }
        }
      }
      else
      {
        if (Math.abs(cd)>Math.abs(de))
        {
          if (Math.abs(cd)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + c + " und " + d + " und betr�gt " + Math.abs(cd));
          }
        }
        else
        {
          if (Math.abs(de)>Math.abs(ef))
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + d + " und " + e + " und betr�gt " + Math.abs(de));
          }
          else 
          {
            System.out.println("Der gr��te Temperatursprung liegt zwischen " + e + " und " + f + " und betr�gt " + Math.abs(ef));
          }
        }
      }
    }

  }
}    
