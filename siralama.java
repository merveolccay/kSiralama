package java101;
import java.util.Scanner;
public class siralama {
    public static void main (String[] args){
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = input.nextInt();
        System.out.print("b sayısını giriniz: ");
        b = input.nextInt();
        System.out.print("c sayısını giriniz: ");
        c = input.nextInt();

        if((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        }else if ((b<a) &&(b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }
        }else {
            if(b<a){
                System.out.print("c<b<a");
            }else {
                System.out.print("c<a<b");
            }
        }


    }
}
