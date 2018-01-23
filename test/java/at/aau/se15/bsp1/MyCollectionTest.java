package at.aau.se15.bsp1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyCollectionTest
{
    private MyCollection c;
    @Before
    public void setup() {
        c = new MyCollection(5);
        c.add("1");
        c.add("2");
        c.add("3");
    }
    @Test
    public void testSizeSimple() {
        assertEquals(3,c.size());
    }
    
    @Test
    public void testRemove() {
    	MyCollection c1 = new MyCollection(5);
    	c1.add("1");
    	c1.add("2");
    	c.remove("3");
    	assertEquals(c1.cList(),c.cList());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithExc() {
    	MyCollection c1 = new MyCollection(5);
    	c1.remove("3");
    }
    
   
}
