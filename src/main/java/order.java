public class order {
    private int stockQ;
    private Seller seller;

    public order() {
        this.stockQ = 0;
        this.seller = new Seller("a");
    }

    public int getStockQ() {
        return stockQ;
    }

    public void setStockQ(int stockQ) {
        this.stockQ = stockQ;
    }

    public void incStockQ(int q) throws Exception {

        if(this.seller.getStatus().equals("a"))
            this.stockQ = stockQ;
        else
            throw new Exception();
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
