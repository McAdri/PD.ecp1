package pd.composite.expression;

public class Sumar extends Operation{

	public Sumar(Expresion expresion1,Expresion expresion2){
		super(expresion1,expresion2);
	}
	


	@Override
	public String toString() {
		return "(" + expresion1.toString() + "+" + expresion2.toString() + ")";
	}

	@Override
	public int operar() {
		return this.expresion1.operar() + this.expresion2.operar();
	}
}
