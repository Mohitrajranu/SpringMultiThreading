package com.byteslounge.spring.tx;

import java.util.List;

import main.java.com.byteslounge.spring.tx.model.User;
import main.java.com.byteslounge.spring.tx.user.UserManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

    	UserManager userManager = (UserManager) ctx.getBean("userManagerImpl");
    	
    	User user = new User();
    	user.setUsername("johndoe");
    	user.setName("John Doe");
    	
    	userManager.insertUser(user);
    	
    	System.out.println("User inserted!");
    	
    	user = userManager.getUser("johndoe");
    	
    	System.out.println("\nUser fetched by username!"
    		+ "\nId: " + user.getId()
    		+ "\nUsername: " + user.getUsername()
    		+ "\nName: " + user.getName());
    	
    	user = userManager.getUserById(user.getId());
    	
    	System.out.println("\nUser fetched by ID!"
    		+ "\nId: " + user.getId()
    		+ "\nUsername: " + user.getUsername()
    		+ "\nName: " + user.getName());
    	
    	List<User> users = userManager.getUsers();
    	
    	System.out.println("\nUser list fetched!"
        	+ "\nUser count: " + users.size());

    }
}
