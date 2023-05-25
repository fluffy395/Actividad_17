package Hilos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Formulario extends JFrame {
    private JTextField respuesta1TextField;
    private JTextField respuesta2TextField;
    private JTextField respuesta3TextField;
    private JTextField respuesta4TextField;
    private JTextField respuesta5TextField;
    private JTextField respuesta6TextField;
    private JTextField respuesta7TextField;
    private JTextField respuesta8TextField;

    public Formulario() {
        setTitle("Formulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crea el componente JLabel para la imagen
        JLabel imagenLabel = new JLabel();
        try {
            // Carga la imagen desde el archivo
            Image imagen = ImageIO.read(new File("C:/Users/Issa/Pictures/Familia.PNG")); // Reemplaza la ruta con la ubicación de tu imagen
            // Establece la imagen en el JLabel
            imagenLabel.setIcon(new ImageIcon(imagen));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Crea un panel para las preguntas y cajas de texto
        JPanel panelPreguntas = new JPanel();
        panelPreguntas.setLayout(new GridLayout(8, 2));

        // Crea las preguntas y cajas de texto para las respuestas
        JLabel pregunta1Label = new JLabel("1. Anne is Paul's ___");
        respuesta1TextField = new JTextField(20);

        JLabel pregunta2Label = new JLabel("2. Jason and Emily are their ___");
        respuesta2TextField = new JTextField(20);

        JLabel pregunta3Label = new JLabel("3. Paul is Anne's ___");
        respuesta3TextField = new JTextField(20);

        JLabel pregunta4Label = new JLabel("4. Jason is Anne's ___");
        respuesta4TextField = new JTextField(20);

        JLabel pregunta5Label = new JLabel("5. Emily is Paul's ___");
        respuesta5TextField = new JTextField(20);

        JLabel pregunta6Label = new JLabel("6. Jason is Emily's ___");
        respuesta6TextField = new JTextField(20);

        JLabel pregunta7Label = new JLabel("7. Emily is Jason's ___");
        respuesta7TextField = new JTextField(20);

        JLabel pregunta8Label = new JLabel("8. Paul and Anne are Jason's ___");
        respuesta8TextField = new JTextField(20);

        // Agrega las preguntas y cajas de texto al panel de preguntas
        panelPreguntas.add(pregunta1Label);
        panelPreguntas.add(respuesta1TextField);

        panelPreguntas.add(pregunta2Label);
        panelPreguntas.add(respuesta2TextField);

        panelPreguntas.add(pregunta3Label);
        panelPreguntas.add(respuesta3TextField);

        panelPreguntas.add(pregunta4Label);
        panelPreguntas.add(respuesta4TextField);

        panelPreguntas.add(pregunta5Label);
        panelPreguntas.add(respuesta5TextField);

        panelPreguntas.add(pregunta6Label);
        panelPreguntas.add(respuesta6TextField);

        panelPreguntas.add(pregunta7Label);
        panelPreguntas.add(respuesta7TextField);

        panelPreguntas.add(pregunta8Label);
        panelPreguntas.add(respuesta8TextField);

        // Crea un panel principal para la imagen y el panel de preguntas
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(imagenLabel, BorderLayout.WEST);
        panelPrincipal.add(panelPreguntas, BorderLayout.CENTER);

        // Agrega el panel principal al formulario
        add(panelPrincipal);

        pack();
        setVisible(true);
    }

    private void mostrarPreguntas() {
        String p1, p2, p3, p4, p5, p6, p7, p8;

        // Obtiene las respuestas de las cajas de texto
        p1 = respuesta1TextField.getText();
        p2 = respuesta2TextField.getText();
        p3 = respuesta3TextField.getText();
        p4 = respuesta4TextField.getText();
        p5 = respuesta5TextField.getText();
        p6 = respuesta6TextField.getText();
        p7 = respuesta7TextField.getText();
        p8 = respuesta8TextField.getText();

        // Respuestas correctas
        String r1 = "wife";
        String r2 = "children";
        String r3 = "father";
        String r4 = "husband";
        String r5 = "daughter";
        String r6 = "brother";
        String r7 = "sister";
        String r8 = "parents";

        // Compara las respuestas ingresadas con las respuestas correctas
        boolean respuesta1Correcta = p1.equalsIgnoreCase(r1);
        boolean respuesta2Correcta = p2.equalsIgnoreCase(r2);
        boolean respuesta3Correcta = p3.equalsIgnoreCase(r3);
        boolean respuesta4Correcta = p4.equalsIgnoreCase(r4);
        boolean respuesta5Correcta = p5.equalsIgnoreCase(r5);
        boolean respuesta6Correcta = p6.equalsIgnoreCase(r6);
        boolean respuesta7Correcta = p7.equalsIgnoreCase(r7);
        boolean respuesta8Correcta = p8.equalsIgnoreCase(r8);

        // Muestra los resultados de las respuestas
        System.out.println("Respuesta 1: " + (respuesta1Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 2: " + (respuesta2Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 3: " + (respuesta3Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 4: " + (respuesta4Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 5: " + (respuesta5Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 6: " + (respuesta6Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 7: " + (respuesta7Correcta ? "Correcta" : "Incorrecta"));
        System.out.println("Respuesta 8: " + (respuesta8Correcta ? "Correcta" : "Incorrecta"));

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Formulario formulario = new Formulario();
                formulario.mostrarPreguntas();
            }
        });
    }
}