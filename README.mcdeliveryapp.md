# 🍔 Mcdelivery app (Java)

[![KR](https://img.shields.io/badge/README-한국어-blue)](./README.mcdeliveryapp.ko.md)
[![EN](https://img.shields.io/badge/README-English-red)](./README.mcdeliveryapp.md)

## 📖 Project Background & Objectives

- This project replicates the real-world McDelivery service experience by implementing a food ordering and delivery application using Java Swing.
- Unlike kiosks, it simulates an app-based flow: from menu selection → adding to cart → entering delivery address → making payment.
- The goal is not only to implement a basic delivery app UI but also to incorporate backend processes such as order management and delivery tracking.

## 🛠 Tech Stack

- **Language**: Java (Swing-based UI)
- **IDE**: Eclipse
- **Database**: MySQL

---

## 🎬 Demo Video

Key features of the McDelivery App demonstrated in a GIF (converted from MP4)  
(*Note: GIF files may take a while to load.)
- 👤 Login / Sign-Up
- 🍔 Menu Selection
- 🛒 Add to Cart
- 💳 Checkout
- 📦 View Order History / Delivery Status

<img src="https://github.com/user-attachments/assets/ec232bdb-b09a-47c8-83d8-4be0acea2acd" width="400"/> - 맥딜리버리 앱 녹화본(1)<br>

<img src="https://github.com/user-attachments/assets/c0150f17-23a6-42bf-a392-65a5354f95ff" width="400"/> - 맥딜리버리 앱 녹화본(2)

---

## 🧭 Challenges & Solutions During Development

### 1) Delivery Address Input & Management
- **Issue**: Inconsistent address storage in the database.
- **Cause**: Raw string inputs were stored directly.
- **Solution**: Implemented regex validation and separated address fields (city/district, detailed address) in the DB.
- **Effect**: 0% error rate during address search/edit and ensured data consistency.

### 2) Cart & Order Management
- **Issue**: Incorrect quantity handling when ordering duplicate menu items.
- **Cause**: Cart was managed using a single list structure.
- **Solution**: Refactored cart to use HashMap<Menu, Integer>.
- **Effect**: Accurate quantity handling with 0% calculation errors even for duplicate orders.

### 3) Delivery Status Updates
- **Issue**: Unable to display delivery progress after order completion.
- **Cause**: Order status field was missing in the database.
- **Solution**: Introduced order status as an Enum (Pending → Preparing → Out for Delivery → Delivered) and added a status field to the DB.
- **Effect**: Real-time tracking of delivery process, improving user experience.

### 4) UI Resolution Compatibility
- **Issue**: UI worked fine on 1920×1080 but broke on other resolutions.
- **Solution**: Applied responsive layout using a combination of GridBagLayout and CardLayout.
- **Effect**: Ensured UI stability across various screen sizes.

---

## 📝 Lessons Learned

- **Delivery App Flow Design**: Designed new user scenarios such as address input and delivery tracking, distinct from traditional kiosk systems.
- **DB Schema Expansion**: Split the original order table into orders, order_items, and delivery_info for better data management.
- **User Experience Focus**: Minimized repetitive user inputs for cart and address entry.
- **Code Architecture**: Strengthened maintainability by separating layers into UI (View), Business Logic (Service), and Database Interaction (DAO).

## 🚀 Future Improvements

- **Integrate Real Payment Modules**: Add support for card and quick payment simulations.
- **Delivery Time Estimation**: Predict delivery time based on historical order data.
- **Recommendation System**: Suggest popular or personalized menus based on user history.
- **Mobile Compatibility**: Consider extending to Android clients beyond the current Swing-based desktop app.
