package com.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {
	
	@Test
	public void testPasswordEncode() {
		String encoded1=new BCryptPasswordEncoder().encode("admin123");
		String encoded2=new BCryptPasswordEncoder().encode("user1pass");
		System.out.println(encoded1);
		System.out.println(encoded2);
	}
	
}
