fun main() {

        val list = LinkedList<Int>()

        list.push(3)
        list.push(2)
        list.push(1)

        println(list)
        list.reverse()
        println(list)

        println(list.findMiddle()?.value)

}
