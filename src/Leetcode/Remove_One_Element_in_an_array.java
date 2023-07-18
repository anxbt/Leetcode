package Leetcode;

public class Remove_One_Element_in_an_array {
    public static void main(String[] args) {
        // Original array
        int[] array = {1, 2, 3, 4, 5};

        // Element to remove
        int elementToRemove = 5;

        // Remove the element and get the updated array
        int[] updatedArray = removeElement(array, elementToRemove);

        // Print the updated array
        for (int i : updatedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeElement(int[] array, int element){
        // Find the index of the element to remove
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        // If the element is found, remove it and shift the remaining elements
        if (index != -1) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Create a new array with the last element removed
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, array.length - 1);

            return newArray;
        } else {
            System.out.println("Element not found in the array.");
            return array; // If element not found, return the original array
        }
    }

    }

