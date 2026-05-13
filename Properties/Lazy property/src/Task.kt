class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            value = value ?: initializer()
            return value!!
        }
}
