import FireDrillExercise.QuestionOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuestionOneTest {
    @Test
    public void testThatCanReplace(){
        int [] myArray = {12,3,5,6,8,9,6,2,4,7};
        int [] array = {0,1,1,0,0,1,0,0,0,1};
        assertArrayEquals(array, QuestionOne.sortForEvenAndOldWithZeroAndOne(myArray));

    }

}
