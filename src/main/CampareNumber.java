package main;

public class CampareNumber {
   public String campare(String a , String b){
      int A = 0 , B = 0;
      for (int i = 0; i < a.length() ; i++) {
         if (a.indexOf(b.charAt(i)) != -1) {
            B++ ;
         }
         if(a.charAt(i) == b.charAt(i)){
            A++;
            B--;
         }
      }
      return A + "A" + B + "B";
   }
}
