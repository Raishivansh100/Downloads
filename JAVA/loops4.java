import java.util.Scanner;
public class loops4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int num=sc.nextInt();
        System.out.println("Multiplication table of " + num + ":");
        
            int i=1;
         
        while(i<=20)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
         
            {  int k=1;
            do {
            System.out.println(num + " x " +k + " = " + (num * k));
            k++;
             }
          
            while(k<=10);
            } 
        for(int j=1; j<=10; j++)
        {
            System.out.println(num + " x " + j + " = " + (num * j));
        }
    }
}
