##Assumptions
- Inventory of books are replenished offline. As such there's no code to restore inventory.
- Stock is not checked before checkout. 
- No support for multiple Checkouts at the same time. The facade class (Checkout) is not thread safe.
