import java.util.Scanner;

public class productOfDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int product=1;
        while(n>0){
            int digit=n%10;
            product=product*digit;
            n=n/10;
        }
        System.out.println(product);
    }
}
