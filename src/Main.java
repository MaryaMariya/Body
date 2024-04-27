public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 67; // вес в килограммах
        double height = 1.70; // рост в метрах
        double bmi = service.calculate(weight, height); // считаем ИМТ
        String bmiResult = String.format("%.0f",bmi); // округляем до целого числа

        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height + " м.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }
}