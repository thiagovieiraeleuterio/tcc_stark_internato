package tcc.internato.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class AppTestStark {

	@Test
	public void test() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stark_persistence");
		assertNotNull(factory);
	}

}
