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

public class BrickAndMortar {
		private String address;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			if(address.trim().length() == 0) {return;}
			this.address = address;
		}
		
		public String toString() {
			return "Address = " + address;
		}

}
