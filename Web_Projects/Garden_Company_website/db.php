<?php
$servername = "localhost";
$username = "root";
$password = " ";
$dbname = "test";

$conn = mysqli_connect($servername, $username, $password, $dbname);
if(!$conn){
    die('Could not connect to server:' .mysqli_connect_error());
}
?>