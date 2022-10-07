package companionObject

class Calc {
    /* чтобы не создавать объект для вызова функции, создается  companion object.
     это то же самое, что и static в java
      companion object - объект, который относится к классу, в котором он был объявлен
      этот объект всегда существует, его не нужно создавать самостоятельно.
      точно так же, как static-методы в java относятся к классу, а не к объекту, и не имеют доступа к полям объекта
       companion object - не имеет доступа к полям класса
        companion object == static
      */

    companion object {
        /* Если по мы пишем так val PI = 3.14,
        то по умолчанию создается так:
         private static final float PI = 3.14
          public float getPI()
          {
              return PI;
          }
          поэтому надо указывать ключевое слово const, это будет переменная у которой не будет gettera */

        const val PI = 3.14
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }

}