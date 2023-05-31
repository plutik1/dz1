package src.main.java.dz1;

public class TEA extends HotDrink {
    public TEA(String kind, double price, long id, int volume, double temp) {
        super(kind, price, id, volume, temp);
    }


        @Override


       public String toString() {
            return String.format( "У чая: %s, %s, %s,%s, %s", getKind(), getPrice(), getId(), getVolume(), gettemp());
    }
    }

