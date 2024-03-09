package Dispatch_Riders_Test;

import Dispatch_Riders.DispatchRiders;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDispatchRiders {
    @Test
        public void test_that_collection_rate_les_than_equal_to_49_rider_wage_amount_to_12840 () {
        assertEquals(12840, DispatchRiders.accountantCalculator(49));
    }
    @Test
        public void  test_that_if_collection_rate_80_rider_wage_is_45000() {
            assertEquals(45000, DispatchRiders.accountantCalculator(80));
        }
        @Test
    public void test_that_if_collection_rate_is_25_rider_wage_is_9000(){
        assertEquals(9000, DispatchRiders.accountantCalculator(25));
        }

        @Test
    public void test_that_if_collection_rate_is_negative_rider_wage_throws_exception(){
        assertThrows(Exception.class,()-> DispatchRiders.accountantCalculator(-80));
        }


    }


