class StockSpanner {
    class Pair {
        int stockPrice;
        int span;
        Pair(int stockPrice, int span) {
            this.stockPrice = stockPrice;
            this.span = span;
        }
    }
    Stack<Pair> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int currSpan = 1;
        if (st.isEmpty()) {
            st.push(new Pair(price, currSpan));
        } else {
            while (!st.isEmpty() && st.peek().stockPrice <= price) {
                Pair p = st.pop();
                currSpan += p.span;
            }
            st.push(new Pair(price, currSpan));
        }
        return currSpan;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */