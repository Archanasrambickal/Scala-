object Fact {
	def main(args: Array[String]){
	  println("Enter the number");
	  val n=Console.readInt
	  var t=0
	  var i: Int = 1
	  if (n>1){
	    for (i <- 1 to n){
	      t=t + i
	      }
	    print("fact is"+t)
	  }
	  
	}
	
}
