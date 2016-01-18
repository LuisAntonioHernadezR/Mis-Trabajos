import javax.swing.JOptionPane;
/**
 * 
 * @author Luis Antonio Hernández Ramos
 *
 */
public class Saludo {
	/**
	 * 
	 * @param args argumentos del metodo main
	 */
	
 public static void main(String[] args) {
	String nombre = "luis";
	String edad = "31";
	//System.out.println("Hola:  "+ nombre  );
	//System.out.printf("Hola: %s", nombre);
	JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es %s años de edad.", nombre, edad ));
}
}
