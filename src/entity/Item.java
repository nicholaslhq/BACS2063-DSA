
package entity;

/**
 *
 * @author YKWong
 */
public class Item {
    private int itemID;
    private String itemName;
    private String itemDes;


public Item(){

}

public Item(int itemID, String itemName, String itemDes){
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDes = itemDes;

}

 public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    
     public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
     public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }
    
     public String toString() {
        return "Item{" + "itemID=" + itemID + ", itemName=" +
                itemName + ", itemDescription=" + itemDes + "}";
    }
}