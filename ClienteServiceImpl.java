import java.util.List;
public class ClienteServiceImpl implements IClienteService {

	ClienteRepository repo = new ClienteRepository();

	public List<Cliente> buscarTodo(){
		return repo.getClientes();
	}

	public Cliente buscarPorId(Integer id){
		return null;
	}

	public void guardar(Cliente cliente){
		repo.addCliente(cliente);
	}

	public void borrar(Integer id){

	}
}
