//定义数组存储3部汽车对象。
//
//​ 汽车的属性：品牌，价格，颜色。
//
//​ 创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。

public class Car {
    private String band;
    private double price;
    private String color;

    public Car() {
    }

    public Car(String band, double price, String color) {
        this.band = band;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return band
     */
    public String getBand() {
        return band;
    }

    /**
     * 设置
     * @param band
     */
    public void setBand(String band) {
        this.band = band;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

}
