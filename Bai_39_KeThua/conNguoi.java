/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_39_KeThua;

public class conNguoi {
    private String name;
    private int old;
    
    public conNguoi(String name , int old){
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
     public void an (){
         System.out.println("an com");
     }
     public void uong(){
         System.out.println("uong nuoc");
     }
     public void ngu(){
         System.out.println("sleep");
     }
    
}
