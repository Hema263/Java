import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int originalNum=num;
        int sum=0;
        int n=String.valueOf(num).length();
        while(num>0){ 
            int digit=num%10;
            sum+= Math.pow(digit,n);
            num=num/10;
        }
        if(sum==originalNum){
            System.out.println(originalNum+" is an armstrong Number");
        }
        else{
             System.out.println(originalNum+" is not an armstrong Number");
        }
        
    }
}
