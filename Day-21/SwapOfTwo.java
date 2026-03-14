public class SwapOfTwo {
    public static void main(String[] args){
        int a=10;
        int b=20;
//        int temp=a;
//        System.out.println(b);
//        System.out.println(temp);
        //Approch
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
