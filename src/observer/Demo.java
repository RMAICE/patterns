package observer;

public class Demo {
    public static void main(String[] args) {
        var apple = new Stock("Apple", 300.54f);
        var google = new Stock("Google", 200.3f);
        var statusBar = new StatusBar();
        var stockListView = new StockListView();
        Observer[] observers = { statusBar, stockListView };
        Stock[] stocks = { apple, google };

        statusBar.addStock(apple);
        statusBar.addStock(google);
        stockListView.addStock(apple);
        stockListView.addStock(google);

        for (Stock stock : stocks)
            for (Observer observer : observers)
                stock.addObserver(observer);

        google.setPrice(199.2f);
    }
}
