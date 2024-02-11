
import java.util.Scanner;
public class S2 {
        public static void main(String[] args) {

                int a;
                char b;
                Scanner input  = new Scanner(System.in);
                System.out.print("lutfen isaret giriniz: ");
                b = input.nextLine().charAt(0);
                System.out.print("sayi girin");
        a = input.nextInt();
                kareCiz(b,a);
        }
                public static void kareCiz(char isaret,int kenaruzunluk){

        int n=kenaruzunluk;
                        for(int i=0;i<n;i++)
                        {
                                for(int j=0;j<n;j++){
                                        if(i==0||i==(n-1))
                                                System.out.print(isaret);
                                        else if (j==0||j==(n-1))
                                                System.out.print(isaret);
                                        else
                                                System.out.print(" ");
                                }
                                System.out.println();
                        }
                }
}