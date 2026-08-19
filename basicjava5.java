import java.util.*;
public class basicjava5 {
    public static void printhelloworld(){
        System.out.println("hello world");
    }
    


    public static void calculatesum(int num1, int num2){
       
        int sum = num1 + num2;
        System.out.println("sum is : "+ sum);
    }

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        calculatesum(a,b);
    }

}
