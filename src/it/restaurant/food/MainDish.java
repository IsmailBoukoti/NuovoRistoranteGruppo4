package it.restaurant.food;


import java.util.List;

public class MainDish extends MenuItem{


    public MainDish(String name,double price,MenuTypeEnum type,boolean isRecommended,String stringOfIngredients,boolean dishOfTheDay){
        super(name,price,type,isRecommended,stringOfIngredients,dishOfTheDay);
    }

    @Override
    public String getDetails(){
        return super.getDetails();
    }
}
