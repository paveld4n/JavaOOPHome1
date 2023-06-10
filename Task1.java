public class Task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Owner owner1 = new Owner();

        cat1.setName("Барсик");
        cat1.setAge(12);
        
        cat1.showHiCat();
        owner1.setName("Барклай");
        owner1.setAge(12);
        owner1.name = "Патрик";
        owner1.showHiCat();
    }
}
