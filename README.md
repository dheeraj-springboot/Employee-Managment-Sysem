
# Employee Management System

## Overview
The **Employee Management System** is a web-based application built with **Angular** for the frontend and **Spring Boot** for the backend. This system allows users to manage employee data, including adding new employees, updating existing employee details, and deleting employees. Additionally, it features a search function to find employees by their ID and display their detailed information.

This project aims to demonstrate the creation of a full-stack web application with a REST API for managing employee records. The frontend interface provides a user-friendly design for interacting with employee data, while the backend ensures robust and scalable data handling.

## Features
- **Add Employees**: Allows users to input details for new employees, including their name, email, job title, phone number, and image URL.
- **Update Employee Details**: Users can edit the information of existing employees by populating a form with the employee's current data.
- **Delete Employees**: Employees can be removed from the system through an intuitive delete button.
- **Find Employee by ID**: Search for employees by their ID and display detailed information including an employee image.
- **Real-Time Display**: Employees are displayed in a card format with details such as name, job title, phone number, email, and an employee image.

## Technology Stack
### Frontend
- **Angular**: The user interface is built using Angular, which provides a responsive and dynamic experience. Angular's form groups and services manage the form submissions for adding, updating, and searching employees.
- **Bootstrap**: Provides a clean and responsive design for forms, buttons, and cards to ensure a user-friendly interface.
- **FontAwesome**: Icons are used for adding, updating, and deleting employees, enhancing the overall UI experience.

### Backend
- **Spring Boot**: The backend is powered by Spring Boot, which handles the server-side logic, database interaction, and exposes a REST API to communicate with the Angular frontend.
- **Spring Data JPA**: Provides data persistence and retrieval functionalities for employee data.
- **H2 Database**: An in-memory database is used for rapid prototyping and testing.

## How to Use
1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/employee-management-system.git
    ```
2. **Install dependencies**:
    Navigate to the frontend directory and install Angular dependencies:
    ```bash
    cd frontend
    npm install
    ```

3. **Run the Frontend**:
    Start the Angular development server:
    ```bash
    ng serve
    ```
    The frontend will run on `http://localhost:4200`.

4. **Run the Backend**:
    In another terminal, navigate to the backend folder and run the Spring Boot application:
    ```bash
    cd backend
    ./mvnw spring-boot:run
    ```
    The backend will run on `http://localhost:8080`.

5. **Access the Application**:
    Open your browser and go to `http://localhost:4200` to start managing employees.


## Future Enhancements

- **Authentication & Authorization**: Secure the system by adding user roles and authentication to protect employee data.
- **Pagination and Sorting**: Add pagination and sorting functionality for better management of large sets of employee data.
- **Persistent Database**: Replace the H2 in-memory database with a persistent relational database such as MySQL or PostgreSQL.


## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue if you find any bugs or have suggestions for new features.
