# 📱💬 Kakaotalk app (Java)

[![KR](https://img.shields.io/badge/README-한국어-blue)](./README.kakaotalkapp.ko.md)
[![EN](https://img.shields.io/badge/README-English-red)](./README.kakaotalkapp.md)

## 📖 Project Background & Objectives

- Inspired by the real KakaoTalk messenger service, this project implements a mobile chat application in Java with real-time communication using socket programming.
- Beyond simple UI, the app simulates actual messenger architecture by incorporating bi-directional client-server communication and session management.
- The focus is on understanding the structure and mechanisms of real-time communication systems by developing a user-friendly interface with responsive message delivery.

## 🛠 Tech Stack

- **Language**: Java (UI built with Swing)
- **Communication**: TCP Socket / Multi-Threading
- **IDE**: Eclipse
- **Database**: MySQL
- **Thread Management**: Asynchronous processing using ExecutorService

---

## 🎬 Demo Video

GIFs demonstrating the main features of the KakaoTalk App (converted from MP4)
(Note: GIF loading may take a moment.)
- 💭 Real-time Chat (Client ↔ Server)
- 💾 Message Save / Load
- 💬 Chatroom Switching / User List Display
- 🕓 Timestamps and Message Delivery Status

<img src="https://github.com/user-attachments/assets/b6498ea0-4616-4f99-bdc9-dd5dae98f33e" width="400"/> - KakaoTalk App Demo (1)<br>

<img src="https://github.com/user-attachments/assets/2592e18b-7740-4284-9750-1cd3454b97d9" width="400"/> - KakaoTalk App Demo (2)

---

## 🧭 Challenges & Solutions During Development

### 1) Real-Time Bi-Directional Communication
- **Issue**: Message order was incorrect when multiple users connected simultaneously.
- **Cause**: All client requests were handled sequentially on a single thread.
- **Solution**: Introduced a thread pool using ExecutorService to handle each client’s communication asynchronously.
- **Result**: Maintained message delay under 0.3 seconds even with up to 10 concurrent users.

### 2) Message Persistence
- **Issue**: Previous messages disappeared after the client was closed.
- **Cause**: Logs were only stored in memory due to lack of database integration.
- **Solution**: Implemented immediate INSERT into chat_log table on message send, and SELECT retrieval upon reconnection.
- **Result**: Chat history preserved per user session.

### 3) UI Thread Blocking
- **Issue**: UI temporarily froze when receiving messages.
- **Cause**: Receiving logic was executed directly on the Event Dispatch Thread (EDT).
- **Solution**: Used SwingWorker to separate UI and network handling.
- **Result**: Smooth performance with no UI lag during message exchange.

### 4) Message Alignment and Visual Structure
- **Issue**: Received messages were misaligned within chat bubbles.
- **Cause**: Center alignment was not applied in JLabel rendering.
- **Solution**: Used FontMetrics and Graphics to implement text centering logic.
- **Result**: Consistent spacing and layout in all message bubbles.

---

## 📝 Lessons Learned

- **Core Networking Concepts**: Gained hands-on experience in real-time data exchange and multithreaded socket programming.
- **UI-Thread Separation**: Learned best practices to minimize UI lag in event-driven applications.
- **Database Design**: Structured database using separate tables for user, chat_log, and room for better chatroom management.
- **Scalability Consideration**: Designed with extensibility in mind for future mobile/web integration using the client-server architecture.

## 🚀 Future Improvements

- Add support for image/file sharing
- Implement group chat functionality (multi-user broadcast architecture)
- Refactor using WebSockets for improved performance and scalability
- **Enhance UX**: Add dark mode, notification sounds, and profile customization
