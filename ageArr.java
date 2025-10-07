import java.util.Scanner;

public class ageArr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=scan.nextInt();
        }
        int babycount=0;
        int schoolcount=0;
        int adultcount=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<=5){
                babycount++;
                
            }
            else if(arr[i]>5 && arr[i]<=20){
                schoolcount++;
                
            }
            else{
                adultcount++;
                
            }
        }
        System.out.println("Baby:"+ babycount);
        System.out.println("Attending School:"+ schoolcount);
        System.out.println("Adult:"+ adultcount);
    }
}

