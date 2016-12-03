package latam.qa.testing.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void creatingString_twoSimpleNumbers_ReturnStringWithCommaBetween(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertEquals(String.format("%d,%d", 1, 2), result);

    }

    @Test
    public void creatingString_twoSimpleNumbers_mustFail(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertNotSame(String.format("%d,%d", 1, 5), result);

    }

    @Test
 public void divideCero(){
	Number n = new Number();
	int division = n.divideNumeros(1,0);
	if(division==0){
	System.out.println("No se pueden realizar divisiones por 0");
}
}

	@Test
public void numeroConocido(){

	Number n = new Number();
	int division1=n.divideNumeros(4,2);
	int division2=n.divideNumeros(9,2);
	System.out.println("Division 1="+division1);
	System.out.println("Division 2="+division2);
}


}
