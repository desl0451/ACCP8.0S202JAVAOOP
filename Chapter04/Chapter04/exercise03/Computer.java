package Chapter04.exercise03;

public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk hardDisk;
	public Computer(CPU cpu, EMS ems, HardDisk hardDisk) {
		this.cpu = cpu;
		this.ems = ems;
		this.hardDisk = hardDisk;
	}
	public void showInfo(){
		System.out.println("���������Ϣ����:");
		System.out.println("CPU��Ʒ����:"+cpu.getCPUBrand()+",��Ƶ��:"+cpu.getFrequency()+"Hz");
		System.out.println("Ӳ��������:"+hardDisk.getCapacity()+"GB");
		System.out.println("�ڴ�������:"+ems.getEMSType()+"GB");
	}
}
