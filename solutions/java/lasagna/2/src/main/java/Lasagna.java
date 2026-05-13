public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
}
    public int remainingMinutesInOven(int x){
        int value = expectedMinutesInOven();
        return value - x;
}
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
}
    public int totalTimeInMinutes(int layers, int mins){
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + mins;
    }
}
