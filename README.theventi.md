# ☕ theventi cafe Kiosk System (Java)

[![KR](https://img.shields.io/badge/README-한국어-blue)](./README.theventi.ko.md)
[![EN](https://img.shields.io/badge/README-English-red)](./README.theventi.md)

## 📖 Project Background & Objectives

- This kiosk program was developed by referencing the real ordering environment of the Korean franchise café, The Venti.
- The goal was to design a UI/UX that closely replicates the actual store experience, allowing customers to intuitively select and pay for items.
- Beyond simple unmanned ordering, the project aims to enhance operational efficiency by incorporating data-driven order and menu management functionalities.

## 🛠 Tech Stack

- **Language**: Java (Swing-based UI)
- **IDE**: Eclipse
- **DB**: MySQL

---

## 🎬 Demo Video

This is a demonstration of the main features of the Venti Café Kiosk system.  
(Note: GIFs may take some time to load.)
- ☕ Menu Selection
- 🛒 Add to Cart
- 💳 Payment Processing
- 📊 Order History Management / View Popular Menu Items

<img src = "https://github.com/user-attachments/assets/b4331c95-546b-42c8-97c2-d525a2504c5b" width = "400"/> - The Venti Kiosk System Demo (1)<br>
<img src = "https://github.com/user-attachments/assets/bfbf5b79-cb6b-468a-99f9-b8caa698a51d" width = "400"/> - The Venti Kiosk System Demo (2)

---

## 🧭 Challenges & Solutions During Development

### 1) Menu Categories & Item Management
- **Issue**: As the number of menu items increased, buttons began to overlap and the UI became cluttered.
- **Cause**: All menu items were placed on a single screen.
- **Solution**: Simplified the layout by using JTabbedPane with CardLayout for category switching.
- **Result**: No UI overlap even with over 30 menu items; improved user navigation time.

### 2) Cart/Payment & Order DB Integration
- **Issue**: When ordering multiple items at once, quantity and total amount calculations were incorrect.
- **Cause**: Unstable handling of duplicate items and quantities in a single list structure.
- **Solution**: Used a HashMap<Menu, Integer> to manage the cart, and separated records into orders and order_items tables in MySQL.
- **Result**: 0% calculation error; able to track menu history per order.

### 3) Popular Menu Analysis
- **Issue**: Simple order logs were insufficient for sales/operation insights.
- **Cause**: Order data was only cumulatively stored without analysis.
- **Solution**: Wrote SQL queries to count sales per item and added a feature to view popular items in the admin page.
- **Result**: Enabled identification of popular items → useful for recommendations and inventory management.

### 4) Screen Transition Delay
- **Issue**: About 600ms delay when returning to the home screen after completing a payment.
- **Cause**: UI resources were being reloaded each time.
- **Solution**: Cached screen components and reused them during transitions.
- **Result**: Transition speed improved from ~600ms to ~150ms; better user experience.

### 5) Resolution/Scaling Compatibility
- **Issue**: Worked properly at 1920×1080 resolution, but UI elements overlapped at 125% scaling or on different resolutions.
- **Cause**: Fixed pixel-based layout design.
- **Solution**: Switched to GridBagLayout for relative sizing and scaling.
- **Result**: UI consistency maintained across 100–150% scaling environments.

---

## 📝 Lessons Learned

- **Real-World Service Simulation**: Importance of UI flow design that reflects the in-store customer journey (menu browsing → selection → payment → order tracking).
- **Power of Databases**: Enables not just order storage, but menu statistics and popular item analysis to support data-driven decisions.
- **Data Structure + RDBMS Design**: Used collections (Map) for in-memory cart management and MySQL for persistent storage, ensuring structural stability.
- **UI/UX Testing**: Minimizing repeated inputs and creating a clear, intuitive flow is crucial.
- **Code Structuring**: Separation of View-Model-Service improved maintainability and scalability.

## 🚀 Future Improvements

- **Extended Payment Modules**: Integrate simulations for card/QR payments.
- **Recommendation Feature**: Implement a recommendation algorithm based on popular items; offer time-based personalized menus.
- **Admin Mode**: Provide a dashboard for sales performance and menu-wise analytics.
- **Kiosk Mode**: Add full-screen mode and auto-restart scripts.
