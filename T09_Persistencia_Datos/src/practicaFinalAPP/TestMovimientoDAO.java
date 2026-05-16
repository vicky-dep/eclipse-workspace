package practicaFinalAPP;

import java.time.LocalDate;
import java.util.List;

public class TestMovimientoDAO {

	public static void main(String[] args) {
		try {
			CategoriaDAO categoriaDAO = new CategoriaDAO();
			MovimientoDAO movimientoDAO = new MovimientoDAO();
			// INSERTAR CATEGORIAS
			categoriaDAO.insertar(new Categoria("Sueldo"));
			categoriaDAO.insertar(new Categoria("Alimentacion"));
			System.out.println("Categorias insertadas");
			// LISTAR CATEGORIAS
			List<Categoria> categorias = categoriaDAO.listarTodos();
			System.out.println("\nLISTADO CATEGORIAS:");
			for (Categoria c : categorias) {
				System.out.println(c);
			}
			/*
			 * IMPORTANTE:
			 * Revisar los IDs generados en consola.
			 * Ajustar estos IDs si en tu BBDD aparecen otros.
			 */
			Movimiento movimiento1 = new Movimiento(
					"Sueldo Mayo",
					1500,
					LocalDate.now(),
					"INGRESO",
					3
			);
			Movimiento movimiento2 = new Movimiento(
					"Supermercado",
					50,
					LocalDate.now(),
					"GASTO",
					4
			);
			// INSERTAR MOVIMIENTOS
			movimientoDAO.insertar(movimiento1);
			movimientoDAO.insertar(movimiento2);
			System.out.println("\nMovimientos insertados");
			// LISTAR MOVIMIENTOS
			System.out.println("\nLISTADO MOVIMIENTOS:");
			List<Movimiento> movimientos = movimientoDAO.listarTodos();
			for (Movimiento m : movimientos) {
				System.out.println(m);
			}
			// CALCULAR INGRESOS
			System.out.println("\nTOTAL INGRESOS:");
			System.out.println(movimientoDAO.calcularTotalIngresos());
			// CALCULAR GASTOS
			System.out.println("\nTOTAL GASTOS:");
			System.out.println(movimientoDAO.calcularTotalGastos());
			// CALCULAR BALANCE
			System.out.println("\nBALANCE:");
			System.out.println(movimientoDAO.calcularBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}