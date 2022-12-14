package inheritance.homeWork.worker

/*
1. Создать класс Работник, конструктор которого содержит поля: name и возраст, а также метод work(),
который выводит на экран слово "Работаю...".
2. Создать класс Программист, который является наследником Работника. Этот класс содержит дополнительное поле "язык программирования".
Метод work() будет выводить надпись: "Пишу код на ...(язык программирования)".
3. В методе higherOrderFunctions.filterAndMap.higherOrderFunctions.filterAndMap.main() создать коллекцию работников, в которой будут как обычные работники, так и программисты.
4. В цикле заставить всех работников работать.
 */
abstract class Worker(val name: String, val age: Int) {

    abstract fun work()
}