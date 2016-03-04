package CampareNumberTest;

import main.CampareNumber;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CampareNumberTest {
    @Test
    public void outPut_0A0B_WHEN_All_wrong() {
        CampareNumber CB = new CampareNumber();
        String a = "1234" , b = "9876";
        String result = CB.campare(a , b);

        assertThat("0A0B",is(result));
    }
    @Test
    public void outPut_4A0B_WHEN_All_Right(){
        CampareNumber CB = new CampareNumber();
        String a = "1234" , b = "1234";
        String result = CB.campare(a , b);

        assertThat("4A0B",is(result));
    }
    @Test
    public void outPut_0A4B_WHEN_Out_of_order(){
        CampareNumber CB = new CampareNumber();
        String a = "1234" , b = "4321";
        String result = CB.campare(a, b);

        assertThat("0A4B",is(result));
    }
}