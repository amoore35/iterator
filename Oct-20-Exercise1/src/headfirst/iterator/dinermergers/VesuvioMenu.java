package headfirst.iterator.dinermergers;

import java.util.LinkedList;

public class VesuvioMenu {
	
	private LinkedList<MenuItem> menuItems;
	
	public VesuvioMenu() {
		menuItems = new LinkedList<>();
		addItem("Ravioli Combo", "3 cheese and 3 spinach", true, 11.00);
		addItem("Baked Spaghetti", "Spaghetti baked with mozzarella cheese"
				+ " and meat sauce", false, 10.50);
		addItem("Spinach Ravioli", "Pillows of pasta filled with spinach,"
				+ " baked in tomato sauce and mozzarella cheese", true, 11.00);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
	    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
	    menuItems.add(menuItem);
	  }

	public LinkedList<MenuItem> getMenuItems() {
		return menuItems;
	}
}
