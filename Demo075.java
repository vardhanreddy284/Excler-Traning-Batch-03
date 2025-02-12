public class Demo075 {
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max; 
    }
    public static void main(String[] args) {
        Demo075 demo = new Demo075();
        int[] array = {1, 3, 7, 0, 5, 9, 2};
        int max = demo.findMax(array);
        System.out.println("The maximum number in the array is: " + max);
    }
}
