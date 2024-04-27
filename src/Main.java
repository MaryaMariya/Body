public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; // вес в килограммах
        double height = 1.87; // рост в метрах
        double bmi = service.calculate(weight, height); // считаем ИМТ
        String bmiResult = String.format("%.1f",bmi); // округляем до 1-х знака

        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height + " м.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }
}