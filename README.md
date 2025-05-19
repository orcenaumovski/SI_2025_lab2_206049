Орце Наумовски 206049 

2. CFG
![Control Flow Graph](images/cfg.png)

3. Cyclomatic complexity
-Цикломатската комплексност на кодот е 9. До резултатот стигнав со формулата V(G) = P + 1,
 каде што P е бројот на predicate јазли. Тие јазли се:
 ->if (allItems == null)
 ->i < allItems.size() - дел од for циклусот
 ->if (item.getName() == null || item.getName().length() == 0)
 ->if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
 ->if (item.getDiscount() > 0)
 ->if (cardNumber != null && cardNumber.length() == 16)
 ->j < cardNumber.length()  - дел од for циклусот
 ->if (allowed.indexOf(c) == -1)

