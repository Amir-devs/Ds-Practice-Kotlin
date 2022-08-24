class Stack<T : Any>() {
    private val storage = arrayListOf<T>()

    fun push(element: T) {
        storage.add(element)
    }

    fun pop(): T? {
        if (storage.size == 0) {
            return null
        }
        return storage.removeAt(storage.size - 1)
    }

    override fun toString() = buildString {
        appendLine("---> Top <---")
        storage.reversed().forEach {
            appendLine(it)
        }
        appendLine("---> End <---")
    }

}
