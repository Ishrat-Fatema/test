abstract class vehicle
{
abstract void speed();
abstract void engine();
void test()
{
System.out.println("This class cannot be overridden");
}
};
class spirit extends vehicle
{
void speed()
	{
System.out.println("20km per hour");
	}
void engine()
{
System.out.println("2 stroke");
}
}
	class abstract1
	{
	public static void main(String s[])
		{
spirit s1=new spirit();
s1.speed();
s1.engine();
s1.test();
		}
	}