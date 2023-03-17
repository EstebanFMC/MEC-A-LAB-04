import java.util.Timer;
import java.util.TimerTask;
import java.util.Queue;
import java.util.LinkedList;

public class Interfaz extends javax.swing.JFrame {
int turnos = 0, turnoA = 1;
int minutos = 0, segundos = 10;

Queue<Persona> cola = new LinkedList<>();
Persona persona;
Timer timer = new Timer();

TimerTask  task = new TimerTask() //ACTUALIZACION DE TIEMPO Y DE TURNOS
            {   @Override
                public void run ()
                {                  
                    TiempoRestLabel.setText("" + minutos + " : " + segundos);
                   
                    if(segundos == -1){
                        minutos--;
                        segundos = 10;
                    }
                    segundos--;
                    
                    if(segundos == -1 && minutos == 0){
                        segundos = 10;
                        minutos = 0;
                        turnoA++;
                    }
                    
                    //EVALUACION PARA FINALIZACION DE TAREA
                    if((turnos - turnoA) < 0 ){
                           turnos = 1;
                           TurnoLabel.setText("" + 0);
                           timer.cancel();
                        }
                    else{        
                    TurnoLabel.setText("" + turnoA);//Turno actual
                    NoTurnosLabel.setText("" + (turnos - turnoA)); //Turnos restantes
                    }
                              
                    
                  
                }
            };



    public Interfaz() {
        initComponents();
       
        
       /*if ("Elegir opcion".equals(CondicionBox.getSelectedItem().toString()) || "Elegir opcion".equals(AfilBox.getSelectedItem().toString()) )
       IngresoButtom.setVisible(false); 
       else
       IngresoButtom.setVisible(true);*/
    
    }   
    @SuppressWarnings("unchecked")
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        ApellidosField2 = new javax.swing.JTextField();
        TurnosRest = new javax.swing.JLabel();
        NoTurnosLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        ApellidosField = new javax.swing.JTextField();
        TurnosRest1 = new javax.swing.JLabel();
        TiempoRestLabel = new javax.swing.JLabel();
        TiempoButtom = new javax.swing.JButton();
        IngresoButtom = new javax.swing.JButton();
        TurnosRest2 = new javax.swing.JLabel();
        TurnoLabel = new javax.swing.JLabel();
        AfilBox = new javax.swing.JComboBox<>();
        CondicionBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        EdadField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel6.setText("Afilicación (POS - PC):");

        jTextField2.setText("jTextField1");

        ApellidosField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TurnosRest.setText("Turnos Restantes:");

        NoTurnosLabel.setText("0");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Condición especial:");

        jLabel7.setText("Afilicación:");

        ApellidosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosFieldActionPerformed(evt);
            }
        });

        TurnosRest1.setText("Tiempo Restante:");

        TiempoRestLabel.setText("0");

        TiempoButtom.setText("Añadir Tiempo");
        TiempoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoButtomActionPerformed(evt);
            }
        });

        IngresoButtom.setText("Ingresar");
        IngresoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoButtomActionPerformed(evt);
            }
        });

        TurnosRest2.setText("Turno Actual:");

        TurnoLabel.setText("0");

        AfilBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir opcion", "POS", "PC" }));
        AfilBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfilBoxActionPerformed(evt);
            }
        });

        CondicionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir opcion", "Embarazo", "3a Edad", "Menor a 12 años", "Limitación Motriz", "Nada" }));
        CondicionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CondicionBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Edad:");

        EdadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel9.setText("SUMINISTROS MÉDICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TurnosRest)
                                    .addComponent(TurnosRest1)
                                    .addComponent(TurnosRest2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NombreField)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NoTurnosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TiempoRestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                    .addComponent(TiempoButtom)
                                    .addGap(10, 10, 10))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TurnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(ApellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AfilBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdadField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CondicionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IngresoButtom)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ApellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EdadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AfilBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CondicionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IngresoButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TurnosRest2)
                    .addComponent(TurnoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TurnosRest)
                            .addComponent(NoTurnosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TurnosRest1)
                            .addComponent(TiempoRestLabel))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TiempoButtom)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApellidosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosFieldActionPerformed
    
    }//GEN-LAST:event_ApellidosFieldActionPerformed

    private void IngresoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoButtomActionPerformed
        String nombre, apellido, afiliacion, condicion;
        int edad;
        
        nombre = NombreField.getText();
        apellido = ApellidosField.getText();
        condicion =  CondicionBox.getSelectedItem().toString();
        afiliacion = AfilBox.getSelectedItem().toString();
        edad = Integer.parseInt(EdadField.getText());
        
        //ENVÍO DE DATOS A LA COLA
        persona = new Persona(nombre,apellido,afiliacion,condicion,edad);
        cola.add(persona);
        
        //REINICIO DE TEXTOS
        NombreField.setText("");
        ApellidosField.setText("");
        CondicionBox.setSelectedItem("Elegir opcion");
        AfilBox.setSelectedItem("Elegir opcion");
        EdadField.setText("");
      
        //INCREMENTO DE TURNOS Y LLAMADO DE TAREA "TASK"
        turnos ++;
        if(turnos == 1)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }//GEN-LAST:event_IngresoButtomActionPerformed

    
    
    
    
    private void CondicionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CondicionBoxActionPerformed
  
    }//GEN-LAST:event_CondicionBoxActionPerformed

    private void AfilBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfilBoxActionPerformed
        
    }//GEN-LAST:event_AfilBoxActionPerformed

    private void ApellidosField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosField2ActionPerformed

    private void EdadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadFieldActionPerformed
       
    }//GEN-LAST:event_EdadFieldActionPerformed

    private void TiempoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoButtomActionPerformed
        segundos = 10;
    }//GEN-LAST:event_TiempoButtomActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AfilBox;
    private javax.swing.JTextField ApellidosField;
    private javax.swing.JTextField ApellidosField2;
    private javax.swing.JComboBox<String> CondicionBox;
    private javax.swing.JTextField EdadField;
    private javax.swing.JButton IngresoButtom;
    private javax.swing.JLabel NoTurnosLabel;
    private javax.swing.JTextField NombreField;
    private javax.swing.JButton TiempoButtom;
    private javax.swing.JLabel TiempoRestLabel;
    private javax.swing.JLabel TurnoLabel;
    private javax.swing.JLabel TurnosRest;
    private javax.swing.JLabel TurnosRest1;
    private javax.swing.JLabel TurnosRest2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
