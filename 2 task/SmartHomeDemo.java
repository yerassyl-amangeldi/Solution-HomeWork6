public class SmartHomeDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();

        TurnOnLightCommand lightOn = new TurnOnLightCommand(livingRoomLight);
        SetThermostatCommand setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand(1, lightOn);
        remote.setCommand(2, setTemp);

        remote.pressButton(1);
        remote.pressButton(2);
        remote.undoButton();
        remote.pressButton(1);
        remote.undoButton();
    }
}