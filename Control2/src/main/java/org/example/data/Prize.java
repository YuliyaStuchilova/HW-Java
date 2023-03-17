package org.example.data;

public abstract class Prize {
    protected Integer id;
    protected String name;
    protected Integer amount;
    protected Byte chance;

    public Prize(Integer id, String name, Integer amount, Byte chance) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.chance = chance;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Integer getAmount() {
        return amount;
    }


    public Byte getChance() {
        return chance;
    }

    public void setChance(Byte chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "Prize{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", chance=" + chance +
                '}';
    }
}
