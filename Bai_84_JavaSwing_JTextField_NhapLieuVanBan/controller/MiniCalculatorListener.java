
package Bai_84_JavaSwing_JTextField_NhapLieuVanBan.controller;

import Bai_84_JavaSwing_JTextField_NhapLieuVanBan.View.MiniCalculatorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class MiniCalculatorListener implements ActionListener{
    private MiniCalculatorView MiniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView MiniCalculatorView) {
        this.MiniCalculatorView = MiniCalculatorView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")){
         this.MiniCalculatorView.plus();
        }else if(button.equals("-")){
            this.MiniCalculatorView.minus();
        }else if(button.equals("*")){
            this.MiniCalculatorView.multiply();
        }else if(button.equals("/")){
            this.MiniCalculatorView.divide();
        }else if(button.equals("^")){
            this.MiniCalculatorView.pow();
        }else if(button.equals("%")){
            this.MiniCalculatorView.mod();
        }
    }
    
}
