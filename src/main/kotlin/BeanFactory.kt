class BeanFactory {
    private var beanMap = hashMapOf<String, Any>()

    fun getBean(name: String) = beanMap[name]

    fun registerBean(name: String, value: Any) { beanMap[name] = value }

}