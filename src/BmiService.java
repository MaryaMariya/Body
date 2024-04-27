public class BmiService {

    public double calculate(int weight, double height) {
        double bmi;
        bmi = weight / (height * height); // вычисляем индекс массы тела


        return bmi;
    }
}