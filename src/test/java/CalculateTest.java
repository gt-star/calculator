import com.example.calculator.Exception.DivisionByZeroException;
import com.example.calculator.serviceCalculator.ServiceCalcImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateTest {
    private final ServiceCalcImpl serviceCalc = new ServiceCalcImpl();

    @Test
    public void getRequestPlusOne(){
        int result = serviceCalc.getRequestPlus(Constants.X,Constants.Y);
        assertEquals(Constants.X+ Constants.Y,result);
    }
    @Test
    public void getRequestPlusTwo(){
        int result = serviceCalc.getRequestPlus(Constants.Y,Constants.Y);
        assertEquals(Constants.Y+ Constants.Y,result);
    }
    @Test
    public void getRequestMinusOne(){
        int result = serviceCalc.getRequestMinus(Constants.Y,Constants.Y);
        assertEquals(Constants.Y-Constants.Y,result);
    }
    @Test
    public void getRequestMinusTwo(){
        int result = serviceCalc.getRequestMinus(Constants.X,Constants.X);
        assertEquals(Constants.X-Constants.X,result);
    }
    @Test
    public void getRequestMultiplyOne(){
        int result = serviceCalc.getRequestMultiply(Constants.Y,Constants.Y);
        assertEquals(Constants.Y*Constants.Y,result);
    }
    @Test
    public void getRequestMultiplyTwo(){
        int result = serviceCalc.getRequestMultiply(Constants.Y,Constants.Y);
        assertEquals(Constants.Y*Constants.Y,result);
    }
    @Test
    public void getRequestDivideOne(){
        int result = serviceCalc.getRequestDivide(Constants.X,Constants.X);
        assertEquals(Constants.X/Constants.X,result);
    }
    @Test
    public void getRequestDivideTwo(){
        assertThrows(DivisionByZeroException.class, () -> serviceCalc.getRequestDivide(Constants.ZERO,Constants.Y));
    }
}
