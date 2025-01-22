package javabasic;

public class ConstructorClass {

    static int b = 12;

    public ConstructorClass(){

    }

    public static void main(String[] arg){
        ConstructorClass.method3();
        ConstructorClass constructorClass = new ConstructorClass();
        constructorClass.method1();
        constructorClass.method2();
    }
    public int method1(){
        int a = 100;
        System.out.println(b);
        return a;
    }
    public String method2(){
        String name = "sarath";
        return name;
    }
    public static void method3(){
        System.out.println(b);
    }

}
