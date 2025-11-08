# Katalon_CheckoutFlow

## Description
This project contains automation tests for the **Cart and Checkout Flow** on the following website:

[https://www.saucedemo.com/v1/inventory.html]

The automation validates that users can:
- Add products to the cart
- Proceed with checkout
- Ensure successful transaction completion

---

## Test Cases

### Positive Test Cases
1. User can add a single product to the cart
2. User can add multiple products to the cart
3. User can remove a product from the cart via the product page
4. User can remove a product from the cart via the cart page
5. User can checkout a single product
6. User can checkout multiple products
7. User can cancel checkout on the Overview page

### Negative Test Cases
1. User cannot checkout with an empty cart
2. User cannot checkout if the First Name field is empty
3. User cannot checkout if the Last Name field is empty
4. User cannot checkout if the Postal Code field is empty

---

## How to Run
1. Clone the repository:  
```bash
git clone https://github.com/arumpikachu/Katalon_CheckoutFlow.git
