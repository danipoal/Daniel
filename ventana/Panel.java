import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


public class Panel extends JFrame {

     
    public Panel() {
        // Establecer propiedades del JFrame
        setTitle("Adivinador del DNI");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel y establecer su diseño
        JPanel panel = new JPanel(new FlowLayout()); // Usando FlowLayout para organizar los componentes en línea
        panel.setBackground(Color.WHITE);

        // Para introducir información en la ventana
        JLabel label = new JLabel("Introduce solo el numero de tu DNI:");
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        JTextField textField = new JTextField("");
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setPreferredSize(new Dimension(300, 40));
        // Agregar el JTextField al JPanel
        panel.add(label);
        panel.add(textField);

        //Imagen
        URL url = getClass().getResource("lunes.PNG");
        
        ImageIcon icono = new ImageIcon(url);
           JLabel labelConImagen = new JLabel(icono);
        if(url != null){

            panel.add(labelConImagen);
        }else {
            System.out.println("No se pudo cargar la imagen.");
        }


        // Agregar el JPanel al JFrame
        add(panel);
        setVisible(true);

        // Agregar un ActionListener al JTextField para manejar las pulsaciones de Enter
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Intentar convertir el texto a un valor entero
                    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

                    int valorEntero = Integer.parseInt(textField.getText());
                    System.out.println("Valor entero ingresado: " + valorEntero);

                    // Crear un nuevo JLabel con el texto que deseas mostrar
                    JLabel nuevoLabel = new JLabel("La letra de tu DNI es: " + letras[valorEntero % 23] );
                    nuevoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
                    JLabel nuevoLabel2 = new JLabel("Ahora introduce tu numero de telefono para adivinar la region en la que vives:");
                    
                    TextField telefono = new TextField("");
                    telefono.setFont(new Font("Arial", Font.PLAIN, 20));
                    telefono.setPreferredSize(new Dimension(300, 40));


                    URL urlBiblio = getClass().getResource("biblio.PNG");
                    ImageIcon biblio = new ImageIcon(urlBiblio);

                    JLabel imagenBiblio = new JLabel(biblio);
                    
                    // Agregar el nuevo JLabel al JPanel
                    panel.remove(label);
                    panel.remove(labelConImagen);
                    panel.remove(textField);
                    panel.add(nuevoLabel);
                    panel.add(nuevoLabel2);
                    panel.add(telefono);
                    panel.add(imagenBiblio);

                    // Actualizar la interfaz gráfica
                    panel.revalidate();
                    panel.repaint();
                    // Aquí puedes realizar acciones con el valor entero, como guardarlo en una variable.
                    // Hacer visible la ventana
                    setVisible(true);
                    



                    telefono.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.printf(telefono.getText());
                                panel.remove(nuevoLabel);
                                panel.remove(nuevoLabel2);
                                panel.remove(telefono);
                                panel.remove(imagenBiblio);
                            JLabel ultimoLabel = new JLabel("No he podido encontrar region.");
                            JLabel ultimoLabel2 = new JLabel("Pero ahora tengo tu numero ;)");

                            ultimoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
                            ultimoLabel2.setFont(new Font("Arial", Font.PLAIN, 20));


                            URL ulrCara = getClass().getResource("sonriente.PNG");
                            ImageIcon carita = new ImageIcon(ulrCara);
                            JLabel labelCara = new JLabel(carita);


                            panel.add(ultimoLabel);
                            panel.add(ultimoLabel2);
                            panel.add(labelCara);

                            panel.revalidate();
                            panel.repaint();
                        }

                      
                    });
                    
                } catch (NumberFormatException ex) {
                    // Manejar la excepción si el texto no es un número entero válido
                    JOptionPane.showMessageDialog(null, "Introduce solo el número de tu DNI.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }      
        }); 




    }

    public static void main(String[] args) {
        // Crear una instancia de la clase que extiende JFrame

        Panel miVentana = new Panel();
    }
}
