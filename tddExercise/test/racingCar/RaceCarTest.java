package racingCar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceCarTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void 입력받은_차_수만큼_car_객체를_생성하는지_확인() {
        int inputCarNum = 3;
        RacingGame racingGame = new RacingGame(3);
        assertEquals(inputCarNum, racingGame.rc.size());
    }
    
    @Test
    public void 전진값을_주어졌을떄_자동차의_현재_위치값이_변경됨() {
    	RaceCar raceCar = new RaceCar();
    	int cuurrentCoord = raceCar.getCoord();
    	raceCar.moveCar();
    	assertEquals(cuurrentCoord+1, raceCar.getCoord());
    }
    
    @Test
    public void 멈춤값을_주어졌을떄_자동차의_현재_위치값이_변경되지_않음() {
    	RaceCar raceCar = new RaceCar();
    	int cuurrentCoord = raceCar.getCoord();
    	assertEquals(cuurrentCoord, raceCar.getCoord());
    }
    
    @Test
    public void 전진조건값이_4이상일때_전진값이_맞게_주어지는지_확인() {
    	RaceCar raceCar = new RaceCar();
    	int randomResult = 4;
    	assertEquals(1, raceCar.goCarValue(randomResult));
    }
    
    @Test
    public void 전진조건값이_4미만일때_전진값이_맞게_주어지는지_확인() {
    	RaceCar raceCar = new RaceCar();
//    	int randomResult = 3;
    	assertEquals(0, 1);
    }
}