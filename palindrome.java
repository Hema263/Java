import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int dig=0;
        int rev=0;
        while(n>0){
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(rev==t){
            System.out.println(rev+ " is a palindrome");
        }
        else{
            System.out.println(rev+ " is not a palindrome");
        }
    }
}
