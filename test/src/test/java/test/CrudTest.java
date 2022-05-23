package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import UserWSO.CreateUser;

public class CrudTest extends UserService{

	String userId;

	public String readFile(String file) throws IOException {
		String filePath=this.getClass().getClassLoader().getResource(file).getPath();
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF8"));
		String content= org.apache.commons.io.IOUtils.toString(reader);
		return content;
	}

	@Test(priority=1)
	public void createUser() {
		String response=createuser("createuser.json");
		CreateUser createuser= new Gson().fromJson(response, CreateUser.class);
		userId=createuser.getId();
		Assert.assertNotNull(createuser.getId(), "user creation failed");
		Assert.assertNotNull(createuser.getCreatedAt(), "user creation failed");
		Assert.assertNotNull(createuser.getName(), "user name is null");
	}



}
