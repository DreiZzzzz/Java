public class MyStatic {
	public static void main(String[] args) {
		TryStatic tryLang = new TryStatic();


		System.out.println(tryLang.getAge()); // before

		tryLang.setAge(100);

		System.out.println(tryLang.getAge()); // after
	}
}