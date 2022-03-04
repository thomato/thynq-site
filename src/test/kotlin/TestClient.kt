import kotlinx.browser.document
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class TestClient {
    @Test
    fun testCompanyName() {
        val container = document.createElement("div")
        container.home()

        assertContains(container.textContent!!, "Thynq", true)
    }

    @Test
    fun testCompanySlogan() {
        val container = document.createElement("div")
        container.home()

        assertContains(container.textContent!!, "Software and technology", true)
    }
} 