package equals.homeWork

/*
1. Создайте data-класс Адрес, конструктор которого содержит обязательные поля: название города, улицы и номер дома.
2. В методе higherOrderFunctions.filterAndMap.higherOrderFunctions.filterAndMap.main создайте объект этого класса.
3. Создайте второй такой же объект, использую метод copy().
4. Выведите на экран значения этих объектов, их хэш-коды и результат сравнения объектов по equals().
5. Используя деструктор, разложите объект на составляющие, сохранив значения в соответствующие переменные.
6. Удалите ключевое слово data и реализуйте все необходимые методы, чтобы работа метода higherOrderFunctions.filterAndMap.higherOrderFunctions.filterAndMap.main() осталась прежней.
 */
class Address(val city: String, val street: String, val house: Int) {

    operator fun component1(): String {  //как еще один вариант записи
        return city
    }
    operator fun component2() = street
    operator fun component3() = house

    fun copy(city: String = this.city, street: String = this.street, house: Int = this.house): Address =
        Address(city, street, house)


    override fun toString(): String {
        return "Address(city='$city', street='$street', house=$house)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (house != other.house) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + house
        return result
    }

}
