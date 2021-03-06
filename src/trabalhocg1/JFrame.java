/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocg1;

import java.awt.CardLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Teste
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    
    String stArquivo = null;
    Arquivo arq = null;
    
    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrinc = new javax.swing.JPanel();
        JPanelArq = new javax.swing.JPanel();
        jbArquivo = new javax.swing.JButton();
        jbAfastElem = new javax.swing.JButton();
        jbAproxElem = new javax.swing.JButton();
        jbRaioObj = new javax.swing.JButton();
        lbArquivo = new javax.swing.JLabel();
        tfArquivo = new javax.swing.JTextField();
        jPanelInfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfDist1 = new javax.swing.JTextField();
        lbX1 = new javax.swing.JLabel();
        tfX1 = new javax.swing.JTextField();
        lbY1 = new javax.swing.JLabel();
        tfY1 = new javax.swing.JTextField();
        lbInfo1 = new javax.swing.JLabel();
        lbTempo1 = new javax.swing.JLabel();
        tfTempo1 = new javax.swing.JTextField();
        lbDist1 = new javax.swing.JLabel();
        jbBuscar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfDist2 = new javax.swing.JTextField();
        lbInfo2 = new javax.swing.JLabel();
        lbDist2 = new javax.swing.JLabel();
        lbElem2 = new javax.swing.JLabel();
        cbElem2 = new javax.swing.JComboBox<>();
        jbBuscar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfDist3 = new javax.swing.JTextField();
        lbInfo3 = new javax.swing.JLabel();
        lbDist3 = new javax.swing.JLabel();
        lbElem3 = new javax.swing.JLabel();
        cbElem3 = new javax.swing.JComboBox<>();
        jbBuscar3 = new javax.swing.JButton();
        jPanelResul = new javax.swing.JPanel();
        listPontos = new java.awt.List();
        lbResul = new javax.swing.JLabel();
        jbReiniciar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbArquivo.setText("Carregar Arquivo");
        jbArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArquivoActionPerformed(evt);
            }
        });

        jbAfastElem.setText("AfastElem");
        jbAfastElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAfastElemActionPerformed(evt);
            }
        });

        jbAproxElem.setText("AproxElem");
        jbAproxElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAproxElemActionPerformed(evt);
            }
        });

        jbRaioObj.setText("Raio Obj");
        jbRaioObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRaioObjActionPerformed(evt);
            }
        });

        lbArquivo.setText("Nome do Arquivo:");

        tfArquivo.setText("NomeDoArquivo.txt");

        javax.swing.GroupLayout JPanelArqLayout = new javax.swing.GroupLayout(JPanelArq);
        JPanelArq.setLayout(JPanelArqLayout);
        JPanelArqLayout.setHorizontalGroup(
            JPanelArqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelArqLayout.createSequentialGroup()
                .addGroup(JPanelArqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelArqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbArquivo))
                    .addGroup(JPanelArqLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jbRaioObj)
                        .addGap(47, 47, 47)
                        .addComponent(jbAproxElem)
                        .addGap(50, 50, 50)
                        .addComponent(jbAfastElem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelArqLayout.setVerticalGroup(
            JPanelArqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelArqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelArqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbArquivo)
                    .addComponent(tfArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbArquivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(JPanelArqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRaioObj)
                    .addComponent(jbAproxElem)
                    .addComponent(jbAfastElem))
                .addGap(24, 24, 24))
        );

        jPanelInfo.setLayout(new java.awt.CardLayout());

        tfDist1.setText("Em metros");
        tfDist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDist1ActionPerformed(evt);
            }
        });

        lbX1.setText("X:");

        lbY1.setText("Y:");

        lbInfo1.setText("Digite as informações:");

        lbTempo1.setText("Tempo:");

        tfTempo1.setText("Segundos");
        tfTempo1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfTempo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTempo1ActionPerformed(evt);
            }
        });

        lbDist1.setText("Distância:");

        jbBuscar1.setText("Buscar");
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbInfo1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbX1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfX1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbY1)
                        .addGap(18, 18, 18)
                        .addComponent(tfY1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(lbTempo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lbDist1)
                        .addGap(18, 18, 18)
                        .addComponent(tfDist1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(319, 319, 319))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jbBuscar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbInfo1)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTempo1)
                        .addComponent(lbDist1)
                        .addComponent(tfDist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbX1)
                        .addComponent(tfX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbY1)
                        .addComponent(tfY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbBuscar1)
                .addContainerGap())
        );

        jPanelInfo.add(jPanel1, "Painel1");

        tfDist2.setText("Em metros");
        tfDist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDist2ActionPerformed(evt);
            }
        });

        lbInfo2.setText("Digite as informações:");

        lbDist2.setText("Distância:");

        lbElem2.setText("Elemento:");

        cbElem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElem2ActionPerformed(evt);
            }
        });

        jbBuscar2.setText("Buscar");
        jbBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbInfo2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbElem2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbElem2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDist2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jbBuscar2)
                                .addGap(0, 36, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(tfDist2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(319, 319, 319))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInfo2)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDist2)
                    .addComponent(tfDist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbElem2)
                    .addComponent(cbElem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbBuscar2)
                .addContainerGap())
        );

        jPanelInfo.add(jPanel2, "Painel2");

        tfDist3.setText("Em metros");
        tfDist3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDist3ActionPerformed(evt);
            }
        });

        lbInfo3.setText("Digite as informações:");

        lbDist3.setText("Distância:");

        lbElem3.setText("Elemento:");

        cbElem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElem3ActionPerformed(evt);
            }
        });

        jbBuscar3.setText("Buscar");
        jbBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbElem3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbElem3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(lbDist3)
                .addGap(18, 18, 18)
                .addComponent(tfDist3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jbBuscar3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInfo3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInfo3)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDist3)
                    .addComponent(tfDist3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbElem3)
                    .addComponent(cbElem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbBuscar3)
                .addContainerGap())
        );

        jPanelInfo.add(jPanel3, "Painel3");

        listPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPontosActionPerformed(evt);
            }
        });

        lbResul.setText("Resultado:");

        jbReiniciar3.setText("Limpar");
        jbReiniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReiniciar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelResulLayout = new javax.swing.GroupLayout(jPanelResul);
        jPanelResul.setLayout(jPanelResulLayout);
        jPanelResulLayout.setHorizontalGroup(
            jPanelResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResulLayout.createSequentialGroup()
                        .addComponent(lbResul, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbReiniciar3))
                    .addComponent(listPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelResulLayout.setVerticalGroup(
            jPanelResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResul)
                    .addComponent(jbReiniciar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincLayout = new javax.swing.GroupLayout(jPanelPrinc);
        jPanelPrinc.setLayout(jPanelPrincLayout);
        jPanelPrincLayout.setHorizontalGroup(
            jPanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelArq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelResul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincLayout.setVerticalGroup(
            jPanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincLayout.createSequentialGroup()
                .addComponent(JPanelArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArquivoActionPerformed
    stArquivo = tfArquivo.getText();
    try {
        if("".equals(stArquivo))System.out.println("Não foi possível ler o arquivo!");
        else{ 
            arq = new Arquivo(stArquivo);
            System.out.println("Arquivo lido com sucesso!");}
        
    } catch (FileNotFoundException ex) {
            Logger.getLogger(JPanel.class.getName()).log(Level.SEVERE, "Não foi possível ler o arquivo!", ex);
      }
    ArrayList<Elemento> lElem = (ArrayList<Elemento>) arq.getArquivo();
    for(Elemento e: lElem){
        cbElem2.addItem(e.getRotulo());
        cbElem3.addItem(e.getRotulo());
    }
    }//GEN-LAST:event_jbArquivoActionPerformed

    private void jbAproxElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAproxElemActionPerformed
    ((CardLayout) jPanelInfo.getLayout()).show(jPanelInfo, "Painel2"); 
    
    }//GEN-LAST:event_jbAproxElemActionPerformed

    private void tfDist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDist1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDist1ActionPerformed

    private void tfTempo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTempo1ActionPerformed

    private void listPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPontosActionPerformed
        // TODO add your handling code here:
        jPanelInfo.setVisible(false);
    }//GEN-LAST:event_listPontosActionPerformed

    private void tfDist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDist2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDist2ActionPerformed

    private void jbRaioObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRaioObjActionPerformed
    ((CardLayout) jPanelInfo.getLayout()).show(jPanelInfo, "Painel1"); 
    
    }//GEN-LAST:event_jbRaioObjActionPerformed

    private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar1ActionPerformed
    int x = Integer.parseInt(tfX1.getText());
    int y = Integer.parseInt(tfY1.getText());
    int t = Integer.parseInt(tfTempo1.getText());
    int d = Integer.parseInt(tfDist1.getText());
    
    ArrayList<Elemento> lElem = (ArrayList<Elemento>) arq.getArquivo();
    for (Elemento el : lElem) {
        System.out.println(el.toString());
    }
    //System.out.print(lElem.get(0).toString());
    Evento ev = new Evento(lElem,arq.getPxm());
    //Paths_D
    ArrayList<Elemento>lRelev = (ArrayList<Elemento>) ev.raioPontosLive(x, y, t, d);
   // System.out.print(lRelev.get(2).toString());
    System.out.println();
    for (Elemento el : lRelev) {
        System.out.println(el.toString());
        listPontos.add(el.toString());
    }
    }//GEN-LAST:event_jbBuscar1ActionPerformed

    private void jbBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar2ActionPerformed
    ArrayList<Elemento> lElem = (ArrayList<Elemento>) arq.getArquivo();
    Elemento SElem = lElem.get(cbElem2.getSelectedIndex());
    lElem.remove(cbElem2.getSelectedIndex());
    
    
    ArrayList<Ponto> lPonto = SElem.getPontos();
    ArrayList<Elemento> lElemAux= new ArrayList<>();
    for(Ponto p: lPonto){
    int x = p.getX();
    int y = p.getY();
    int t = p.getT();
    int d = Integer.parseInt(tfDist2.getText());
    
    //for (Elemento el : lElem) {
    //    System.out.println(el.toString());
    //}
    //System.out.print(lElem.get(0).toString());
    Evento ev = new Evento(lElem,arq.getPxm());
    //Paths_D
    ArrayList<Elemento>lRelev = (ArrayList<Elemento>) ev.raioPontosLive(x, y,t,d);
    // System.out.print(lRelev.get(2).toString());
    System.out.println();
    
    boolean  nElem = false;
    Elemento elAux = null;
    for (int i = 0; i < lRelev.size(); i++) {
           nElem = false; 
           elAux = null;
            
                for (int j = 0; j < lRelev.get(i).getPontos().size() ; j++) {
                    //busca pontos que estão detro do raio de busca(X+,Y) em determinado tempo
                    //se 
                    
                        if(nElem == false){
                            elAux = new Elemento(lRelev.get(i).getRotulo(),new ArrayList<>());
                            nElem =true;
                        }
                        elAux.addPonto(lRelev.get(i).getPontos().get(j));
                    }
                   
                } if(elAux !=null)lElemAux.add(elAux);
            }
    
    for (Elemento el : lElemAux) {
        System.out.println(el.toString());
        listPontos.add(el.toString());
    }
    
    }//GEN-LAST:event_jbBuscar2ActionPerformed

    private void cbElem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbElem2ActionPerformed

    private void jbAfastElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAfastElemActionPerformed
    ((CardLayout) jPanelInfo.getLayout()).show(jPanelInfo, "Painel3");
    
    }//GEN-LAST:event_jbAfastElemActionPerformed

    private void tfDist3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDist3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDist3ActionPerformed

    private void cbElem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbElem3ActionPerformed

    private void jbReiniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReiniciar3ActionPerformed
        listPontos.removeAll();
    }//GEN-LAST:event_jbReiniciar3ActionPerformed

    private void jbBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar3ActionPerformed
    ArrayList<Elemento> lElem = (ArrayList<Elemento>) arq.getArquivo();
    Elemento SElem = lElem.get(cbElem3.getSelectedIndex());
    lElem.remove(cbElem3.getSelectedIndex());
    
    
    ArrayList<Ponto> lPonto = SElem.getPontos();
    ArrayList<Elemento> lElemAux= new ArrayList<>();
    for(Ponto p: lPonto){
    int x = p.getX();
    int y = p.getY();
    int t = p.getT();
    int d = Integer.parseInt(tfDist3.getText());
    
    //for (Elemento el : lElem) {
    //    System.out.println(el.toString());
    //}
    //System.out.print(lElem.get(0).toString());
    Evento ev = new Evento(lElem,arq.getPxm());
    //Paths_D
    ArrayList<Elemento>lRelev = (ArrayList<Elemento>) ev.raioPontosAfast(x, y,t,d);
    // System.out.print(lRelev.get(2).toString());
    System.out.println();
    
    boolean  nElem = false;
    Elemento elAux = null;
    for (int i = 0; i < lRelev.size(); i++) {
           nElem = false; 
           elAux = null;
            
                for (int j = 0; j < lRelev.get(i).getPontos().size() ; j++) {
                    //busca pontos que estão detro do raio de busca(X+,Y) em determinado tempo
                    //se 
                    
                        if(nElem == false){
                            elAux = new Elemento(lRelev.get(i).getRotulo(),new ArrayList<>());
                            nElem =true;
                        }
                        elAux.addPonto(lRelev.get(i).getPontos().get(j));
                    }
                   
                } if(elAux !=null)lElemAux.add(elAux);
            }
    
    for (Elemento el : lElemAux) {
        System.out.println(el.toString());
        listPontos.add(el.toString());
    }
    }//GEN-LAST:event_jbBuscar3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelArq;
    private javax.swing.JComboBox<String> cbElem2;
    private javax.swing.JComboBox<String> cbElem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelPrinc;
    private javax.swing.JPanel jPanelResul;
    private javax.swing.JButton jbAfastElem;
    private javax.swing.JButton jbAproxElem;
    private javax.swing.JButton jbArquivo;
    private javax.swing.JButton jbBuscar1;
    private javax.swing.JButton jbBuscar2;
    private javax.swing.JButton jbBuscar3;
    private javax.swing.JButton jbRaioObj;
    private javax.swing.JButton jbReiniciar3;
    private javax.swing.JLabel lbArquivo;
    private javax.swing.JLabel lbDist1;
    private javax.swing.JLabel lbDist2;
    private javax.swing.JLabel lbDist3;
    private javax.swing.JLabel lbElem2;
    private javax.swing.JLabel lbElem3;
    private javax.swing.JLabel lbInfo1;
    private javax.swing.JLabel lbInfo2;
    private javax.swing.JLabel lbInfo3;
    private javax.swing.JLabel lbResul;
    private javax.swing.JLabel lbTempo1;
    private javax.swing.JLabel lbX1;
    private javax.swing.JLabel lbY1;
    private java.awt.List listPontos;
    private javax.swing.JTextField tfArquivo;
    private javax.swing.JTextField tfDist1;
    private javax.swing.JTextField tfDist2;
    private javax.swing.JTextField tfDist3;
    private javax.swing.JTextField tfTempo1;
    private javax.swing.JTextField tfX1;
    private javax.swing.JTextField tfY1;
    // End of variables declaration//GEN-END:variables
}
