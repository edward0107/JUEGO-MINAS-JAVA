
package juego;

import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Edward Esteban
 */
public class menu_juego extends javax.swing.JFrame {
        hora_local hr = new hora_local();
     
         public texto_dinamico hilo1;
    /**
     * Creates new form menu_juego
     */
    public menu_juego() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txtH1Cadena.setText("UNIVERSIDAD MARIANO GALVES DE GUATEMALA");
        this.txtH1Sleep.setText("1000");
        sonido();
        mostrartiempo();
        sinbtn();
        cronometro cr = new cronometro();
        cr.start();
       
     
      
       
    }
    
    public void mostrartiempo(){
        lbl_hora_local.setText(hr.completa);

    }
    
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        lbl_hora = new javax.swing.JLabel();
        lbl_min = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_seg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_hora_local = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblH1 = new javax.swing.JLabel();
        lblH1Mensaje = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtH1Sleep = new javax.swing.JTextField();
        txtH1Cadena = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        principiante = new javax.swing.JMenuItem();
        avanzado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setSize(new java.awt.Dimension(0, 0));

        lbl_hora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_hora.setText("0");

        lbl_min.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_min.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Time");

        lbl_seg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_seg.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText(":");

        lbl_hora_local.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_hora_local.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hora local");

        jLabel4.setText("Tiempo de juego transcurrido");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edward Esteban\\Desktop\\proyectos java\\juego\\mariano.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblH1.setBackground(new java.awt.Color(255, 255, 255));
        lblH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblH1.setText("jLabel2");

        lblH1Mensaje.setText("jLabel4");

        jLabel7.setText("Sleep:");

        txtH1Sleep.setText("jTextField2");

        txtH1Cadena.setBackground(new java.awt.Color(204, 204, 204));
        txtH1Cadena.setForeground(new java.awt.Color(204, 204, 204));
        txtH1Cadena.setText("jTextField1");
        txtH1Cadena.setCaretColor(new java.awt.Color(204, 204, 204));
        txtH1Cadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtH1CadenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtH1Cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(756, 756, 756)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtH1Sleep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(lblH1Mensaje))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblH1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtH1Sleep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblH1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblH1Mensaje)
                        .addGap(6, 6, 6)))
                .addComponent(txtH1Cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Juego");

        principiante.setText("Principiante");
        principiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principianteActionPerformed(evt);
            }
        });
        jMenu1.add(principiante);

        avanzado.setText("Avanzado");
        avanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzadoActionPerformed(evt);
            }
        });
        jMenu1.add(avanzado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem5.setText("Instrucciones");
        jMenuItem5.setActionCommand("Instrucciones\n");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lbl_hora_local, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_hora)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)
                                .addComponent(lbl_min)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_seg)
                                .addGap(56, 56, 56)))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_hora)
                            .addComponent(jLabel1)
                            .addComponent(lbl_min)
                            .addComponent(jLabel2)
                            .addComponent(lbl_seg)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(lbl_hora_local))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("Universidad");
        jPanel2.getAccessibleContext().setAccessibleDescription("Universidad");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzadoActionPerformed
        // TODO add your handling code here:
        Avanzado ava = new Avanzado();
        ava.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avanzadoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            //ruta donde va tu archivo pdf ,este ya sera abierto en tu explorador de archivos de pdf preterminados
            File j = new File("C:\\Users\\Edward Esteban\\Desktop\\proyectos java\\juego\\src\\juego\\reglas busca minas .pdf");
            Desktop.getDesktop().open(j);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void principianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principianteActionPerformed
 
    
    Principiante pi = new Principiante();
    pi.setVisible(true);
    this.dispose();
       
    }//GEN-LAST:event_principianteActionPerformed

    private void txtH1CadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtH1CadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtH1CadenaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
               // TODO add your handling code here:
               System.exit(0);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         menu_juego me = new menu_juego();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               me.setVisible(true);
              
            }
        });
       
    }
   
    private class cronometro extends Thread{
    public void run(){
     try {
              for( int hora=0;hora<=24;hora++){
                  for( int min=0;min<=60;min++){
                    for( int seg=0;seg<=60;seg++){
              lbl_hora.setText(String.valueOf(hora));
              lbl_min.setText(String.valueOf(min));
              lbl_seg.setText(String.valueOf(seg));
             Thread.sleep(1000);
              }
           }
        }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error en"+e);
        }
        
    
    }
    
    }
    
    public void sinbtn(){
    try
        {
            int sleep = Integer.parseInt(this.txtH1Sleep.getText().trim());
            if(sleep < 0) throw new Exception("Ingrese un sleep mayor o igual que cero. ");

            if(this.txtH1Cadena.getText().trim().equals("") && sleep == 0) hilo1 = new texto_dinamico(this.lblH1, this.lblH1Mensaje);
            if(this.txtH1Cadena.getText().trim().equals("") && sleep > 0)
            {
                hilo1 = new texto_dinamico(this.lblH1, this.lblH1Mensaje);
                hilo1.setSleep(sleep);
            }
            if(this.txtH1Cadena.getText().trim().equals("") == false && sleep > 0) hilo1 = new texto_dinamico(this.txtH1Cadena.getText(), sleep, this.lblH1, this.lblH1Mensaje);

            hilo1.setTamanioFuente(20, 50);
            hilo1.start();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "btnH1Iniciar(). " + ex.getMessage());
        }
    }
     
    public void sonido(){
     
     AudioClip sonido;
    sonido= java.applet.Applet.newAudioClip(getClass().getResource("/juego/Kevin Roldan, Bryant Myers, Lyanno - Hasta Abajo.wav"));
    sonido.play();
    sonido.loop();
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem avanzado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblH1;
    private javax.swing.JLabel lblH1Mensaje;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_hora_local;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_seg;
    private javax.swing.JMenuItem principiante;
    private javax.swing.JTextField txtH1Cadena;
    private javax.swing.JTextField txtH1Sleep;
    // End of variables declaration//GEN-END:variables
}

