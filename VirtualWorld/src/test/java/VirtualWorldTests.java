import com.company.World;
import com.company.Utils;
//import junitparams.internal.Utils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static com.company.Utils.randomNumber;
import static com.company.World.worldHeight;
import static com.company.World.worldWidth;

public class VirtualWorldTests {

    World virtualWorld = new World();
    Utils utils = new Utils();

//    @Before
//    public void setUp() {
//
//        virtualWorld.fillEmptyWorld();
//        utils.checkForFreeSpace();
//        virtualWorld.populateWorld();
//        utils.bubbleSortComparator(virtualWorld.organismList);
//        Utils.checkForFreeSpace();
//        Utils.bubbleSortComparator(virtualWorld.organismList);
//        virtualWorld.makeTurn();
//        System.out.println("Wolne miejsca : " + Utils.checkForFreeSpace());
//        virtualWorld.drawTheWorld();
//    }

    @Before
    public void setUp() {

    }

    @Test
    public void UtilsRandomFreeNumberTestBelowMinimum() {
        int width = 1;

        for (int i = 0; i < 50; i++) {
            if (randomNumber(width - 2, width + 2) < 0) {
                System.out.println(width);
                Assert.fail("Przekroczono dopuszczalny zakres!");
            }
        }


    }

    @Test
    public void UtilsRandomFreeNumberTestAboveMaximumWidth() {
        int height = 29;

        for (int i = 0; i < 50; i++) {
            if (randomNumber(worldWidth - 2, worldWidth + 2) > worldWidth) {
                System.out.println(height);
                Assert.fail("Przekroczono dopuszczalny zakres!");
            }
        }
    }

    @Test
    public void UtilsRandomFreeNumberTestAboveMaximumHeight() {
        int height = 29;

        for (int i = 0; i < 50; i++) {
            if (randomNumber(worldHeight - 2, worldHeight + 2) > worldHeight) {
                System.out.println(height);
                Assert.fail("Przekroczono dopuszczalny zakres!");
            }
        }
    }


//
//    @Test
//    public void randomFreeNumberTest(int width, int height) {
//
//        int temporaryWidth = Utils.randomNumber(width - 2, width + 2);
//        int temporaryHeight = Utils.randomNumber(height - 2, height + 2);
//
//
//
//    }


}
