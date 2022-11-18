package it.restaurant.food;


import it.restaurant.customer.CustomerTypeEnum;

public class SideDishes extends MenuItem{

    public SideDishes(String name,double price,CustomerTypeEnum type1,boolean isRecommended,String stringOfIngredients){
        super(name,price,type1,isRecommended,stringOfIngredients);
    }

    public SideDishes(String name,double price,CustomerTypeEnum type1,CustomerTypeEnum type2,boolean isRecommended,String stringOfIngredients){
        super(name,price,type1,type2,isRecommended,stringOfIngredients);
    }

    @Override
    public String printDetails(){
        return super.printDetails();
    }
}
