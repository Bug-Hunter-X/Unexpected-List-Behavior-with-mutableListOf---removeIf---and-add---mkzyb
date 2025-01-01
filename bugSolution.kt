fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it <=2 }
    println(newList) // Output: [1, 2]
    val updatedList = newList.toMutableList()
    updatedList.add(6)
    println(updatedList) // Output: [1,2,6]
    val filteredList = updatedList.filter {it % 2 != 0}
    println(filteredList) // Output: [1] 
}