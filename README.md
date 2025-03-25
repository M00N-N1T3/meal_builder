# Meal Builder Factory - README

## **Project Overview**
The **Meal Builder Factory** project is a simple but effective way to learn the **Builder Factory Pattern**. The goal is to create a system that allows customers to order different meal combinations, each containing a main dish, a side, a drink, and optionally a dessert. The **Builder Pattern** ensures step-by-step meal construction, while the **Factory Pattern** provides pre-configured meal options for convenience.

## **Objective**
- Implement the **Builder Pattern** to construct a **Meal** object step by step.
- Implement the **Factory Pattern** to create different meal combinations without requiring direct object instantiation.
- Ensure flexibility by allowing both pre-configured meals and fully customized orders.

---

## **Project Requirements**
### **1. Programming Language**
- Java **Builder & Factory Patterns**.

### **2. Core Components**
#### **A. Meal Class (Product)**
- Represents a **meal order**.
- Attributes:
    - `String mainDish`
    - `String sideDish`
    - `String drink`
    - `String dessert` (optional)
- Constructor should only be accessible via the Builder.

#### **B. MealBuilder (Builder Pattern)**
- A class with methods to set each meal component.
- Implements the following methods:
    - `setMainDish(String mainDish)`
    - `setSideDish(String sideDish)`
    - `setDrink(String drink)`
    - `setDessert(String dessert)` (optional)
    - `build()` - Returns the final **Meal** object.

#### **C. MealBuilderFactory (Factory Pattern)**
- Provides pre-configured meal builders.
- Implements a static `getMeal(String mealType)` method.
- Meal types to implement:
    - **Veggie Meal** → Main: Veggie Burger, Side: Salad, Drink: Juice, Dessert: Fruit Cup
    - **Chicken Meal** → Main: Grilled Chicken, Side: Fries, Drink: Soda, Dessert: Ice Cream
    - **Kids Meal** → Main: Nuggets, Side: Apple Slices, Drink: Milk, Dessert: Cookie
- Allows full customization via a **Custom Meal Builder**.

#### **D. Client Code (Main Application)**
- Demonstrates the use of `MealBuilderFactory`.
- Prints meal details when created.
- Accepts user input to allow **customized meal creation**.

---

## **Implementation Details**
### **1. Structure**
```
MealBuilderFactoryProject/
│── src/
│   ├── Meal.java (Product)
│   ├── MealBuilder.java (Builder)
│   ├── MealBuilderFactory.java (Factory)
│   ├── Main.java (Client Code)
│── README.md
│── .gitignore
│── LICENSE (if applicable)
```

### **2. Expected Output**
#### **Example 1: Using Factory for Pre-configured Meal**
```
Meal: Chicken Meal
  - Main Dish: Grilled Chicken
  - Side Dish: Fries
  - Drink: Soda
  - Dessert: Ice Cream
```
#### **Example 2: Custom Meal Creation**
```
Enter your meal choices:
Main Dish: Steak
Side Dish: Mashed Potatoes
Drink: Lemonade
Dessert: Cheesecake

Your Custom Meal:
  - Main Dish: Steak
  - Side Dish: Mashed Potatoes
  - Drink: Lemonade
  - Dessert: Cheesecake
```

---

## **Enhancements & Extensions**
- Add **nutrition facts** to meals.
- Include **pricing** and allow users to calculate total cost.
- Introduce a **combo discount system**.
- Extend to support **dietary preferences** (e.g., gluten-free, keto, etc.).

## **Conclusion**
This project provides hands-on practice with the **Builder Factory Pattern**, demonstrating how to construct objects step by step while offering pre-configured options. It’s a great way to master **object-oriented design principles** in a structured yet flexible way.