<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Signup Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            max-width: 500px;
            margin: 50px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        }
        .alert {
            padding: 10px;
            margin-bottom: 10px;
            border-radius: 5px;
        }
        .alert-success {
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }
        .alert-error {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
        }
    </style>
</head>
<body>

<div class="container">
    <h2 class="text-center">Signup Form</h2>

    <form action="PersonController" method="post">
        <input type="hidden" name="action" value="register">

        <div class="mb-3">
            <label class="form-label">Name*</label>
            <input type="text" class="form-control" name="name" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Email*</label>
            <input type="email" class="form-control" name="email" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Mobile*</label>
            <input type="text" class="form-control" name="mobile" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Address*</label>
            <textarea class="form-control" name="address" rows="3" required></textarea>
        </div>

        <div class="mb-3">
            <label class="form-label">Password*</label>
            <input type="password" class="form-control" name="password" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Select Course*</label>
            <select class="form-control" name="course" required>
                <option value="" disabled selected>Select a Course</option>
                <option value="java">JAVA</option>
                <option value="python">PYTHON</option>
                <option value="php">PHP</option>
                <option value="qa">QA</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Languages*</label><br>
            <input type="checkbox" name="language" value="English"> English 
            <input type="checkbox" name="language" value="Hindi"> Hindi 
            <input type="checkbox" name="language" value="Gujarati"> Gujarati
        </div>

        <div class="mb-3">
            <label class="form-label">Gender*</label><br>
            <input type="radio" name="gender" value="male" required> Male 
            <input type="radio" name="gender" value="female" required> Female 
            <input type="radio" name="gender" value="other" required> Other
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
