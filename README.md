# Person Parser Application

Proyek ini adalah aplikasi full-stack yang terdiri dari:

- **Backend**: Spring Boot REST API
- **Frontend**: React

Aplikasi ini berfungsi untuk memproses teks tidak terstruktur yang berisi
**nama, umur, dan kota**, kemudian menormalkan data tersebut dan menyimpannya ke dalam database.

---

## 🧠 Parsing Rules

- Proses parsing dilakukan dari **kanan ke kiri**
- Setiap karakter dibaca hanya **satu kali**
- Tidak menggunakan regex, replace, maupun split
- Umur diambil dari karakter numerik
- Nama dan kota mendukung lebih dari satu kata
- Jika kota merupakan **ibu kota provinsi**, maka nama provinsi akan ditambahkan
- Data ibu kota dimuat dari konfigurasi saat runtime

---

## 🛠️ Tech Stack

### Backend

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL / H2
- REST API

### Frontend

- React
- Fetch API

---

## 🚀 How to Run

### Backend

```bash
cd backend
mvn spring-boot:run
```

### Frontend

```bash
cd frontend
npm install
npm start
```
