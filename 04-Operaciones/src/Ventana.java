import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author Luis Antonio Hernández Ramos
 *
 */
public class Ventana extends JFrame implements ActionListener{

	private JLabel lblN1 = new JLabel("Numero 1"); 
	private JLabel lblN2 = new JLabel("Numero 2");
	private JLabel lblNR = new JLabel("Resultado");
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMultiplicacion = new JButton("*");
	private JButton btnDivision = new JButton("/");	
	
	private Container c = getContentPane();
	private Operaciones op = new Operaciones();
	
	public Ventana(){
		/**
		 * es el metodo ventana donde van las posiciones de la pantalla
		 */
		super.setTitle("Operaciones");
		super.setSize(340,480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
		
	}

	private void cargarControles() {
		/**
		 * es el metodo para que se encarga de realizar las funciones
		 */
		// TODO Auto-generated method stub
		c.setLayout(null);
		
		lblN1.setBounds(10, 10 , 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		lblN2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110, 300, 30);
		
		btnSuma.setBounds(10, 150, 75, 20);
		btnResta.setBounds(90,  150, 75, 20);
		btnMultiplicacion.setBounds(180, 150, 75, 20);
		btnDivision.setBounds(260, 150, 75, 20);
		
		lblNR.setBounds(10, 190, 300, 30);
		
		c.add(lblN1);
		c.add(lblN2);
		c.add(lblNR);
		c.add(txtN1);
		c.add(txtN2);
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMultiplicacion);
		c.add(btnDivision);
		
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMultiplicacion.addActionListener(this);
		btnDivision.addActionListener(this);
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * en este metodo se llaman los botones con las funciones
		 */
		// TODO Auto-generated method stub
		Object buton = e.getSource();
		if(buton == btnSuma){
		int r = op.sumar(
				Integer.parseInt(txtN1.getText()),
				Integer.parseInt(txtN2.getText())
				);
		lblNR.setText(
				String.format("%s + %s = %d", 
						txtN1.getText(),
						txtN2.getText(),r));
		}else if(buton == btnResta){
			int f = op.restar(
					Integer.parseInt(txtN1.getText()),
					Integer.parseInt(txtN2.getText())
					);
			lblNR.setText(
					String.format("%s + %s = %d", 
							txtN1.getText(),
							txtN2.getText(),f));
		}else if(buton == btnMultiplicacion){
			int d = op.multiplicar(
					Integer.parseInt(txtN1.getText()),
					Integer.parseInt(txtN2.getText())
					);
			lblNR.setText(
					String.format("%s + %s = %d", 
							txtN1.getText(),
							txtN2.getText(),d));
		}else if(buton == btnDivision){
			int s = op.dividir(
					Integer.parseInt(txtN1.getText()),
					Integer.parseInt(txtN2.getText())
					);
			lblNR.setText(
					String.format("%s + %s = %d", 
							txtN1.getText(),
							txtN2.getText(),s));
		}
	}
}
