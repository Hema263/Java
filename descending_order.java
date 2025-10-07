import java.util.Scanner;

public class descending_order {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        int n4=scan.nextInt();
        int first=Math.max(Math.max(n1,n2),Math.max(n3,n4));
        int second=Math.max(Math.min(n1,n2),Math.min(n3,n4));
        int third=Math.min(Math.max(n1,n2),Math.max(n3,n4));
        int last=Math.min(Math.min(n1,n2),Math.min(n3,n4));
        if(second>third){
            System.out.println(first+" "+second+" "+third+" "+last);
        }
        else{
            System.out.println(first+" "+third+" "+second+" "+last);
        }
    }
}
