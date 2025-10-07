import java.util.Scanner;

public class agecategory {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=1 && age<=10){
            System.out.println("Child");
        }
        else if(age>=11 && age<=18){
            System.out.println("Teenage");
        }
        else if(age>=19 && age<=25){
            System.out.println("Youngsters");
        }
        else if(age>=26 && age <=50){
            System.out.println("Adult");
        }
        else if(age>=51){
            System.out.println("Grandparents");
        }
        else{
            System.out.println("Invalid age");
        }
    }
    
}
