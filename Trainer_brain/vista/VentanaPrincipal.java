package Trainer_brain.vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    //-----------------------------
    //---Atributos-----------------
    //------------------------------
    public PanelEntradadeDatos miPanelEntradadeDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultado miPanelResultado;
    public DialogoPreguntas miDialogoMoverCarro;
    /*
     * Metodo Constructor
     * 
     */
    /**
     * 
     */
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        // Creacion de la adiccion del panel entrada de datos
        miPanelEntradadeDatos= new PanelEntradadeDatos();
        miPanelEntradadeDatos.setBounds(10,10,380,190);
        add(miPanelEntradadeDatos);
          //Caracteristicas de la ventana
          setTitle("Train_Brai");
          setSize(400,600);
          //setLocation(10,10);
          setLocationRelativeTo(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setResizable(false);
          setVisible(true);


    }

    
}
