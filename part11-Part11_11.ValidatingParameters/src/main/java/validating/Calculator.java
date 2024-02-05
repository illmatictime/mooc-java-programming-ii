package validating;

public class Calculator {

    public int factorial(int num) {
        if(num < 0){
            throw new IllegalArgumentException("Only non-negative numbers!");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException
                ("Set Size and Subset Size should only be non-negative numbers!");
        }
        if(subsetSize > setSize){
            throw new IllegalArgumentException("Subset size is larger than set size!");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
