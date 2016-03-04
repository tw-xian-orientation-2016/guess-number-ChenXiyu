package main;

public class CampareNumber {
   public String campare(String a , String b){
      int A = 0 , B = 0;
      for (int i = 0; i < a.length() ; i++) {
         for (int j = 0; j < b.length() ; j++) {
            if (a.indexOf(b.charAt(j)) == -1) {
               break;
            }
         }
      }
      return A + "A" + B + "B";
   }
}
