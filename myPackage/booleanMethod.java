package myPackage;

public class booleanMethod {
    public static void main (String[] args){
        System.out.println(isEven(2000009));
        System.out.println(isEven(22));
        System.out.println(isEven(23));
        System.out.println(isEven(24));
    }
    public static Boolean isEven(int number){
        return number % 2 == 0;
    }
}
