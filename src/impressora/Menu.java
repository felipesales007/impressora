package impressora;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame
{
    public Menu() 
    {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelFundo = new javax.swing.JPanel();
        PainelFrente = new javax.swing.JPanel();
        btn_branca = new javax.swing.JButton();
        btn_vermelha = new javax.swing.JButton();
        ImagemHSR = new javax.swing.JLabel();
        ImagemImpressora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Impressão");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PainelFundo.setBackground(new java.awt.Color(204, 204, 204));

        PainelFrente.setBackground(new java.awt.Color(204, 204, 204));

        btn_branca.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_branca.setText("BRANCA");
        btn_branca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_brancaActionPerformed(evt);
            }
        });

        btn_vermelha.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_vermelha.setText("VERMELHA");
        btn_vermelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vermelhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelFrenteLayout = new javax.swing.GroupLayout(PainelFrente);
        PainelFrente.setLayout(PainelFrenteLayout);
        PainelFrenteLayout.setHorizontalGroup(
            PainelFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFrenteLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btn_branca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_vermelha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        PainelFrenteLayout.setVerticalGroup(
            PainelFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFrenteLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PainelFrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_branca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vermelha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        ImagemHSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impressora/HSR.jpg"))); // NOI18N

        ImagemImpressora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impressora/Impressora.png"))); // NOI18N

        javax.swing.GroupLayout PainelFundoLayout = new javax.swing.GroupLayout(PainelFundo);
        PainelFundo.setLayout(PainelFundoLayout);
        PainelFundoLayout.setHorizontalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagemImpressora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagemHSR)
                .addContainerGap())
        );
        PainelFundoLayout.setVerticalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagemHSR)
                    .addComponent(ImagemImpressora, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_brancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_brancaActionPerformed
        btn_branca.setEnabled(false);
        btn_vermelha.setEnabled(true);
        PainelFrente.setBackground(Color.WHITE);
        
        try 
        {
            Runtime.getRuntime().exec("C:\\Impressora\\Etiqueta Branca.bat");
        } catch (IOException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_brancaActionPerformed

    private void btn_vermelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vermelhaActionPerformed
        btn_vermelha.setEnabled(false);
        btn_branca.setEnabled(true);
        PainelFrente.setBackground(Color.RED);
        
        try 
        {
            Runtime.getRuntime().exec("C:\\Impressora\\Etiqueta Vermelha.bat");
        } catch (IOException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_vermelhaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try 
        {
            Runtime.getRuntime().exec("C:\\Impressora\\Delete.bat");
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
            try 
            {
                Thread.sleep(3*1000);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemHSR;
    private javax.swing.JLabel ImagemImpressora;
    private javax.swing.JPanel PainelFrente;
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JButton btn_branca;
    private javax.swing.JButton btn_vermelha;
    // End of variables declaration//GEN-END:variables

    private void setIcon() 
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icone.png")));
    }
}