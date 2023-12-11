/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_assignment6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author angelramirez-rivera
 */
public class ArrayFileHandler {
     // Static method to write an int array to a binary file
        public static void writeArray(String fileName, int[] data) {
            try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
                for (int value : data) {
                    out.writeInt(value);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Static method to read data from a binary file into an int array
        public static void readArray(String fileName, int[] data) {
            try (DataInputStream in = new DataInputStream(new FileInputStream(fileName)) ) {
                for (int i = 0; i < data.length; i++) {
                    data[i] = in.readInt();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
