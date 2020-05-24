object q3{
	def main(args : Array[String])
	{
	
	print("How many copies you want to buy : ");
	var books = scala.io.StdIn.readFloat();
	
	wholesale(books);
	}
	
	def wholesale(copies : Float) : Float = {
	
	var bookprice = 24.95;
	var discount = 0.4;
	var shipping = 3;
		
		if(copies <= 50)
		{
		var finalprice = (copies*bookprice)*(1-discount);
		var finalprice1 = finalprice + (copies*shipping);
		print(finalprice1);
		}
		
		else
		{
		var finalprice = (copies*bookprice)*(1-discount);
		var finalprice2 = finalprice + (50*shipping) + (copies - 50)*0.75;
		print(finalprice2);
		}
			
	return 0;
	}

}
