public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyWeightKg = 50;
        double heightMetrs = 1.63;
        int bodyMassIndex = service.calculate(bodyWeightKg, heightMetrs);
        System.out.println("Индекс массы Вашего тела составляет: " + bodyMassIndex);
    }
}