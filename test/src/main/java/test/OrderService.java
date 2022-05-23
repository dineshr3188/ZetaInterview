package test;

public class OrderService extends BaseTest{

	public String addPet( ) {
		String path=props.getProperty("baseUri")+props.getProperty("addPet");
		String payload= "{\"id\":1,\"category\":{\"id\":1,\"name\":\"\"},\"name\":\"\",\"photoUrls\":[\"https://google.com/dogs\"],\"tags\":[{\"id\":1,\"name\":\"string\"}],\"status\":\"available\"}";
		String response=postRestAPI(path,payload);
		return response;
	}

	public String placeOrder() {
		String path=props.getProperty("baseUri")+props.getProperty("placeOrder");
		String payload="{\"id\":1,\"petId\":1,\"quantity\":1,\"shipDate\":\"2022-05-23T14:48:39.231Z\",\"status\":\"placed\",\"complete\":true}";
		String response=postRestAPI(path,payload);
		return response;
	}

	public String checkInventory() {
		String path=props.getProperty("baseUri")+props.getProperty("checkInventory");
		String response=getRestAPI(path);
		return response;

	}


}
