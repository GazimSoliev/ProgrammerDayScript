import java.time.LocalDateTime

@JvmInline
value class Liter(val value: Number) {
    override fun toString() = "$value liters"
}

val Number.L get() = Liter(this)

enum class DrinkType(val drinkName: String) {
    Soda("Soda"),
    Beer("Beer"),
    Coffee("Coffee"),
    Water("Water"),
    Tea("Tea")
}

data class Person(val name: String) {
    fun drink(liters: Liter, drinkType: DrinkType) =
        println("$name drinks $liters of ${drinkType.drinkName}")
}


val person = Person("Programmer")
if (LocalDateTime.now().dayOfYear == 256) {
    println("Happy programmer's day")
    person.drink(1.5.L, DrinkType.Soda)
}



