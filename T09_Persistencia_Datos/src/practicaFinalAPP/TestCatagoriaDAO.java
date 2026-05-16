package practicaFinalAPP;

import java.util.List;

public class TestCatagoriaDAO {

	public static void main(String[] args) {
		try {
			CategoriaDAO dao = new CategoriaDAO();
			// INSERTAR
			Categoria categoria = new Categoria("Transporte");
			dao.insertar(categoria);
			System.out.println("Categoria insertada");
			// LISTAR
			List<Categoria> categorias = dao.listarTodos();
			System.out.println("\nLISTADO:");
			for (Categoria c : categorias) {
				System.out.println(c);
			}
			// BUSCAR POR ID
			Categoria buscada = dao.buscarPorId(1);
			System.out.println("\nBUSQUEDA ID 1:");
			System.out.println(buscada);
			// ACTUALIZAR
			Categoria actualizar = new Categoria(1, "Supermercado");
			dao.actualizar(actualizar);
			System.out.println("\nCategoria actualizada");
			// LISTAR OTRA VEZ
			System.out.println("\nLISTADO ACTUALIZADO:");
			categorias = dao.listarTodos();
			for (Categoria c : categorias) {
				System.out.println(c);
			}
			// ELIMINAR
			dao.eliminar(1);
			System.out.println("\nCategoria eliminada");
			// LISTADO FINAL
			System.out.println("\nLISTADO FINAL:");
			categorias = dao.listarTodos();
			for (Categoria c : categorias) {
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


/* prueba inicial
public static void main(String[] args) {
	try {
		Categoria categoria = new Categoria("Alimentacion");
		CategoriaDAO dao = new CategoriaDAO();
		dao.insertar(categoria);
		System.out.println("Categoria insertada");
		List<Categoria> categorias = dao.listarTodos();
		for (Categoria c : categorias) {
			System.out.println(c);
		}
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
}*/