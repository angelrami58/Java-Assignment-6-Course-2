/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez_assignment6;


/**
 *
 * @author angelramirez-rivera
 */
public class Ramirez_Assignment6 {
    
    public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};
        int[] loadedArray = new int[5];
        String fileName = "data.bin";

        // Write the originalArray to a binary file
        writeArray(fileName, originalArray);
        System.out.println("Array written to the file.");

        // Read data from the file into the loadedArray
        readArray(fileName, loadedArray);
        System.out.println("Array read from the file.");

        // Display the original and loaded arrays
        System.out.print("Original Array: ");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Loaded Array: ");
        for (int value : loadedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Compare the original and loaded arrays
        boolean arraysMatch = true;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != loadedArray[i]) {
                arraysMatch = false;
                break;
            }
        }

        if (arraysMatch) {
            System.out.println("Arrays match!");
        } else {
            System.out.println("Arrays do not match.");
        }
    }

    // Define the writeArray and readArray methods here (as provided in the previous response)

    // Static method to write an int array to a binary file
    public static void writeArray(String fileName, int[] data) {
        // Implementation of the writeArray method
    }

    // Static method to read data from a binary file into an int array
    public static void readArray(String fileName, int[] data) {
        // Implementation of the readArray method
    }
}


