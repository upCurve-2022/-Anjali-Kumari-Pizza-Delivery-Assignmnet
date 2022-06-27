package model.food;

public  abstract class Item {
    String itemName;
    Integer PreparationTime;
    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Integer getPreparationTime()
    {
        return PreparationTime;
    }
    public void setPreparationTime(Integer preparationTimeOfPizza)
    {
        this.PreparationTime=preparationTimeOfPizza;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", preparationTimeOfPizza=" + PreparationTime +
                '}';
    }
}
