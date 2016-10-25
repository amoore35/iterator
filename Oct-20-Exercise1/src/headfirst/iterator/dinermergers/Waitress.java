package headfirst.iterator.dinermergers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Waitress {

  private PancakeHouseMenu pancakeHouseMenu;
  private DinerMenu dinerMenu;
  private VesuvioMenu vesuvioMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, VesuvioMenu vesuvioMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.vesuvioMenu = vesuvioMenu;
  }

  public void printMenu() {
    ArrayList<MenuItem> menuItems = pancakeHouseMenu.getMenuItems();
    MenuItem[] menuItemsAs = dinerMenu.getMenuItems();
    LinkedList<MenuItem> menuItemVs = vesuvioMenu.getMenuItems();

    System.out.println("MENU\n----\nBREAKFAST");
    for (int i = 0; i < menuItems.size(); i++) {
      MenuItem menuItem = menuItems.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("\nLUNCH");
    int n = 0;
    while (menuItemsAs[n] != null) {
       MenuItem menuItem = menuItemsAs[n];
       System.out.print(menuItem.getName() + ", ");
       System.out.print(menuItem.getPrice() + " -- ");
       System.out.println(menuItem.getDescription());
       n++;
    }
    
    System.out.println("\nDINNER");
    for (int i = 0; i < menuItemVs.size(); i++) {
    	MenuItem menuItem = menuItemVs.get(i);
    	System.out.print(menuItem.getName() + ", ");
    	System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
    
  }

}
