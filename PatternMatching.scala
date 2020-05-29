package OOA

object PatternMatching extends  App{

  def forecast(temp: Int): String = {
    temp match {
      case 0 => "Cloudy"
      case 20 => "Mostly Cloudy"
      case 50 => "Partly Sunny"
      case 80 => "Mostly Sunny"
      case 100 => "Sunny"
      case _ => "Unknown"
    }
  }

  println(forecast(100) == "Sunny")
  println(forecast(80) == "Mostly Sunny")
    println( forecast(50) == "Partly Sunny")
    println(  forecast(20) == "Mostly Cloudy")
    println( forecast(0) == "Cloudy")
    println(  forecast(15) == "Unknown")

  println()
  val t = new SimpleTime(hours=5, minutes=30)
  println(t.Hours == 5)
  println(t.Minutes == 30)

  val t2 = new SimpleTime(hours=10)
  println(t2.Hours == 10)
  println(t2.Minutes == 0)

  val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
  println( p.hasMoon == false)

  val pe = Person("Jane", "Smile", "jane@smile.com")
  println( pe.first == "Jane")
    println( pe.last == "Smile")
    println( pe.email == "jane@smile.com")
  println()
  val people = Vector(
    Person("Jane","Smile","jane@smile.com"),
    Person("Ron","House","ron@house.com"),
    Person("Sally","Dove","sally@dove.com")
  )
  println(people(0).equals(Person("Jane","Smile","jane@smile.com")))
   println( people(1).equals(Person("Ron","House","ron@house.com")))
    println( people(2).equals(Person("Sally","Dove","sally@dove.com")))
  println()
  val m = Map("sally@taylor.com"-> Name("Sally","Taylor"))
  println(m("sally@taylor.com").equals(Name("Sally", "Taylor")))

  val m2 = m +("jiminy@cricket.com"-> Name("Jiminy", "Cricket"))
 println( m2("jiminy@cricket.com").equals(Name("Jiminy", "Cricket")))
  println( m2("sally@taylor.com").equals(Name("Sally", "Taylor")))

  var myset = Set("English", "French", "Spanish", "German",  "Chinese" )
  myset += "Turkish"
  println(myset)
  myset += "French"
  println(myset)
  myset -= "Spanish"
  println(myset)


    println( myset.size == 5)
  val m3 = m2 - "jiminy@cricket.com"

  println( m3.size ==1)

}
