object q2{
	def main(args : Array[String])
	{
	print("The radiusof the sphere : ");
	var radius = scala.io.StdIn.readDouble();
	print("The volume of a sphere : " + volume(radius));
	
	}
	
	def volume(r : Double) : Double = {
		var volume : Double = 0;
		val pi : Double = (22.0/7.0);
		
		volume = (4.0/3.0)*pi*(r*r*r);
		return volume;
	}
}