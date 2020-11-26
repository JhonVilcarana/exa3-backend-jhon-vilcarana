package pe.apirestoracle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.apirestoracle.dao.ProductoDao;
import pe.apirestoracle.dao.UsuarioDao;
@SpringBootTest
class ApiRestOracleApplicationTests {
@Autowired
PasswordEncoder passwordEncoder;
@Autowired
 UsuarioDao usuarioDao;
@Autowired
ProductoDao productoDao;
@Test
void contextLoads() {
	
	System.out.println(productoDao.readAll());
}
		
}
