package i03_BankCard_initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testConstructorW3Parameters() {
        //Given
        CreditCard card = new CreditCard(1000, Currency.EUR);
        //Then
        assertEquals(308_230L, card.getBalance());
    }

    @Test
    void testConstructorW1Parameter() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    void testPaymentW2ParametersSuccess() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertTrue(card.payment(100, Currency.EUR));
        assertEquals(69177L, card.getBalance());
    }

    @Test
    void testPaymentW2ParametersFail() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertFalse(card.payment(1000, Currency.EUR));
        assertEquals(100_000L, card.getBalance());
    }

    @Test
    void testPaymentW1ParameterSuccess() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertTrue(card.payment(10_000));
        assertEquals(90_000L, card.getBalance());
    }

    @Test
    void testPaymentW1ParameterFail() {
        //Given
        CreditCard card = new CreditCard(100_000);
        //Then
        assertFalse(card.payment(150_000));
        assertEquals(100_000L, card.getBalance());
    }
}