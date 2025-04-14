# 🌱 Carbon Emissions Calculator

A full-stack application for calculating carbon emissions based on electricity, gas, and transportation data.

## Structure

- **Frontend**: Angular 12+ (in `/frontend`)
- **Backend**: Java Spring Boot 3.x (in `/backend`)

## Setup Instructions

### Backend

```bash
cd backend/carbon-calculator-backend
mvn spring-boot:run
```

### Frontend

```bash
cd frontend/carbon-calculator-frontend
npm install
ng serve
```

## API Endpoint

- `POST /api/carbon/calculate`

## Tech Stack

- Angular, TypeScript, HTML, CSS
- Java 17, Spring Boot, Maven
- RESTful API, DTOs, Postman

Absolutely! Here’s a very easy explanation of each part of the Spring Boot JWT implementation in clean, markdown-style bullet points 🧠✨

⸻

🛡️ Spring Boot JWT Auth – Simple Breakdown

⸻

✅ JwtUtil.java – The Token Maker
 • A helper class to create and validate JWT tokens
 • Stores a secret key inside (like a digital signature)
 • You give it a username, and it gives you a token
 • Also helps read the username back from the token

⸻

✅ AuthController.java – The Login Endpoint
 • Frontend sends username/password to /api/auth/login
 • If credentials are correct, it calls JwtUtil.generateToken(...)
 • Returns the JWT token as a plain string
 • In a real app, you’d check credentials from the database

⸻

✅ SecurityConfig.java – The Gatekeeper Rules
 • Tells Spring Boot:
 • Allow anyone to access /api/auth/** (public)
 • Protect everything else (.anyRequest().authenticated())
 • Adds your custom JwtAuthFilter to watch incoming requests

⸻

✅ JwtAuthFilter.java – The Token Checker
 • Checks every request for an Authorization: Bearer <token> header
 • If a token is there:
 • It validates the token
 • Extracts the username
 • Logs the user in for this request
 • If token is missing or invalid, the request will be blocked (403)

⸻

🛠️ Flow Summary

 1. Angular sends POST to /api/auth/login
 2. Server sends back a JWT
 3. Angular saves it in localStorage
 4. Angular sends the JWT in all API requests
 5. JwtAuthFilter checks that token before anything else runs
 6. Only valid tokens get access to protected routes

⸻

Let me know if you’d like the Angular token guard + interceptor breakdown in the same style!
