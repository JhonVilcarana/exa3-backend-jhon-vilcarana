package pe.apirestoracle.dao;

import java.util.Map;

import pe.apirestoracle.entity.Producto;

public interface ProductoDao {
int create (Producto p);
int update (Producto p);
int delete (int id);
Map<String, Object> readAll();
Map<String, Object> read (int id);

}
