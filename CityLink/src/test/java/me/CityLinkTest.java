package me;

import org.junit.*;
import static org.junit.Assert.*;

public class CityLinkTest {

    public CityLinkTest() {}

    @Test
    public void test() throws Exception {
        assertEquals(73418, CityLink.timeTaken(new int[]{1593,-88517,14301,3200,6,-15099,3200,5881,-2593,11,57361,-92990}, new int[]{99531,-17742,-36499,1582,46,34001,-19234,1883,36001,0,233,485}));

        assertEquals(1, CityLink.timeTaken(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49}, new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49}));
    }
}
