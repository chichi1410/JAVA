/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_45_BaiTapKeThua_Abstract;

/**
 *
 * @author Admin
 */
public class bike extends phuongTienDiChuyen{
    
    public bike( hangSanXuat HangSanXuat) {
        super("xe dep", HangSanXuat);
    }
    @Override
    public double layVanToc(){
        return 20;
    }
    
   
    
}
