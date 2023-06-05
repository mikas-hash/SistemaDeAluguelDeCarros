/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto.godzilla;


import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import java.sql.ResultSetMetaData;
import data.Carros;
import control.CarrosDao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author migue
 */
public class gerenciarCarro extends javax.swing.JFrame {

    /**
     * Creates new form gerenciarCarro
     */
    public gerenciarCarro() {
        initComponents();
        exibirDados();


        
        
    }

    private Connection con;
    private Statement st;
    private ResultSetMetaData metaData;
    private ResultSet rs;
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GERENCIAR = new javax.swing.JLabel();
        CHASSI = new javax.swing.JTextField();
        PLACA = new javax.swing.JTextField();
        MARCA = new javax.swing.JTextField();
        VALOR = new javax.swing.JTextField();
        ADICIONAR = new javax.swing.JButton();
        EXCLUIR = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacarros = new javax.swing.JTable();
        LIMPAR1 = new javax.swing.JButton();
        cbstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aluguel de carros ");

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        GERENCIAR.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        GERENCIAR.setText("Gerenciar Carros");

        CHASSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHASSIActionPerformed(evt);
            }
        });

        ADICIONAR.setText("ADICIONAR");
        ADICIONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADICIONARActionPerformed(evt);
            }
        });

        EXCLUIR.setText("EXCLUIR");
        EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIRActionPerformed(evt);
            }
        });

        EDITAR.setText("EDITAR");

        jLabel1.setText("PLACA");

        jLabel2.setText("MARCA");

        jLabel3.setText("CHASSI");

        jLabel4.setText("R$");

        jLabel5.setText("STATUS");

        tabelacarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "PLACA", "MARCA", "CHASSI", "VALOR", "STATUS"
            }
        ));
        tabelacarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelacarrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelacarros);

        LIMPAR1.setText("LIMPAR CAMPOS");
        LIMPAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPAR1ActionPerformed(evt);
            }
        });

        cbstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIVEL", "ALUGADO" }));
        cbstatus.setMinimumSize(new java.awt.Dimension(100, 20));
        cbstatus.setPreferredSize(new java.awt.Dimension(100, 20));
        cbstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PLACA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHASSI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GERENCIAR)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADICIONAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LIMPAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GERENCIAR)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PLACA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHASSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EXCLUIR)
                    .addComponent(ADICIONAR)
                    .addComponent(EDITAR)
                    .addComponent(LIMPAR1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbstatusActionPerformed

    private void LIMPAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPAR1ActionPerformed
        PLACA.setText("");
        VALOR.setText("");
        CHASSI.setText("");
        MARCA.setText("");
    }//GEN-LAST:event_LIMPAR1ActionPerformed

    private void tabelacarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacarrosMouseClicked

    }//GEN-LAST:event_tabelacarrosMouseClicked

    private void EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIRActionPerformed
        int selectedRow = tabelacarros.getSelectedRow(); // Obtém a linha selecionada

        if (selectedRow != -1) { // Verifica se alguma linha foi selecionada
            String placa = tabelacarros.getValueAt(selectedRow, 0).toString(); // Obtém o valor da coluna "PLACA" da linha selecionada

            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o carro com a placa: " + placa + "?", "Excluir Carro", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) { // Confirmação do usuário
                CarrosDao dao = new CarrosDao();

                try {
                    if (!dao.conectar()) {
                        JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
                    } else {
                        if (dao.excluirCarro(placa)) { // Exclui o carro com a placa especificada
                            JOptionPane.showMessageDialog(null, "Carro excluído com sucesso!");
                            DefaultTableModel model = (DefaultTableModel) tabelacarros.getModel();
                            model.removeRow(selectedRow); // Remove a linha da tabela
                        } else {
                            JOptionPane.showMessageDialog(null, "Não foi possível excluir o carro");
                        }
                    }
                } catch (HeadlessException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao excluir o carro");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um carro para excluir");
        }

    }//GEN-LAST:event_EXCLUIRActionPerformed

    private void ADICIONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADICIONARActionPerformed
        Carros carros = new Carros();
        CarrosDao dao;
        boolean sts;
        carros.setPlaca(PLACA.getText());
        String statusSelecionado = (String) cbstatus.getSelectedItem();
        carros.setStatus(statusSelecionado);
        carros.setPreco(Double.parseDouble(VALOR.getText()));
        carros.setMarca(MARCA.getText());
        carros.setImagem("");
        carros.setChassi(CHASSI.getText());

        dao = new CarrosDao();

        try {
            if (!dao.conectar()) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
            } else {
                if (dao.salvar(carros)) {
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível salvar os dados do carro");
                }

                dao.atualizarTabela((DefaultTableModel) tabelacarros.getModel());
                tabelacarros.revalidate();
                tabelacarros.repaint();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a tabela de carros");
        }

    }//GEN-LAST:event_ADICIONARActionPerformed

    private void CHASSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHASSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHASSIActionPerformed
    
    public void exibirDados() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemagod", "root", "1234");
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM carros");
        tabelacarros.setModel(resultSetToTableModel(rs));
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    public DefaultTableModel resultSetToTableModel(ResultSet rs) throws SQLException {
    ResultSetMetaData metaData = rs.getMetaData();
    int columnCount = metaData.getColumnCount();

    // Obter os nomes das colunas
    String[] columnNames = new String[columnCount];
    for (int column = 1; column <= columnCount; column++) {
        columnNames[column - 1] = metaData.getColumnName(column);
    }

    // Criar o modelo de tabela vazio
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    // Preencher o modelo de tabela com os dados do ResultSet
    while (rs.next()) {
        Object[] rowData = new Object[columnCount];
        for (int column = 1; column <= columnCount; column++) {
            rowData[column - 1] = rs.getObject(column);
        }
        model.addRow(rowData);
    }

    return model;
}



    public static void main(String args[]) {
        try {
    UIManager.setLookAndFeel( new FlatDarkPurpleIJTheme());
    } catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gerenciarCarro().setVisible(true);
            }
        });
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADICIONAR;
    private javax.swing.JTextField CHASSI;
    private javax.swing.JButton EDITAR;
    private javax.swing.JButton EXCLUIR;
    private javax.swing.JLabel GERENCIAR;
    private javax.swing.JButton LIMPAR1;
    private javax.swing.JTextField MARCA;
    private javax.swing.JTextField PLACA;
    private javax.swing.JTextField VALOR;
    private javax.swing.JComboBox<String> cbstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelacarros;
    // End of variables declaration//GEN-END:variables


}