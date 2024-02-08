

public class Program {

    public static void main(String[] args) {
        int[] numbers = {8, -2, 3, 1, 1};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
        System.out.println(sum(numbers, 0, numbers.length, 0, 999));
    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int total = 0;
        int startIndex = fromWhere;
        int endindex = toWhere;

        if(fromWhere <= 0){
            startIndex = 0;
        }
        if(toWhere >= array.length){
            endindex = array.length;
        }

        for (int i = startIndex; i < endindex; i++) {
            if(array[i] >= smallest && array[i] <= largest){
                total += array[i];
            }
        }
        return total;
    }
}
