/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottogame;

import java.util.Random;

/**
 *
 * @author ibikh
 */
public class LottoTicketGenerator {

    public static LottoTicket[] generateTicket(int numTicket) {

        LottoTicket[] ticket = new LottoTicket[numTicket];
        Random random = new Random();

        for (int i = 0; i < ticket.length; i++) {

            int number = random.nextInt(48) + 1;
            String color = LottoTicket.COLORS[random.nextInt(4)];

            LottoTicket my_ticket = new LottoTicket(number, color);

            ticket[i] = my_ticket;

        }// end of random number and color for loop
        return ticket;

    }

}
