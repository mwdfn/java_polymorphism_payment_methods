import java.util.ArrayList;

public class Wallet implements IScan {
    private String name;
    private ArrayList<IScan> walletItem;


    public Wallet(String name) {
        this.name = name;
        this.walletItem = new ArrayList<IScan>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.walletItem.size() ;
    }

    public void addItem(IScan item) {
        this.walletItem.add(item);
    }


    public String scan(){
        return "Payment Complete";
    }
}
