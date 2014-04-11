package daa_assignment;

import java.awt.Color;
//DIT10c1-0145
//Learn how to use Threds
//http://www.roseindia.net/java/java-methods/java-method-wait.shtml
public class BubbleSort extends javax.swing.JFrame {

    public BubbleSort() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt0 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        txtPass = new javax.swing.JTextField();
        txtTemp = new javax.swing.JTextField();
        txtI = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14));

        txt0.setBackground(new java.awt.Color(0, 0, 0));
        txt0.setFont(new java.awt.Font("Tahoma", 1, 11));
        txt0.setForeground(new java.awt.Color(255, 255, 255));
        txt0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt0.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt0.setEnabled(false);
        txt0.setSelectionColor(new java.awt.Color(0, 0, 0));

        txt1.setBackground(new java.awt.Color(0, 0, 0));
        txt1.setFont(new java.awt.Font("Tahoma", 1, 11));
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt1.setEnabled(false);

        txt2.setBackground(new java.awt.Color(0, 0, 0));
        txt2.setFont(new java.awt.Font("Tahoma", 1, 11));
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt2.setEnabled(false);

        txt3.setBackground(new java.awt.Color(0, 0, 0));
        txt3.setFont(new java.awt.Font("Tahoma", 1, 11));
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt3.setEnabled(false);

        txt4.setBackground(new java.awt.Color(0, 0, 0));
        txt4.setFont(new java.awt.Font("Tahoma", 1, 11));
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt4.setEnabled(false);

        txt5.setBackground(new java.awt.Color(0, 0, 0));
        txt5.setFont(new java.awt.Font("Tahoma", 1, 11));
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt5.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("Bubble Sort");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Get an Array and Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 24));
        label1.setText("pass");

        label2.setFont(new java.awt.Font("Dialog", 1, 24));
        label2.setText("i");

        label3.setFont(new java.awt.Font("Dialog", 1, 24));
        label3.setText("temp");

        txtPass.setEditable(false);
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtTemp.setEditable(false);
        txtTemp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTemp.setText(" ");

        txtI.setEditable(false);
        txtI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtI.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtPass))
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 14));

        jTextField14.setBackground(new java.awt.Color(153, 153, 153));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField14.setEnabled(false);

        jTextField15.setBackground(new java.awt.Color(153, 153, 153));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField15.setEnabled(false);

        jTextField16.setBackground(new java.awt.Color(153, 153, 153));
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField16.setEnabled(false);

        jTextField17.setBackground(new java.awt.Color(153, 153, 153));
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField17.setEnabled(false);

        jTextField18.setBackground(new java.awt.Color(153, 153, 153));
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField18.setEnabled(false);

        jTextField19.setBackground(new java.awt.Color(153, 153, 153));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 11));
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField19.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setBackground(java.awt.Color.green);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("Sorting In Progress");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-590)/2, (screenSize.height-605)/2, 590, 605);
    }// </editor-fold>//GEN-END:initComponents


  public void setColor()
  {     //DIT10c1-0145
        txt1.setBackground(Color.black);
        txt0.setBackground(Color.black);
        txt2.setBackground(Color.black);
        txt3.setBackground(Color.black);
        txt4.setBackground(Color.black);
        txt5.setBackground(Color.black);


  }

public void clear()
{          //DIT10c1-0145
           jTextField14.setText("");
           jTextField15.setText("");
           jTextField16.setText("");
           jTextField17.setText("");
           jTextField18.setText("");
           jTextField19.setText("");



}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setEnabled(false);
        setColor();
        clear();

        new Thread() {

            public void run() {
                try {

                    int[] array = new int[6];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (java.lang.Math.random() * 100);
                    }
                   
                    jTextField14.setText(Integer.toString(array[0]));
                    jTextField15.setText(Integer.toString(array[1]));
                    jTextField16.setText(Integer.toString(array[2]));
                    jTextField17.setText(Integer.toString(array[3]));
                    jTextField18.setText(Integer.toString(array[4]));
                    jTextField19.setText(Integer.toString(array[5]));


                    txt0.setText(Integer.toString(array[0]));
                    txt1.setText(Integer.toString(array[1]));
                    txt2.setText(Integer.toString(array[2]));
                    txt3.setText(Integer.toString(array[3]));
                    txt4.setText(Integer.toString(array[4]));
                    txt5.setText(Integer.toString(array[5]));

                   
                    int temp;

                   
                    for (int pass = 1; pass <= (array.length); pass++)
                    {
                        txtPass.setText(pass + "");
                        if (txtPass.getText().equals("6")) {
                            jButton1.setEnabled(true);
                        }

                        for (int i = 0; i < (array.length - pass); i++)
                        {    
                             txtI.setText(i + "");
                             Wait.manySec(1);

                             if(i==0)
                                {
                                 //DIT10c1-0145
                                  txt0.setBackground(Color.blue);
                                  txt1.setBackground(Color.blue);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);

                                }
                                if(i==1)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.blue);
                                  txt2.setBackground(Color.blue);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);

                                }
                                if(i==2)
                                {
                              
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.blue);
                                  txt3.setBackground(Color.blue);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);

                                }
                                if(i==3)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.blue);
                                  txt4.setBackground(Color.blue);
                                  txt5.setBackground(Color.black);

                                }
                                if(i==4)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.blue);
                                  txt5.setBackground(Color.blue);

                                }


                            if (array[i] > array[i + 1])
                            {
                              
                                temp = array[i];
                                txtTemp.setText(temp + "");
                                Wait.manySec(1);

                                array[i] = array[i + 1];

                                if(i==0)
                                {
                                  txt0.setBackground(Color.blue);
                                  txt1.setBackground(Color.blue);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);

                                  Wait.manySec(1);

                                  txt0.setText(array[i+1]+"");
                                }
                                if(i==1)
                                {
                               
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.blue);
                                  txt2.setBackground(Color.blue);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);

                                  Wait.manySec(1);

                                  txt1.setText(array[i+1]+"");
                                }
                                if(i==2)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.blue);
                                  txt3.setBackground(Color.blue);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);
                                   Wait.manySec(1);
                                  txt2.setText(array[i+1]+"");
                                }
                                if(i==3)
                                {
                                
                                   txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.blue);
                                  txt4.setBackground(Color.blue);
                                  txt5.setBackground(Color.black);
                                   Wait.manySec(1);
                                   txt3.setText(array[i+1]+"");
                                }
                                if(i==4)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.blue);
                                  txt5.setBackground(Color.blue);

                                    Wait.manySec(1);

                                   txt4.setText(array[i+1]+"");

                                }

                                Wait.manySec(1);
                                array[i + 1] = temp;

                                if(i==0)
                                {
                                  txt0.setBackground(Color.blue);
                                  txt1.setBackground(Color.blue);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);
                               
                                    txt1.setText(temp+"");
                                }
                                if(i==1)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.blue);
                                  txt2.setBackground(Color.blue);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);

                                   txt2.setText(temp+"");
                                }
                                if(i==2)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.blue);
                                  txt3.setBackground(Color.blue);
                                  txt4.setBackground(Color.black);
                                  txt5.setBackground(Color.black);
                                    txt3.setText(temp+"");

                                }
                                if(i==3)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.blue);
                                  txt4.setBackground(Color.blue);
                                  txt5.setBackground(Color.black);
                                 
                                  txt4.setText(temp+"");

                                }
                                if(i==4)
                                {
                                  txt0.setBackground(Color.black);
                                  txt1.setBackground(Color.black);
                                  txt2.setBackground(Color.black);
                                  txt3.setBackground(Color.black);
                                  txt4.setBackground(Color.blue);
                                  txt5.setBackground(Color.blue);

                                   txt5.setText(temp+"");

                                }

                        }


                    }
                    
                    }
                   setColor();
                  jTextField1.setBackground(Color.gray);
                  jTextField1.setText("  Array Sorted    ");
                  jButton1.setEnabled(true);
       
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }.start();


//DIT10c1-0145

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
//DIT10c1-0145
            public void run() {
                new BubbleSort().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextField txt0;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txtI;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
//DIT10c1-0145