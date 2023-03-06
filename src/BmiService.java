public class BmiService {
    public int calculate(int bodyWeightKg, double heightMeters) {
        return (int) (bodyWeightKg / heightMeters / heightMeters);
    }
}
