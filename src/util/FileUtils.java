package util;

import global.GlobalStrings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
    public int[] readIntegersFromArray() {
        File file = new File(GlobalStrings.FILE_PATH);
        int[] integers = new int[100];
        int count = 0;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String integerLine;
            while ((integerLine = bufferedReader.readLine()) != null) {
                int newIntegerLine = Integer.parseInt(integerLine.trim());
                integers[count] = newIntegerLine;
                count++;
                System.out.println(integerLine);
            }
        } catch (IOException exception) {
            System.err.print(exception.getMessage());
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = integers[i];
        }
        return result;
    }
}
