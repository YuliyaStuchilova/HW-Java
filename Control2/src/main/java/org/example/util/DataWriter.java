package org.example.util;

import org.example.data.Prize;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class DataWriter {

    public void writeFilePrizes (List<Prize> prizeList){
        try(FileWriter writer = new FileWriter("Prizes.txt"))
        {
            for(Prize prize : prizeList){
                writer.append(prize.toString());
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));;
        }
    }
}
