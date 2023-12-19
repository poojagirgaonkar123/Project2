package pack4;


    import java.util.Scanner;
    public class Largest{
        public static void main(String[] args) {
            int a, b, c, la, temp;
            System.out.println("Enter first number");
            Scanner sc= new Scanner(System.in);
            a =sc.nextInt();
            System.out.println("Enter second number");
            Scanner s= new Scanner(System.in);
            b = s.nextInt();
            System.out.println("Enter third number");
            Scanner scc= new Scanner(System.in);
            c = scc.nextInt();
            temp= Math.max(a, b);
            la= Math.max(c, temp);
            System.out.println("Enter largest number among three numbers");
            System.out.println(la);



        }
    }


