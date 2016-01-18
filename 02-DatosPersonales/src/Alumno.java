/**
 * 
 * @author Luis Antonio Hernandez Ramos
 *
 */
public class Alumno {
	private String nombre;
	private  String edad ;
	private String telefono;
	private String correo;
	private String direccion;
	private String codigopostal;
	private String altura;
	private String peso;
	private String sexo;
	private String apellido;
	/**
	 * Constructor no tiene parametros
	 */
	
	public Alumno(){
		
	}
/**
 * 
 * @param nombre de la persona
 * @param edad de la persona
 * @param telefono de la persona 
 * @param correo de la persona
 * @param direccion de la persona 
 * @param codigopostal de la persona
 * @param altura de la persona 
 * @param peso de la persona 
 * @param sexo de la persona
 * @param apellido de la persona
 */
	public Alumno(String nombre, String edad, String telefono, String correo, String direccion, String codigopostal,
			String altura, String peso, String sexo, String apellido) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.codigopostal = codigopostal;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.apellido = apellido;
	}
/**
 * 
 * @return regresa el nombre de la persona en formato string
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre introduce el nombre de la persona en formato string
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return regresa la edad de la persona
 */
	public String getEdad() {
		return edad;
	}
/**
 * 
 * @param edad introduce la edad de la persona en formato String
 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
/**
 * 
 * @return regresa el telefono de la persona
 */
	public String getTelefono() {
		return telefono;
	}
/**
 * 
 * @param telefono introduce el telefono de la  persona en formato String
 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
/**
 * 
 * @return regresa el correo de la persona
 */
	public String getCorreo() {
		return correo;
	}
/**
 * 
 * @param correo introduce el correo de la peronsa en formato String
 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
/**
 * 
 * @return regresa la direccion de la persona
 */
	public String getDireccion() {
		return direccion;
	}
/**
 * 
 * @param direccion introduce la direccion de la persona en formato string
 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
/**
 * 
 * @return regresa el codigo postal de la persona
 */
	public String getCodigopostal() {
		return codigopostal;
	}
/**
 * 
 * @param codigopostal introduce el codigo postal de la persona en formato string
 */
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
/**
 * 
 * @return regresa la altura de la persona
 */
	public String getAltura() {
		return altura;
	}
/**
 * 
 * @param altura introduce la altura de una persona en formato String
 */
	public void setAltura(String altura) {
		this.altura = altura;
	}
/**
 * 
 * @return regresa el peso de la persona
 */
	public String getPeso() {
		return peso;
	}
/**
 * 
 * @param peso introduce el peso de una persona en formato String
 */
	public void setPeso(String peso) {
		this.peso = peso;
	}
/**
 * 
 * @return regresa el sexo de la persona
 */
	public String getSexo() {
		return sexo;
	}
/**
 * 
 * @param sexo introduce sexo de la persona en formato String
 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
/**
 * 
 * @return regresa el apellido de la persona 
 */
	public String getApellido() {
		return apellido;
	}
/**
 * 
 * @param apellido introduce el apellido de la persona en formato string
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
