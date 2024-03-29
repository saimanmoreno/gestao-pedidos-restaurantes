/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.unicv.gpr.telas;

import cv.unicv.gpr.modelos.Funcionarios;
import cv.unicv.gpr.modelosdao.FuncionarioDAO;

/**
 *
 * @author pc
 */
public class JDialogAtualizarFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAdicionarFuncionario
     * @param parent
     * @param modal
     * @param f
     */
    
    
    public JDialogAtualizarFuncionario(java.awt.Frame parent, boolean modal, Funcionarios f) {
        super(parent, modal);
        initComponents();
        
        lblIdAtribuido.setText(Integer.toString(f.getIdFuncionarios()));
        txtNome.setText(f.getNome());
        cmbCargo.setSelectedItem(f.getCargo());
        txtDataNasc.setText(f.getDataNasc());
        txtMorada.setText(f.getMorada());
        txtTelefone.setText(Integer.toString(f.getTelefone()));
        txtEmail.setText(f.getEmail());
        cmbSexo.setSelectedItem(f.getSexo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        txtMorada = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        lblIdAtribuido = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Funcionarios");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar Funcionario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12))); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12))); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 350, -1));

        cmbCargo.setBackground(new java.awt.Color(255, 255, 255));
        cmbCargo.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Cargo:", "Administrador", "Garçom", "Cozinha" }));
        cmbCargo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(cmbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 40));

        cmbSexo.setBackground(new java.awt.Color(255, 255, 255));
        cmbSexo.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Sexo:", "Masculino", "Feminino" }));
        cmbSexo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 150, 40));

        txtMorada.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtMorada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Morada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12))); // NOI18N
        jPanel1.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 310, -1));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12))); // NOI18N
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, -1));

        txtEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtEmail.setText("example@gmail.com");
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12))); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, -1));

        label.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        label.setText("Id atribuido: ");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        txtDataNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Nascimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 12))); // NOI18N
        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNasc.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 150, 40));

        lblIdAtribuido.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.add(lblIdAtribuido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 810, 340));

        btnAtualizar.setBackground(new java.awt.Color(153, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        Funcionarios func = new Funcionarios();
        FuncionarioDAO funcionario = new FuncionarioDAO();

        func.setNome(txtNome.getText());
        func.setCargo((String) cmbCargo.getSelectedItem());
        func.setDataNasc(txtDataNasc.getText());
        func.setEmail(txtEmail.getText());
        func.setMorada(txtMorada.getText());
        func.setTelefone(Integer.parseInt(txtTelefone.getText()));
        func.setSexo((String) cmbSexo.getSelectedItem());
        func.setIdFuncionarios(Integer.parseInt(lblIdAtribuido.getText()));
        System.out.println(func.getIdFuncionarios());
        funcionario.atualizar(func, this);
        this.dispose();

    }//GEN-LAST:event_btnAtualizarActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Funcionarios f = null;
                JDialogAtualizarFuncionario dialog = new JDialogAtualizarFuncionario(new javax.swing.JFrame(), true, f);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblIdAtribuido;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
