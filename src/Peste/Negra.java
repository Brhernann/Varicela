
package Peste;

import Rojo.User;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Negra extends javax.swing.JFrame {

public static ArrayList <User> lista;
 
 
    public Negra() {
        initComponents();
        lista = new ArrayList<User>();
        JPregistrar.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("LuxCorp");
        jcomboculiao.addItem("");
        jcomboculiao.addItem("Hombre");
        jcomboculiao.addItem("mujer");
        jcomboculiao.addItem("Marcianazi");
          
    }
    


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPInicioSession = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        btnregistrarNuevo = new javax.swing.JButton();
        btnir = new javax.swing.JButton();
        JPregistrar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtregistrarNombre = new javax.swing.JTextField();
        txtregistrarPass = new javax.swing.JPasswordField();
        txtregistrarUsuario = new javax.swing.JTextField();
        txtRegistrarApellido = new javax.swing.JTextField();
        btnregistrarwacho = new javax.swing.JButton();
        jcomboculiao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPInicioSession.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        btnregistrarNuevo.setText("Registrar Nuevo");
        btnregistrarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarNuevoActionPerformed(evt);
            }
        });

        btnir.setText("ir");
        btnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPInicioSessionLayout = new javax.swing.GroupLayout(JPInicioSession);
        JPInicioSession.setLayout(JPInicioSessionLayout);
        JPInicioSessionLayout.setHorizontalGroup(
            JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInicioSessionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregistrarNuevo)
                    .addGroup(JPInicioSessionLayout.createSequentialGroup()
                        .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPInicioSessionLayout.createSequentialGroup()
                                .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(78, 78, 78)
                                .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtusuario)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        JPInicioSessionLayout.setVerticalGroup(
            JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInicioSessionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPInicioSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnregistrarNuevo)
                .addGap(19, 19, 19))
        );

        JPregistrar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo");

        txtRegistrarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarApellidoActionPerformed(evt);
            }
        });

        btnregistrarwacho.setText("Guardar");
        btnregistrarwacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarwachoActionPerformed(evt);
            }
        });

        jcomboculiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboculiaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPregistrarLayout = new javax.swing.GroupLayout(JPregistrar);
        JPregistrar.setLayout(JPregistrarLayout);
        JPregistrarLayout.setHorizontalGroup(
            JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPregistrarLayout.createSequentialGroup()
                .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPregistrarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(JPregistrarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addGap(28, 28, 28)
                .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtregistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(txtregistrarNombre)
                    .addComponent(jcomboculiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPregistrarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txtregistrarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPregistrarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnregistrarwacho, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRegistrarApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        JPregistrarLayout.setVerticalGroup(
            JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPregistrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtregistrarPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtregistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRegistrarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtregistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(JPregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrarwacho)
                    .addComponent(jcomboculiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPInicioSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPInicioSession, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void inicioSesion(){
     
        String usuario = txtusuario.getText();
        String pass = String.valueOf(txtpass.getPassword());
  
        if (lista.equals("") || lista == null) {
            
            JOptionPane.showMessageDialog(null, "Registre un nuevo usuario");
            JPInicioSession.setVisible(false);
            JPregistrar.setVisible(true);
        }
        
        else{
            
            if (usuario.equals("") || usuario==null || pass.equals("") || pass==null ) {
                
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
            
        else{
             
                int encontrado = 0;
                for (int i = 0; i < lista.size(); i++) {
                    
                    if (lista.get(i).getUser().equals(usuario) || lista.get(i).getPass().equals(pass)) {
                        
                        encontrado = 1;
                       
                    }
 
                    
                }
      
                if (encontrado==0) {
                    
                    JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                }
                else{
                    
             
                    
                        Naranja n = new Naranja();
                        n.setVisible(true);
                        this.dispose();
                }
                
                
            }
  
        }
        
        
        
    }
    
    public void registrarUsuario(){
        
        
        
      String user = txtregistrarUsuario.getText();
      String pass = txtregistrarPass.getText();
      String nombre = txtregistrarNombre.getText();
      String apellido = txtRegistrarApellido.getText();
      String sexo = jcomboculiao.getSelectedItem().toString();
     
      
      
        if (lista.equals("") || lista == null) {
            
            JOptionPane.showMessageDialog(null, "Registre un nuevo usuario");
        }
        
        else{
            
           
            
            if (user.equals("") || user==null || 
                pass.equals("")  || pass==null ||
                nombre.equals("") || nombre==null || 
                apellido.equals("") || apellido==null) {
                
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
            
           else if (sexo.equals("")||sexo==null) {
                 JOptionPane.showMessageDialog(null, "Seleccione su sexo");
            }
            
        
            
        else{
             
                int encontrado = 0;
                for (int i = 0; i < lista.size(); i++) {
                    
                    if (lista.get(i).getUser().equals(user)) {
                        
                       JOptionPane.showMessageDialog(null, "El nombre de usuario " + user+ " ya existe");
                       encontrado = 1;
                    }
 
                    
                }
      
                if (encontrado==0) {
                        
                    
                    User u = new User(user, pass, nombre, apellido,sexo);
                   
                    lista.add(u);
                    JOptionPane.showMessageDialog(null, "Usuario Agregado correctamente!");
                    JPregistrar.setVisible(false);
                    JPInicioSession.setVisible(true);
                    
                    
                }
                
                
                
                
            }
  
        }
    }
    
     
    private void btnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnirActionPerformed
           inicioSesion();
        
    }//GEN-LAST:event_btnirActionPerformed

    private void txtRegistrarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrarApellidoActionPerformed

    private void btnregistrarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarNuevoActionPerformed
     
        JPInicioSession.setVisible(false);
        JPregistrar.setVisible(true);        
   
    }//GEN-LAST:event_btnregistrarNuevoActionPerformed

    private void btnregistrarwachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarwachoActionPerformed
     
    registrarUsuario();

            
      
    }//GEN-LAST:event_btnregistrarwachoActionPerformed

    private void jcomboculiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboculiaoActionPerformed
       
      String sexo = jcomboculiao.getSelectedItem().toString();
        
    }//GEN-LAST:event_jcomboculiaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Negra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Negra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Negra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Negra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Negra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPInicioSession;
    private javax.swing.JPanel JPregistrar;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton btnir;
    private javax.swing.JButton btnregistrarNuevo;
    private javax.swing.JButton btnregistrarwacho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcomboculiao;
    private javax.swing.JTextField txtRegistrarApellido;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtregistrarNombre;
    private javax.swing.JPasswordField txtregistrarPass;
    private javax.swing.JTextField txtregistrarUsuario;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
