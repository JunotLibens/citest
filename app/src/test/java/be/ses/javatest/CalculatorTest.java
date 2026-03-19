package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    
    @Test 
    public void gegevenXis4enYis2_waneerDivide_dan2() {
        // Arrange
        Calculator calc = new Calculator();
        Float x = 4.0f;
        Float y = 2.0f;

        // Act
        Float result = calc.divide(x, y);

        // Assert
        assertThat(result).isEqualTo(2.0f);

    }

    @Test
    public void gegevenXis4enYis2_waneerMultiply_dan8() {
        // Arrange
        Calculator calc = new Calculator();
        Float x = 4.0f;
        Float y = 2.0f;

        // Act
        Float result = calc.multiply(x, y);

        // Assert
        assertThat(result).isEqualTo(8.0f);

    }

    @Test 
    public void gegevenXis4enYis2_waneerSubtract_dan2() {
        // Arrange
        Calculator calc = new Calculator();
        Float x = 4.0f;
        Float y = 2.0f;

        // Act
        Float result = calc.subtract(x, y);

        // Assert
        assertThat(result).isEqualTo(2.0f);

    }

    @Test
    public void gegevenXis4enYis2_waneerAdd_dan6() {
        // Arrange
        Calculator calc = new Calculator();
        Float x = 4.0f;
        Float y = 2.0f;

        // Act
        Float result = calc.add(x, y);

        // Assert
        assertThat(result).isEqualTo(6.0f);

    }

    @Test
    public void gegevenXis4_waneerRoot_dan2() {
        // Arrange
        Calculator calc = new Calculator();
        Float x = 4.0f;

        // Act
        Float result = calc.root(x);

        // Assert
        assertThat(result).isEqualTo(2.0f);

    }

}