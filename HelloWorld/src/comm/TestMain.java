package comm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {   
		    	  
		        @Test  
		        public void testFindMax(){  
		            assertEquals(4,TestingExample.findMax(new int[]{1,3,4,2}));  
		            assertEquals(-1,TestingExample.findMax(new int[]{-12,-1,-3,-4,-2}));  
		        }  
		    }  
