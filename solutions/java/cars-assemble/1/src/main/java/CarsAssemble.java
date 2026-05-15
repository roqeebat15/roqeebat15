public class CarsAssemble {

    public double productionRatePerHour(int speed) {
    int cars = 221;
        int carsProduced = cars * speed;
        if (1 <= speed && speed <= 4){
          return carsProduced;   
        }
        else if(5 <= speed && speed <= 8){
            return 0.9 * carsProduced;
        }
        else if(speed == 9){
            return 0.8 * carsProduced;
        }
        else if(speed == 10){
            return 0.77 * carsProduced;
        }
        else{
            return 0;
        }
    }
    public int workingItemsPerMinute(int speed) {
    double workingCarsPM = productionRatePerHour(speed) / 60;
        return (int) workingCarsPM;
    }
}
