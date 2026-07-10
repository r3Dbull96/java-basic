public class Visitor {
    private static int totalVisitors;

    public Visitor() {
        ++totalVisitors;
    }

    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static void main(String[] args) {
        Visitor visitor1 = new Visitor();
        System.out.println(getTotalVisitors());

        Visitor visitor2 = new Visitor();
        System.out.println(getTotalVisitors());

        Visitor visitor3 = new Visitor();
        System.out.println(getTotalVisitors());

        Visitor visitor4 = new Visitor();
        System.out.println(getTotalVisitors());

        Visitor visitor5 = new Visitor();
        System.out.println(getTotalVisitors());

        // Значение totalVisitors одно для всех объектов, т.к. статичная переменная принадлежит классу а не объекту этого класса
    }
}
