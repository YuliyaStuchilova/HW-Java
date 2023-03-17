package org.example.data;


import org.example.util.DataReader;
import org.example.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

public class ToysList implements PrizesList{
    private List<Prize> prizes;

    public ToysList(List<Prize> prizes) {
        this.prizes = prizes;
    }

    public List<Prize> getPrizes() {
        List<Prize> copy = new ArrayList<>();
        for (Prize prize: prizes) {
            copy.add(prize);
        }
        return copy;
    }

    @Override
    public String toString() {
        return "prizes=" + prizes +
                '}';
    }


    @Override
    public void addPrize(Prize prize) {
        prizes.add(prize);
    }

    @Override
    public void deletePrize(Prize prize) {
        prizes.remove(prize);
    }

    public void savePrize() {
        DataWriter dataWriter = new DataWriter();
        dataWriter.writeFilePrizes(prizes);
    }

    public void readPrize() {
        DataReader dataReader = new DataReader();
        this.prizes = dataReader.prizeReader();
    }

}
