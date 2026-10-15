/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottogame;

/**
 *
 * @author ibikh
 */
public class LottoTicket {
    private int number;
    private String color;
    
    public static final String[] COLORS = {
    "Red", "Blue", "Green", "Yellow"};

    public LottoTicket(int number, String color) {
        this.number = number;
        this.color = color;
    }

    LottoTicket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
