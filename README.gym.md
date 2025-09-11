# 🏋️‍♂️ Gym Kiosk System (Java)

## 📖 Project Background & Objectives
- Developed a kiosk that allows gym users to intuitively manage memberships, make payments, and check workout programs.
- Aimed to automate processes traditionally reliant on manual work or front desk staff, thereby improving operational efficiency.
- Designed and implemented the UI/UX with actual kiosk environments in mind as much as possible.

## 🛠 Tech Stack
- **Language**: Java (UI built with Swing)
- **IDE**: Eclipse
- **DB**: Text files

---

## 🎬 Demo Video
This is a demo showing the key features of the gym kiosk system.
(Note: GIFs may take some time to load.)
- 👤 Membership Management
- 💳 Payment and Program Selection

<img src="https://github.com/user-attachments/assets/6349a444-082e-49ac-a9b1-5ee9d7804885" width="400"/> - Gym Kiosk System Demo (1)<br>

<img src="https://github.com/user-attachments/assets/9a74b459-6a77-49e8-8973-2f89bbdb2ef5" width="400"/> - Gym Kiosk System Demo (2)

---

## 🧭 Challenges & Solutions During Development

### 1) UI Freezing/Lag (EDT Blocking)
- **Issue**: Temporary UI freezes during member search/save operations.
- **Cause**: File I/O and calculations were executed synchronously on the Event Dispatch Thread (EDT).
- **Solution**: Separated I/O to background threads using SwingWorker; kept UI updates on EDT only.
- **Impact**: UI response time after clicking search/save improved from ~800ms → ~180ms.

### 2) Layout Breaking on Non-FHD Resolutions
- **Issue**: UI displayed correctly at 1920×1080 but broke at 125% scaling or different resolutions.
- **Cause**: Use of absolute positioning and fixed pixel sizes.
- **Solution**: Switched to LayoutManager (GridBagLayout), used proportional layout based on container size, dynamically scaled fonts/icons.
- **Impact**: UI overlap issues reduced to 0 across 100–150% scaling.

### 3) File DB Concurrency & Consistency Issues
- **Issue**: Occasional data loss/corruption on rapid consecutive saves.
- **Cause**: Write conflicts and partial writes.
- **Solution**: Wrote to a temporary .tmp file first, then atomically replaced the original using Files.move(ATOMIC_MOVE), applied file locks.
- **Impact**: Save failure rate dropped to 0%, consistency issues resolved.

### 4) Missing Input Validation/Edge Case Handling
- **Issue**: Invalid values like incorrect birth dates, phone numbers, and membership durations were being saved.
- **Cause**: Input validation existed only at UI level; domain-level checks were weak.
- **Solution**: Implemented dual-layer validation (UI + domain model) with regex/range checks, unified error messages.
- **Impact**: Exception cases due to invalid input reduced by over 60%.

### 5) Listener Duplication & Memory Growth on Screen Switch
- **Issue**: Click events were triggered multiple times after navigating between pages several times.
- **Cause**: Forgot to remove old listeners when loading new screens.
- **Solution**: Established screen lifecycle methods (init()/dispose()), enforced removeListener() policy.
- **Impact**: Event duplication resolved, memory usage over extended sessions stabilized.

---

## 📝 Lessons Learned

- **EDT Principle**: Heavy operations should never run on the EDT. Keep UI light, move I/O to background threads.
- **Layout Design Shift**: Designing based on relationships/proportions, not pixels, ensures robustness across resolutions/scaling.
- **Ensure Consistency at Save Time**: UI validation is not enough—design a data safety net using atomic writes/locking/backups.
- **Single Responsibility Separation**: Separating View (UI), Model (domain), and Worker (task) makes testing and maintenance easier.
- **Power of Visualization**: Measuring and logging UI response/file I/O times helps prioritize

<!--
## 🔧 Performance/Quality Metrics (with measurement methods)

- **UI Response Time**: Time from click to first UI update (measured with System.nanoTime)
  - Target **< 200ms**, Current **~180ms**
- **File I/O Time**: Avg. time for a single save (N=100)
  - Target **< 50ms**, Current **~35ms**
- **Error Rate**: Number of validation failures/exceptions per day
  - Target **≤ 1/day**, Current **0–1/day**
- **Memory Stability**: Heap usage increase after 2 hours of continuous use
  - Target **< 10%**, Current **~7%**

> *TIP: `java.util.logging`/`slf4j`로 타임스탬프+구간 로깅을 남겨 재현성/회고에 활용.*
---
-->

## 🚀 Future Improvements

- **Database Migration**: Switch from text files to (lightweight) MySQL to improve
- **Modularization**: Separate DAO/Service layers, expand unit tests using test doubles.
- **Kiosk Mode**: Add full-screen lock, idle (attract) screen, auto-launch script on reboot.
