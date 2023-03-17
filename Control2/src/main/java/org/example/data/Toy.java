package org.example.data;

public class Toy extends Prize{
    public Toy(Integer id, String name, Integer amount, Byte chance) {
        super(id, name, amount, chance);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", chance=" + chance + '\n';
    }

}
