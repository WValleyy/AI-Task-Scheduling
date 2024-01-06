package sleepingbarber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Session extends javax.swing.JFrame{
    private boolean[] Busy, waiting;
    private final int MaxSleep = 5;
    private final int MaxBusy = 5;
    private final int Waiting = 6;
    private static int noOfBarbers, noOfCustomers, noOfChairs;
    public Session(int noOfBarbers, int noOfCustomers, int noOfChairs) {
        initComponents();
        this.noOfBarbers = noOfBarbers;
        this.noOfCustomers = noOfCustomers;
        this.noOfChairs = noOfChairs;
        Busy = new boolean[this.noOfBarbers];
        waiting = new boolean[this.noOfChairs];

        for (int i = this.noOfBarbers; i < (MaxSleep + MaxBusy); i++) {
            BarbersPanel.getComponent(i).setVisible(false);
        }

        for (int i = 0; i < Waiting; i++) {
            WaitPanel.getComponent(i).setVisible(false);
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

        BarbersText = new javax.swing.JLabel();
        WaitingText = new javax.swing.JLabel();
        BarbersPanel = new javax.swing.JPanel();
        sleepBarber1 = new javax.swing.JLabel();
        sleepBarber2 = new javax.swing.JLabel();
        sleepBarber3 = new javax.swing.JLabel();
        sleepBarber4 = new javax.swing.JLabel();
        sleepBarber5 = new javax.swing.JLabel();
        Busy1 = new javax.swing.JLabel();
        Busy2 = new javax.swing.JLabel();
        Busy3 = new javax.swing.JLabel();
        Busy4 = new javax.swing.JLabel();
        Busy5 = new javax.swing.JLabel();
        WaitPanel = new javax.swing.JPanel();
        waiting1 = new javax.swing.JLabel();
        waiting2 = new javax.swing.JLabel();
        waiting3 = new javax.swing.JLabel();
        waiting4 = new javax.swing.JLabel();
        waiting5 = new javax.swing.JLabel();
        waiting6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BarbersText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BarbersText.setForeground(new java.awt.Color(255, 0, 0));
        BarbersText.setText("All Barbers are sleeping");
        getContentPane().add(BarbersText);
        BarbersText.setBounds(110, 200, 550, 80);

        WaitingText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        WaitingText.setForeground(new java.awt.Color(255, 0, 0));
        WaitingText.setText("waiting chairs are available");
        getContentPane().add(WaitingText);
        WaitingText.setBounds(100, 420, 430, 50);

        BarbersPanel.setLayout(null);

        sleepBarber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepBarber1.setText("jLabel5");
        BarbersPanel.add(sleepBarber1);
        sleepBarber1.setBounds(0, 0, 170, 150);

        sleepBarber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepBarber2.setText("jLabel5");
        BarbersPanel.add(sleepBarber2);
        sleepBarber2.setBounds(170, 0, 170, 150);

        sleepBarber3.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepBarber3.setText("jLabel5");
        BarbersPanel.add(sleepBarber3);
        sleepBarber3.setBounds(340, 0, 170, 150);

        sleepBarber4.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepBarber4.setText("jLabel5");
        BarbersPanel.add(sleepBarber4);
        sleepBarber4.setBounds(510, 0, 170, 150);

        sleepBarber5.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepBarber5.setText("jLabel5");
        BarbersPanel.add(sleepBarber5);
        sleepBarber5.setBounds(680, 0, 170, 150);

        Busy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("cuthair.jpg"))); // NOI18N
        Busy1.setText("jLabel2");
        BarbersPanel.add(Busy1);
        Busy1.setBounds(0, 0, 170, 150);

        Busy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("cuthair.jpg"))); // NOI18N
        Busy2.setText("jLabel2");
        BarbersPanel.add(Busy2);
        Busy2.setBounds(170, 0, 170, 150);

        Busy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("cuthair.jpg"))); // NOI18N
        Busy3.setText("jLabel2");
        BarbersPanel.add(Busy3);
        Busy3.setBounds(340, 0, 170, 150);

        Busy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("cuthair.jpg"))); // NOI18N
        Busy4.setText("jLabel2");
        BarbersPanel.add(Busy4);
        Busy4.setBounds(510, 0, 170, 150);

        Busy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("cuthair.jpg"))); // NOI18N
        Busy5.setText("jLabel2");
        BarbersPanel.add(Busy5);
        Busy5.setBounds(680, 0, 170, 150);

        getContentPane().add(BarbersPanel);
        BarbersPanel.setBounds(10, 30, 850, 150);

        WaitPanel.setLayout(null);

        waiting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting1.setText("jLabel2");
        WaitPanel.add(waiting1);
        waiting1.setBounds(0, 0, 140, 110);

        waiting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting2.setText("jLabel2");
        WaitPanel.add(waiting2);
        waiting2.setBounds(140, 0, 140, 110);

        waiting3.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting3.setText("jLabel2");
        WaitPanel.add(waiting3);
        waiting3.setBounds(280, 0, 140, 110);

        waiting4.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting4.setText("jLabel2");
        WaitPanel.add(waiting4);
        waiting4.setBounds(420, 0, 140, 110);

        waiting5.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting5.setText("jLabel2");
        WaitPanel.add(waiting5);
        waiting5.setBounds(560, 0, 140, 110);

        waiting6.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting6.setText("jLabel2");
        WaitPanel.add(waiting6);
        waiting6.setBounds(700, 0, 140, 110);

        getContentPane().add(WaitPanel);
        WaitPanel.setBounds(10, 290, 840, 110);

        //jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepingta/BackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-9, 0, 980, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//       Session form = new Session(noOfTAs, noOfStudents, noOfChairs);
//       SleepingTA s = new SleepingTA(noOfStudents, noOfChairs, noOfTAs);
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
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Session(noOfTAs, noOfStudents, noOfChairs).setVisible(true);
//
//        }
//        });




    }

    public void BusyBarber(int Barber_Id){
        try {

            Thread.sleep(500);
            Busy[Barber_Id - 1] = true;
            BarbersPanel.getComponent( Barber_Id - 1 ).setVisible(false);
            BarbersPanel.getComponent( Barber_Id + MaxSleep - 1 ).setVisible(true);
            int c = getBusyBarber();
            if (c == noOfBarbers) {
                BarbersText.setText("All Barbers are Busy");
            }
            else if (c == 0){
                BarbersText.setText("All Barbers are available");
            }
            else{
                BarbersText.setText(c + " Barbers are Busy, " +(noOfBarbers - c)
                        +" Barbers are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SleepBarber(int Barber_Id){

        try {
            Thread.sleep(500);
            Busy[Barber_Id - 1] = false;
            BarbersPanel.getComponent( Barber_Id - 1 ).setVisible(true);
            BarbersPanel.getComponent( Barber_Id + MaxSleep - 1 ).setVisible(false);
            int c = getBusyBarber();
            if (c == noOfBarbers) {
                BarbersText.setText("All Barbers are Busy");
            }
            else if (c == 0){
                BarbersText.setText("All Barbers are available");
            }
            else{
                BarbersText.setText(c + " Barbers are Busy, " +(noOfBarbers - c)
                        +" Barbers are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void TakeChair() throws InterruptedException{

        for (int i = 0; i < noOfChairs; i++) {
            if (!waiting[i]) {
                waiting[i] = true;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(true);
                int c = getWaitingChairs();
                if (c == noOfChairs) {
                    WaitingText.setText("There is no Chair available");
                }
                else if(c == 0){
                    WaitingText.setText("All Chairs are available");
                }
                else{
                    WaitingText.setText(c + " Chairs are Taken, " +(noOfChairs - c)
                            +" Chairs are available");
                }
            }
        }
    }

    public void ReturnChair(int Barber_Id) throws InterruptedException{

        for (int i = 0; i < noOfChairs; i++) {
            if (waiting[i]) {
                waiting[i] = false;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(false);
                int c = getWaitingChairs();
                if (c == noOfChairs) {
                    WaitingText.setText("There is no Chair available");
                }
                else if(c == 0){
                    WaitingText.setText("All Chairs are available");
                }
                else{
                    WaitingText.setText(c + " Chairs are Taken, " +(noOfChairs - c)
                            +" Chairs are available");
                }
            }
        }
    }


    public int getBusyBarber(){
        int c = 0;
        for (int i = 0; i < noOfBarbers; i++) {
            if (Busy[i]) {
                c++;
            }

        }
        return c;
    }

    public int getWaitingChairs(){
        int c = 0;
        for (int i = 0; i < noOfChairs; i++) {
            if (waiting[i]) {
                c++;
            }

        }
        return c;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Busy1;
    private javax.swing.JLabel Busy2;
    private javax.swing.JLabel Busy3;
    private javax.swing.JLabel Busy4;
    private javax.swing.JLabel Busy5;
    private javax.swing.JPanel BarbersPanel;
    private javax.swing.JLabel BarbersText;
    private javax.swing.JPanel WaitPanel;
    private javax.swing.JLabel WaitingText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel sleepBarber1;
    private javax.swing.JLabel sleepBarber2;
    private javax.swing.JLabel sleepBarber3;
    private javax.swing.JLabel sleepBarber4;
    private javax.swing.JLabel sleepBarber5;
    private javax.swing.JLabel waiting1;
    private javax.swing.JLabel waiting2;
    private javax.swing.JLabel waiting3;
    private javax.swing.JLabel waiting4;
    private javax.swing.JLabel waiting5;
    private javax.swing.JLabel waiting6;
    // End of variables declaration//GEN-END:variables
}
