class Darts {
    int score(double xOfDart, double yOfDart) {
        double coordinates = Math.pow(xOfDart,2) + Math.pow(yOfDart,2);
        if(coordinates<=1){
        return 10;
        }
        else if(coordinates <=25){
            return 5;
        }
        else if(coordinates <=100){
            return 1;
        }
        else{
            return 0;
        }
    }
}
