package test;

public class UserService extends BaseTest{



	public String createuser(String payload) {
		String path=basePath+props.getProperty("createUser");
		String response=postRestAPI(path,payload);
		return response;
	}

	public String getuser(int userId) {
		String path="https://reqres.in/api/users";
		String payload=basePath+props.getProperty("createUser");
		String response=postRestAPI(path,payload);
		return response;
	}

}
