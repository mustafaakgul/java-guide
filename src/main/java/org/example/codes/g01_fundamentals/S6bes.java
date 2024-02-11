


public class S6bes {
 
 public static void main(String[] args) {
  
   String[] aylar ={"ocak","subat","mart","nisan","mayis","haziran","temmuz","agustos","eylul","ekim","kasim","aralik"};
   int[] gunler= {31,28,31,30,31,30,31,31,30,31,30,31};
    gosterAy(aylar,gunler);
 }
 public static int gosterAy(String a,int b){
 System.out.println("Ay         Kaç gün");
 for(int i=0 ; i<12;i++)
 System.out.println(aylar[i]+"         "+ gunler[i]);
 }
}