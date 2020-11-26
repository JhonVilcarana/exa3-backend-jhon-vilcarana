package pe.apirestoracle.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.apirestoracle.dao.ProductoDao;
import pe.apirestoracle.entity.Producto;
import pe.apirestoracle.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService {
	@Autowired
		private ProductoDao pruductoDao;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return pruductoDao.readAll();
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
