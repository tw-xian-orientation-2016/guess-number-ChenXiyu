package CampareNumberTest;

import main.CampareNumber;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CampareNumberTest {
    CampareNumber CB ;
    @Before
    public void setUp() {
        CB = new CampareNumber();
    }

    @Test
    public void outPut_0A0B_WHEN_All_wrong() {
        assertThat("0A0B",is(CB.campare("1234","9876")));
    }
    @Test
    public void outPut_4A0B_WHEN_All_Right(){
        assertThat("4A0B",is(CB.campare("1234","1234")));
    }
    @Test
    public void outPut_0A4B_WHEN_Out_of_order(){
        assertThat("0A4B",is(CB.campare("3421","4312")));
    }
    @Test
    public void test_Answer_is_legal(){
        AnswerGenerator AG = new AnswerGenerator();

        String answer = AG.generatAnswer();

        assertThat(true,is(this.verifyAnswer(answer)));

    }

    public boolean verifyAnswer(String a){
        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}


