public class Fraction {
    public int topN, btmN;
    public String toFraction() {
        return topN + "/" + btmN;
    }
    public String toFloat() {
        return ((topN * 1.00)/(btmN * 1.00)) + "";
    }
    
    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN += f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }
    }
    
    public boolean myEquals(Fraction x) {
        return ((topN * 1.00)/(btmN * 1.00)) == ((x.topN * 1.00)/(x.btmN * 1.00));
    }
    
    public void LowestTermFrac() {
        for (int num = topN; num > 0; num--) {
            if (topN % num == 0) {
                topN /= num;
                btmN /= num;
            }
        }
    }
}
