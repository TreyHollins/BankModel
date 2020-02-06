/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/6/2020
 * Assignment: In Class
 * Description: 
 * Citations:
 */
package bank;

public class CafeBranch {
		private String menu;

		public String getMenu() {
			return menu;
		}

		public void setMenu(String menu) {
			if(menu.trim().length() == 0) {return;}
			this.menu = menu;
		}
		
		public String toString() {
			return "Menu = " + menu;
		}
}
