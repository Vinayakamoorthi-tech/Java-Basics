
public class FourMethod {
    public static void main(String[] args) {
        FourMethod m=new FourMethod();
        m.method1(10);
        m.method2();
        
        System.out.println("Value : "+m.method3());
        System.out.println("Value : "+m.method4(10,20));
    }
    void method1(int a){    //With argument without return
        System.out.println("The given argument : "+a);
    }
    void method2(){        // without argument without return type
        System.out.println("This is no argument no return type statement");
    }
    int method3(){          //with return type and without argument
        int a =15;
        return a;
    }
    float method4(int a,int b){ //with argument with return type
        int c=a+b;
        return c;
    }
}
