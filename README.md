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

Perfect — let me break it all down clearly:

⸻

✅ Task Recap: VS Code Workspace Setup (Latest Task)

What You Just Got:

An optimized .vscode/ folder tailored for your full-stack Angular + Spring Boot project.

⸻

🛠️ What Each File Does (Easy Explanation)

1. launch.json
 • 🎯 Lets you run your Spring Boot backend with the debugger
 • 🧪 Launches Angular frontend in Chrome automatically
 • 💡 Includes a preLaunchTask so Angular auto-starts

2. tasks.json
 • ⚙️ Runs ng serve in the correct folder
 • 🔁 You don’t need to manually cd into frontend anymore
 • 🔥 Auto-runs before Angular debugging starts

3. extensions.json
 • 📦 Recommends all the VS Code extensions you actually need:
 • Angular support
 • Java support
 • Docker, GitLens
 • API testing with Thunder Client

4. settings.json
 • 🧼 Enables formatOnSave (for TypeScript + Java)
 • 👨‍🏫 Uses Google Java style formatting
 • 🧊 Hides clutter like node_modules and target
 • 🧙 Configures terminal to use zsh (your shell)

⸻

✅ You Selected:

Angular Interceptor + Guard (to send and protect token)
MongoDB or PostgreSQL for real users

⸻

🔜 Next Steps I’ll Set You Up With:

⸻

🅰️ Angular – Interceptor + Auth Guard

Angular HTTP Interceptor
 • Automatically adds Authorization: Bearer <token> to all API requests
 • Keeps your API secure without repeating code

Angular Auth Guard
 • Blocks access to routes like /dashboard if user is not logged in
 • Checks if JWT token exists and is valid

🔒 This gives your frontend real access control.

⸻

☕ Spring Boot – PostgreSQL (or MongoDB)
 • Replaces mock if (username == "user") logic
 • Adds a real User Entity, UserRepository, and password hashing
 • Saves and validates users securely
 • Enables future features like “My Emissions” or “User History”

⸻

Let’s Go?

Would you like me to:

 1. Set up Angular auth.interceptor.ts + auth.guard.ts?
 2. Scaffold Spring Boot User Model + PostgreSQL config + register/login endpoints?

Let me know which you want first — Frontend Token Security or Backend User Auth DB — and I’ll code it out step-by-step. You’re running a real app now 🔥



Absolutely — here’s a well-organized task list for completing the Carbon Emissions Calculator, covering frontend, backend, auth, and deployment. I’ve structured it like a real-world dev sprint board 🧑‍💻🗂

⸻

✅ PHASE 1 – CORE FUNCTIONALITY

🔹 [ ] Frontend UI (Angular)
 • Emissions Calculator Form (carbon-calculator.component.ts)
 • Results View / Chart (carbon-results.component.ts, carbon-chart.component.ts)
 • User Preferences (units, region, thresholds)

🔹 [ ] Backend API (Spring Boot)
 • Emissions Calculation Endpoint /api/carbon/calculate
 • Endpoint to fetch previous results (optional DB)
 • Option to log each calculation per user

⸻

🔐 PHASE 2 – AUTHENTICATION + USERS

🔹 [x] Backend
 • JWT Token Generator (JwtUtil.java)
 • Spring Security Config (SecurityConfig.java)
 • JWT Filter (JwtAuthFilter.java)
 • Register + Login Endpoints (/api/auth/register, /login)
 • User Entity + PostgreSQL Integration

🔹 [ ] Frontend
 • login.component.ts + register.component.ts
 • Angular Auth Guard
 • Angular HTTP Interceptor
 • Token storage (localStorage) + logout

⸻

💾 PHASE 3 – DATABASE FEATURES

🔹 [ ] Backend
 • Store each carbon calculation in PostgreSQL
 • Create EmissionLog entity tied to User
 • Expose /api/user/history endpoint

🔹 [ ] Frontend
 • History page: display past user emissions
 • Add charting (monthly or category-wise)

⸻

💻 PHASE 4 – POLISH + UI/UX
 • Angular material design or Tailwind CSS layout
 • Form validation + loading states
 • Error messages for login / auth / API fails
 • Light/Dark theme toggle

⸻

🚀 PHASE 5 – DEPLOYMENT + DEVOPS

🔹 [ ] Vercel (Angular Frontend)
 • angular.json + environment config
 • Setup custom domain (optional)

🔹 [ ] AWS (Spring Boot Backend)
 • EC2 / Elastic Beanstalk / Fargate
 • PostgreSQL on RDS or Railway
 • CORS config + HTTPS support

⸻

🧪 OPTIONAL FEATURES (Stretch Goals)
 • Admin Dashboard (user management, logs)
 • Export reports (PDF or CSV)
 • Email-based account verification
 • OAuth2 login (Google)

⸻

📦 Final Deliverables

Area Goal
🔐 Auth JWT-secured app with register/login
💡 Features Full calculator, charting, saved history
🧑‍💻 UX Clean UI with error handling and polish
🚀 Deploy Hosted frontend (Vercel) + backend (AWS)
🧱 Docs README, Postman, and GitHub project structure



⸻

Absolutely — your Carbon Emissions Calculator project already incorporates several foundational software design patterns, and as we build it out, even more will come into play — both in the Spring Boot backend and the Angular frontend.

Here’s a breakdown of the key design patterns used (or to be used):

⸻

☕ BACKEND (Spring Boot) – Java

⸻

✅ 1. Model-View-Controller (MVC)

Where:
 • UserController, AuthController, UserService, User entity

How:
 • Controller handles HTTP requests
 • Service layer handles business logic
 • Entity classes define the data model
 • Repository interfaces abstract data access

📌 This is the core of Spring Boot web apps.

⸻

✅ 2. Dependency Injection (DI)

Where:
 • Everywhere @Autowired is used

How:
 • Spring injects dependencies like UserService, JwtUtil, PasswordEncoder automatically

📌 Loosely couples components, making them testable and reusable.

⸻

✅ 3. Singleton Pattern

Where:
 • @Component, @Service, @Repository beans

How:
 • Spring Boot ensures there’s only one instance of each bean per application context

⸻

✅ 4. Strategy Pattern

Where:
 • PasswordEncoder (BCryptPasswordEncoder)
 • JwtUtil encapsulates token strategies

How:
 • Allows you to swap password encoding strategies or token signing mechanisms

⸻

✅ 5. Filter Pattern

Where:
 • JwtAuthFilter extends OncePerRequestFilter

How:
 • Intercepts HTTP requests to apply authentication logic before passing to controllers

⸻

✅ 6. Builder Pattern (via JJWT)

Where:
 • In JwtUtil.generateToken() with .builder() calls

How:
 • Chains method calls to build a complex JWT object

⸻

🅰️ FRONTEND (Angular) – TypeScript

⸻

✅ 1. Component-Based Architecture

Where:
 • LoginComponent, CarbonCalculatorComponent, etc.

How:
 • Angular splits UI into isolated, reusable components with their own logic and styles

📌 A modern take on MVC for the frontend.

⸻

✅ 2. Observer Pattern

Where:
 • In Angular services using HttpClient and Observable
 • Guards, interceptors, and reactive forms

How:
 • Components subscribe to Observables and react when data or state changes

⸻

✅ 3. Interceptor Pattern

Where:
 • AuthInterceptor

How:
 • Catches and modifies HTTP requests before they reach the server

📌 Used to attach JWT tokens seamlessly.

⸻

✅ 4. Route Guard Pattern

Where:
 • AuthGuard

How:
 • Checks authentication state before allowing navigation to a route

📌 Secures Angular routes.

⸻

✅ 5. Service Pattern

Where:
 • AuthService, CarbonApiService, UserService

How:
 • Encapsulates reusable business logic or API calls, and injected into components via DI

⸻

✅ 6. Reactive Form Pattern

Where:
 • LoginComponent and future form UIs

How:
 • UI and logic are bound to an underlying FormGroup and updated in real-time

⸻

✅ 7. Module Pattern (Future)

Where:
 • You can use Angular modules (AuthModule, DashboardModule, etc.)

How:
 • Groups related components/services together for lazy-loading or encapsulation

⸻

🔐 Cross-Cutting Concepts

Concept Implementation
Authentication JWT + Filter + Interceptor + Guard
Authorization Spring Security config for routes
Error Handling Angular global error interceptor (optional)
Environment Config Angular environments + Spring application.properties
Testing Support JUnit (backend), Jasmine/Karma (frontend)



⸻

💡 Summary

Layer Pattern(s)
Spring Boot MVC, Singleton, DI, Builder, Filter, Strategy
Angular Component, Observer, Interceptor, Guard, Service, Reactive Form


🚀 Platform!
Vercel for Angular and GCP (Cloud Run / Cloud SQL) for Spring Boot + PostgreSQL, here’s our next step roadmap:

⸻

✅ Deployment Phase Task Plan (Starting Now)

🔹 [Step 1] – Finalize Angular for Vercel
 • Clean Angular build
 • vercel.json setup
 • Add environment config (API URL)
 • ng build ready for deploy
 • GitHub → Vercel auto-deploy (optional)

🔹 [Step 2] – Finalize Spring Boot for GCP
 • Dockerfile for Cloud Run
 • Expose port 8080
 • Connect to Cloud SQL (PostgreSQL)
 • Environment config (CORS, DB creds)
 • Deploy to Cloud Run

🔹 [Step 3] – CORS + End-to-End Connection
 • Add CORS config to Spring Boot
 • Update Angular to call backend endpoint
 • Confirm full login + calculator works remotely

⸻

🚀 Step 1: Angular + Vercel Setup

✅ 1. Create vercel.json

📁 In your Angular project root:

{
  "outputDirectory": "dist/carbon-calculator-frontend",
  "framework": null
}



⸻

✅ 2. Add environment config (API base URL)

📁 src/environments/environment.prod.ts

export const environment = {
  production: true,
  apiUrl: 'https://your-backend-domain.com/api'
};

🔁 In your login.component.ts and services, replace:

this.http.post(`${environment.apiUrl}/auth/login`, ...)



⸻

✅ 3. Build it

ng build --configuration production

This creates:

/dist/carbon-calculator-frontend/



⸻

✅ 4. Deploy to Vercel

npm install -g vercel
vercel --prod

It’ll ask for:

 • Output folder → dist/carbon-calculator-frontend
 • Link project to GitHub? ✅ Optional but great

⸻

Next Step?

Would you like me to:
 • 🐳 Generate a Dockerfile for your Spring Boot app?
 • 🛠 Show how to deploy to Cloud Run?
 • 🧪 Add CORS config + test login with deployed Angular?

You’re just a few clicks from a live, secure, full-stack app 🌍🔥