/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lottogame;

import java.util.Scanner;

/**
 *
 * @author ibikh
 */
public class LottoGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LottoTicket[] ticket = LottoTicketGenerator.generateTicket(48);

        //
        for (LottoTicket my_ticket : ticket) {

            System.out.println(my_ticket.getNumber() + " "
                    + my_ticket.getColor());

        } // end of printing for loop

        // askiing user for number
        System.out.println("Enter a number between 1 and 49:  ");

        int ticket_num = input.nextInt();

        System.out.println("Enter a number between 1 to 3 for your color: ");

        int color_guess = input.nextInt();

        LottoTicket user_ticket = new LottoTicket(ticket_num, LottoTicket.COLORS[color_guess]);

        boolean match = false;

        for (LottoTicket my_ticket : ticket) {

            if (my_ticket.getNumber() == user_ticket.getNumber() && my_ticket.getColor().equals(user_ticket.getColor())) {
                match = true;
                break;
            } // end of if
        } // END OF COMPARISON

        if (match == true) {
            System.out.println("Correct");

        } else {
            System.out.println("Incorrect");
        }

        input.close();

    } // end of main

}
