<?php
include_once 'db.php';

if(isset($_POST['submit'])){
    $fName = $_POST['fName'];
    $mName = $_POST['mName'];
    $lName = $_POST['lName'];
    $uName = $_POST['uName'];
    $password = $_POST['password'];
    $passConfirm = $_POST['passConfirm'];
    $email = $_POST['email'];

    $sql = "INSERT INTO company (fName, mName, lName, uName, password, passConfirm, email)
    VALUES ('$fName','$mName','$lName','$uName','$password','$passConfirm','$email')";
    if(mysqli_query($conn,$sql)){
        echo "Success";
    } else {
        echo "Error".$sql.":-".mysqli_error($conn);
    }
    mysqli_close($conn);
}
?>