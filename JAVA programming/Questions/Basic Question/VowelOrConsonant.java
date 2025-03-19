import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The letter '"+ch+"' is an Vowel");
            
                break;
        
            default:
                if(ch>'A' && ch<'z'){
                    System.out.println("The letter '"+ch+"' is consonant");
                }
                else{
                    System.out.println("Invalid enter!!! Enter only alphabet");
                }
                break;
        }
    }
}
