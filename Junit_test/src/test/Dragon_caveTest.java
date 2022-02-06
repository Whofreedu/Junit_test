import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Dragon_caveTest {
    Dragon_cave dragon_cave;

    @BeforeEach
    void setUp() {
        dragon_cave = new Dragon_cave();
    }

    @Test
    void main() {
        assertEquals(2, choice.nextInt() );
    }

    @AfterEach
    void tearDown() {
    }
}