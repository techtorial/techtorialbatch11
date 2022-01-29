package MentoringWithAhmet.RecapJava;

public class Test {
    public static void main(String[] args) {
        Human man = new Human();
        Human woman = new Human();

        System.out.println(man.age);
        System.out.println(man.height);
        woman.age=23;
        System.out.println(woman.age);//23  30

        StaticInstanceBlock ahmet = new StaticInstanceBlock();
        System.out.println(ahmet.food);
        StaticInstanceBlock mehmet = new StaticInstanceBlock();
        System.out.println(mehmet.food);
        ahmet.eating();
        System.out.println(ahmet.food);
        StaticInstanceBlock ali = new StaticInstanceBlock();
        System.out.println(ali.food);
        ali.eating();
        mehmet.eating();
        System.out.println(ahmet.food);
        StaticInstanceBlock kamuran = new StaticInstanceBlock();
        System.out.println(kamuran.food);



    }


}
