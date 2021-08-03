import java.util.Scanner;

public class y2021m8d1 {
    public static void main(String[] args)
    {
        double grades1,grades2;
        double level;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your first grades");
        grades1= scanner.nextInt();
        System.out.println("Your second grades");
        grades2= scanner.nextInt();
        level=(grades2-grades1)/grades1*100;
        System.out.printf("%.2f",level);
        System.out.print("%");
    }
}
