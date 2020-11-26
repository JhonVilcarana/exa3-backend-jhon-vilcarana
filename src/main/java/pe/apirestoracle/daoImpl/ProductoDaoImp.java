package pe.apirestoracle.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import pe.apirestoracle.dao.ProductoDao;
import pe.apirestoracle.entity.Producto;
@Component
public class ProductoDaoImp implements ProductoDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
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
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PK_PRODUCTO")
				.withProcedureName("SP_LISTAR_P")
				.declareParameters(new SqlOutParameter("CURSOR_P" , OracleTypes.CURSOR , new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> read(int id) {
	return null;
	}

}
