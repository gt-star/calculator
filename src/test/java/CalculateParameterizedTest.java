import com.example.calculator.serviceCalculator.ServiceCalcImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateParameterizedTest {
    private final ServiceCalcImpl serviceCalc = new ServiceCalcImpl();

    @ParameterizedTest
    @MethodSource("params")
    public void getRequestPlus(int a,int b){
        int result = serviceCalc.getRequestPlus(a,b);
        assertEquals(a + b,result);
    }
    @ParameterizedTest
    @MethodSource("params")
    public void getRequestMinus(int a,int b){
        int result = serviceCalc.getRequestMinus(a,b);
        assertEquals(a - b,result);
    }
    @ParameterizedTest
    @MethodSource("params")
    public void getRequestMultiply(int a,int b){
        int result = serviceCalc.getRequestMultiply(a,b);
        assertEquals(a * b,result);
    }
    @ParameterizedTest
    @MethodSource("params")
    public void getRequestDivide(int a,int b){
        int result = serviceCalc.getRequestDivide(a,b);
        assertEquals(a / b,result);
    }

    public static Stream<Arguments> params(){
        return Stream.of(
                Arguments.of(Constants.Y,Constants.Y),
                Arguments.of(Constants.X,Constants.X),
                Arguments.of(Constants.Y,Constants.X),
                Arguments.of(Constants.ZERO,Constants.X));
    };
}
