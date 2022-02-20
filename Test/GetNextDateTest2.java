import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNextDateTest2 extends GetNextDate {

    @Test
    void getNextDate1() {
        int day=1;
        int month=1;
        int year=2018;
        String expected = "2/1/2018";
        String result = getNextDate(day,month,year);
        assertEquals(expected,result);
    }
}