# Club Management Application

A Spring Boot MVC application for managing clubs and their information with user authentication and authorization.

## Features

- User Authentication and Authorization
  - Login functionality
  - Role-based access control
  - Secure password handling
- Club Management
  - View a list of all clubs
  - Create new clubs with details (title, content, photo URL)
  - Edit and delete clubs (authenticated users only)
- Persistent data storage with PostgreSQL database
- MVC architecture for clean separation of concerns
- Responsive UI with Bootstrap 5

## Technologies Used

- **Java 17**
- **Spring Boot 3.1.3**
- **Spring Security** - For authentication and authorization
- **Spring Data JPA** - For database access
- **Thymeleaf** - Server-side Java template engine
- **PostgreSQL** - Database
- **Lombok** - Reduces boilerplate code
- **Maven** - Dependency management and build
- **Bootstrap 5** - For responsive UI

## Prerequisites

- JDK 17 or higher
- PostgreSQL server
- Maven

## Setup and Installation

1. **Clone the repository**
   ```bash
   git clone <https://github.com/ozgucdlg/Club-Management-System.git>
   cd mvc
   ```

2. **Configure Database**
   - Create a PostgreSQL database named `mvc`
   - Update database credentials in `src/main/resources/application.properties` if needed:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/mvc
     spring.datasource.username=postgres
     spring.datasource.password=password
     ```

3. **Build and Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**
   - Open a web browser and go to `http://localhost:8080`
   - Default login credentials:
     - Username: admin
     - Password: admin

## Project Structure

```
src/main/java/com/ozguc/mvc/
├── config/           # Configuration classes
│   └── SecurityConfig.java
├── controller/       # Controllers handling HTTP requests
│   ├── AuthController.java
│   └── ClubController.java
├── dto/             # Data Transfer Objects
├── model/           # Entity models
│   ├── Club.java
│   ├── User.java
│   └── Role.java
├── repository/      # Database access interfaces
├── service/         # Business logic
│   ├── abstracts/   # Service interfaces
│   └── concretes/   # Service implementations
└── MvcApplication.java
```

## Security Features

- **Authentication**
  - Custom login page
  - Password encryption using BCrypt
  - Session management
  - Remember-me functionality (coming soon)

- **Authorization**
  - Role-based access control
  - Protected endpoints
  - Secure password storage

## Usage

### Authentication
- Navigate to `http://localhost:8080/login`
- Enter credentials:
  - Username: admin
  - Password: admin

### View All Clubs
- Navigate to `http://localhost:8080/clubs` to see a list of all clubs
- This page is accessible without authentication

### Add a New Club
- Navigate to `http://localhost:8080/clubs/new`
- Authentication required
- Fill in the club details (title, photo URL, content)
- Click the Create button

## API Endpoints

### Public Endpoints
- `GET /` - Home page
- `GET /clubs` - List all clubs
- `GET /clubs/search` - Search clubs
- `GET /login` - Login page

### Protected Endpoints
- `GET /clubs/new` - Create new club form
- `POST /clubs/new` - Create new club
- `GET /clubs/edit/{id}` - Edit club form
- `POST /clubs/edit/{id}` - Update club
- `DELETE /clubs/delete/{id}` - Delete club

## Future Enhancements

- User registration system
- Password reset functionality
- Email verification
- Club member management
- Event scheduling
- Advanced search and filtering
- RESTful API for mobile applications
- File upload for club photos
- Social media integration
- Club ratings and reviews

## Development

### Running Tests
```bash
mvn test
```

### Building for Production
```bash
mvn clean package
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

[MIT License](LICENSE)

## Credits

Developed by Ozguc 