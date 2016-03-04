package main;

public class CampareNumber {
   public String campare(String a , String b){
      int A = 0 , B = 0;
      for (int j = 0; j < b.length() ; j++) {
         if (a.indexOf(b.charAt(j)) == -1) {
            continue;
         }else {
            B ++ ;
         }
      }
      for (int i = 0; i < a.length() ; i++) {
         if(a.charAt(i) == b.charAt(i)){
            A++;
            B--;
         }
      }
      return A + "A" + B + "B";
   }
}
