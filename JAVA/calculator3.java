   import java.util.*;

  class calculator3 {
      /**
     * @param args
     */
    public static void main(String args[])
     {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.println("Enter both numbers :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
      System.out.println("Enter your choice :"); 
        int choice =sc.nextInt();
      /*  if (choice==1)
      {
        System.out.println(a+b);
      }
      else if (choice==2)
      {
        System.out.println(a-b);
      }
      else if (choice==3)
      {
        System.out.println(a*b);
      }
      else if (choice==4)
      {
        System.out.println(a/b);
      }
      else
      {
        System.out.println("Invalid choice");
      } */
      switch (choice) {
        case 1:
            System.out.println("Addition: " + (a + b));
            break;
        case 2:
            System.out.println("subtraction " + (a + b));
            break;
        case 3:
            System.out.println("Multiplication: " + (a * b));
            break;
        case 4:
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
        default:
            break;
      }
    }
}