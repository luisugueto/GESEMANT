/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesemant;

import graficas.GraficaBacklog;
import graficas.GraficaHorasExtras;
import graficas.GraficaHorasHombreTrabajo;
import graficas.GraficaHorasNormales;
import graficas.GraficaMantCorrectivoEM;
import graficas.GraficaMantCorrectivoPP;
import graficas.GraficaMantPredictivo;
import graficas.GraficaMantPreventivo;
import graficas.GraficaOrdenesTrabajo;
import graficas.GraficaRetrabajo;
import graficas.GraficaTiempoNoIdentificado;
import graficas.GraficaUtilizacionManoObra;
import graficas.GraficaVariacionTiempo;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.WindowConstants;

/**
 *
 * @author admin
 */
public class MostrarGraficasIndicadores extends javax.swing.JFrame {

    /**
     * Creates new form MostrarGraficasIndicadores
     */
    
    // ARRAYLIST DE DATOS 
    private ArrayList<String> semanas = new ArrayList<String>();
    private ArrayList mantpredictivo = new ArrayList();
    private ArrayList mantpreventivo = new ArrayList(); 
    private ArrayList mantcorrectivopr = new ArrayList(); 
    private ArrayList mantcorrectivoem = new ArrayList();
    private ArrayList ordenestrabajo = new ArrayList(); 
    private ArrayList horashombretrabajo = new ArrayList();
    private ArrayList horasnormales = new ArrayList(); 
    private ArrayList horasextras = new ArrayList();
    private ArrayList variacionn = new ArrayList();
    private ArrayList utilmanoobra = new ArrayList(); 
    private ArrayList tiempnoiden = new ArrayList();
    private ArrayList retrabajoo = new ArrayList(); 
    private ArrayList backlogg = new ArrayList();
    
    // ARRAYLIST DE VENTANAS
    private ArrayList<GraficaMantPredictivo> listGraficaMantPredictivo = new ArrayList<GraficaMantPredictivo>();
    private int numGraficaMantPredictivo = 0;
    
    private ArrayList<GraficaMantPreventivo> listGraficaMantPreventivo = new ArrayList<GraficaMantPreventivo>();
    private int numGraficaMantPreventivo = 0;
    
    private ArrayList<GraficaMantCorrectivoPP> listGraficaMantCorrectivoPP = new ArrayList<GraficaMantCorrectivoPP>();
    private int numGraficaMantCorrectivoPP = 0;
    
    private ArrayList<GraficaMantCorrectivoEM> listGraficaMantCorrectivoEM = new ArrayList<GraficaMantCorrectivoEM>();
    private int numGraficaMantCorrectivoEM = 0;
    
    private ArrayList<GraficaOrdenesTrabajo> listGraficaOrdenesTrabajo = new ArrayList<GraficaOrdenesTrabajo>();
    private int numGraficaOrdenesTrabajo = 0;
    
    private ArrayList<GraficaHorasHombreTrabajo> listGraficaHorasHombreTrabajo = new ArrayList<GraficaHorasHombreTrabajo>();
    private int numGraficaHorasHombreTrabajo = 0;
    
    private ArrayList<GraficaHorasNormales> listGraficaHorasNormales = new ArrayList<GraficaHorasNormales>();
    private int numGraficaHorasNormales = 0;
    
    private ArrayList<GraficaHorasExtras> listGraficaHorasExtras = new ArrayList<GraficaHorasExtras>();
    private int numGraficaHorasExtras = 0;
    
    private ArrayList<GraficaVariacionTiempo> listGraficaVariacionTiempo = new ArrayList<GraficaVariacionTiempo>();
    private int numGraficaVariacionTiempo = 0;
    
    private ArrayList<GraficaUtilizacionManoObra> listGraficaUtilizacionManoObra = new ArrayList<GraficaUtilizacionManoObra>();
    private int numGraficaUtilizacionManoObra = 0;
    
    private ArrayList<GraficaTiempoNoIdentificado> listGraficaTiempoNoIdentificado = new ArrayList<GraficaTiempoNoIdentificado>();
    private int numGraficaTiempoNoIdentificado = 0;
    
    private ArrayList<GraficaRetrabajo> listGraficaRetrabajo = new ArrayList<GraficaRetrabajo>();
    private int numGraficaRetrabajo = 0;
    
    private ArrayList<GraficaBacklog> listGraficaBacklog = new ArrayList<GraficaBacklog>();
    private int numGraficaBacklog = 0;
    
    public MostrarGraficasIndicadores(String fechaa, ArrayList semanas, ArrayList mantpredictivo, ArrayList mantpreventivo, ArrayList mantcorrectivopr, ArrayList mantcorrectivoem, ArrayList ordenestrabajo, ArrayList horashombretrabajo, ArrayList horasnormales, ArrayList horasextras, ArrayList variacionn, ArrayList utilmanoobra, ArrayList tiempnoiden, ArrayList retrabajoo, ArrayList backlogg) {
        initComponents();
        this.setTitle("VER GRÁFICAS POR INDICADOR");
        this.fecha.setText(fechaa);
        
        // SETTING ARRAYLIST CON INDICADORES
        this.semanas = semanas;
        this.mantpredictivo = mantpredictivo;
        this.mantpreventivo = mantpreventivo;
        this.mantcorrectivopr = mantcorrectivopr;
        this.mantcorrectivoem = mantcorrectivoem;
        this.ordenestrabajo = ordenestrabajo;
        this.horashombretrabajo = horashombretrabajo;
        this.horasnormales = horasnormales;
        this.horasextras = horasextras; 
        this.variacionn = variacionn;
        this.utilmanoobra = utilmanoobra; 
        this.tiempnoiden = tiempnoiden; 
        this.retrabajoo = retrabajoo; 
        this.backlogg = backlogg;

        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/imagenes/logo-trans-small.png")));
        
        jButton1.setBackground(Color.decode("#3e8f3e"));
        jButton1.setForeground(Color.white);
        
        jButton2.setBackground(Color.decode("#3e8f3e"));
        jButton2.setForeground(Color.white);
        
        jButton3.setBackground(Color.decode("#3e8f3e"));
        jButton3.setForeground(Color.white);
        
        jButton4.setBackground(Color.decode("#3e8f3e"));
        jButton4.setForeground(Color.white);
        
        jButton5.setBackground(Color.decode("#3e8f3e"));
        jButton5.setForeground(Color.white);
        
        jButton6.setBackground(Color.decode("#3e8f3e"));
        jButton6.setForeground(Color.white);
        
        jButton7.setBackground(Color.decode("#3e8f3e"));
        jButton7.setForeground(Color.white);
        
        jButton8.setBackground(Color.decode("#3e8f3e"));
        jButton8.setForeground(Color.white);
        
        jButton9.setBackground(Color.decode("#3e8f3e"));
        jButton9.setForeground(Color.white);
        
        jButton10.setBackground(Color.decode("#3e8f3e"));
        jButton10.setForeground(Color.white);
        
        jButton11.setBackground(Color.decode("#3e8f3e"));
        jButton11.setForeground(Color.white);
        
        jButton12.setBackground(Color.decode("#3e8f3e"));
        jButton12.setForeground(Color.white);
        
        jButton13.setBackground(Color.decode("#3e8f3e"));
        jButton13.setForeground(Color.white);
        
        jButton14.setBackground(Color.decode("#3e8f3e"));
        jButton14.setForeground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jButton12.setText("jButton12");

        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(480, 650));
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(10, 100));

        jPanel1.setPreferredSize(new java.awt.Dimension(480, 650));

        jLabel1.setText("<html>VER GRÁFICA COMPARATIVA<br> DE INDICADORES DE SEMANA: </html>");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("TIPO DE MANTENIMIENTO");

        jButton1.setText("MANTENIMIENTO PREDICTIVO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MANTENIMIENTO PREVENTIVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MANTENIMIENTO CORRECTIVO PLANIFICADO Y PROGRAMADO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MANTENTENIMIENTO CORRECTIVO DE EMERGENCIA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("CUMPLIMIENTO DE LA PROGRAMACIÓN");

        jButton5.setText("POR ÓRDENES DE TRABAJO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("POR HORAS HOMBRE DE TRABAJO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("HORARIO DE TRABAJO");

        jButton7.setText("HORAS NORMALES");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("HORAS EXTRAS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("DESVIACIÓN");

        jButton9.setText("VARIACIÓN DE LAS ESTIMACIONES DE TIEMPO");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("PRODUCTIVIDAD");

        jButton10.setText("UTILIZACIÓN DE LA MANO DE OBRA");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("TIEMPO NO IDENTIFICADO");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("CALIDAD");

        jButton13.setText("RETRABAJO");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("TRABAJOS PENDIENTES");

        jButton14.setText("BACKLOG");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton9))
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel7)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton13)
                                .addGap(58, 58, 58)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton14)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(11, 11, 11)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addGap(17, 17, 17)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaMantPredictivo > 0){
            this.listGraficaMantPredictivo.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaMantPredictivo = 0;
        GraficaMantPredictivo manpredictivo = new GraficaMantPredictivo(this.semanas, this.mantpredictivo);
        this.listGraficaMantPredictivo.add(manpredictivo);
        this.numGraficaMantPredictivo++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        if(this.numGraficaMantPreventivo > 0){
            this.listGraficaMantPreventivo.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaMantPreventivo = 0;
        GraficaMantPreventivo manpreventivo = new GraficaMantPreventivo(this.semanas, this.mantpreventivo);
        this.listGraficaMantPreventivo.add(manpreventivo);
        this.numGraficaMantPreventivo++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaMantCorrectivoPP > 0){
            this.listGraficaMantCorrectivoPP.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaMantCorrectivoPP = 0;
        GraficaMantCorrectivoPP mancorrectivopp = new GraficaMantCorrectivoPP(this.semanas, this.mantcorrectivopr);
        this.listGraficaMantCorrectivoPP.add(mancorrectivopp);
        this.numGraficaMantCorrectivoPP++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaMantCorrectivoEM > 0){
            this.listGraficaMantCorrectivoEM.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaMantCorrectivoEM = 0;
        GraficaMantCorrectivoEM mancorrectivoem = new GraficaMantCorrectivoEM(this.semanas, this.mantcorrectivoem);
        this.listGraficaMantCorrectivoEM.add(mancorrectivoem);
        this.numGraficaMantCorrectivoEM++;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaOrdenesTrabajo > 0){
            this.listGraficaOrdenesTrabajo.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaOrdenesTrabajo = 0;
        GraficaOrdenesTrabajo ordenestrabaj = new GraficaOrdenesTrabajo(this.semanas, this.ordenestrabajo);
        this.listGraficaOrdenesTrabajo.add(ordenestrabaj);
        this.numGraficaOrdenesTrabajo++;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaHorasHombreTrabajo > 0){
            this.listGraficaHorasHombreTrabajo.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaHorasHombreTrabajo = 0;
        GraficaHorasHombreTrabajo horashombre = new GraficaHorasHombreTrabajo(this.semanas, this.horashombretrabajo);
        this.listGraficaHorasHombreTrabajo.add(horashombre);
        this.numGraficaHorasHombreTrabajo++;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaHorasNormales > 0){
            this.listGraficaHorasNormales.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaHorasNormales = 0;
        GraficaHorasNormales horasnormal = new GraficaHorasNormales(this.semanas, this.horasnormales);
        this.listGraficaHorasNormales.add(horasnormal);
        this.numGraficaHorasNormales++;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaHorasExtras > 0){
            this.listGraficaHorasExtras.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaHorasExtras = 0;
        GraficaHorasExtras horasExtras = new GraficaHorasExtras(this.semanas, this.horasextras);
        this.listGraficaHorasExtras.add(horasExtras);
        this.numGraficaHorasExtras++;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaVariacionTiempo > 0){
            this.listGraficaVariacionTiempo.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaVariacionTiempo = 0;
        GraficaVariacionTiempo VariacionTiempo = new GraficaVariacionTiempo(this.semanas, this.variacionn);
        this.listGraficaVariacionTiempo.add(VariacionTiempo);
        this.numGraficaVariacionTiempo++;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaUtilizacionManoObra > 0){
            this.listGraficaUtilizacionManoObra.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaUtilizacionManoObra = 0;
        GraficaUtilizacionManoObra UtilizacionManoObra = new GraficaUtilizacionManoObra(this.semanas, this.utilmanoobra);
        this.listGraficaUtilizacionManoObra.add(UtilizacionManoObra);
        this.numGraficaUtilizacionManoObra++;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaTiempoNoIdentificado > 0){
            this.listGraficaTiempoNoIdentificado.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaTiempoNoIdentificado = 0;
        GraficaTiempoNoIdentificado TiempoNoIdentificado = new GraficaTiempoNoIdentificado(this.semanas, this.tiempnoiden);
        this.listGraficaTiempoNoIdentificado.add(TiempoNoIdentificado);
        this.numGraficaTiempoNoIdentificado++;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaBacklog > 0){
            this.listGraficaBacklog.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaBacklog = 0;
        GraficaBacklog Backlog = new GraficaBacklog(this.semanas, this.backlogg);
        this.listGraficaBacklog.add(Backlog);
        this.numGraficaBacklog++;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(this.numGraficaRetrabajo > 0){
            this.listGraficaRetrabajo.forEach((a)->a.closeJFrame());
        }
            
        this.numGraficaRetrabajo = 0;
        GraficaRetrabajo Retrabajo = new GraficaRetrabajo(this.semanas, this.retrabajoo);
        this.listGraficaRetrabajo.add(Retrabajo);
        this.numGraficaRetrabajo++;
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarGraficasIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarGraficasIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarGraficasIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarGraficasIndicadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MostrarGraficasIndicadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
