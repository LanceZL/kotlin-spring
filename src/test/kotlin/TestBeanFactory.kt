import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TestBeanFactory {

    @Test
    fun testGetBean() {
        val beanFactory = BeanFactory()
        beanFactory.registerBean("hello", Service())

        val service = beanFactory.getBean("hello") as? Service
        assertNotNull(service)
        assertEquals("Hello from service!", service.sayHello())
    }

    class Service{ fun sayHello() = "Hello from service!" }
}