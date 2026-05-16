package practicaFinalAPP;

import java.util.List;
// dependiendo del package quizas debemos hacer un import desde android... o tambien en modelo?

public interface CrudDAOInterfaz<T> {

	// le pregunté a Leticia si podemos usar T en vez de Object...
	
	void insertar(T objeto) throws DAOException;

	List<T> listarTodos() throws DAOException;

	T buscarPorId(int id) throws DAOException;

	void actualizar(T objeto) throws DAOException;

	void eliminar(int id) throws DAOException;

}