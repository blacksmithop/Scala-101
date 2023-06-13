// Let's go over some OOP concepts
// trait Goodbye:
//     def bye(next_meet: String) =
        

class Greet(var name: String):
    def speak() = println(s"Hello there, welcome $name to Scala")

@main def Basics(args: String*): Unit  =
    val p = Greet("Abhinav")
    println(p.name)
    p.speak()