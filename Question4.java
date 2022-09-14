public class Question4 {
    public static void main(String args[]){
        int a=20;
        int b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapping using temp variable: a="+ a+", b="+b);
        int c=20;
        int d=10;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("Swapping without using temp variable: c="+ c+", d="+d);
    }
}
