package racingCar;

public class RaceCar {
	int coord = 0;
	
	public int getCoord() {
		return coord;
	}

	public void moveCar() {
		this.coord +=1;
	}

	public void stopCar() {
		this.coord = this.coord;//TODO
	}

	public int goCarValue(int randomResult) {
		if(randomResult>=4)
			return 1;
		return 0;
	}



//    public int inputCarNum(int inputCarNum) {
////        List<Car> carList = new ArrayList<>();
////        for(int i = 0 ; i< inputCarNum ; i++){
////            ((ArrayList) carList).add(new Car());
////        }
////        return ((ArrayList) carList).size()
//////        return 0;
//    }
}
