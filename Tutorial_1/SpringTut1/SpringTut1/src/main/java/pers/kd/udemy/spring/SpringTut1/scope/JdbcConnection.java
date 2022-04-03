package pers.kd.udemy.spring.SpringTut1.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("******************* JDBC Connection");
	}

}
