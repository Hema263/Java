import java.util.Scanner;

public class toLowerCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(lowerCase(str));
    }
    static String lowerCase(String s){
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
           
        }
         return new String (ch);
      
    }
}
