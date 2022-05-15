public class Class{
	public static void main(String[] agrs){
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 10;
		cat1.color = "白色";
		cat1.weight = 8.0;
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 3;
		cat2.color = "花色";
		cat2.weight = 6.3;
		System.out.println("第一只猫：" + "  " + cat1.name + "  " 
			+ cat1.age + "  " + cat1.color + "  " + cat1.weight);
		System.out.println("第二只猫：" + "  " + cat2.name + "  "
			+ cat2.age + "  " + cat2.color + "  " + cat2.weight);

	}
}
		class Cat{
			String name;
			int age;
			String color;
			double weight;
		}


