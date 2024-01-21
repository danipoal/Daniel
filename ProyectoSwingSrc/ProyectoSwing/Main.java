//package ProyectoSwing;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
//import ProyectoSwing.EscrituraFichero;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Main extends EscrituraFichero{
    public static void registro(){
        CountDownLatch latch = new CountDownLatch(1);

        //Hacemos la fuente para todos los elementos de la interfaz con UIManager
        Font fuente = new Font("Arial", Font.PLAIN, 16);
        UIManager.put("Label.font", fuente);
        UIManager.put("Button.font", fuente);
        UIManager.put("TextField.font", fuente);


        // Creamos un JFrame que nos hará de ventana
        JFrame ventana = new JFrame("Datos personales");
        // Configuramos un cierre de la aplicación cuando la ventana se cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Le damos un tamaño a nuestra ventana
        ventana.setSize(600, 400);
        ventana.setLocation(500, 250);

        
        // Creamos un panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        ventana.add(panel);
        //-----------------------------------------------------------------------------
        //Creamos el menu superior     
        JMenuBar menuBar = new JMenuBar();              //Creamos la barra del menu superior
        JMenu fileMenu = new JMenu("Archivo");        //Las opciones que tiene este menu, osea instancias
        JMenu exitMenu = new JMenu("Salir");
        
        menuBar.add(fileMenu);
        menuBar.add(exitMenu);
        //Opciones dentro de Archivo - Submenu
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        ventana.setJMenuBar(menuBar);       //Lo añadimos al JFrame para que el menu sea visible



        exitMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println(	"Cerrando aplicacion");                 //NO SE CIERRA LA APLICACION..
                System.exit(0);
                
            }
            
        }) ;
        //---------------------------------------------------------------------------

        // Creamos un Label para mostrar un texto
        JLabel tipoDocumento = new JLabel();
        tipoDocumento.setText("Tipo de documento:");
        // Le asignamos una posición y un tamaño
        tipoDocumento.setBounds(50, 50, 500, 55);
        //TipoDocumento.setFont(fuente);    //Esto ya lo hace la UIManager
        // Añadimos la etiqueta al panel
        panel.add(tipoDocumento);

        //Creamos el desplegable para el JLabel del tipo de Documento
        String[] tiposDocumento = {"DNI", "CIF", "CNAE"};       //El string de posibles tipos de documento
        JComboBox<String> tipoDocumentoInsert = new JComboBox<>(tiposDocumento);
        tipoDocumentoInsert.setBounds(260, 60, 70, 35);
        panel.add(tipoDocumentoInsert);

        //Creamos otro label para el Nº de documento
        JLabel numeroDocumentoEtiqueta = new JLabel();
        numeroDocumentoEtiqueta.setText("Nº de documento:");
        numeroDocumentoEtiqueta.setBounds(50, 90, 500, 55);
        panel.add(numeroDocumentoEtiqueta);
        //Creamos el textField para meter el DNI. 
        JTextField numeroDocumento = new JTextField();
        numeroDocumento.setBounds(260, 100, 200, 35);
        panel.add(numeroDocumento);


        //Label para nombre y apellidos
        JLabel nombreEtiqueta = new JLabel("Nombre y Apellidos:");
        nombreEtiqueta.setBounds(50, 130, 500, 55);
        panel.add(nombreEtiqueta);
        //TextField para nombre y apellidos
        JTextField nombre = new JTextField();
        nombre.setBounds(260, 140, 200, 35);
        panel.add(nombre);

        //Label para fecha de nacimiento
        JLabel fechaEtiqueta = new JLabel("Fecha de nacimiento:");
        fechaEtiqueta.setBounds(50, 170, 500, 55);
        panel.add(fechaEtiqueta);
        //TextField para fecha de nacimiento
        JTextField fecha = new JTextField("DD/MM/AAAA");
        fecha.setBounds(260, 180, 200, 35);
        panel.add(fecha);

        //Label para sexo
        JLabel sexoEtiqueta = new JLabel("Sexo:");
        sexoEtiqueta.setBounds(50, 210, 500, 55);
        panel.add(sexoEtiqueta);
        //RadioButton para elegir el genero
        JRadioButton hombre = new JRadioButton("Hombre");
        hombre.setBounds(250, 220, 70, 28);
        JRadioButton mujer = new JRadioButton("Mujer");
        mujer.setBounds(325, 220, 60, 28);
        JRadioButton otro = new JRadioButton("Otro");
        otro.setBounds(390, 220, 60, 28);

        panel.add(hombre);
        panel.add(mujer);
        panel.add(otro);

        //Creamos el boton para enviar los datos
        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.setBounds(290, 300, 100, 35);
        panel.add(botonEnviar);

        //-----------------------------------------------------------------------------------------------------------------

        botonEnviar.addActionListener(new ActionListener() {        //Accion despues de pulsar el boton
            @Override
            public void actionPerformed(ActionEvent e) {
                /* 
                //Antes de poner las cosas que sucederan iniciamos la conexion a la BBDD
                ConnectDB connect = new ConnectDB();
                try{
                    connect.connectToBD();
                }catch(SQLException er){
                    System.err.println("No se ha podido conectar");
                    er.printStackTrace();
                }
                */

                //Hay que guardar toda la informacion en alguna variable a la hora de pulsar el boton


                String currentDirectory = System.getProperty("user.dir");           //Directorio actual
                //File currentDirectoryFile = new File(currentDirectory);

                File registros = new File(currentDirectory, "registros.txt");
                //Intentamos crear el directorio, y el fichero donde se introduciran los registros
                try{
                    if (registros.createNewFile()) {
                        System.out.println("Creado Correctamente.");
                    }else{
                        System.out.println("Ya estaba creado el fichero.");
                    }
                }catch(IOException e3){
                    e3.printStackTrace();
                }
                    //Se escribe 
                try{
                    FileWriter fileWriter = new FileWriter(registros, true);        //Ese true significa que se escribira al final del archivo
                    fileWriter.write(nombre.getText() + fecha.getText() + "\n");
                    System.out.println("Datos añadidos.");
                    fileWriter.close();             //Si lo pones entre parentesis la creacion del fileWriter no hace falta el close
                }catch(IOException e4){
                    e4.printStackTrace();
                }

                //Como evento crearemos un archivo que guarde dichos datos
                System.out.printf(nombre.getText());
                System.out.printf(fecha.getText());
                System.out.printf(numeroDocumento.getText());
                System.out.print(hombre); 

                


                ventana.remove(panel);
                // Creamos un panel nuevo que se vera al pulsar el boton
                JPanel panel2 = new JPanel();
                panel2.setLayout(null);
                

                




                //Graficamnte lo que se ve cuando se pulsa el boton
                JLabel textoConfirmacion = new JLabel("Informacion guardada.");
                textoConfirmacion.setBounds(190, 110, 400, 100);
                panel2.add(textoConfirmacion);
                ventana.add(panel2);
                ventana.setVisible(true);

                //---------------------------------------------------------------------
                //A nivel interno, la creacion de fichero



                
            }
        });



        // Hacemos que el hilo principal espere hasta que la ventana se cierre. Si no se usa esto, la consola se queda pillada
        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                latch.countDown();
            }
        });

        // Ponemos la ventana visible
        ventana.setVisible(true);

        try {
            // Esperamos hasta que la ventana se cierre
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // Creamos un CountDownLatch con un recuento de 1
        registro();
}}


