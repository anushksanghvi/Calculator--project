public class Calculator{
    public static int add(int a, int b){
        return (a+b);
    }
    public static int sub(int a, int b){
        return (a-b);
    }
    public static int mul(int a, int b){
        return (a*b);
    }

    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(sub(2,3));
        System.out.println(mul(2,3));
    }
}