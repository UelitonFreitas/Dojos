package Lamps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ueliton on 6/29/16.
 */
public class LampHallManager {
    private static final Boolean ON = true;
    private static final Boolean OFF = false;

    private final int numberOfLamps;
    private List<Boolean> lamps;

    public LampHallManager(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
        initializeLamps();
    }

    private void initializeLamps() {
        this.lamps = new ArrayList<>();
        for (int i = 0; i < this.numberOfLamps; i++) {
            lamps.add(OFF);
        }
    }

    public boolean switchLamp(int walk, int position) {
        int walkInRealWord = walk + 1;
        int positionInRealWord = position + 1;

        return positionInRealWord % walkInRealWord== 0;
    }

    public List<Boolean> joseWalk() {

        for (int walk = 0; walk < numberOfLamps; walk++) {
            for (int i = 0; i < numberOfLamps; i++) {
                if(switchLamp(walk, i))
                    lamps.set(i, !lamps.get(i));
            }
        }
        return lamps;
    }

    public List<Boolean> getLamps() {
        return lamps;
    }
}
