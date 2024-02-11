import java.util.Scanner;
public class S4 {
        public static void main(String[] args) {
                int a,b;
                Scanner input  = new Scanner(System.in);
                System.out.println("hngi sayinn kuvveti ");
                a = input.nextInt();
                System.out.println("kacncı kuvvet");
                b = input.nextInt();
                hesapla(a,b);
        }
        public static void hesapla(int a,int b){

                int  carpim=1;
                for(int i=0;i<b;i++){
                        carpim=carpim*a;
                }

                        System.out.print("Sonuc:"+a+"^"+b+"="+carpim);
        }
}