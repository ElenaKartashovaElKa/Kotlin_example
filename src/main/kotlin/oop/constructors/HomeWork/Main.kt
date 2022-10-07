package oop.constructors.HomeWork

fun main() {
    var book = Book("Kotlin")
    println(book.name)
    book.year = 2017
    book.prise = 1200
    book.year = 2019

    println("${book.name}, ${book.year}, ${book.prise}")
}