package com.spring.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.spring.dao.UserDao;
import com.spring.spring.entity.User;

@SpringBootTest
class ApplicationTests {

	   @Autowired
			UserDao userDao;

			@Test
			public void testCreate() {
				
				User u = new User();
				
				u.setName("madhu");
				u.setMobileNo("7008444914");
				u.setEmail("madhusmita@gmail.com");
				u.setDoj("23-12-2021");
				u.setAddress("bangalore");
				
				userDao.save(u);
					
			}
			
			@Test
			public void testReadAll() {
			
			List<User> list = userDao.findAll();
			assertThat(list).size().isGreaterThan(0);
			
			}
			
			@Test
			public void testReadOne() {
				
				User user = userDao.findById(2).get();
				assertEquals("sonali" , user.getName());
				
			}
		
			@Test
			public void testUpdate() {
				
				User u =userDao.findById(4).get();
				u.setName("nisha");
				userDao.save(u);
				assertNotEquals("madan", userDao.findById(4).get().getName());
				
			}
			
			@Test
			public void testDelete() {
				
				userDao.deleteById(6);
				assertThat(userDao.existsById(6)).isFalse();
			}
			
	
}
