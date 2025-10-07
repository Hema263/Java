import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String output=reverseVowels(str);
        System.err.println(output);
    }
    static boolean isVowel(char c){
        if(c=='a'|| c=='e'|| c=='i' || c=='o'|| c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        return true;
        else
        return false;
    }
    static String reverseVowels(String s){
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(isVowel(ch[i]) && isVowel(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!(isVowel(ch[i]))) i++;
            else j--;
        }
        return new String(ch);
    }
    
}
