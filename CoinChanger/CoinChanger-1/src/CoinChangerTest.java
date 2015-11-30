import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CoinChangerTest {

    private ArrayList<Integer> coins(Integer...i) {
        return new ArrayList<Integer>(Arrays.asList(i));
    }

    @Test
    public void changeFor1() {
        assertEquals(coins(1), CoinChanger.giveChange(1));
    }

    @Test
    public void changeFor2() {
        assertEquals(coins(1,1), CoinChanger.giveChange(2));
    }

}