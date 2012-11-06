import org.junit.Assert.*
import org.junit.Test as test
import org.junit.Before as setup
import org.junit.After as teardown

class Tests {
    setup fun before() {
        // Set up fixture
    }

    test fun simple() {
        assertEquals(4, 2 * 2)
    }

    teardown fun after() {
        // Clean up
    }
}
