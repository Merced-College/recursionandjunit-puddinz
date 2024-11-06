import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class RecursionTest {

    @Test
    public void testCount8() {
        assertEquals(1, Main.count8(8));
        assertEquals(2, Main.count8(818));
        assertEquals(4, Main.count8(8818));
        assertEquals(0, Main.count8(123456)); 
        assertEquals(1, Main.count8(108));
    }
    @Test
    public void testCountHi() {
        assertEquals(1, Main.countHi("xxhixx"));
        assertEquals(2, Main.countHi("xhixhix"));
        assertEquals(1, Main.countHi("hi")); 
        assertEquals(0, Main.countHi("hello"));
        assertEquals(3, Main.countHi("hihihi"));

    }
    
    @Test
    public void testCountHi2() {
        assertEquals(1, Main.countHi2("ahixhi"));
        assertEquals(2, Main.countHi2("ahibhi"));
        assertEquals(0, Main.countHi2("xhixhi")); 
        assertEquals(1, Main.countHi2("hi"));
        assertEquals(0, Main.countHi2("xhi"));

    }

    @Test
    public void testStrCount() {
        assertEquals(2, Main.strCount("catcowcat", "cat"));
        assertEquals(1, Main.strCount("catcowcat", "cow"));
        assertEquals(0, Main.strCount("catcowcat", "dog")); 
        assertEquals(3, Main.strCount("catcatcat", "cat"));
        assertEquals(0, Main.strCount("cat", "dog"));

    }
    
    @Test
    public void testStringClean() {
        assertEquals("yza", Main.stringClean("yyzzza"));
        assertEquals("abdc", Main.stringClean("abdcc"));
        assertEquals("how are you", Main.stringClean("howw areee you")); 
        assertEquals("a", Main.stringClean("aaaaa"));
        assertEquals("abc", Main.stringClean("aabbcc"));

    }



}