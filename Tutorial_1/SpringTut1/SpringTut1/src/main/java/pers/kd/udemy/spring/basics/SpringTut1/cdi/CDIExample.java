package pers.kd.udemy.spring.basics.SpringTut1.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class CDIExample {
	
	@Inject
	CDIExampleDAO cdiExampleDAO;

	public CDIExampleDAO getCdiExampleDAO() {
		return cdiExampleDAO;
	}

	public void setCdiExampleDAO(CDIExampleDAO cdiExampleDAO) {
		this.cdiExampleDAO = cdiExampleDAO;
	}
	
	

}
