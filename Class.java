public class Class{
	public static void main(String[] agrs){
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 10;
		cat1.color = "��ɫ";
		cat1.weight = 8.0;
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 3;
		cat2.color = "��ɫ";
		cat2.weight = 6.3;
		System.out.println("��һֻè��" + "  " + cat1.name + "  " 
			+ cat1.age + "  " + cat1.color + "  " + cat1.weight);
		System.out.println("�ڶ�ֻè��" + "  " + cat2.name + "  "
			+ cat2.age + "  " + cat2.color + "  " + cat2.weight);

	}
}
		class Cat{
			String name;
			int age;
			String color;
			double weight;
		}


