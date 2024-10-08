import java.util.*;
public class average_of_three { 
    public static void average(int a , int b , int c )
    {
        int avg = (a + b + c) / 3 ;
        System.out.print("Average:- " + avg ); 
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any three number:- ");
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        average( a , b , c );
    }    
}
