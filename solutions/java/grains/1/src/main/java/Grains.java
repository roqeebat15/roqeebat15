import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
    throw new IllegalArgumentException("square must be between 1 and 64");
}

        return BigInteger.valueOf(2).pow(square-1); 
    }

    BigInteger grainsOnBoard() {
        int count =1;
        BigInteger sum = BigInteger.ZERO;
        while(count<=64){
            sum = sum.add(BigInteger.valueOf(2).pow(count-1));
            count++;
        }
        return sum;
    }

}
