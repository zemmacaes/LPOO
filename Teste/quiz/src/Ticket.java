public class Ticket
{
    private int number;
    private Concert concert;

    public Ticket(int number, Concert concert) throws InvalidTicket {
        if(number < 0)
            throw new InvalidTicket();

        this.number = number;
        this.concert = concert;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Concert getConcert() {
        return concert;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }
}
