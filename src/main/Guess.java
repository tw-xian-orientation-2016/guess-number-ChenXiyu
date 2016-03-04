package main;

public class Guess {
    AnswerGenerator answerGenerator ;
    CampareNumber campareNumber;
    public Guess(AnswerGenerator  answerGenerator , CampareNumber campareNumber){
        this.answerGenerator = answerGenerator;
        this.campareNumber = campareNumber;
    }

    public String guessNumber(String input){
        String answer = this.answerGenerator.generatAnswer();
        String result = this.campareNumber.campare(input, answer);
        return result;
    }
}
