package OOA

class Planet(name: String, description: String ,  moons: Int = 1) {
  var Name : String = name
   var Description : String = description
  var Moons: Int = moons
  def hasMoon() : Boolean = Moons >=1

}

