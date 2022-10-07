package equals.kotlinDataClass

fun main() {
    val student1 = Student("Иван", "Иванов", "412344") // конструктор
   // val student2 = Student("Иван", "Иванов", "412344")
    val student2 = student1.copy(id = "2342")

    //и есть деструктивный оператор - деструктор
    val (name: String, lastName: String, id: String) = student1 //из объекта получили набор переменных
    println(name)
    println(lastName)
    println(id)

    println(student1) //в date классе - переопределен toString()
    println(student2)
    println(student1.hashCode()) //date - переопределен hashCode()
    println(student2.hashCode())
    println(student1 == student2) //date - переопределен equals()
    println(student1 === student2) //date - переопределен == (сравнение на равенство)
}