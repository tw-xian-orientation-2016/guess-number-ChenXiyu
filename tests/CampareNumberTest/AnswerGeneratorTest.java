package CampareNumberTest;

import main.AnswerGenerator;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {
    @Test
    public  void return_correct_number(){
        Random r = mock(Random.class);
        when(r.nextInt(10)).thenReturn(1,2,3,4);

        AnswerGenerator AG =new AnswerGenerator(r);

        assertThat("1234",is(AG.generatAnswer()));
    }
    @Test
    public void return_leagal_number(){
        Random r = mock(Random.class);
        when(r.nextInt(10)).thenReturn(1,1,2,2,2,3,4);

        AnswerGenerator AG =new AnswerGenerator(r);

        assertThat("1234",is(AG.generatAnswer()));
    }
}
