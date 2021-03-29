package ticketgui;

public class ConcertTicketUI extends javax.swing.JFrame {

    public ConcertTicketUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TicketPackageBG = new javax.swing.ButtonGroup();
        TicketPackagePanel = new javax.swing.JPanel();
        btnMeetNGreet = new javax.swing.JRadioButton();
        btnPregame = new javax.swing.JRadioButton();
        btnVIP = new javax.swing.JRadioButton();
        PackageVersionTitle = new javax.swing.JLabel();
        TicketVersionPanel = new javax.swing.JPanel();
        cbMember = new javax.swing.JCheckBox();
        cbKids = new javax.swing.JCheckBox();
        spnMember = new javax.swing.JSpinner();
        spnKids = new javax.swing.JSpinner();
        spnAdult = new javax.swing.JSpinner();
        cbAdult = new javax.swing.JCheckBox();
        TicketVersionTitle = new javax.swing.JLabel();
        OrderTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrder = new javax.swing.JTextArea();
        btnSubmitOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TicketPackagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TicketPackageBG.add(btnMeetNGreet);
        btnMeetNGreet.setText("Meet N' Greet");
        btnMeetNGreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeetNGreetActionPerformed(evt);
            }
        });

        TicketPackageBG.add(btnPregame);
        btnPregame.setText("Pregame");
        btnPregame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregameActionPerformed(evt);
            }
        });

        TicketPackageBG.add(btnVIP);
        btnVIP.setText("VIP");
        btnVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TicketPackagePanelLayout = new javax.swing.GroupLayout(TicketPackagePanel);
        TicketPackagePanel.setLayout(TicketPackagePanelLayout);
        TicketPackagePanelLayout.setHorizontalGroup(
            TicketPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketPackagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TicketPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMeetNGreet)
                    .addComponent(btnPregame)
                    .addComponent(btnVIP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TicketPackagePanelLayout.setVerticalGroup(
            TicketPackagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketPackagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMeetNGreet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPregame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVIP)
                .addContainerGap())
        );

        PackageVersionTitle.setText("Packages");

        TicketVersionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbMember.setText("Member");
        cbMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMemberActionPerformed(evt);
            }
        });

        cbKids.setText("Kids");

        spnMember.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        spnKids.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        spnKids.setMaximumSize(new java.awt.Dimension(20, 20));
        spnKids.setMinimumSize(new java.awt.Dimension(1, 1));

        spnAdult.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        cbAdult.setText("Adult");
        cbAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TicketVersionPanelLayout = new javax.swing.GroupLayout(TicketVersionPanel);
        TicketVersionPanel.setLayout(TicketVersionPanelLayout);
        TicketVersionPanelLayout.setHorizontalGroup(
            TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketVersionPanelLayout.createSequentialGroup()
                .addGroup(TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TicketVersionPanelLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(cbAdult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TicketVersionPanelLayout.createSequentialGroup()
                        .addGroup(TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TicketVersionPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cbMember)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TicketVersionPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbKids)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnMember, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(spnKids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(54, 54, 54))
        );
        TicketVersionPanelLayout.setVerticalGroup(
            TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketVersionPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAdult))
                .addGap(18, 18, 18)
                .addGroup(TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMember))
                .addGap(18, 18, 18)
                .addGroup(TicketVersionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnKids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKids))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        TicketVersionTitle.setText("Ticket Versions");

        OrderTitle.setText("Order");

        txtOrder.setColumns(20);
        txtOrder.setRows(5);
        jScrollPane1.setViewportView(txtOrder);

        btnSubmitOrder.setText("Submit Order");
        btnSubmitOrder.setToolTipText("");
        btnSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TicketPackagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PackageVersionTitle)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OrderTitle)
                        .addGap(194, 194, 194))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TicketVersionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(TicketVersionTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(OrderTitle)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(PackageVersionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TicketPackagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(TicketVersionTitle)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TicketVersionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMemberActionPerformed

    private void btnMeetNGreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeetNGreetActionPerformed

    }//GEN-LAST:event_btnMeetNGreetActionPerformed

    private void btnSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrderActionPerformed
        
        //Assign bev to which option was selected
        
        AbOptions bev;
        
        if (btnPregame.isSelected()){  //If Pregame option is selected
            bev = new Pregame();
        }
        
        else if (btnMeetNGreet.isSelected()){ //If Meet N' Greet option is selected
            bev = new MeetNGreet();
        }
        
        else if (btnVIP.isSelected()){ //If VIP option is selected
            bev = new VIP();
        }
        
        else {
            bev = new Other(); //If no option is selected
        }
        
        

        
        //If they haven't selected any Decorators
        
        if(!cbMember.isSelected() == true && !cbKids.isSelected() == true && !cbAdult.isSelected() == true){
            
            txtOrder.setText(" " + bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
            
        }
        
        //If they only chose Member
        
        if(cbMember.isSelected() && !cbKids.isSelected() == true && !cbAdult.isSelected() == true){
            
          //If Pregame option is selected
            
            int MemberSpinValue = (Integer) spnMember.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < MemberSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Member(bev); //Creating ticket version object
                
                txtOrder.setText(" " + bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
            }
        }
        
        // If they only chose Kids
        
        if(cbKids.isSelected() && !cbMember.isSelected() == true && !cbAdult.isSelected() == true){
            
            //Calculates quantity selected
            
            int KidsSpinValue = (Integer) spnKids.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < KidsSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Kids(bev); //Creating ticket version object
                
                txtOrder.setText(" " + bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
            }
        }
        
        // If they only chose Adult
        
        if(!cbKids.isSelected() && !cbMember.isSelected() == true && cbAdult.isSelected() == true){
            
            //Calculates quantity selected
            
            int AdultSpinValue = (Integer) spnAdult.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < AdultSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Adult(bev); //Creating ticket version object
                
                txtOrder.setText(" " + bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
            }
        }
        
        //If Member/Kids are selected
        
        if(cbMember.isSelected() && cbKids.isSelected() && !cbAdult.isSelected() == true){
            
            int MemberSpinValue = (Integer) spnMember.getValue(); //Getting value from JSpinner
            
            //Calculates quantity of Members selected
            
            for(int i = 0; i < MemberSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Member(bev); //Creating ticket version object
            }
            
            //Calculates quantity of Kids selected
            
            int KidsSpinValue = (Integer) spnKids.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < KidsSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Kids(bev); //Creating ticket version object
            }
            
            txtOrder.setText(bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
        }
        
        //If Member/Adult are selected
        
        if(cbMember.isSelected() && cbAdult.isSelected() && !cbKids.isSelected() == true){
            int MemberSpinValue = (Integer) spnMember.getValue();
            
            //Calculates quantity of Members selected
            
            for(int i = 0; i < MemberSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Member(bev); //Creating ticket version object
            }
            
            //Calculates quantity of Adults selected
            
            int AdultSpinValue = (Integer) spnAdult.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < AdultSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Adult(bev); //Creating ticket version object
            }
            
            txtOrder.setText(bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
        }
        
        //If Kids/Adult are selected
        
        if(cbKids.isSelected() && cbAdult.isSelected() && !cbMember.isSelected() == true){
            
            int KidsSpinValue = (Integer) spnKids.getValue(); //Getting value from JSpinner
            
            //Calculates quantity of Members selected
            
            for(int i = 0; i < KidsSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Kids(bev); //Creating ticket version object
            }
            
            //Calculates quantity of Adults selected
            
            int AdultSpinValue = (Integer) spnAdult.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < AdultSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Adult(bev); //Creating ticket version object
            }
            
            txtOrder.setText(bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
        }
        
        //If Kids/Adult/Member are selected
        
        if(cbKids.isSelected() && cbAdult.isSelected() && cbMember.isSelected()){
            
            int KidsSpinValue = (Integer) spnKids.getValue(); //Getting value from JSpinner
            
            //Calculates quantity of Members selected
            
            for(int i = 0; i < KidsSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Kids(bev); //Creating ticket version object
            }
            
            //Calculates quantity of Adults selected
            
            int AdultSpinValue = (Integer) spnAdult.getValue(); //Getting value from JSpinner
            
            for(int i = 0; i < AdultSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Adult(bev); //Creating ticket version object
            }
            int MemberSpinValue = (Integer) spnMember.getValue(); //Getting value from JSpinner
            
            //Calculates quantity of Members selected
            
            for(int i = 0; i < MemberSpinValue; i++){ //For loop using value in JSpinner, used to create multiple objects
                
                bev = new Member(bev); //Creating ticket version object
            }
            
            txtOrder.setText(bev.getDescription() + " " + bev.cost()); //Changes text in txtOrder box
        }
        
    }//GEN-LAST:event_btnSubmitOrderActionPerformed

    private void btnPregameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPregameActionPerformed

    private void btnVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVIPActionPerformed

    private void cbAdultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdultActionPerformed


    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConcertTicketUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OrderTitle;
    private javax.swing.JLabel PackageVersionTitle;
    private javax.swing.ButtonGroup TicketPackageBG;
    private javax.swing.JPanel TicketPackagePanel;
    private javax.swing.JPanel TicketVersionPanel;
    private javax.swing.JLabel TicketVersionTitle;
    private javax.swing.JRadioButton btnMeetNGreet;
    private javax.swing.JRadioButton btnPregame;
    private javax.swing.JButton btnSubmitOrder;
    private javax.swing.JRadioButton btnVIP;
    private javax.swing.JCheckBox cbAdult;
    private javax.swing.JCheckBox cbKids;
    private javax.swing.JCheckBox cbMember;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnAdult;
    private javax.swing.JSpinner spnKids;
    private javax.swing.JSpinner spnMember;
    private javax.swing.JTextArea txtOrder;
    // End of variables declaration//GEN-END:variables
}
