import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.*

fun main() {
    window.onload = { document.body?.home() }
}

fun Node.home() {
    append {
        div {
            classes = setOf("position-absolute", "top-50", "start-50", "translate-middle")

            div {
                classes = setOf("d-flex", "flex-row", "align-items-center", "gap-5")

                logo()
                branding()
            }
        }
    }
}

private fun DIV.branding() {
    div {
        h1 {
            classes = setOf("text-uppercase")
            +"Thynq"
        }

        p {
            classes = setOf("text-uppercase")
            +"Software and technology"
        }
    }
}

private fun DIV.logo() {
    img {
        classes = setOf("mh-100", "d-inline-block")
        src = "/images/logo/logo-color.svg"
    }
}
