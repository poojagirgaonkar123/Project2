package pack4;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400==0 && year%4==0){
            System.out.println("This is a leap year");
        } else{
            System.out.println("This is not a leap year");
        }
    }
}
