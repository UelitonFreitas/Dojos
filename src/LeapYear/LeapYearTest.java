package LeapYear;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by ueliton on 7/1/16 http://dojopuzzles.com/problemas/exibe/ano-bissexto/.
 *  Este problema foi utilizado em 391 Dojo(s).
 * A cada 4 anos, a diferença de horas entre o ano solar e o do calendário convencional completa cerca de 24 horas (mais exatamente: 23 horas, 15 minutos e 864 milésimos de segundo). Para compensar essa diferença e evitar um descompasso em relação às estações do ano, insere-se um dia extra no calendário e o mês de fevereiro fica com 29 dias. Essa correção é especialmente importante para atividades atreladas às estações, como a agricultura e até mesmo as festas religiosas.
 * Um determinado ano é bissexto se:
 * O ano for divisível por 4, mas não divisível por 100, exceto se ele for também divisível por 400.
 * Exemplos:

 * São bissextos por exemplo:
 * 1600
 * 1732
 * 1888
 * 1944
 * 2008

 * Não são bissextos por exemplo:
 * 1742
 * 1889
 * 1951
 * 2011

 * Escreva uma função que determina se um determinado ano informado é bissexto ou não.
 */
public class LeapYearTest {

    @Test
    public void shouldReturnThatAYearIsLeapBy4DivideButDoNotBy100(){

        int year =  2016;
        boolean result = LeapYear.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    public void shouldReturnThatAYearIsLeapBy4_100And400Divide(){

        int year =  1600;
        boolean result = LeapYear.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    public void shouldReturnThatAYearIsNOTLeap(){
        int year =  1742;
        boolean result = LeapYear.isLeapYear(year);
        assertFalse(result);
    }

    @Test
    public void shouldPassOnDojoLeapYearDataSetTest(){
        int[] leapYears = {1600, 1732, 1888, 1944, 2008};
        for (int leapYear : leapYears) {
            assertTrue(LeapYear.isLeapYear(leapYear));
        }
    }

    @Test
    public void shouldPassOnDojoNOTLeapYearDataSetTest(){
        int[] noLeapYears = {1742, 1889, 1951, 2011 };
        for (int noLeapYear : noLeapYears) {
            assertFalse(LeapYear.isLeapYear(noLeapYear));
        }
    }
}
