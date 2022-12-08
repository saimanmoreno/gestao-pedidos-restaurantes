/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.unicv.gpr.telas;

import cv.unicv.gpr.modelos.Pratos;
import cv.unicv.gpr.modelosdao.PratosDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public final class FrmAdicionarPratos extends javax.swing.JFrame {

    /**
     * Creates new form fmrFazerPedido
     */
    public FrmAdicionarPratos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTablePratos.getModel();
        jTablePratos.setRowSorter(new TableRowSorter(modelo));
        lerTable();
    }
    
    public void lerTable(){
        
        DefaultTableModel modelo = (DefaultTableModel) jTablePratos.getModel();
        modelo.setNumRows(0);
        PratosDAO pratodao = new PratosDAO();
        
        for(Pratos p: pratodao.listar()){
            
            modelo.addRow(new Object[]{
                p.getIdPratos(),
                p.getDescrição(),
                p.getCategoria(),
                p.getPreço()
            });
        }
    }
    
    public void pesquisarTable(String palavraChave){
        
        DefaultTableModel modelo = (DefaultTableModel) jTablePratos.getModel();
        modelo.setNumRows(0);
        PratosDAO pratodao = new PratosDAO();
        
        for(Pratos p: pratodao.pesquisar(palavraChave)){
            
            modelo.addRow(new Object[]{
                p.getIdPratos(),
                p.getDescrição(),
                p.getCategoria(),
                p.getPreço()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        lblIdAtribuido = new javax.swing.JLabel();
        txtNomePrato = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnAtualizar = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePratos = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1024, 600));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 204, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestão de Pratos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel111.setBackground(new java.awt.Color(255, 204, 153));
        jPanel111.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Novo Prato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel111.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdAtribuido.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblIdAtribuido.setText("Id atribuido: ");
        jPanel111.add(lblIdAtribuido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        txtNomePrato.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtNomePrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Prato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 13), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel111.add(txtNomePrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 800, 40));

        cmbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cmbCategoria.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Categoria:", "Entrada", "Prato-Principal", "Carnes", "Acompanhante", "Bebidas", "Sobremesa", "Fast-Foods", "Pequeno-Almoço" }));
        cmbCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel111.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 40));

        btnAtualizar.setBackground(new java.awt.Color(153, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel111.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 100, 30));

        txtPreco.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtPreco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 13), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel111.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 150, 40));

        btnAdicionar.setBackground(new java.awt.Color(153, 255, 255));
        btnAdicionar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel111.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 110, 30));

        jPanel11.add(jPanel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 840, 170));

        jScrollPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jScrollPane2KeyReleased(evt);
            }
        });

        jTablePratos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTablePratos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTablePratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Nome", "Categoria", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePratos.setGridColor(new java.awt.Color(255, 153, 102));
        jTablePratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePratosMouseClicked(evt);
            }
        });
        jTablePratos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTablePratosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePratos);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 840, 260));

        btnRemover.setBackground(new java.awt.Color(255, 153, 153));
        btnRemover.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel11.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, 110, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Pesquisar Pratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        txtPesquisar.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 13), new java.awt.Color(153, 153, 153))); // NOI18N

        btnPesquisar.setBackground(new java.awt.Color(153, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 840, 70));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 910, 630));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cv/unicv/gpr/icones/restaurant-1282 - Cópia.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 80, 70));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisarTable(txtPesquisar.getText());
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if (jTablePratos.getSelectedRow() != -1) {
            Pratos p = new Pratos();
            PratosDAO prato = new PratosDAO();
            
            lblIdAtribuido.setVisible(true);
            lblIdAtribuido.setText("Id do Prato: "+jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 0));
            p.setDescrição(txtNomePrato.getText());
            p.setCategoria((String) cmbCategoria.getSelectedItem());
            p.setPreço(Integer.parseInt(txtPreco.getText()));
            p.setIdPratos((int) jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 0));
                    
            prato.atualizar(p);
            
            txtNomePrato.setText("");
            cmbCategoria.setSelectedIndex(0);
            txtPreco.setText("");
            
            lerTable();
        }
        
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        if (jTablePratos.getSelectedRow() != -1) {
            
            Pratos p = new Pratos();
            PratosDAO prato = new PratosDAO();
            
            p.setIdPratos((int) jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 0));
                    
            prato.remover(p);
            
            txtNomePrato.setText("");
            cmbCategoria.setSelectedIndex(0);
            txtPreco.setText("");
            
            lerTable();
        }
        
        if(jTablePratos.getRowCount()==0) btnRemover.setVisible(false);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void jScrollPane2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2KeyReleased

    private void jTablePratosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePratosKeyReleased
        // TODO add your handling code here:
        
         if (jTablePratos.getSelectedRow() != -1) {
            
            lblIdAtribuido.setVisible(true);
            lblIdAtribuido.setText("Id do Prato: "+jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 0));
            txtNomePrato.setText((String) jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 1));
            cmbCategoria.setSelectedItem((String) jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 2));
            txtPreco.setText(jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 3).toString());
         }
        
    }//GEN-LAST:event_jTablePratosKeyReleased

    private void jTablePratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePratosMouseClicked
        // TODO add your handling code here:
        
        if (jTablePratos.getSelectedRow() != -1) {
            
            lblIdAtribuido.setText("Id do Prato: "+jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 0));
            txtNomePrato.setText((String) jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 1));
            cmbCategoria.setSelectedItem((String) jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 2));
            txtPreco.setText(jTablePratos.getValueAt(jTablePratos.getSelectedRow(), 3).toString());
         }
    }//GEN-LAST:event_jTablePratosMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        
        if(!(txtNomePrato.equals("") || txtPreco.getText().equals("") || cmbCategoria.getSelectedItem().equals("Selecionar"))){
            Pratos p = new Pratos();
            PratosDAO prato = new PratosDAO();

            p.setDescrição(txtNomePrato.getText());
            p.setCategoria((String) cmbCategoria.getSelectedItem());
            p.setPreço(Integer.parseInt(txtPreco.getText()));

            prato.adicionar(p);

            txtNomePrato.setText("");
            txtPreco.setText("");

            lerTable();
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdicionarPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarPratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdicionarPratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePratos;
    private javax.swing.JLabel lblIdAtribuido;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtNomePrato;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}