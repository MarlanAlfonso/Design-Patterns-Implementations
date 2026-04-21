# Restaurant Menu - Composite Design Pattern

## Files
- `MenuComponent.java` - Interface
- `MenuItem.java` - Leaf (individual item)
- `MenuCategory.java` - Composite (category/combo)
- `RestoApp.java` - Main application

---
## How to Run

```bash
javac *.java
java RestoApp
```
---
## Expected Output
```
--- MAIN MENU ---
--- BARKADA SOLO MEAL ---

Classic Burger: ₱250.00
Large Fries: ₱85.00
Root Beer: ₱60.00
Vanilla Sundae: ₱45.00

==============================
Total Menu Value: ₱440.00
```

---
## How It Works
- `MenuItem` stores a name and price (leaf node)
- `MenuCategory` holds a list of `MenuComponent` objects (composite node)
- `getPrice()` on a category recursively sums all children
- `print()` on a category delegates to each child automatically