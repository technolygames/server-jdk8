package gui.frame;

import classes.userClasses.serverGUIAppearance;
import gui.panel.svConfigPanel;
import gui.panel.svReceiverPanel;
import gui.panel.svSenderPanel;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.InetAddress;
import javax.swing.JOptionPane;

public class mainFrame extends javax.swing.JFrame{
    public mainFrame(){
        initComponents();
        
        new serverGUIAppearance(System.getProperty("user.dir")+"/data/config/config.properties").LookAndFeel(this);
        botones();
        
        setSize(435,345);
        pack();
    }
    
    protected final void botones(){
        closeButton.addActionListener((a)->{
            System.exit(0);
        });
        
        miConfigServer.addActionListener((a)->{
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(new svConfigPanel(),BorderLayout.CENTER);
            this.pack();
        });
        
        miServer.addActionListener((a)->{
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(new svReceiverPanel(),BorderLayout.CENTER);
            this.pack();
        });
        
        miSendData.addActionListener((a)->{
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(new svSenderPanel(),BorderLayout.CENTER);
            this.pack();
        });
        
        miAddress.addActionListener((a)->{
            try{
                JOptionPane.showMessageDialog(null,InetAddress.getLocalHost().getHostAddress());
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error:\n"+e.getMessage()+"\nCausado por:\n"+e.getCause());
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miConfigServer = new javax.swing.JMenuItem();
        miServer = new javax.swing.JMenuItem();
        miSendData = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAddress = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton.setText("Cerrar programa");

        jMenu1.setText("Ventanas");

        miConfigServer.setText("Configurar servidor");
        jMenu1.add(miConfigServer);

        miServer.setText("Servidor");
        jMenu1.add(miServer);

        miSendData.setText("Enviar datos");
        jMenu1.add(miSendData);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Extra");

        miAddress.setText("IP del equipo");
        jMenu2.add(miAddress);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miAddress;
    private javax.swing.JMenuItem miConfigServer;
    private javax.swing.JMenuItem miSendData;
    private javax.swing.JMenuItem miServer;
    // End of variables declaration//GEN-END:variables
}