//Формируется новогодний подарок. 
//Он может включать в себя разные сладости (Candy, Jellybean, etc.)
//У каждой сладости есть название, вес, цена и свой уникальный параметр. 
//Необходимо собрать подарок из сладостей. 
//Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.



package Presents;

public class Candy extends Present {
    private String person;

    public Candy(String name, int weight, Double price){
        super(name, weight, price);
    }

    public Candy(String name, int weight, Double price, String person){
        super(name, weight, price);
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString(){
        return "Candy: "+super.toString() + ", кому: "+person;
    }
}
