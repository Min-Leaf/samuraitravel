const stripe = Stripe('pk_test_51QjIu1Ag9JZzzy2cESCnJ8JDgzx6a7YI0QsDIg3y5tfiGgtoPFpxHCanwdDAP3vNUW6vjnapP4PQl01DO34EgqH200YbRAma37');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
 stripe.redirectToCheckout({
   sessionId: sessionId
 })
});