public class Cliente {

	private int numero;
	private String apellido;
	private String nombre;

	public Cliente() {}

	public Cliente(int numero, String apellido, String nombre) {
		this.numero = numero;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return apellido + " " + nombre;
	}
}
