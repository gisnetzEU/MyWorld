public class User {

    private String name;
    private String surnames;
    private String idCard;
    private Card card;

    public User(String name, String surnames, String idCard, Card card) {
        this.name = name;
        this.surnames = surnames;
        this.idCard = idCard;
        this.card = card;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", idCard='" + idCard + '\'' +
                ", card=" + card +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
