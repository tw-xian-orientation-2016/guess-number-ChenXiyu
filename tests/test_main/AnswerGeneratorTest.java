package test_main;

import main.AnswerGenerator;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {
    AnswerGenerator answerGenerator;
    Random random = mock(Random.class);

    @Test
    public void return_correct_number(){
        when(random.nextInt(10)).thenReturn(1,2,3,4);
        answerGenerator =new AnswerGenerator(random);

        assertThat("1234",is(answerGenerator.generatAnswer()));
    }
    @Test
    public void return_leagal_number(){
        when(random.nextInt(10)).thenReturn(1,1,2,3,4);
        answerGenerator =new AnswerGenerator(random);
        assertThat("1234",is(answerGenerator.generatAnswer()));
    }
}
