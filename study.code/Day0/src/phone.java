public class phone {
    private String band;
    private double price;
    private String color;

    public phone() {
    }

    public phone(String band, double price, String color) {
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

    public void call(){
        System.out.println("正在使用价格为"+price+"元的"+color+"色的"+band+"手机打电话");
    }
    public void senMessage(){
        System.out.println("正在使用价格为"+price+"元的"+color+"色的"+band+"手机打电话");
    }

}
