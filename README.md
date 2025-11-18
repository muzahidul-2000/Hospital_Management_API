🏥 Hospital Management API

A complete Spring Boot REST API for managing hospital operations such as patients, doctors, appointments, authentication, and more.

🚀 Features

✔ Patient Management

Add, update, delete, and fetch patient details

Filter patients by age, gender, blood group, etc.

✔ Doctor Management

Add and manage doctors

Fetch specialization-wise doctors

Doctor availability

✔ Appointment Booking

Create and manage appointments

Prevent double-booking

Track appointment history

✔ Authentication & Authorization

JWT-based login system

Role-based access (ADMIN, DOCTOR, RECEPTION)

✔ Billing Module (Optional)

Create bills for patients

Track paid/unpaid bills

✔ Clean REST API Architecture

Layered architecture: Controller → Service → Repository

Uses DTOs for clean data transfer

Global exception handling

🛠 Tech Stack
Layer	Technology
Backend	Spring Boot 3, Spring Web, Spring Data JPA
Security	Spring Security, JWT
Database	MySQL / PostgreSQL
Build Tool	Maven
Tools	IntelliJ IDEA, Postman, Git
📁 Project Structure
src/main/java/com/hospitalmanagement/
│
├── controller     # REST controllers
├── service        # Business logic
├── repository     # JPA repositories
├── model          # Entity classes
├── dto            # Request/response DTOs
├── exception      # Global exception handlers
└── security       # JWT auth

🔧 Installation & Setup
1. Clone the Repository
git clone https://github.com/muzahidul-2000/Hospital_Management_API.git

2. Configure Database

In application.properties (not committed):

spring.datasource.url=jdbc:mysql://localhost:3306/hospital
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Run the Application
mvn spring-boot:run

🧪 API Endpoints
🔹 Patient APIs
Method	Endpoint	Description
GET	/api/patients	Get all patients
POST	/api/patients	Add a new patient
GET	/api/patients/{id}	Get patient by ID
PUT	/api/patients/{id}	Update patient
DELETE	/api/patients/{id}	Delete patient
🔹 Doctor APIs
Method	Endpoint
GET	/api/doctors
POST	/api/doctors
GET	/api/doctors/speciality/{name}
🔹 Appointment APIs
Method	Endpoint
POST	/api/appointments
GET	/api/appointments/{id}
🔹 Auth APIs
Method	Endpoint
POST	/auth/register
POST	/auth/login
🛡 Security (JWT Flow)

User registers / logs in

Server returns JWT token

User includes token in every request:

Authorization: Bearer <token>


Token validated via filter

API access granted based on role

📝 Future Enhancements

Nurse management

Pharmacy module

Email/SMS notifications

Docker support

Swagger documentation

🤝 Contributing

Contributions are welcome!
Please create an issue first before making major changes.

📄 License

This project is licensed under the MIT License.

👤 Author

Muzahidul Islam

💼 GitHub: github.com/muzahidul-2000
