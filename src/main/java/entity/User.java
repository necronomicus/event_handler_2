package entity;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private String lastName;
    private List<Ticket> ticketList;

    public User(Long id, String name, String lastName, List<Ticket> ticketList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.ticketList = ticketList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}
