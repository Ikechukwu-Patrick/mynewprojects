package NewPackage;

import org.junit.jupiter.api.Test;

import static NewPackage.IntArray.intArray;
import static org.junit.jupiter.api.Assertions.*;

class IntArrayTest {
    @Test
    public void testThatFunctionCanAddZeros(){
        intArray();
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(array, intArray());

    }

}