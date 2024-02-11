
public class Equation <T>{
	T ob ;
	public Equation(T ob){
		this.ob=ob;
	}
	public boolean equal(Equation<?> ob2){
		if(this.ob.toString().equals(ob2.ob.toString()))
			return true;
		return false;
	}

}

/*
    public class WildCard{
    public static void main(String[] args) {
		Equation<Integer> ob1=new Equation<Integer>(1);
		Equation<Integer> ob2=new Equation<Integer>(1);
		Equation<Long> ob3=new Equation<Long>(1L);
		if(ob1.equal(ob2))
			System.out.println("true");
		if(ob2.equal(ob3))
			System.out.println("true");
	}*/
