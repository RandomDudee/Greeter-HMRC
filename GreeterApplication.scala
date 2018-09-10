import scala.io.StdIn

/**
  * Created by digital032746 on 10/09/18.
  */
object GreeterApplication extends App{


  def greet(name: String) = println("Hello " + name )

  val name = StdIn.readLine("What is your name?")

  greet(name)


}
