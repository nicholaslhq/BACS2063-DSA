
package adt;


/**
 *
 * @author YKWong
 */
public class ArrListDriver {
    
    public static void main(String[] args){
        ItemInterface<String> potionset = new ArrList<>();
        System.out.println("isEmpty() return:" + potionset.isEmpty());
        potionset.add("Potion");
        potionset.add("Super Potion");
        potionset.add("Hyper Potion");
        
        ItemInterface<String> weaponset = new ArrList<>();
        weaponset.add("Sword");
        weaponset.add("Gun");
        weaponset.add("Arrow");
        weaponset.add("ShortGun");
        
        System.out.println("potionset: "+potionset);
        System.out.println("weaponset: "+weaponset);
        
        potionset.remove("Potion");
        System.out.println(potionset.toString());
        potionset.clear();
        System.out.println("clear"+potionset.toString());
        System.out.println("isEmpty() return:" + weaponset.isEmpty());
        
    }
    
}
