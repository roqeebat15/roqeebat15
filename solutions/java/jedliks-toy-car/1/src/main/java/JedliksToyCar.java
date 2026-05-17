public class JedliksToyCar {
    int distanceDriven = 0;
    int batteryPercentage = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0){
            return "Battery empty";
        }
        else{
            return "Battery at " + batteryPercentage + "%";
        }
    }

    public void drive() {
        if (distanceDriven == 2000 && batteryPercentage == 0){
        }
 else{
               distanceDriven += 20;     batteryPercentage -= 1;
     }     
        
    }
}
