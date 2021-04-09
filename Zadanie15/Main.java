package zadanie;

public class Main {

    public static void main(String[] args) {

        Invoice Cola = new Invoice("1", "Coca-Cola", 20, 10);
        Invoice Woda = new Invoice("2", "Woda", 100, 2);
        Invoice Nic = new Invoice("3","Nic",0,2);
        Invoice Błąd= new Invoice("4","Błąd",13,0);


        System.out.println("ID:"+ Cola.getProduct_number()+ " Nazwa:"+Cola.getProduct_description() + " Ilość:"
                + Cola.getQuantity() + " Cena za sztukę:" + Cola.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + Cola.amount());
        System.out.println("ID:"+ Woda.getProduct_number()+ " Nazwa:"+Woda.getProduct_description() + " Ilość:"
                + Woda.getQuantity() + " Cena za sztukę:" + Woda.getPricePerItem());
        System.out.println("Iloczyn= " + Woda.amount());
        System.out.println("ID:"+ Nic.getProduct_number()+ " Nazwa:"+Nic.getProduct_description() + " Ilość:"
                + Nic.getQuantity() + " Cena za sztukę:" + Nic.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + Nic.amount());
        System.out.println("ID:"+ Błąd.getProduct_number()+ " Nazwa:"+Błąd.getProduct_description() + " Ilość:"
                + Błąd.getQuantity() + " Cena za sztukę:" + Błąd.getPricePerItem());
        System.out.println("Całkowita wartość towarów: " + Błąd.amount());

    }
}
