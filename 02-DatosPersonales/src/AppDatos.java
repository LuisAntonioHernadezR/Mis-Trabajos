import javax.swing.JOptionPane;
/**
 * 
 * @author Luis Antonio Hernandez Ramos
 *
 */
public class AppDatos {
	/**
	 * 
	 * @param args se llamma el metodo main
	 */
	public static void main(String[] args) {
		/**
		 * Es un objeto que manda a llamar la clase Alumno ingresando parametros
		 */
		Alumno al = new Alumno("miguel","22","545565646","algo@hotmail.com","sin direccion","55200","165 cm","89","masculino","Gomez");
		JOptionPane.showMessageDialog(null, String.format("Hola: %s \n tu edad es: %s \n tu telefono es: %s \n tu correo es: %s \n tu direccion es: %s \n tu codigo postal es: %s \n tu altura es: %s \n tu peso es: %s \n tu sexo es: %s \n tu apellido es: %s ",al.getNombre(),al.getEdad(),al.getTelefono(),al.getCorreo(),al.getDireccion(),al.getCodigopostal(),al.getAltura(),al.getPeso(),al.getSexo(),al.getApellido()));
	
		
	}

}
