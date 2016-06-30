package Lamps;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by ueliton on 6/29/16.
 * Este problema foi utilizado em 113 Dojo(s).
 * Um homem chamado José é o responsável por ligar e desligar as luzes de um corredor.
 * Cada lâmpada tem seu próprio interruptor que liga e a desliga. Inicialmente todas as lâmpadas estão desligadas.
 * José faz uma coisa peculiar: se existem n lâmpadas no corredor, ele caminha até o fim do corredor e volta n vezes.
 * Na iésima caminhada, ele aperta apenas os interruptores aos quais sua posição é divisível por i.
 * Ele não aperta nenhum interruptor na volta à sua posição inicial, apenas na ida.
 * A iésima caminhada é definida como ir ao fim do corredor e voltar.
 * Determine qual é o estado final de cada lâmpada. Está ligada ou desligada?
 * Exemplo:
 * Entrada: 3
 * Saída: [on, off, off]
 */
public class LampsHallTest {

    private static final boolean ON = true;
    private static final boolean OFF = false;
    private static final int NUMBER_OF_LAMPS = 3;
    private LampHallManager lampManager;

    @Before
    public void setUp() {
        this.lampManager = new LampHallManager(NUMBER_OF_LAMPS);
    }

    @Test
    public void shouldSwitchOneLampThatHasPositionDivisibleByI() {

        boolean switchLamp = true;

        int i = 2;
        int walk = 2;

        boolean lampWasSwitched = lampManager.switchLamp(walk, i);

        assertEquals(switchLamp, lampWasSwitched);
    }

    @Test
    public void shouldNOTSwitchOneLampThatHasPositionThatIsNOTDivisibleByI() {

        boolean switchLamp = false;

        int actualLamp = 3;
        int walk = 2;

        boolean lampsWasSwitched =  lampManager.switchLamp(walk, actualLamp);;

        assertEquals(switchLamp, lampsWasSwitched);
    }

    @Test
    public void shouldSwitchAllLampsThatHasPositionDivisibleByIInASetOfLamps() {

        List<Boolean> expectedLamps = Arrays.asList(ON, OFF, OFF, ON);

        LampHallManager lampManager = new LampHallManager(expectedLamps.size());

        List<Boolean> result = lampManager.joseWalk();

        assertEquals(expectedLamps, result);
    }
}
