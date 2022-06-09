package ventanas;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.InetAddress;
import javax.swing.JOptionPane;
import paneles.serverConfig;
import paneles.serverPanel;
import paneles.serverSender;

public class sendFiles extends javax.swing.JFrame{
    public sendFiles(){
        initComponents();
        
        setResizable(false);
        botones();
    }
    
    protected final void botones(){
        closeButton.addActionListener((a)->{
            System.exit(0);
        });
        
        miConfigServer.addActionListener((a)->{
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(new serverConfig(),BorderLayout.CENTER);
            pack();
        });
        
        miServer.addActionListener((a)->{
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(new serverPanel(),BorderLayout.CENTER);
            pack();
        });
        
        miSendData.addActionListener((a)->{
            this.getContentPane().setLayout(new BorderLayout());
            this.getContentPane().add(new serverSender(),BorderLayout.CENTER);
            pack();
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
        panelMenu = new javax.swing.JMenu();
        miConfigServer = new javax.swing.JMenuItem();
        miServer = new javax.swing.JMenuItem();
        miSendData = new javax.swing.JMenuItem();
        extraMenu = new javax.swing.JMenu();
        miAddress = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton.setText("Cerrar programa");

        panelMenu.setText("Ventanas");

        miConfigServer.setText("Configurar servidor");
        panelMenu.add(miConfigServer);

        miServer.setText("Servidor");
        panelMenu.add(miServer);

        miSendData.setText("Enviar datos");
        panelMenu.add(miSendData);

        jMenuBar1.add(panelMenu);

        extraMenu.setText("Extra");

        miAddress.setText("IP del equipo");
        extraMenu.add(miAddress);

        jMenuBar1.add(extraMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]){
        new sendFiles().setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JMenu extraMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miAddress;
    private javax.swing.JMenuItem miConfigServer;
    private javax.swing.JMenuItem miSendData;
    private javax.swing.JMenuItem miServer;
    private javax.swing.JMenu panelMenu;
    // End of variables declaration//GEN-END:variables
}