package service;

import entity.Ticket;

import java.time.LocalDate;

public class TicketService {

    public Ticket createTicket(Long id, String name, String description, LocalDate date, Double price){
        Ticket ticket = new Ticket(id,name,description,date,price);
        return ticket;

    }
}
