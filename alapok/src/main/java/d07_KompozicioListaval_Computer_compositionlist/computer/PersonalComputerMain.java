package computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu=new Cpu("Athlon", 0.33);
        PersonalComputer personalComputer=new PersonalComputer(cpu);
        System.out.println(personalComputer);
        Hardware hardware = new Hardware("Sound Card", "Gravis Ultrasound");
        personalComputer.addHardware(hardware);
        System.out.println(personalComputer);
        Software software=new Software("suli", 1.0);
        personalComputer.addSoftware(software);
        System.out.println(personalComputer);

    }
}
