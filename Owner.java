// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. 
// Добавьте соответствующее поле в классе "Кот" и методы доступа для него. 
// Измените метод "приветствие" класса "Кот", чтобы он выводил
// приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".


public class Owner extends Cat{
    String name;
    
    
    // void showHiOwner() {
    //     System.out.println("Мяу! Меня зовут кот " +    "Мне " + " года(лет). Мой владелец " + name + ".");
    // }
    void setOwner(String name) {
        this.name = name;
    }
    String getOwner() {
        return name;
    }
    @Override
    public void showHiCat(){
        System.out.println("Мяу! Меня зовут кот " + getName() + ". Мне " + getAge() + " года(лет). Мой владелец " + name + "."); 
    }       
}
