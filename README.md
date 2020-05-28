# Programming Paradigms

## Scala Worksheet Supplemental - Two

This sheet is intended to familiarise students with the object-oriented programming aspects of Scala. 
The sheet also includes some questions on *Pattern Matching*, a very powerful feature in Scala.

### Pattern Matching

```scala
    def matchColor(color:String):String = { 
    	color match { 
    		case "red" => "RED" 
    		case "blue" => "BLUE" 
    		case "green" => "GREEN" 
    		case _ => "UNKNOWN COLOR: " + color 
    	} 
    } 
    matchColor("white") is "UNKNOWN COLOR: white" 
    matchColor("blue") is "BLUE"
```

Create a method forecast that represents the percentage of cloudiness, and use it to produce a “weather forecast” 
string such as “Sunny” (100), “Mostly Sunny” (80), “Partly Sunny” (50), “Mostly Cloudy” (20), and “Cloudy” (0). 
For this exercise, only match for the legal values 100, 80, 50, 20, and 0
Everything else should produce “Unknown.” 

Satisfy the following tests: 

```scala
    forecast(100) is "Sunny" 
    forecast(80) is "Mostly Sunny" 
    forecast(50) is "Partly Sunny" 
    forecast(20) is "Mostly Cloudy" 
    forecast(0) is "Cloudy" 
    forecast(15) is "Unknown"
```

### Default and Named Arguments

Define a class `SimpleTim`e that takes two arguments: an `Int` that represents hours, and an `Int` that represents minutes. 
Use *named arguments* to create a `SimpleTime` object. 

Satisfy the following tests: 

```scala
    val t = new SimpleTime(hours=5, minutes=30) 
    t.hours is 5
    t.minutes is 30
```

Using your solution for `SimpleTime`, default `minutes` to `0` so that you don’t have to specify them. 
Your code should satisfy the following tests: 

```scala
    val t2 = new SimpleTime2(hours=10)
    t2.hours is 10
    t2.minutes is 0
```
   
Create a class `Planet` that has, by default, a single moon. The `Planet` class should have a `name` (`String`) 
and `description` (`String`). 
Use named arguments to specify the name and description, and a default for the number of moons. 
Your code should satisfy the following tests:

```scala
    val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0) 
    p.hasMoon is false
```

### Case Classes

Create a *case class* to represent a `Person` in an address book, complete with `String`s for the name 
and a `String` for the contact information. 
Your code should satisfy the following tests:

```scala
    val p = Person("Jane", "Smile", "jane@smile.com") 
    p.first is "Jane" 
    p.last is "Smile" 
    p.email is "jane@smile.com"
```

Create some `Person` objects. Put the `Person` objects in a `Vector`. 
Your code should satisfy the following tests: 

```scala
    val people = Vector(
        Person("Jane","Smile","jane@smile.com"), 
        Person("Ron","House","ron@house.com"), 
        Person("Sally","Dove","sally@dove.com")
    )
    people(0) is "Person(Jane,Smile,jane@smile.com)" 
    people(1) is "Person(Ron,House,ron@house.com)"
    people(2) is "Person(Sally,Dove,sally@dove.com)"
```

### Maps and Sets

Maps store information using unique keys. For instance, an email address can serve as a unique key. 

Create a class `Name` containing `firstName` and `lastName` fields/members. 
Create a `Map` that associates `emailAddress` (a `String`) with `Name`. 
Your code should satisfy the following test:

```scala
    val m = Map("sally@taylor.com"-> Name("Sally","Taylor"))
    m("sally@taylor.com") is Name("Sally", "Taylor")
```
    
Adding to your solution for the previous exercise, add `Jiminy Cricket` to the map, 
where his email address is `“jiminy@cricket.com”`. 
Your code should satisfy the following tests:

```scala
    m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
    m2("sally@taylor.com") is Name("Sally", "Taylor")
```

Sets store distinct values. 
Create a set for the following languages: `English`, `French`, `Spanish`, `German`, and `Chinese`. 
What happens when you try to add `Turkish`?

Try to add a language that already exists to the set (for example, `French`). What happens?

Remove “`Spanish`” from a `Set` containing `English`, `French`, `Spanish`, `German`, and `Chinese`. 

Remove “`jiminy@cricket.com`” from a `Map` containing information for Jiminy Cricket, Mary Smith, and Sally Taylor 
(using the classes defined earlier). 
Your code should satisfy the following tests:

```scala
    val set3 = // fill this in
    set3.size is 4
    val map3 = // fill this in
    map3.size is 2
```
