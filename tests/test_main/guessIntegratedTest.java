package test_main;

import main.AnswerGenerator;
import main.CampareNumber;
import main.Guess;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class guessIntegratedTest {
    Guess guess;
    @Before
    public void setUp() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4, 7);
        guess = new Guess(new AnswerGenerator(random), new CampareNumber());
    }
    @Test
    public void outPut_4A0B_When_input_1234(){
        ;
        assertThat("4A0B", is(guess.guessNumber("1234")));
    }
    @Test
    public void output_0A0B_when_input_9876(){
        assertThat(guess.guessNumber("9876"),is("0A0B"));
    }
    @Test
    public void output_0A4B_when_input_4321(){
        assertThat( guess.guessNumber("4321"), is("0A4B"));
    }
}
