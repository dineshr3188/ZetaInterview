package test;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import UserWSO.AddPetPojo;
import UserWSO.InventoryPojo;
import UserWSO.OrderPojo;

public class EndToEndTest extends OrderService {

	Integer petId;

	@Test(priority=1)
	public void EndToEnd() {
		String response=addPet();
		AddPetPojo addPet = new Gson().fromJson(response,AddPetPojo.class );
		petId=addPet.getId();
		System.out.println("pet added successfully "+ petId);
		String responseOrder=placeOrder();
		OrderPojo order=  new Gson().fromJson(responseOrder,OrderPojo.class );
		System.out.println("Order ID is " +order.getId());
		String responseinventory=checkInventory();
		InventoryPojo inventory=  new Gson().fromJson(responseinventory,InventoryPojo.class );
		System.out.println("Inventory has " +inventory.getAvailable());

	}




}
