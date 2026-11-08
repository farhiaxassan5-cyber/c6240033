package Stack;

    public class Solution {

        // Reverse Array Method
        public static int[] reverseArray(int[] numbers) {

            // Create ArrayStack with capacity 2
            ArrayStack<Integer> stack = new ArrayStack<>();

            // Push all numbers into Stack
            for (int i = 0; i < numbers.length; i++) {
                stack.push(numbers[i]);
            }

            // Create new array
            int[] reversed = new int[numbers.length];

            // Pop elements into new array
            int i = 0;

            while (!stack.isEmpty()) {
                reversed[i] = stack.pop();
                i++;
            }

            // Return reversed array
            return reversed;
        }

        // Bonus: Reverse First K Elements
        public static int[] reverseFirstK(int[] numbers, int k) {

            if (k < 0 || k > numbers.length) {
                throw new IllegalArgumentException("Invalid K");
            }

            ArrayStack<Integer> stack = new ArrayStack<>();

            // Push first K elements
            for (int i = 0; i < k; i++) {
                stack.push(numbers[i]);
            }

            int[] result = new int[numbers.length];

            // Pop first K elements
            for (int i = 0; i < k; i++) {
                result[i] = stack.pop();
            }

            // Copy remaining elements
            for (int i = k; i < numbers.length; i++) {
                result[i] = numbers[i];
            }

            return result;
        }

        // Display Array
        public static void display(int[] numbers) {

            for (int num : numbers) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        // Main Method
        public static void main(String[] args) {

            int[] numbers = {10, 20, 30, 40, 50};

            System.out.println("Original Array:");
            display(numbers);

            System.out.println("Reversed Array:");
            int[] reversed = reverseArray(numbers);
            display(reversed);

            System.out.println("Bonus Challenge:");
            int[] bonus = reverseFirstK(numbers, 3);
            display(bonus);
        }
    }