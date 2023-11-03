
import java.util.List;
import javax.swing.JOptionPane;


public class Jugar extends javax.swing.JFrame {

    //private JuegoAhorcado ahorcado;
    private JuegoAhorcadoBase ahorcado;
    private String palabra;
    public static game_mode mode= Inicio.mode;
    public static List<String> words = AdminPalabrasSecretas.palabras;
    public Jugar() {
        initComponents();
        this.setLocationRelativeTo(null);
        jugar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbpalabra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbintentos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtletra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("LETRA:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, -1));
        jPanel1.add(lbpalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 20));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel2.setText("INTENTOS:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(lbintentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 20));

        jLabel3.setText("PALABRA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel1.add(txtletra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String letra=txtletra.getText();
       if(letra.length()!=1){
           JOptionPane.showMessageDialog(null, "Solo se puede ingresar una letra");
           txtletra.setText("");
       }
       else if(ahorcado.verificarLetra(letra.charAt(0))){
           ahorcado.actualizarPalabraActual(letra.charAt(0)); txtletra.setText("");
       if(ahorcado.hasGanado()){
           JOptionPane.showMessageDialog(null, "Felicidades has adivinado la palabra! ");
       Inicio menu= new Inicio();
       menu.setVisible(true);
       dispose();}}
           
       else {ahorcado.intentos--;
       txtletra.setText("");
       if(ahorcado.intentos==0){
           JOptionPane.showMessageDialog(null, "Has perdido ");
           Inicio menu= new Inicio();
       menu.setVisible(true);
       dispose();
       }}
       //ahorcado.jugar(letra.charAt(0));
       lbpalabra.setText(ahorcado.getPalabraActual());
       lbintentos.setText(String.valueOf(ahorcado.getIntentos()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jugar(){
        if(mode.getMode().equalsIgnoreCase("fijo")){
           
        palabra= JOptionPane.showInputDialog("Ingrese la palabra: ");
         if(palabra==null){
             JOptionPane.showMessageDialog(null, "Tiene que ingresar una palabra");
         }else
            System.out.println(words);
         ahorcado = new JuegoAhorcadoFijo(palabra);
        }
        else ahorcado = new JuegoAhorcadoAza();
        lbpalabra.setText(ahorcado.getPalabraActual());
        lbintentos.setText(String.valueOf(ahorcado.getIntentos()));
       
    }
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
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbintentos;
    private javax.swing.JLabel lbpalabra;
    private javax.swing.JTextField txtletra;
    // End of variables declaration//GEN-END:variables
}
