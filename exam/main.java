import java.util.*;
public class main{
    public static boolean Prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = obj1.nextInt();
        System.out.println("Prime numbers up to "+n+":");
        for(int i = 2; i <n; i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }
        obj1.close();
    }
}