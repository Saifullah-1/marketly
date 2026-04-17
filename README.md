# Marketly 🛒

**Marketly** is a full-stack e-commerce web application where users can browse, search, rate, and order products — while vendors and admins manage listings and transactions.

## Features ✨

- **User Authentication & Authorization** 🔐  
  Google OAuth and basic login with JWT-based security. Role-based access: Customer, Vendor, Admin.

- **Customer Capabilities** 👤  
  - Browse and search for products  
  - Add items to cart and checkout securely  
  - Leave reviews and ratings  
  - View order history  

- **Vendor Capabilities** 🏪  
  - List and manage products  
  - Track and fulfill customer orders  

- **Admin Capabilities** 🛠️  
  - Manage all products, users, and orders  
  - Promote users to admin roles  
  - Oversee site-wide discounts and promotions  

## Tech Stack 🧰

- **Frontend:** React.js ⚛️  
- **Backend:** Spring Boot ☕  
- **Database:** MySQL 🐬  
- **Security:** JWT + Google OAuth  
- **Testing:** JUnit & Mockito (60%+ coverage) ✅

## Development Approach ⚙️

- Followed **Agile methodologies** with iterative development cycles.  
- Tasks were tracked and managed using **Jira** for better team collaboration.

## Getting Started 🚀

### Prerequisites

- Java 21
- Node.js & npm  
- MySQL  
- Maven

### Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/marketly.git
   ```
2. Set up the database and configure `application.properties`.

3. Start the backend:
   ```bash
  cd backend
  ./mvnw spring-boot:run
   ```

4. Start the frontend:
   ```bash
   cd frontend
   npm install
  npm run dev
   ```

## Testing 🧪

- Run backend tests with:
  ```bash
  cd backend
  ./mvnw test
  ```
- Utilized **Mockito** for mocking and **JUnit** for unit testing.

