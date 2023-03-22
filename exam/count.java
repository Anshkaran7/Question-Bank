import java.util.Scanner;

public class count{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        long num = scanner.nextLong();
        int n = 0;
        while(num!=0){
            num /=10;
            n ++;

        }
        System.out.println(n);
    }
}