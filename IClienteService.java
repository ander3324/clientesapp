import java.util.List;
public interface IClienteService {

	public List<Cliente> buscarTodo();

	public Cliente buscarPorId(Integer id);

	public void guardar(Cliente cliente);

	public void borrar(Integer id);
}
