/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package midterm;

import java.text.DecimalFormat;

/**
 *
 * @author marky
 */
public class Calculator extends javax.swing.JFrame {

   double NumEnter1;
   double NumEnter2;
   double Result;
   String op;
   private static final DecimalFormat df = new DecimalFormat("0.00");
  private boolean operatorTyped = false;
  private boolean decimalAdded = false; 
  private boolean operate = false;
    public Calculator() {
        initComponents();
        eq.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
      public void calculate(){
      String expression = eq.getText();
    try {
        double result = evaluateExpression(expression);
        String formattedResult;

        if (result == (int) result) {
            formattedResult = String.format("%d", (int) result);
        } else {
            formattedResult = String.format("%.2f", result);
        }

         
        Ans.setText(formattedResult);
    } catch (Exception ex) {
       eq.setText("");
    }
   
 }
  private boolean isOperator(String input) {
    return "+-*/".contains(input);
 }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Ans = new javax.swing.JTextField();
        dot = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        div = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        bnt7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        min = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        del = new javax.swing.JButton();
        eq = new javax.swing.JTextField();
        neg = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        show = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        Ans.setBackground(new java.awt.Color(0, 0, 0));
        Ans.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ans, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ans, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 380, 70);

        dot.setBackground(new java.awt.Color(153, 102, 0));
        dot.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        dot.setForeground(new java.awt.Color(255, 255, 255));
        dot.setText(".");
        dot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });
        jPanel1.add(dot);
        dot.setBounds(210, 340, 70, 50);

        btn1.setBackground(new java.awt.Color(153, 102, 0));
        btn1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(30, 280, 70, 50);

        btn2.setBackground(new java.awt.Color(153, 102, 0));
        btn2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(120, 280, 70, 50);

        div.setBackground(new java.awt.Color(255, 153, 51));
        div.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        div.setForeground(new java.awt.Color(255, 255, 255));
        div.setText("÷");
        div.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel1.add(div);
        div.setBounds(300, 340, 70, 50);

        btn4.setBackground(new java.awt.Color(153, 102, 0));
        btn4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(30, 220, 70, 50);

        btn5.setBackground(new java.awt.Color(153, 102, 0));
        btn5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(120, 220, 70, 50);

        btn6.setBackground(new java.awt.Color(153, 102, 0));
        btn6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(210, 220, 70, 50);

        bnt7.setBackground(new java.awt.Color(153, 102, 0));
        bnt7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bnt7.setForeground(new java.awt.Color(255, 255, 255));
        bnt7.setText("7");
        bnt7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt7ActionPerformed(evt);
            }
        });
        jPanel1.add(bnt7);
        bnt7.setBounds(30, 160, 70, 50);

        btn8.setBackground(new java.awt.Color(153, 102, 0));
        btn8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);
        btn8.setBounds(120, 160, 70, 50);

        btn9.setBackground(new java.awt.Color(153, 102, 0));
        btn9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);
        btn9.setBounds(210, 160, 70, 50);

        btn0.setBackground(new java.awt.Color(153, 102, 0));
        btn0.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);
        btn0.setBounds(120, 340, 70, 50);

        btn3.setBackground(new java.awt.Color(153, 102, 0));
        btn3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(210, 280, 70, 50);

        plus.setBackground(new java.awt.Color(255, 153, 51));
        plus.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus);
        plus.setBounds(300, 160, 70, 50);

        min.setBackground(new java.awt.Color(255, 153, 51));
        min.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setText("-");
        min.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        jPanel1.add(min);
        min.setBounds(300, 220, 70, 50);

        mul.setBackground(new java.awt.Color(255, 153, 51));
        mul.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mul.setForeground(new java.awt.Color(255, 255, 255));
        mul.setText("×");
        mul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });
        jPanel1.add(mul);
        mul.setBounds(300, 280, 70, 50);

        del.setBackground(new java.awt.Color(255, 0, 51));
        del.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("del");
        del.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel1.add(del);
        del.setBounds(120, 400, 70, 50);
        jPanel1.add(eq);
        eq.setBounds(20, 100, 360, 30);

        neg.setBackground(new java.awt.Color(255, 0, 51));
        neg.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        neg.setForeground(new java.awt.Color(255, 255, 255));
        neg.setText("+/-");
        neg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negActionPerformed(evt);
            }
        });
        jPanel1.add(neg);
        neg.setBounds(30, 340, 70, 50);

        equal.setBackground(new java.awt.Color(255, 102, 0));
        equal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setText("=");
        equal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel1.add(equal);
        equal.setBounds(300, 400, 70, 50);

        jButton28.setBackground(new java.awt.Color(102, 102, 102));
        jButton28.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Base N");
        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);
        jButton28.setBounds(210, 400, 70, 50);

        clr.setBackground(new java.awt.Color(255, 0, 51));
        clr.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        clr.setForeground(new java.awt.Color(255, 255, 255));
        clr.setText("CLR");
        clr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        jPanel1.add(clr);
        clr.setBounds(30, 400, 70, 50);

        show.setBackground(new java.awt.Color(51, 51, 51));
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setText("show equation");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show);
        show.setBounds(150, 130, 120, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void EnterNumbers(String q){
    String Nums = Ans.getText()+q;
    Ans.setText(Nums);
}
    private void bnt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt7ActionPerformed
    EnterNumbers("7");
     eq.setText(eq.getText() + "7");
        operate = false;
    }//GEN-LAST:event_bnt7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
      EnterNumbers("8");
       eq.setText(eq.getText() + "8");
        operate = false;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
     EnterNumbers("9");
      eq.setText(eq.getText() + "9");
        operate = false;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
     EnterNumbers("4");
      eq.setText(eq.getText() + "4");
        operate = false;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
     EnterNumbers("5");
      eq.setText(eq.getText() + "5");
        operate = false;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
     EnterNumbers("6");
      eq.setText(eq.getText() + "6");
        operate = false;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
    EnterNumbers("1");
     eq.setText(eq.getText() + "1");
        operate = false;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
    EnterNumbers("2");
     eq.setText(eq.getText() + "2");
        operate = false;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
    EnterNumbers("3");
     eq.setText(eq.getText() + "3");
        operate = false;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
     EnterNumbers("0");
      eq.setText(eq.getText() + "0");
        operate = false;
    }//GEN-LAST:event_btn0ActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        try{
        NumEnter1=Double.parseDouble(Ans.getText());
    Ans.setText("");
    op="/";
      if (!operate) {
        if(eq.getText().equals("")){
           operate = false; 
        }else{
        eq.setText(eq.getText() + "/");
        operate = true;
        }
    }
        decimalAdded = false;
        }catch (NumberFormatException ex){
        }
    }//GEN-LAST:event_divActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
     try{
        NumEnter1=Double.parseDouble(Ans.getText());
    Ans.setText("");
    op="*";
   if (!operate) {
        if(eq.getText().equals("")){
           operate = false; 
        }else{
        eq.setText(eq.getText() + "*");
        operate = true;
        }
    }
        decimalAdded = false;
     }catch(NumberFormatException ex){
     }
    }//GEN-LAST:event_mulActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
    try{
        NumEnter1=Double.parseDouble(Ans.getText());
    Ans.setText("");
    op="-";
      if (!operate) {
            eq.setText(eq.getText() + "-");
            operate = true;
        }
       decimalAdded = false;
    }catch(NumberFormatException ex){
        
    }
    }//GEN-LAST:event_minActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
    try{
        NumEnter1=Double.parseDouble(Ans.getText());
    Ans.setText("");
    op="+";
      if (!operate) {
            eq.setText(eq.getText() + "+");
            operate = true;
        }
       decimalAdded = false;
    }catch(NumberFormatException ex){
        
    }
    }//GEN-LAST:event_plusActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
    Ans.setText("");
    String Fn,Sn;
    Fn=String.valueOf(NumEnter1);
    Sn=String.valueOf(NumEnter2);   
    
    Fn="";
    Sn="";
     eq.setText(""); 
        decimalAdded = false;
        operate = false;
    }//GEN-LAST:event_clrActionPerformed

    private void negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negActionPerformed
   double nums = Double.parseDouble(String.valueOf(Ans.getText()));
    try{ 
        String input = eq.getText();
            if (input.contains(".")) {
                double no = Double.parseDouble(input);
                no = no * (-1);
                eq.setText(String.valueOf(no));
                Ans.setText(String.valueOf(no));
            } else {
                int intValue = Integer.parseInt(input);
                intValue = intValue * (-1);
                eq.setText(String.valueOf(intValue));
                Ans.setText(String.valueOf(intValue));
            }
      } catch (NumberFormatException ex) {
   
    }
    }//GEN-LAST:event_negActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
    String backSp= null;
    if(Ans.getText().length()>0){
        StringBuilder sb = new StringBuilder(Ans.getText());
        sb.deleteCharAt(Ans.getText().length()-1);
        backSp=sb.toString();
        Ans.setText(backSp);
    }
    int length = eq.getText().length();
        int num = eq.getText().length()-1;
        String store;
        if (length >0){
            StringBuilder back = new StringBuilder (eq.getText());
            back.deleteCharAt(num);
            store = back.toString();
            eq.setText(store);
        }
         decimalAdded = false;
         operate = false;
    }//GEN-LAST:event_delActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
   try{
        if(! Ans.getText().contains(".")){
       Ans.setText(Ans.getText()+dot.getText());
   }
           if (!decimalAdded) {
            eq.setText(eq.getText() + ".");
            decimalAdded = true;
        }
            } catch (NumberFormatException ex) {
     
    }
        operate = true;
    }//GEN-LAST:event_dotActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
      try{
        calculate();  
         decimalAdded = true;
      }catch (NumberFormatException ex) {
      
    }
    }//GEN-LAST:event_equalActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
    bsn ac = new bsn();
    ac.setVisible(true);
    ac.setLocationRelativeTo(null);
    dispose();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
      if(show.isSelected()){
           eq.setVisible(true);
          show.setText("hide equation");
       }else{
           eq.setVisible(false);
            show.setText("show equation");
       }
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ans;
    private javax.swing.JButton bnt7;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton clr;
    private javax.swing.JButton del;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JTextField eq;
    private javax.swing.JButton equal;
    private javax.swing.JButton jButton28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton min;
    private javax.swing.JButton mul;
    private javax.swing.JButton neg;
    private javax.swing.JButton plus;
    private javax.swing.JRadioButton show;
    // End of variables declaration//GEN-END:variables
 private static double evaluateExpression(String expression) {
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (Character.isWhitespace(ch)) nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (; ; ) {
                        if (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (; ; ) {
                        if (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        eat(')');
                    } else if (Character.isDigit(ch) || ch == '.') { // numbers
                        while (Character.isDigit(ch) || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new RuntimeException("Unexpected: " + (char) ch);
                    }

                    return x;
                }
            }.parse();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }
}
