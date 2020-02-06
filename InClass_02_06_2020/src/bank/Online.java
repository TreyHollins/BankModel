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

public class Online {
		private String url;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			if(url.trim().length() == 0) {return;}
			this.url = url;
		}
		
		public String toString() {
			return "URL = " + url;
		}
}
