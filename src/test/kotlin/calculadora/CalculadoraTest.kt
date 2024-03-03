package calculadora;

import design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

public class CalculadoraTest {
    private var number1 = 25
    private var number2 = 15
    private var calculadora = Calculadora()

    @Test
    fun `Debe sumar los dos valores`() {
        Assertions.assertEquals(calculadora.sumar(number1, number2),40)
    }
    @Test
    fun `Debe restar los dos valores`() {
        Assertions.assertEquals(calculadora.restar(number1, number2),10)
    }
    @Test
    fun `Debe dividir los dos valores`() {
        Assertions.assertEquals(calculadora.dividir(number2, number1),0)
    }
    @Test
    fun `Debe multiplicar los dos valores`() {
        Assertions.assertEquals(calculadora.multiplicar(number1, number2),375)
    }
}
