package model;

/**
 * Created by Administrator on 2015/12/2.
 */
public class fruit {
    private final String name;
    private final String price;
    private final String country;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    private fruit(buildfruit bf){
        this.name = bf.name;
        this.price = bf.price;
        this.country = bf.country;
    }


    public static class buildfruit{
        private String name = null;
        private String price = null;
        private String country = null;

        public buildfruit name(String name){
            this.name = name;
            return this;
        }

        public buildfruit price(String price){
            this.price = price;
            return this;
        }

        public buildfruit country(String country){
            this.name = name;
            return this;
        }

        public fruit dobuild(){
            return new fruit(this);
        }
    }

}
