package VendingMachine;

public enum Coin {
    _1(1), _5(5), _10(10), _20(20), _50(50), _100(100);

    public final int value;

    Coin(final int v) {
        this.value = v;
    }

    public static Coin getCoin(int amt) {
        if(amt == 1) return _1;
        if(amt == 5) return _5;
        if(amt == 10) return _10;
        if(amt == 20) return _20;
        if(amt == 50) return _50;
        if(amt == 100) return _100;
        return null;
    }
}
