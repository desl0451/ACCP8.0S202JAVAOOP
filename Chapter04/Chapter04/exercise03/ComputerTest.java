package Chapter04.exercise03;

public class ComputerTest {
	public static void main(String[] args) {
		CPU cpu = new IntelCPU();
		EMS ems = new JSD_EMS();
		HardDisk hardDisk = new XJ_HardDisk();
		Computer computer = new Computer(cpu, ems, hardDisk);
		computer.showInfo();
	}
}
