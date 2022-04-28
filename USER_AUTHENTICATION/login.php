<?php
session_start();

//check if user is already logge in if yes reidrect him to welcome page
if(isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] == true){
    header("location: welcome.php");
    exit;
}

require_once "config.php";

$username = $password = "";
$username_err = $password_err = $login_err = "";

//process data from when form is submitted
if($_SERVER["REQUEST_METHOD"] == 'POST'){

    //check if username is empty
    if(empty(trim($_POST["username"]))){
        $username_err = "Please enter username";
    } else{
        $username = trim($_POST["username"]);
    }

    //check if password is empty
    if(empty(trim($_POST["password"]))){
        $password_err = "Please enter your password";
    } else{
        $password = trim($_POST["password"]);
    }

    //validate credentials
    if(empty($username_err) && empty($password_err)){

        //prepare select statement
        $sql = "SELECT id, username, password FROM users WHERE username = ?";

        if($stmt = mysqli_prepare($link, $sql)){
            mysqli_stmt_bind_param($stmt, "s", $param_username);

            $param_username = $username;

            if(mysqli_stmt_execute($stmt)){
                mysqli_stmt_store_result($stmt);

                //check if username exists, if yes verify password
                if(mysqli_stmt_num_rows($stmt) == 1){
                    //bind result variables
                    mysqli_stmt_bind_result($stmt, $id, $username, $hashed_password);
                    if(mysqli_stmt_fetch($stmt)){
                        if(password_verify($password, $hashed_password)){

                            //password is correct so start a new session
                            session_start();

                            //store data in session variables
                            $_SESSION["loggedin"] = true;
                            $_SESSION["id"] = $id;
                            $_SESSION["username"] = $username;

                            //redirect to welcome page
                            header("location: welcome.php");
                        } else{
                            //password not valid, display error message
                            $login_err = "Invalid username or password";
                        }
                    }
                } else{
                    //username doesn't exist,display error message
                    $login_err = "Invalid username or password";
                }
            } else{
                echo "Oops! Something went wrong. Please try again later.";
            }
            mysqli_stmt_close($stmt);
        }
    }
    mysqli_close($link);
}
?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            body{
                font: 14px sans-serif;
            }
            .wrapper{
                width: 360px;
                padding: 20px;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <h2>Login</h2>
            <p>Please fill in your details to login</p>

            <?php
            if(!empty($login_err)){
                echo '<div class=" alert alert-danger">' . $login_err . '</div>';
            }
            ?>

            <form action='<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>' method="post">
                <div class="form-group">
                    <label>Username</label>
                    <input type="text" name="username" class="form-control <?php echo (!empty($username_err)) ? 'is-invalid' : ''; ?> "
                    value="<?php echo $username; ?>">
                    <span class="invalid-feedback"><?php echo $username_err; ?></span>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" name="password" class="form-control <?php echo (!empty($passwor_err)) ? 'is-invalid' : ''; ?>"
                    value="<?php echo $password; ?>">
                    <span class="invalid-feedback"><?php echo $passwor_err; ?></span>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Login">
                </div>
                <p>Don't have an account? <a href="register.php">Sign up now</a>.</p>
            </form>
        </div>
    </body>
</html>