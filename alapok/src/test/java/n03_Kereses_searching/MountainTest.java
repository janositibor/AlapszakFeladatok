package n03_Kereses_searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {
    @Test
    void testSearchPike() {
        int[] heights = new int[]{3200, 2670, 1234, 2345, 2634, 2790};

        assertEquals(true, new Mountain(heights).searchPike(new Pike("Lomnici-csúcs", 2634)));
    }

    @Test
    void testSearchPikeNotFound() {
        int[] heights = new int[]{1234, 2345, 2634, 2670, 2790, 3200};

        assertEquals(false, new Mountain(heights).searchPike(new Pike("Gerlachfalvi-csúcs", 2655)));
    }

    @Test
    void testRealSearchPike() {
        Pike pike1=new Pike("Mecsek",601);
        Pike pike2=new Pike("Kékestető",1011);
        Pike pike3=new Pike("Álmoshegy",1001);
        Pike pike4=new Pike("Almáshegy",701);

        Pike[] pikesArray={pike1,pike2,pike3,pike4};
        Mountain mountain=new Mountain(pikesArray);

        assertEquals(0, mountain.searchPikeByPike(pike4));
        assertEquals(1, mountain.searchPikeByPike(pike3));
        assertEquals(2, mountain.searchPikeByPike(pike2));
        assertEquals(3, mountain.searchPikeByPike(pike1));
    }


}