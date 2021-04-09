package zadanie;

public class Card {

    private enum Colour {kier, karo, pik, trefl}

    private enum Value {
        dwójka("2"), trójka("3"), czwórka("4"), piątka("5"), szóstka("6"),
        siudemka("7"), ósemka("8"), dziewiątka("9"), dziesiątka("10"),
        walet("walet"), dama("dama"), król("król"), as("as"), joker("jJoker");

        private String value;
        Value (String wartosc) { this.value = wartosc; }
        public String getValue() { return value; }
    }

    private Value wartosc;
    private Colour kolor;

    public Card(int value, int colour) {
        this.wartosc = Value.values()[value];//wybierak
        this.kolor = Colour.values()[colour];//wybierak
    }

    public String gWartosc() {
        return wartosc.getValue();
    }

    public String gColour() {
        return kolor.toString();
    }
}
