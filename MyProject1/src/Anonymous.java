class base{
	int a;
	base(int x)
	{
		a=x;
	}
	base(){}
	public void show(){
		System.out.println("inside base");
	}
}
public class Anonymous {

	public static void main(String[] args) {
	base b = new base(){
		public void show(){
			System.out.println("inside subbase");
		}
	};
	
	b.show();

	}

}
