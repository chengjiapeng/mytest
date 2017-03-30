package com.example.web;

import com.example.web.controller.HomeController;
import com.example.web.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class WebApplicationTests {
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}


	@Test
	public void testHomePage() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(view().name("home"))
				.andExpect(model().attributeExists("test"))
				.andExpect(model().attribute("test", "this is for test"));
	}

	@Test
	public void testRegister() throws Exception {
		UserDao userDao = mock(UserDao.class);
		mockMvc.perform(post("/registerProcess")
						.param("username", "zhangsan")
						.param("password", "123456"))
				.andExpect(redirectedUrl("/"));
	}

}
