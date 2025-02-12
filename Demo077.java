public class Demo077 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        System.out.println("Original Array: ");
        for (int element : originalArray) {
            System.out.print(element + " ");
        }
        System.out.println("\nCopied Array: ");
        for (int element : copiedArray) {
            System.out.print(element + " ");
        }
    }
}
