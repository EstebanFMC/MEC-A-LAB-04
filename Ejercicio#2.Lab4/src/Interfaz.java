import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Stack;

public class Interfaz extends javax.swing.JFrame {
    LocalTime Hora;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    Lista lista;
    Stack<Auto> pila2; //PILA PARA VEHICULOS DE 2 RUEDAS
    Stack<Auto> pila4; //PILA PARA VEHICULOS DE 4 RUEDAS
    Stack<Auto> copia; //PILA DE COPIADO
          
    private int numero = 1, numeroT;
    
       
    public Interfaz() {
        initComponents();
        lista = new Lista();
        lista.crearLista();
        pila2 = new Stack<>();
        pila4 = new Stack<>();
    }
    
    public Interfaz(int numero, int numeroT) {
        initComponents();
        
        this.numero = numero;
        this.numeroT = numeroT;
        
        lista = new Lista();
        lista.crearLista();
        pila2 = new Stack<>();
        pila4 = new Stack<>();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaTXT = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        UltimoIngresoButtom = new javax.swing.JButton();
        Vehículos4Buttom = new javax.swing.JButton();
        CantidadButtom = new javax.swing.JButton();
        EliminarButtom = new javax.swing.JButton();
        Vehiculos2Buttom = new javax.swing.JButton();
        SalirButtom = new javax.swing.JButton();
        IngresoButtom = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton5.setText("Vehículos de 2 ruedas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(AreaTXT);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setText("VEHICULOS EN EL PARQUEADERO");

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("PARQUEADERO");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"     Bicicleta", "       20 COP/min"},
                {"     Ciclomotor", "       20 COP/min"},
                {"     Motocicleta", "       30 COP/min"},
                {"     Carro", "       60 COP/min"}
            },
            new String [] {
                "Tipo de Vehículo", "Tarifa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setText("TARIFAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        UltimoIngresoButtom.setText("Último Ingreso");
        UltimoIngresoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoIngresoButtomActionPerformed(evt);
            }
        });

        Vehículos4Buttom.setText("Vehículos de 4 ruedas");
        Vehículos4Buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehículos4ButtomActionPerformed(evt);
            }
        });

        CantidadButtom.setText("Cantidad de vehículos");
        CantidadButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadButtomActionPerformed(evt);
            }
        });

        EliminarButtom.setText("Eliminar vehículo");
        EliminarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtomActionPerformed(evt);
            }
        });

        Vehiculos2Buttom.setText("Vehículos de 2 ruedas");
        Vehiculos2Buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehiculos2ButtomActionPerformed(evt);
            }
        });

        SalirButtom.setText("Salir");
        SalirButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtomActionPerformed(evt);
            }
        });

        IngresoButtom.setText("Ingreso de vehículo");
        IngresoButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoButtomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setText("OPCIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SalirButtom)
                    .addComponent(EliminarButtom)
                    .addComponent(CantidadButtom)
                    .addComponent(Vehículos4Buttom)
                    .addComponent(Vehiculos2Buttom)
                    .addComponent(UltimoIngresoButtom)
                    .addComponent(IngresoButtom)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresoButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UltimoIngresoButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vehiculos2Buttom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vehículos4Buttom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EliminarButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalirButtom)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//COMPLETO. NO MODIFICAR
    private void IngresoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoButtomActionPerformed
        int precio;
        Auto auto;
        Hora = LocalTime.now();
        String placa = JOptionPane.showInputDialog("Digite la placa del vehículo: ");
        String tipo = JOptionPane.showInputDialog("Digite el tipo del vehículo: ").toUpperCase();
        String hora = Hora.format(formato);
       if ("BICICLETA".equals(tipo) || "CICLOMOTOR".equals(tipo) || "MOTOCICLETA".equals(tipo)|| "CARRO". equals(tipo))
       JOptionPane.showMessageDialog(null,"Información ingresada correctamente ");
       else
       JOptionPane.showMessageDialog(null,"Ingreso inválido");    
        
        
        if("BICICLETA".equals(tipo) || "CICLOMOTOR".equals(tipo) || "MOTOCICLETA".equals(tipo)){
            if("BICICLETA".equals(tipo) || "CICLOMOTOR".equals(tipo) )
                precio = 20;
            else 
                precio = 30;
            
            auto = new Auto (placa, tipo, hora, numero, precio);
            pila2.add(auto);
            lista.setLista(auto);
            numero++;
            numeroT++;
        }
        else if("CARRO". equals(tipo)){
            precio = 60;
            auto = new Auto (placa, tipo, hora, numero, precio);
            pila4.add(auto);
            lista.setLista(auto);
            numero++;
            numeroT++;
        }
        
        
       
    }//GEN-LAST:event_IngresoButtomActionPerformed
//COMPLETO. NO MODIFICAR
    private void UltimoIngresoButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoIngresoButtomActionPerformed
              JOptionPane.showMessageDialog(null, lista.getUltimoIngreso());
    }//GEN-LAST:event_UltimoIngresoButtomActionPerformed

    
    
  
    private void Vehiculos2ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehiculos2ButtomActionPerformed
    String text ="";
        
        if(pila2.isEmpty())
        AreaTXT.setText("");
      else
      {
        copia = new Stack<>();
        copia.addAll(pila2);
        while(!copia.isEmpty())
        {
         text += (copia.pop().toString() + "\n");
        }
        AreaTXT.setText(text + "\n");
      }
    }//GEN-LAST:event_Vehiculos2ButtomActionPerformed

    
    
    private void Vehículos4ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehículos4ButtomActionPerformed
     String text = "";
        if(pila4.isEmpty())
        AreaTXT.setText("");
      else
      {
        copia = new Stack<>();
        copia.addAll(pila4);
        while(!copia.isEmpty())
        {
         text += copia.pop().toString() + "\n";
        }
      }
        AreaTXT.setText(text);
    
    }//GEN-LAST:event_Vehículos4ButtomActionPerformed

    private void CantidadButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadButtomActionPerformed
        JOptionPane.showMessageDialog(null, "Hay " + numeroT + " vehículos en el parqueadero\n");
    }//GEN-LAST:event_CantidadButtomActionPerformed

    
    
    
    
    
    //COMPLETO. NO MODIFICAR
    private void EliminarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtomActionPerformed
       if(lista.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "La base de datos se encuentra vacía. Por favor, ingrese datos.");
            }
       else
       {
            String num = (JOptionPane.showInputDialog("Ingrese la placa del vehículo a eliminar: "));
            if(lista.EliminarDato(num)){
                JOptionPane.showMessageDialog(null, "Dato eliminado correctamente");
                numeroT--;
            }
            else
                JOptionPane.showMessageDialog(null, "El dato no se ha podido encontrar. Corrija el dato ingresado.");
        }
    }//GEN-LAST:event_EliminarButtomActionPerformed
    //COMPLETO. NO MODIFICAR   
    private void SalirButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtomActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirButtomActionPerformed
         
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new Interfaz().setVisible(true);
           
            
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane AreaTXT;
    private javax.swing.JButton CantidadButtom;
    private javax.swing.JButton EliminarButtom;
    private javax.swing.JButton IngresoButtom;
    private javax.swing.JButton SalirButtom;
    private javax.swing.JButton UltimoIngresoButtom;
    private javax.swing.JButton Vehiculos2Buttom;
    private javax.swing.JButton Vehículos4Buttom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
