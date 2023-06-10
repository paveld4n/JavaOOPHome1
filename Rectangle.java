// Задача 2:
// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). 
// Класс должен обладать следующими методами:
// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

public class Rectangle {
    double wight;
    double height;

    public Rectangle() {
        height = 8;
        wight = 2;
    }

    public Rectangle(double height, double wight ) {
        this.height = height;
        this.wight = wight;
    }
    void calculateArea() {
        System.out.println("Площадь прямоугольника = " + height * wight);
    }
    void calculatePerimeter() {
        System.out.println("Периметр прямоугольника = " + (height + wight) * 2);
    }

    void setWight(double wight) {
        this.wight = wight;
}
    void setHeight(double height) {
        this.height = height;
}
    double getWight() {
        return wight;
}
    double getHeight() {
        return height;
    }    
}

