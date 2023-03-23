package Trainer_brain.ejecutable;
import Trainer_brain.vista.VentanaPrincipal;
import Trainer_brain.controlador.Controlador;


import Trainer_brain.modelo.Preguntas;;


public class CreacionPreguntas 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Preguntas miPreguntas= null;
        Controlador miControlador = new Controlador(miVentana,miPreguntas);
    }
}
