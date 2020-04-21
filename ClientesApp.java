import java.util.List;
class ClientesApp {

	//En Spring teniamos IoC, acá no.
	static ClienteServiceImpl clienteService = new ClienteServiceImpl();
	static List<Cliente> clientes;
	
	public static void main(String[] args) {

		System.out.println("Listado de Clientes");
		System.out.println("==========================\n");

		cargarClientes();
	}

	static void cargarClientes() {
		clientes = clienteService.buscarTodo();

		for(Cliente c : clientes) {
			System.out.println("Nro: " + c.getNumero() + " | Cliente: " + c);
			System.out.println("________________________________________________\n");
		}
	}
}
