package main;

public class Guess {
    String answer ;
    CampareNumber campareNumber;
    public Guess(AnswerGenerator  answerGenerator , CampareNumber campareNumber){
        this.answer= answerGenerator.generatAnswer();
        this.campareNumber = campareNumber;
    }

    public String guessNumber(String input){
        String result = this.campareNumber.campare(input, this.answer);
        return result;
    }
}
