import java.util.*;
public class patterns5{
    public static void main(String args[])
    {
       System.out.println("solid rectangle pattern");
       //rectangle pattern
        for(int i=0;i<4;i++)
       {
        for(int j=0;j<5;j++)
        {
            System.out.print("*");
        }
        System.out.println();
       }

         System.out.println("hollow rectangle pattern");
         //hollow rectangle pattern
       for(int i=0;i<4;i++)
       {
        for(int j=0;j<5;j++)
        {
            if(j==0 || j==4 || i==0 || i==3)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
         }
        System.out.println();
       }
       System.out.println("inverted pyramid pattern");
         //inverted pyramid pattern
         for(int i=0;i<8;i++)
         {
            for(int j=0;j<9;j++)
            {
                if(8-j<=i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
         System.out.println("Numbered pattern");
         //numbered pattern 
         int counter=0;
         for(int i=0;i<8;i++)
            {
                for(int j=0;j<=i;j++)
                { 
                    {
                        System.out.print(counter+ " ");
                        counter++;
                    }
                }
                System.out.println();
            }
            System.out.println("Floyd's triangle pattern");
            //Floyd's triangle pattern
             int set=0;
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<=i;j++)
                { 
                    {
                        if (set%2==0)
                        {
                            System.out.print("1 ");
                        }
                        else
                        {
                            System.out.print("0 ");
                        }
                        set++;
                    }
                }
                System.out.println();
            }
    }
}