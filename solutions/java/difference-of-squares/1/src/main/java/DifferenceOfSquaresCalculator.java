class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for(int i=1; i<=input; i++){
            sum+=i;
        }
        double squareOfSum = Math.pow(sum,2);
        return (int) squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        double sumOfSquares = 0;
        double square = 0;
        for(int i=1; i<=input; i++){
            square = Math.pow(i,2);
            sumOfSquares += square;
        }
        return (int) sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        DifferenceOfSquaresCalculator difference = new DifferenceOfSquaresCalculator();
        return difference.computeSquareOfSumTo(input) - difference.computeSumOfSquaresTo(input);
    }

}
