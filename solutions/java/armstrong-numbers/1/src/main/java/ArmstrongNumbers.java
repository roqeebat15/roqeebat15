class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int figure = numberToCheck;
        int count = String.valueOf(numberToCheck).length();
        int sum=0;
        while(numberToCheck>0){
           int digits = numberToCheck %10;
            sum += (int) Math.pow(digits, count);
            numberToCheck /= 10;
        }
        return figure==sum;
    }

}
