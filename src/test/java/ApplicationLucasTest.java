import org.junit.jupiter.api.Test;


class ApplicationLucasTest {

    private ApplicationLucas applicationLucas = new ApplicationLucas();
    @Test
    public void testLala() {

        assert false == applicationLucas.lala(1);

        assert true == applicationLucas.lala(6);
    }
}