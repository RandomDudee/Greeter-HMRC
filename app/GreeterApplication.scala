package app

import sun.plugin2.message.Message

import scala.io.StdIn

/**
  * Created by digital032746 on 10/09/18.
  */


class Person(name: String, age: Int) {

  private val years :String = {if
  ( age > 1 ) {
    "years"
  } else {
    "year"
  }
  }

  def speak(): String = {
    if (name == "adam") {
      s"You don't get a hello!"
    } else {
      s"Hello $name, you are $age $years old!"
    }
  }
}

object Prompt {
  def ask(message: String)= StdIn.readLine(message)
}

object GreeterApplication extends App {



  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask(("What is your age ? "))

  val person = new Person(name, age.toInt)

  println(person.speak())

}


