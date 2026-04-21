# ☕ Coffix — Coffee Ordering App

> *"Fall in Love With Coffee in Blissful Delight"*  
> A modern Android coffee ordering application with a beautiful UI, location-based browsing, and seamless ordering experience.

---

## 📱 Screenshots

| Splash / Onboarding | Home Screen | DETAIL SCREEM
|:-------------------:|:-----------:|
| ![Splash Screen](https://github.com/HIMANSHU3125/Apna-Coffee/blob/33433adb0b30bf6f215fc2e8fdb36f093ae74725/WhatsApp%20Image%202026-04-21%20at%2011.45.30%20(2).jpeg) | ![Home Screen](https://github.com/HIMANSHU3125/Apna-Coffee/blob/5026e0b1d41954da6efae9a0770b39431792de75/WhatsApp%20Image%202026-04-21%20at%2011.45.30%20(1).jpeg)  ![DETAIL SCREEN](https://github.com/HIMANSHU3125/Apna-Coffee/blob/53be13d057eee49867ce3b4a34473c8c404c5362/WhatsApp%20Image%202026-04-21%20at%2011.45.29.jpeg) ![ORDER SCREEN](https://github.com/HIMANSHU3125/Apna-Coffee/blob/2e648e47c4815dc8f4330550c653ea6d1596bc4d/WhatsApp%20Image%202026-04-21%20at%2011.45.30.jpeg)|

> 📁 Place your screenshots inside a `screenshots/` folder in the root of this repository.

---

## ✨ Features

- 🌍 **Location-based browsing** — Detects and displays your current area (e.g., Panchkroshi Sarnath, Varanasi)
- 🔍 **Search** — Quickly search for your favourite coffee
- 🎯 **Filter by Category** — Browse All Coffee, Macchiato, Latte, Americano, and more
- 🏷️ **Promo Banners** — Highlights current deals like "Buy One Get One FREE"
- 🛒 **Add to Cart** — One-tap add button on each product card
- ❤️ **Wishlist** — Save your favourite items
- 👤 **User Profile** — Manage your account
- 🎨 **Beautiful UI** — Dark-themed onboarding with warm coffee tones

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Kotlin  |
| Platform | Android (Native) |
| UI | Jetpack Compose |
| Architecture | MVVM |
| Navigation | Android Navigation Component |
| Minimum SDK | API 21 (Android 5.0) |

> ✏️ *Update the table above to match your actual tech stack.*

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (Ladybug or later recommended)
- JDK 11 or higher
- Android SDK API 21+

### Installation

```bash
# 1. Clone the repository
git clone https://github.com/YOUR_USERNAME/coffix-app.git

# 2. Open in Android Studio
File → Open → Select the cloned folder

# 3. Sync Gradle
Android Studio will prompt to sync — click "Sync Now"

# 4. Run the app
Click the ▶ Run button or press Shift + F10
```

---

## 📁 Project Structure

```
coffix-app/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/yourpackage/coffix/
│   │   │   │   ├── ui/          # Screens & Fragments
│   │   │   │   ├── viewmodel/   # ViewModels
│   │   │   │   ├── model/       # Data models
│   │   │   │   ├── repository/  # Data repository
│   │   │   │   └── utils/       # Helper classes
│   │   │   ├── res/
│   │   │   │   ├── layout/      # XML layouts
│   │   │   │   ├── drawable/    # Icons & images
│   │   │   │   └── values/      # Colors, strings, themes
│   │   │   └── AndroidManifest.xml
│   └── build.gradle
├── screenshots/
│   ├── splash.jpg
│   └── home.jpg
├── .gitignore
├── build.gradle
└── README.md
```

---

## 🗺️ Screens Overview

| Screen | Description |
|--------|-------------|
| **Splash / Onboarding** | Beautiful full-screen intro with "Get Started" CTA |
| **Home** | Location header, search bar, promo banner, category tabs, product grid |
| **Cart** | Items added for checkout |
| **Wishlist** | Saved favourite coffees |
| **Profile** | User account management |

---

## 🤝 Contributing

Contributions are welcome! Here's how:

```bash
# 1. Fork the repo
# 2. Create your feature branch
git checkout -b feature/your-feature-name

# 3. Commit your changes
git commit -m "feat: add your feature description"

# 4. Push to your branch
git push origin feature/your-feature-name

# 5. Open a Pull Request on GitHub
```

---

## 📋 GitHub Management Guide

### ✅ Initial Setup (Do this once)

```bash
# Initialize git in your project folder
git init

# Add all files
git add .

# First commit
git commit -m "Initial commit: Coffix coffee app"

# Connect to your GitHub repo
git remote add origin https://github.com/YOUR_USERNAME/coffix-app.git

# Push to GitHub
git push -u origin main
```

### 📸 Adding Screenshots to GitHub

```bash
# Create screenshots folder
mkdir screenshots

# Copy your app screenshots into the screenshots/ folder
# Then add and push them
git add screenshots/
git commit -m "docs: add app screenshots"
git push
```

### 🔄 Regular Workflow (After every coding session)

```bash
git add .
git commit -m "feat: describe what you changed"
git push
```

### 💬 Good Commit Message Examples

| Type | Example |
|------|---------|
| New feature | `feat: add search filter by coffee type` |
| Bug fix | `fix: resolve cart item count not updating` |
| UI change | `ui: update home screen promo banner style` |
| Docs | `docs: update README with setup instructions` |
| Refactor | `refactor: clean up HomeFragment code` |

---



```
*.iml
.gradle
/local.properties
/.idea
.DS_Store
/build
/captures
.externalNativeBuild
.cxx
local.properties
google-services.json
```

---

## 📄 License

```
MIT License — feel free to use, modify, and distribute.
```

---

## 👨‍💻 Author

Himanshu Gupta 
📧 email:sg7266023030@gmail.com


---

<p align="center">Made with ☕ and ❤️ in Varanasi, India</p>
