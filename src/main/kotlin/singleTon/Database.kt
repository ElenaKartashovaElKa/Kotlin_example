package singleTon

//суть в том, чтобы из разных мест можно было обращаться к одной и той же БД, чтобы можно было создать только одну БД
object Database /*class/private constructor()*/ {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }
/*   стиль Kotlin (вот такая реализация была бы на Java)
    companion object {
        var db: Database? = null
        fun getInstance(): Database {
            //проверяем db: если не null, то вернет нам уже созданную db (БД)
            db?.let {
                return it
            }
            val instance = Database() //если db null, то создаем новый объект db
            db = instance  //передаем db, что создана БД, что она уже не null теперь
            return instance
        }
    }
*/
}