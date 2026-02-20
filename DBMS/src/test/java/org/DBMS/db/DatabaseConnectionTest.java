package org.DBMS.db;

import static org.junit.Assert.assertNotNull;

import org.DBMS.db.DatabaseConnection;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
	
	DatabaseConnection connect = new DatabaseConnection();
	
	@Test
	void testConnection() {
		assertNotNull("Database connected successfully!",DatabaseConnection.getConnection());
	}
	
}
