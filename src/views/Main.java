package views;

import controller.PacienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Paciente;
import model.PacienteTableModel;

/**
 *
 * @author benmacario
 */
public class Main extends javax.swing.JFrame {

    PacienteTableModel tableModel = new PacienteTableModel();
    Paciente paciente = new Paciente();
    PacienteDAO pacienteDAO = new PacienteDAO();
    
    public Main() {
        initComponents();
        
        tabelaInfo.setModel(tableModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCard = new javax.swing.JPanel();
        panelCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        comboSexo = new javax.swing.JComboBox<>();
        txtIdade = new javax.swing.JTextField();
        btnCad = new javax.swing.JButton();
        panelExibir = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInfo = new javax.swing.JTable();
        jPanelButton = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanelLogo = new javax.swing.JPanel();
        jLabelClinica = new javax.swing.JLabel();
        jLabelBla = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Blá");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCard.setLayout(new java.awt.CardLayout());

        panelCadastrar.setPreferredSize(new java.awt.Dimension(812, 260));

        jLabel1.setText("Nome:");
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel2.setText("CPF:");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel3.setText("Sexo:");

        jLabel4.setText("Idade:");
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel5.setText("Data consulta:");
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 20));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastrarLayout = new javax.swing.GroupLayout(panelCadastrar);
        panelCadastrar.setLayout(panelCadastrarLayout);
        panelCadastrarLayout.setHorizontalGroup(
            panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadastrarLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelCadastrarLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(10, 10, 10)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelCadastrarLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        panelCadastrarLayout.setVerticalGroup(
            panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCad)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanelCard.add(panelCadastrar, "card2");

        panelExibir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 56, 56)));
        tabelaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabelaInfo);

        panelExibir.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 788, 240));

        btnEditar.setFont(new java.awt.Font("Noto Sans Disp", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Noto Sans Disp", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorderPainted(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelExibir.add(jPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 236, 788, -1));

        jPanelCard.add(panelExibir, "card3");

        getContentPane().add(jPanelCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 812, -1));

        jPanelLogo.setBackground(new java.awt.Color(40, 142, 244));

        jLabelClinica.setFont(new java.awt.Font("Noto Sans Disp", 1, 36)); // NOI18N
        jLabelClinica.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClinica.setText("CLÍNICA");

        jLabelBla.setFont(new java.awt.Font("Noto Sans Disp", 0, 36)); // NOI18N
        jLabelBla.setForeground(new java.awt.Color(254, 254, 254));
        jLabelBla.setText("BLÁ");

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jLabelClinica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBla)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClinica)
                    .addComponent(jLabelBla))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 812, -1));

        jPanelButtons.setForeground(new java.awt.Color(254, 254, 254));

        btnCadastrar.setFont(new java.awt.Font("Noto Sans Disp", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setFocusable(false);
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExibir.setFont(new java.awt.Font("Noto Sans Disp", 1, 12)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.setBorderPainted(false);
        btnExibir.setFocusable(false);
        btnExibir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExibir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        jPanelCard.removeAll();
        jPanelCard.revalidate();
        jPanelCard.repaint();
        jPanelCard.add(panelCadastrar);
         
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        jPanelCard.removeAll();
        jPanelCard.revalidate();
        jPanelCard.repaint();
        jPanelCard.add(panelExibir);
        tableModel.clearTable();
        
        List<Paciente> cnts = pacienteDAO.consultarPaciente();
        
        for (Paciente c : cnts) {
            tableModel.addRow(c);
        }
    }//GEN-LAST:event_btnExibirActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        paciente.setNome(txtNome.getText());
        txtNome.setText("");
        paciente.setCpf(txtCpf.getText());
        txtCpf.setValue(null);
        paciente.setSexo((String) comboSexo.getSelectedItem());
        comboSexo.setSelectedItem("");
        paciente.setIdade(Integer.parseInt(txtIdade.getText()));
        txtIdade.setText("");
        paciente.setData(txtData.getText());
        txtData.setValue(null);
        
        pacienteDAO.salvarPaciente(paciente);
        
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tabelaInfo.getSelectedRow() != -1) {
            int valorId = (int) tabelaInfo.getValueAt(tabelaInfo.getSelectedRow(), 0);
            int confirmacao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir paciente!");

            switch(confirmacao) {
                case 0:
                    pacienteDAO.excluirPaciente(valorId);
                    tableModel.removeRow(tabelaInfo.getSelectedRow());

                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha na tabela para excluir!");
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if(tabelaInfo.getSelectedRow() != -1) {
            FrameEditar editar = new FrameEditar();
            editar.setVisible(true);
        
            int valorId = (int) tabelaInfo.getValueAt(tabelaInfo.getSelectedRow(), 0);
            
            paciente = pacienteDAO.buscarPaciente(valorId);
            
            editar.txtIdentificador.setText(Integer.toString(valorId));
            editar.txtNomeEdit.setText(paciente.getNome());
            editar.txtCpfEdit.setText(paciente.getCpf());
            editar.comboSexoEdit.setSelectedItem(paciente.getSexo());
            editar.txtIdadeEdit.setText(Integer.toString(paciente.getIdade()));
            editar.txtDataEdit.setText(paciente.getData());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha na tabela para editar!");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExibir;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBla;
    private javax.swing.JLabel jLabelClinica;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelCard;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCadastrar;
    private javax.swing.JPanel panelExibir;
    private javax.swing.JTable tabelaInfo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
