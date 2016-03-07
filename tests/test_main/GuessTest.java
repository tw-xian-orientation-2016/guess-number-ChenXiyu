package test_main;

import main.AnswerGenerator;
import main.CampareNumber;
import main.Guess;
import org.junit.Test;

import java.util.Random;

import static javafx.beans.binding.Bindings.when;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class GuessTest {
    @Test
    public void guessUnitTest(){
        AnswerGenerator answerGenerator =mock(AnswerGenerator.class);
        CampareNumber campareNumber = mock(CampareNumber.class);

        when(answerGenerator.generatAnswer()).thenReturn("1234");
        when(campareNumber.campare("1243","1234")).thenReturn("2A2B");

        Guess guess = new Guess(answerGenerator , campareNumber);

        String result = guess.guessNumber("1243");
        assertThat("2A2B",is(result));
    }
}
