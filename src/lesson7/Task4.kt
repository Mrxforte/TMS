package lesson7

fun main() {
    val c1 = Counter()
    val c2 = Counter()
    val c3 = Counter()

    println("Total count: ${Counter.getTotal()}")
}

class Counter {
    companion object {
        private var totalCount = 0

        fun getTotal(): Int {
            return totalCount
        }
    }

    init {
        totalCount++
    }
}
