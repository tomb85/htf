package hft.gdax.websocket.message;

public class Match {

    private String sessionId;
    private String type;
    private long trade_id;
    private long sequence;
    private String maker_order_id;
    private String taker_order_id;
    private String time;
    private String product_id;
    private double size;
    private String price;
    private String side;

    public String getSymbol() {
        return product_id;
    }

    public long getSequence() {
        return sequence;
    }

    public String getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public String getSide() {
        return side;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getOrderId() {
        return maker_order_id;
    }

    public String getTime() {
        return time;
    }
}

/*

{
    "type": "match",
    "trade_id": 10,
    "sequence": 50,
    "maker_order_id": "ac928c66-ca53-498f-9c13-a110027a60e8",
    "taker_order_id": "132fb6ae-456b-4654-b4e0-d681ac05cea1",
    "time": "2014-11-07T08:19:27.028459Z",
    "product_id": "BTC-USD",
    "size": "5.23512",
    "price": "400.23",
    "side": "sell"
}

 */