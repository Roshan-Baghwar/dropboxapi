# CloudEagle Assessment — Dropbox Business API Integration

## 📘 Overview
This Spring Boot application demonstrates how to integrate the Dropbox Business API using OAuth 2.0.
It connects with the `/team/members/list_v2` endpoint to fetch the list of all team members.

---

## ⚙️ Tech Stack
- Java 21
- Spring Boot 3.5.7
- OkHttp 4.11.0 (for HTTP requests)
- org.json (for JSON parsing)
- Maven

---

## 🚀 Setup & Run Locally

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Roshan-Baghwar/dropboxapi.git
cd dropboxapi
```

### 2️⃣ Add Dropbox Access Token
Open `src/main/resources/application.properties` and replace the placeholder:
```properties
dropbox.access.token=sl.u.YOUR_TEAM_ACCESS_TOKEN
```

### 3️⃣ Build and Run
```bash
mvn spring-boot:run
```

### 4️⃣ Test API
Send a GET request:
```
GET http://localhost:8080/api/dropbox/team-members
```
✅ Expected Response (example):
```json
{
  "members": [
    {
      "profile": {
        "team_member_id": "dbmid:AABXYZ1234",
        "email": "roshan@example.com",
        "name": { "display_name": "Roshan Baghwar" }
      },
      "role": { ".tag": "member_only" }
    }
  ],
  "has_more": false
}
```

---

## 🧱 Project Structure
```
src/main/java/com/cloudeagle/dropboxapi/
 ├── controller/
 │     └── DropboxController.java      → REST API endpoint
 ├── service/
 │     └── DropboxService.java         → Calls Dropbox API
 └── DropboxapiApplication.java        → Spring Boot main class
src/main/resources/
 └── application.properties            → Holds access token configuration
```

---

## 📄 Assignment Summary
- Implemented OAuth 2.0 authentication via Team Access Token.
- Integrated Dropbox Business API (`/team/members/list_v2`).
- Verified API responses with Postman and console logs.
- Code structured in Spring Boot with clean service and controller layers.

---

## 👤 Author
**Roshan Baghwar** 