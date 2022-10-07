package equals.kotlinDataClass

data class Student(val name: String, val lastName: String, val id: String) {

    //если класс не data, то надо переопределить поля через ключевое слово operator, чтобы работал метод destructor
//    operator fun component1() = name
//    operator fun component2() = lastName
//    operator fun component3() = id

    //если класс не data, то метод copy можно записать так:
//    fun copy(name: String = this.name, lastName: String = this.lastName, id: String = this.id): Student {
//        return Student(name, lastName, id)
//    }

    /*
    Чем data класс отличается от обычного класса:
    1. переопределен toString()
    2. переопределен equals()
    3. переопределен hashCode()
    4. Деструктивные операторы componentN()
    5. copy()
     */

}