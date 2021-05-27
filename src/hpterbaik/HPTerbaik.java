package hpterbaik;
import java.util.Scanner;
/**
 *
 * @author Natasya Pua
 */
public class HPTerbaik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Input Nilai AI");
           
            System.out.print("DATA A1C1 = ");
                int A1C1 = input.nextInt();
            System.out.print("DATA A1C2 = ");
                int A1C2 = input.nextInt();
            System.out.print("DATA A1C3 = ");
                int A1C3 = input.nextInt();
            System.out.print("DATA A1C4 = ");
                int A1C4 = input.nextInt();
            System.out.print("DATA A1C5 = ");
                int A1C5 = input.nextInt();
                
            System.out.println("Input Nilai A2");
            
            System.out.print("DATA A2C1 = ");
                int A2C1 = input.nextInt();
            System.out.print("DATA A2C2 = ");
                int A2C2 = input.nextInt();
            System.out.print("DATA A2C3 = ");
                int A2C3 = input.nextInt();
            System.out.print("DATA A2C4 = ");
                int A2C4 = input.nextInt();
            System.out.print("DATA A2C5 = ");
                int A2C5 = input.nextInt();
                
            System.out.println("Input Nilai A3");
            
            System.out.print("DATA A3C1 = ");
                int A3C1 = input.nextInt();
            System.out.print("DATA A3C2 = ");
                int A3C2 = input.nextInt();
            System.out.print("DATA A3C3 = ");
                int A3C3 = input.nextInt();
            System.out.print("DATA A3C4 = ");
                int A3C4 = input.nextInt();
            System.out.print("DATA A3C5 = ");
                int A3C5 = input.nextInt();
                
            System.out.println("Input Nilai A4");
            
            System.out.print("DATA A4C1 = ");
                int A4C1 = input.nextInt();
            System.out.print("DATA A4C2 = ");
                int A4C2 = input.nextInt();
            System.out.print("DATA A4C3 = ");
                int A4C3 = input.nextInt();
            System.out.print("DATA A4C4 = ");
                int A4C4 = input.nextInt();
            System.out.print("DATA A4C5 = ");
                int A4C5 = input.nextInt();
                
            System.out.println("Input Nilai A5");
            
            System.out.print("DATA A5C1 = ");
                int A5C1 = input.nextInt();
            System.out.print("DATA A5C2 = ");
                int A5C2 = input.nextInt();
            System.out.print("DATA A5C3 = ");
                int A5C3 = input.nextInt();
            System.out.print("DATA A5C4 = ");
                int A5C4 = input.nextInt();
            System.out.print("DATA A5C5 = ");
                int A5C5 = input.nextInt();
                
            System.out.println("Nilai Bobot (W)");
            
            System.out.print("Bobot (W1) = ");
                double W1 = input.nextDouble();
            System.out.print("Bobot (W2) = ");
                double W2 = input.nextDouble();
            System.out.print("Bobot (W3) = ");
                double W3 = input.nextDouble();
            System.out.print("Bobot (W4) = ");
                double W4 = input.nextDouble();
            System.out.print("Bobot (W5) = ");
                double W5 = input.nextDouble();
                
                System.out.println("Nilai Cost/Benefit (BC)");

            System.out.print("Nilai (BC1) = ");
                double BC1 = input.nextDouble();
            System.out.print("Nilai (BC2) = ");
                double BC2 = input.nextDouble();
            System.out.print("Nilai (BC3) = ");
                double BC3 = input.nextDouble();
            System.out.print("Nilai (BC4) = ");
                double BC4 = input.nextDouble();
            System.out.print("Nilai (BC5) = ");
                double BC5 = input.nextDouble();
            
                
            double R_A1C1=BC1/A1C1;
            double R_A1C2=A1C2/BC2;
            double R_A1C3=A1C3/BC3;
            double R_A1C4=A1C4/BC4;
            double R_A1C5=A1C5/BC5;
            
            double R_A2C1=BC1/A2C1;
            double R_A2C2=A2C2/BC2;
            double R_A2C3=A2C3/BC3;
            double R_A2C4=A2C4/BC4;
            double R_A2C5=A2C5/BC5;
            
            double R_A3C1=BC1/A3C1;
            double R_A3C2=A3C2/BC2;
            double R_A3C3=A3C3/BC3;
            double R_A3C4=A3C4/BC4;
            double R_A3C5=A3C5/BC5;
          
            double R_A4C1=BC1/A4C1;
            double R_A4C2=A4C2/BC2;
            double R_A4C3=A4C3/BC3;
            double R_A4C4=A4C4/BC4;
            double R_A4C5=A4C5/BC5;
            
            double R_A5C1=BC1/A5C1;
            double R_A5C2=A5C2/BC2;
            double R_A5C3=A5C3/BC3;
            double R_A5C4=A5C4/BC4; 
            double R_A5C5=A5C5/BC5;
            
            ///////////////////////////////////////
            
                double RW_A1C1=R_A1C1*W1;
                double RW_A1C2=R_A1C2*W2;
                double RW_A1C3=R_A1C3*W3;
                double RW_A1C4=R_A1C4*W4;
                double RW_A1C5=R_A1C5*W5;

                double RW_A2C1=R_A2C1*W1;
                double RW_A2C2=R_A2C2*W2;
                double RW_A2C3=R_A2C3*W3;
                double RW_A2C4=R_A2C4*W4;
                double RW_A2C5=R_A2C5*W5;

                double RW_A3C1=R_A3C1*W1;
                double RW_A3C2=R_A3C2*W2;
                double RW_A3C3=R_A3C3*W3;
                double RW_A3C4=R_A3C4*W4;
                double RW_A3C5=R_A3C5*W5;

                double RW_A4C1=R_A4C1*W1;
                double RW_A4C2=R_A4C2*W2;
                double RW_A4C3=R_A4C3*W3;
                double RW_A4C4=R_A4C4*W4;
                double RW_A4C5=R_A4C5*W5;

                double RW_A5C1=R_A5C1*W1;
                double RW_A5C2=R_A5C2*W2;
                double RW_A5C3=R_A5C3*W3;
                double RW_A5C4=R_A5C4*W4;
                double RW_A5C5=R_A5C5*W5;

                /////////////////////////////////// 

                double H_A1C1=RW_A1C1+RW_A1C2+RW_A1C3+RW_A1C4+RW_A1C5; //RUMUS HASIL PEMBAGIAN NORMALISASI DENGAN BOBOT
                    double H_A2C2=RW_A2C1+RW_A2C2+RW_A2C3+RW_A2C4+RW_A2C5; //HASIL NORMALISASI DIKALI DENGAN BOBOT
                       double H_A3C3=RW_A3C1+RW_A3C2+RW_A3C3+RW_A3C4+RW_A3C5;
                          double H_A4C4=RW_A4C1+RW_A4C2+RW_A4C3+RW_A4C4+RW_A4C5;
                             double H_A5C5=RW_A5C1+RW_A5C2+RW_A5C3+RW_A5C4+RW_A5C5;

                System.out.println("   Karakter    |   W1  |   W2  |   W3  |   W4  |   W5  |");
                System.out.println("   Bobot (W)   |"+W1+" |"+W2+" |"+W3+" |"+W4+" |"+W5+" |");
                // System.out.println("   Karakter System.out.println(\"| Karakter    |   W1  |   W2  |   W3  |   W4  |   W5  |   er  |   BC1 |   BC2 |   BC3 |   BC4 |   BC5 |");
                System.out.println("   Karakter    |   C1  |   C2  |   C3  |   C4  |   C5  |");
                System.out.println("   A1  |   "+A1C1+"    |   "+A1C2+"    |   "+A1C3+"    |   "+A1C4+"    |   "+A1C5+"|");
                System.out.println("   A2  |   "+A2C1+"    |   "+A2C2+"    |   "+A2C3+"    |   "+A2C4+"    |   "+A2C5+"|");
                System.out.println("   A3  |   "+A3C1+"    |   "+A3C2+"    |   "+A3C3+"    |   "+A3C4+"    |   "+A3C5+"|");
                System.out.println("   A4  |   "+A4C1+"    |   "+A4C2+"    |   "+A4C3+"    |   "+A4C4+"    |   "+A4C5+"|");
                System.out.println("   A5  |   "+A5C1+"    |   "+A5C2+"    |   "+A5C3+"    |   "+A5C4+"    |   "+A5C5+"|");

                System.out.println("-----------------------------------");
                System.out.println("   Karakter    |       C1      |        C2     |        C3     |        C4     |        C5"
                         + "|    HASIL   |");
                System.out.println("   A1          |   "+RW_A1C1+" |   "+RW_A1C2+" |   "+RW_A1C3+" |   "+RW_A1C4+" |   "+RW_A1C5+" | "+H_A1C1+"|");
                System.out.println("   A2          |   "+RW_A2C1+" |   "+RW_A2C2+" |   "+RW_A2C3+" |   "+RW_A2C4+" |   "+RW_A2C5+" | "+H_A2C2+"|");
                System.out.println("   A3          |   "+RW_A3C1+" |   "+RW_A3C2+" |   "+RW_A3C3+" |   "+RW_A3C4+" |   "+RW_A3C5+" | "+H_A3C3+"|");
                System.out.println("   A4          |   "+RW_A4C1+" |   "+RW_A4C2+" |   "+RW_A4C3+" |   "+RW_A4C4+" |   "+RW_A4C5+" | "+H_A4C4+"|");
                System.out.println("   A5          |   "+RW_A5C1+" |   "+RW_A5C2+" |   "+RW_A5C3+" |   "+RW_A5C4+" |   "+RW_A5C5+" | "+H_A5C5+"|");
        }    
}