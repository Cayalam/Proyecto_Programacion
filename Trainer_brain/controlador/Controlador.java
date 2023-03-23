package Trainer_brain.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Trainer_brain.modelo.Preguntas ;
import Trainer_brain.vista.VentanaPrincipal;

public class Controlador  
 {
    //----------------------------
    //Atributos
    //----------------------------
    /**
     *
     */
    private VentanaPrincipal venPrin;
    private Preguntas model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Preguntas pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
}
