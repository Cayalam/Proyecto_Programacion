package Trainer_brain.vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEntradadeDatos extends JPanel
 {
     //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    /*
     * Metodo Constructor
     */
    PanelEntradadeDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);

        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Train.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
    }

    
}
