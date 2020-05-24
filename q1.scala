object q1{
	def main(args : Array[String])
	{
	print("Enter your centigrade Temperature: ");
	var centigrade = scala.io.StdIn.readDouble();
	println("Temperature : " + convert(centigrade));
	}
	
	
	def convert(c : Double) : Double = {
		var f : Double = 0;
	
	f = c*1.8000 + 32.00;
	return f;
	}
}