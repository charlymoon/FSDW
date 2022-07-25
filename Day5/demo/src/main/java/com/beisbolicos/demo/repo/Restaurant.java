package com.beisbolicos.demo.repo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Restaurant {
	   // @Id
	    private long restaurantId;
	    
	    @Indexed(unique = true)
	    private String name;
	    private String borough;
	    private String cuisine;
		public long getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(long restaurant_id) {
			this.restaurantId = restaurant_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBorough() {
			return borough;
		}
		public void setBorough(String borough) {
			this.borough = borough;
		}
		public String getCuisine() {
			return cuisine;
		}
		public void setCuisine(String cuisine) {
			this.cuisine = cuisine;
		}
}
