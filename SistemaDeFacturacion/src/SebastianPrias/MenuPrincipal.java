package SebastianPrias;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contenedor;
	private JDesktopPane desktopPane;
	public static boolean SmostrarmntmCrearClientes=false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setTitle("SISTEMA DE FACTURACIÓN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 446);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(98, 160, 234));
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		mnSistema.setFont(new Font("Dialog", Font.BOLD, 16));
		menuBar.add(mnSistema);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		mntmSalir.addMouseListener(new MouseAdapter() {
			
		});
		mntmSalir.setFont(new Font("Dialog", Font.BOLD, 16));
		mnSistema.add(mntmSalir);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setFont(new Font("Dialog", Font.BOLD, 16));
		menuBar.add(mnClientes);
		
		JMenuItem mntmCrearClientes = new JMenuItem("Crear Clientes");
		mntmCrearClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearCliente crearCliente=new CrearCliente();
				desktopPane.add(crearCliente);
			if(SmostrarmntmCrearClientes==false) {
				crearCliente.setVisible(true);
				SmostrarmntmCrearClientes = true;
				
			}
				
			}
		});
		mntmCrearClientes.setFont(new Font("Dialog", Font.BOLD, 16));
		mnClientes.add(mntmCrearClientes);
		
		JMenuItem mntmListaDeClientes = new JMenuItem("Lista de clientes");
		mntmListaDeClientes.setFont(new Font("Dialog", Font.BOLD, 16));
		mnClientes.add(mntmListaDeClientes);
		
		JMenu mnProductos = new JMenu("Productos");
		mnProductos.setFont(new Font("Dialog", Font.BOLD, 16));
		menuBar.add(mnProductos);
		
		JMenu mnRedesSociales = new JMenu("Redes sociales");
		mnRedesSociales.setFont(new Font("Dialog", Font.BOLD, 16));
		menuBar.add(mnRedesSociales);
		
		JMenuItem mntmFacebook = new JMenuItem("Facebook");
		mntmFacebook.setFont(new Font("Dialog", Font.BOLD, 16));
		mnRedesSociales.add(mntmFacebook);
		
		JMenuItem mntmInstagram = new JMenuItem("Instagram");
		mntmInstagram.setFont(new Font("Dialog", Font.BOLD, 16));
		mnRedesSociales.add(mntmInstagram);
		contenedor = new JPanel();
		contenedor.setBackground(new Color(255, 255, 255));
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 64, 64));
		contenedor.add(desktopPane, "name_35522358088801");
	}

}
