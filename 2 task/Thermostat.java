public class Thermostat {
    private int currentTemperature = 20;
    private int previousTemperature;

    public void setTemperature(int temperature) {
        previousTemperature = currentTemperature;
        currentTemperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void revertTemperature() {
        currentTemperature = previousTemperature;
        System.out.println("[Thermostat] Reverting to previous temperature " + currentTemperature + "°C");
    }
}