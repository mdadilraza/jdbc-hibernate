package controller;

import java.util.ArrayList;
import java.util.List;



import dao.ApplicationDao;
import dto.Application;
import dto.User;

public class SaveBoth {

	public static void main(String[] args) {
		User user1= new User();
		user1.setUserName("Shayam");
		user1.setUserAddress("Hyd");
		user1.setUserEmail("shayam@gmail.com");
		user1.setUserPassword("shayam@123");
		user1.setUserPhone(9373737379L);
		
		User user2= new User();
		user2.setUserName("Venky");
		user2.setUserAddress("Hyd");
		user2.setUserEmail("venky@gmail.com");
		user2.setUserPassword("venky@123");
		user2.setUserPhone(9373737379L);
		
		User user3= new User();
		user3.setUserName("Rahul");
		user3.setUserAddress("Hyd");
		user3.setUserEmail("rahul@gmail.com");
		user3.setUserPassword("rahul@123");
		user3.setUserPhone(9373737379L);
		
		Application application1= new Application();
		application1.setApplicationName("instagram");
		application1.setApplictionType("Social-Media");
		application1.setApplictionSize(78);
		application1.setApplicationRating(4.5);
		
		Application application2= new Application();
		application2.setApplicationName("Facebook");
		application2.setApplictionType("Social-Media");
		application2.setApplictionSize(80);
		application2.setApplicationRating(4.1);
		
		Application application3= new Application();
		application3.setApplicationName("Youtube");
		application3.setApplictionType("Social-Media");
		application3.setApplictionSize(126);
		application3.setApplicationRating(4.2);
		
		List<User> platinum = new ArrayList<User>();
	    platinum.add(user1);
	    platinum.add(user2);
	    platinum.add(user3);
	    
	    List<User> gold = new ArrayList<User>();
	    gold.add(user1);
	    gold.add(user2);
	    
	    List<User> silver= new ArrayList<User>();
	    silver.add(user1);
	    silver.add(user3);
	    
	    application1.setUsers(platinum);
	    application2.setUsers(gold);
	    application3.setUsers(silver);
	    
	    ApplicationDao applicationDao= new ApplicationDao();
	    applicationDao.saveBoth(application1);
	    applicationDao.saveBoth(application2);
	    applicationDao.saveBoth(application3);
	    
	    
		
		
		
		
		
		

	}

}
