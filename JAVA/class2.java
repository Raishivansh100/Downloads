import java.util.*;
public class class2 {
    public static void main(String aregs[])
    {
     System.out.println("Enter a string:");
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     //nextLine() reads the entire line including spaces
        //next() reads only the next token (word) until a space is encountered
        //nextint reads the next integer
     //nextdouble reads the next double value
        //nextboolean reads the next boolean value
        //nextbyte reads the next byte value
     System.out.println(str);
     sc.close();
     //close() is used to close the scanner object to free up resources
    }   
}
