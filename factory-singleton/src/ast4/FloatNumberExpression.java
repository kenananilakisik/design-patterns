package ast4;
//Class Created to abstract factory design pattern
public class FloatNumberExpression extends Expression
{
	public FloatNumberExpression(float f)
	{
		this.f = f;
	}
	public String textualRepresentation()
	{
		return Float.toString(f);
	}
	private float f;
}
