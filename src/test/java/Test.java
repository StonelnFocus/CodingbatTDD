import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @org.junit.jupiter.api.Test
    public void testSleepInWeekday(){
        boolean weekday = true;
        boolean vacation = false;
        assertFalse(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testBlackjack(){
        assertEquals(21, Logic_2.blackjack(19,21));
        assertEquals(21, Logic_2.blackjack(21,19));
        assertEquals(19, Logic_2.blackjack(19,22));
        assertEquals(0, Logic_2.blackjack(22,23));
    }

    @org.junit.jupiter.api.Test
    public void testSleepInWeekdayVacation(){
        boolean weekday = true;
        boolean vacation = true;
        assertTrue(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testSleepInWeekendVacation(){
        boolean weekday = false;
        boolean vacation = true;
        assertTrue(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testSleepInWeekend(){
        boolean weekday = false;
        boolean vacation = false;
        assertTrue(Warmup_1.sleepIn(weekday, vacation));
    }

    @org.junit.jupiter.api.Test
    public void testSleepIn(){
        assertAll(
                () -> assertTrue(Warmup_1.sleepIn(true, true))
        );
    }

    @org.junit.jupiter.api.Test
    public void testSplit53EqualSum(){
        int[] nums = {5, 5, 3, 6, 1};
        boolean equal = Recursion_2.split53(nums);
        assertTrue(equal);
    }

//    @org.junit.jupiter.api.Test
//    public void testSplit53UnequalSum(){
//        int[] nums = {5, 5, 3, 4, 9};
//        boolean equal = Recursion_2.split53(nums);
//        assertFalse(equal);
//    }

    @org.junit.jupiter.api.Test
    public void testFactorial(){
        assertEquals(720, Recursion_1.factorial(6));
        assertEquals(1, Recursion_1.factorial(1));
    }

    @org.junit.jupiter.api.Test
    public void testCountHi(){
        assertEquals(2, String_2.countHi("ABChi hi"));
        assertEquals(1, String_2.countHi("abc hi ho"));
        assertEquals(2, String_2.countHi("hihi"));

    }

    @org.junit.jupiter.api.Test
    public void testPost4(){
        assertArrayEquals(new int[]{1,2}, Array_2.post4(new int[]{2,4,1,2}));
        assertArrayEquals(new int[]{2}, Array_2.post4(new int[]{4,1,4,2}));
        assertArrayEquals(new int[]{1,2,3}, Array_2.post4(new int[]{4,4,1,2,3}));

    }

    @org.junit.jupiter.api.Test
    public void testFizzArray3(){
        assertArrayEquals(new int[]{5,6,7,8,9}, Array_2.fizzArray3(5,10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, Array_2.fizzArray3(11,18));
        assertArrayEquals(new int[]{1,2}, Array_2.fizzArray3(1,3));
    }

    @org.junit.jupiter.api.Test
    public void testAllSwap(){
        assertArrayEquals(new String[]{"ac", "ab"}, Map_2.allSwap(new String[]{"ab", "ac"}));
        assertArrayEquals(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}, Map_2.allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));
        assertArrayEquals(new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}, Map_2.allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));
    }

//    centeredAverage([1, 2, 3, 4, 100]) ??? 3
//    centeredAverage([1, 1, 5, 5, 10, 8, 7]) ??? 5
//    centeredAverage([-10, -4, -2, -4, -2, 0]) ??? -3
    @org.junit.jupiter.api.Test
    public void testCenteredAverage(){
        assertEquals(3, Array_2.centeredAverage(new int[]{1,2,3,4,100}));
        assertEquals(5, Array_2.centeredAverage(new int[]{1,1,5,5,10,8,7}));
        assertEquals(-3, Array_2.centeredAverage(new int[]{-10,-4,-2,-4,-2,0}));
    }

    @org.junit.jupiter.api.Test
    public void testSort(){
        int[] unsortedArray = new int[]{2,3,1,4,6,3,7};
        int array1[] = new int[0];
        int a;
        double b;
        char c;
        long loong = 0;
        long[] looong = null;
        long[][] loooong = null;
        int nonsense;
        System.out.println(array1);
        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
        assertTrue(Arrays.equals(new int[]{1,2,3,3,4,6,7}, unsortedArray));
    }

    @org.junit.jupiter.api.Test
    public void testFunctionalProgramming(){
//        List<String> strings = Arrays.asList("John", "Existential Dread", "yay");
//        strings.replaceAll(s -> "y" + s + "y");
//        System.out.println(strings);
        assertTrue(false);
    }

    @org.junit.jupiter.api.Test
    public void testWordAppend(){
        assertEquals("a", Map_2.wordAppend(new String[]{"a","b","a"}));
        assertEquals("aa", Map_2.wordAppend(new String[]{"a","b","a","c","a","d","a"}));
        assertEquals("a", Map_2.wordAppend(new String[]{"a","","a"}));
    }

    @org.junit.jupiter.api.Test
    public void testMaxMirror(){
        assertEquals(3,Array_3.maxMirror(new int[]{1,2,3,8,9,3,2,1}));
        assertEquals(3,Array_3.maxMirror(new int[]{1,2,1,4}));
        assertEquals(2,Array_3.maxMirror(new int[]{7,1,2,9,7,2,1}));
    }

    @org.junit.jupiter.api.Test
    public void testEvenlySpaced(){
        assertTrue(Logic_2.evenlySpaced(2,4,6));
        assertTrue(Logic_2.evenlySpaced(4,6,2));
        assertFalse(Logic_2.evenlySpaced(4,6,3));
    }
}

