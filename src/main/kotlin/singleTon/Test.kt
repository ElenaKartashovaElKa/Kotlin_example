package singleTon

//Например, где-то в другом месте программы нам надо так же записать данные в БД
class Test {
    fun insertTestData(string: String) {
        Database.insertData(string)
    }
}