package main;

import java.util.Random;

public class AnswerGenerator {
    Random r ;
    public AnswerGenerator(Random r){
        this.r = r ;
    }

    public String generatAnswer(){
        String result = "";
        boolean[] b = new boolean[10];
        int i = 0;
        while(i < 4) {
            int x = this.r.nextInt(10);
            if(!b[x]){
                b[x] = true;
                result += "" + x;
                i++;
            }
        }
        return result;
    }
}
