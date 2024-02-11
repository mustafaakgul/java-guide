
public class G01 <T> {
	T gen;
	public G01(T gen){
		this.gen=gen;
	}
	public void show(){
		System.out.println(gen.getClass().getName()+":");
		System.out.println(gen.toString());
		System.out.println("--------");
	}

	public static void main(String[] args) {
		G01 <Integer> obj1=new G01<Integer>(1);
		G01 <Double> obj2=new G01<Double>(2D);
		G01 <Long> obj3=new G01<Long>(3L);

		
		obj1.show();
		obj2.show();
		obj3.show();

	}

}

/* add float 4f, string "a",character 'a', byte (byte)'a' ,short (short)8,boolean true. */