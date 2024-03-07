package Dispatch_Riders_Test;

import Dispatch_Riders.DispatchRiders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDispatchRiders {
    @Test
    public void test_that_collection_rate_les_than_equal_to_50_rider_wage_amount_to_13k(){
        assertEquals(13000,DispatchRiders.accountantCalculator(50));
    }
    @Test
    public void test_that_collection_rate_less_than_equal_to_59_rider_wage_rider_wage_amount_to_16800k(){
        assertEquals(16800,DispatchRiders.accountantCalculator(59));
    }

    @Test
    public void test_that_collection_rate_less_than_equal_to_69_rider_wage_amount_to_22250(){
        assertEquals(22250,DispatchRiders.accountantCalculator(69));
    }

    @Test
    public void test_that_collection_rate_greater_than_equal_to_70_rider_wage_amount_to_40000(){
        assertEquals(40000,DispatchRiders.accountantCalculator(70));
    }

    @Test
    public void test_that_if_collection_rate_is_80_rider_wage_amount_to_45000(){
        assertEquals(45000,DispatchRiders.accountantCalculator(80));
    }
    @Test
    public void test_that_if_collection_rate_is_25_rider_wage_amount_to_9k(){
        assertEquals(9000,DispatchRiders.accountantCalculator(25));
    }
    @Test
    void testThatCollection_rate_can_not_be_less_than_zero_But_if_so_throw_exception(){
        assertThrows(IllegalArgumentException.class,()-> DispatchRiders.accountantCalculator(-80));
    }

}
