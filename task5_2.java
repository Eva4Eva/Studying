//Формируется новогодний подарок. 
//Он может включать в себя разные сладости (Candy, Jellybean, etc.)
//У каждой сладости есть название, вес, цена и свой уникальный параметр. 
//Необходимо собрать подарок из сладостей. 
//Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.


package Presents;

public class Chocolate extends Present {
    private String type;

    public Chocolate(){}

    public Chocolate(String name, int weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Chocolate: "+super.toString() + ", вид: "+type;
    }

}
