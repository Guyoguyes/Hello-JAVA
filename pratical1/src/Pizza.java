public class Pizza {
    static  double price = 0;
    String size;
    String crust;
    String topping;

    public  Pizza (String size, String crust, String topping){
        this.size = size;
        this.crust = crust;
        this.topping = topping;
    }

    public double makeOrder(){
        System.out.println("Making Pizza Order");
        System.out.println("Pizza Size");
        String large = "large";
        String medium = "medium";
        String small = "small";

        if(this.size.equals(large.toLowerCase())){
            this.price = this.price + 30;
        }else if (this.size.equals(medium.toLowerCase())){
            this.price = this.price + 50;
        }else if (this.size.equals(small.toLowerCase())){
            this.price = this.price + 70;
        }

        System.out.println("Pizza Crust");
        String hard = "hard";
        String soft = "soft";

        if(this.crust.equals(hard.toLowerCase())){
            this.price = this.price + 10;
        }else if(this.crust.equals(soft.toLowerCase())){
            this.price = this.price + 20;
        }

        //topping
        String pineapple = "pineapple";
        String mongo = "mongo";

        if(this.topping.equals(pineapple.toLowerCase())){
            this.price = this.price + 15;
        }else if(this.topping.equals(mongo.toLowerCase())){
            this.price = this.price + 23;
        }

        return this.price;
    }
}
