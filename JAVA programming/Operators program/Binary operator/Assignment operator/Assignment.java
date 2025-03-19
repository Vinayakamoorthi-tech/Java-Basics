

public class Assignment {
    public static void main(String[] args) {
        int a = 10, b = 6;
        System.out.println("a=10 , b=6");
        System.out.println("a+=b = " + (a+=b));// a= a+b
        System.out.println("a-=b = " + (a-=b));// a= a-b
        System.out.println("a*=b = " +(a*=b));
        System.out.println("a/=b = "+(a/=b));
        System.out.println("b=a = "+(b=a));
        System.out.println("a&=b = " + (a&=b));
        System.out.println("a|=b = " + (a|=b));
        System.out.println("a^=b = " + (a^=b));
        System.out.println("a>>=b = " + (a>>=b));
        System.out.println("a<<=b = " + (a<<=b));
        System.out.println("a%=b = " + (a%=b));
    }
}

