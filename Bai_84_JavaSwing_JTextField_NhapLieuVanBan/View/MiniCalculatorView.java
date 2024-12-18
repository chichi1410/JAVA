/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_84_JavaSwing_JTextField_NhapLieuVanBan.View;

import Bai_84_JavaSwing_JTextField_NhapLieuVanBan.controller.MiniCalculatorListener;
import Bai_84_JavaSwing_JTextField_NhapLieuVanBan.model.MiniCalculatorModel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class MiniCalculatorView extends JFrame {

    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_firstValue;
    private JTextField jTextField_secondtValue;
    private JTextField jTextField_answer;

    public MiniCalculatorView() throws HeadlessException {
        this.miniCalculatorModel =  new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("mini calculator");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font font = new Font("arial", Font.BOLD, 20);

        JLabel jLabel_firstValue = new JLabel("first value");
        jLabel_firstValue.setFont(font);
        JLabel jLabel_secondValue = new JLabel("secondvalue");
        jLabel_secondValue.setFont(font);
        JLabel jLabel_answer = new JLabel("answer");
        jLabel_answer.setFont(font);

        jTextField_firstValue = new JTextField(50);
        jTextField_firstValue.setFont(font);
        jTextField_secondtValue = new JTextField(50);
        jTextField_secondtValue.setFont(font);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2, 20, 20));
        // 10 10 la khoang cach giua dong va cot
        jPanelIO.add(jLabel_firstValue);
        jPanelIO.add(jTextField_firstValue);
        jPanelIO.add(jLabel_secondValue);
        jPanelIO.add(jTextField_secondtValue);
        jPanelIO.add(jLabel_answer);
        jPanelIO.add(jTextField_answer);

        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCalculatorListener);
        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCalculatorListener);
        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(miniCalculatorListener);
        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(miniCalculatorListener);
        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCalculatorListener);
        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCalculatorListener);

        JPanel jPanelButtons = new JPanel();
        jPanelButtons.setLayout(new GridLayout(2, 3, 20, 20));
        jPanelButtons.add(jButton_plus);
        jPanelButtons.add(jButton_minus);
        jPanelButtons.add(jButton_multiply);
        jPanelButtons.add(jButton_divide);
        jPanelButtons.add(jButton_pow);
        jPanelButtons.add(jButton_mod);

        this.setLayout(new BorderLayout());
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanelButtons, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void plus() { // cong them
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondtValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void minus() { // tru di 
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondtValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void multiply() { // nhan them 
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondtValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiply();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void divide() { // chia
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondtValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.divide();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void pow() {// mu
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondtValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.pow();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mod() { // chia lay du
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondtValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
//
}
