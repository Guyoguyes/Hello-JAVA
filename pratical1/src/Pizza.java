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
        String[] pizzaSize = {"large", "medium", "small"};
        int i;
        for(i = 0; i < pizzaSize.length; i++) {
            System.out.println(pizzaSize[i]);
        }
            if(this.size.equals(pizzaSize[0].toLowerCase())){
                this.price = this.price + 30;
            }else if(this.size.equals(pizzaSize[1].toLowerCase())){
                this.price = this.price + 50;
            }else if (this.size.equals(pizzaSize[2].toLowerCase())){
                this.price = this.price + 70;
            }else{
                System.out.println("Pizza size is required");
            }


//        if(this.size.equals(large.toLowerCase())){
//            this.price = this.price + 30;
//        }else if (this.size.equals(medium.toLowerCase())){
//            this.price = this.price + 50;
//        }else if (this.size.equals(small.toLowerCase())){
//            this.price = this.price + 70;
//        }

        System.out.println("Pizza Crust");
        String[] pizzaCrust = {"crispy", "stuffed", "Gluten-free"};

        for(i=0; i<pizzaCrust.length; i++){
            System.out.println(pizzaCrust[i]);
        }
        if(this.crust.equals(pizzaCrust[0].toLowerCase())){
                this.price = this.price + 10;
            }else if(this.crust.equals(pizzaCrust[1].toLowerCase())){
                this.price = this.price + 15;
            }else if(this.crust.equals(pizzaCrust[2].toLowerCase())){
                this.price = this.price + 20;
            }

//        if(this.crust.equals(hard.toLowerCase())){
//            this.price = this.price + 10;
//        }else if(this.crust.equals(soft.toLowerCase())){
//            this.price = this.price + 20;
//        }

        //topping
        String[] pizzaTopping = {"Bacon", "Chicken", "Beef", "Vegetables"};

        for (i=0; i < pizzaTopping.length; i++) {
            System.out.println(pizzaTopping[i]);
        }
            if(this.topping.equals(pizzaTopping[0].toLowerCase())){
                this.price = this.price + 15;
            }else if(this.topping.equals(pizzaTopping[1].toLowerCase())){
                this.price = this.price + 20;
            }else if(this.topping.equals(pizzaTopping[2].toLowerCase())){
                this.price = this.price + 25;
            }else if (this.topping.equals(pizzaTopping[3].toLowerCase())){
                this.price = this.price + 10;
            }


//        if(this.topping.equals(pineapple.toLowerCase())){
//            this.price = this.price + 15;
//        }else if(this.topping.equals(mongo.toLowerCase())){
//            this.price = this.price + 23;
//        }

        return this.price;
    }
}
