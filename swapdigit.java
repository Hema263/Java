import java.util.Scanner;
public class swapdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d1=(n/1000);
        int d2=(n/100)%10;
        int d3=(n/10)%10;
        int d4=n%10;
        int result=d4*1000+d2*100+d3*10+d1;
        System.out.println("digit swap:" + result);


    }
}
