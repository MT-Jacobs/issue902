package issue902
import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec

@MicronautTest
class EmptyConstructorTest: StringSpec({

    "test working with no constructor" {
        assert(true)
    }
})
