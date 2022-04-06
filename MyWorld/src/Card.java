public class Card {

    private int number;
    private String type;
    private double amount;
    private int pin;

    public Card(int number, String type, double amount, int pin) {
        this.number = number;
        this.type = type;
        this.amount = amount;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", pin=" + pin +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
