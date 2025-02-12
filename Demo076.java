public class Demo076 {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secondMax = firstMax; 
                firstMax = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != firstMax) {
                secondMax = numbers[i];
            }
        }
        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second maximum number is: " + secondMax);
        } else {
            System.out.println("There is no second maximum number in the array.");
        }
    }
}
