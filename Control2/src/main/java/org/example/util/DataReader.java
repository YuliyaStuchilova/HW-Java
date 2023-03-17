package org.example.util;

import org.example.data.Prize;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<Prize> prizeReader() {
        List<Prize> prizeList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("Prizes.txt")){
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String prizesData = scanner.nextLine();
                String[] strings = prizesData.split(", ");
                Prize prizesRead = new Prize(Integer.parseInt(strings[0]), strings[1],
                        Integer.parseInt(strings[2]), Byte.parseByte(strings[3])) {
                };
                prizeList.add(prizesRead);

            }
            scanner.close();

        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return prizeList;
    }
}
