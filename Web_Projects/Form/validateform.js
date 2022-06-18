function validateHTMlform()
{ 
  let form = document.StudenSignupForm;
   if( form.textnames.value == "" )
   {
     alert( "Enter Your First Name!" );
     form.textnames.focus() ;
     return;
   }
   if( form.lastnames.value == "" )
   {
     alert( "Enter Your Last Name!" );
     form.textnames.focus() ;
     return;
   }
  
   if( form.fathername.value == "" )
   {
     alert( "Enter Your Father Name!" );
     form.fathername.focus() ;
     return;
   }
   
   if( form.paddress.value == "" )
   {
     alert( "Enter Your Postal Address!" );
     form.paddress.focus() ;
     return;
   }
   if( form.personaladdress.value == "" )
   {
     alert( "Enter Your Personal Address!" );
     form.personaladdress.focus() ;
     return;
   }
   if ( ( StudenSignupForm.sex[0].checked == false ) && ( StudenSignupForm.sex[1].checked == false ) )
   {
   alert ( "Choose Your Gender: Male or Female" );
   return false;
   }   
   if( form.City.value == "-1" )
   {
     alert( "Enter Your City!" );
     form.City.focus() ;
     return;
   }   
   if( form.Course.value == "-1" )
   {
     alert( "Enter Your Course!" );
    
     return;
   }   
   if( form.District.value == "-1" )
   {
     alert( "Select Your District!" );
    
     return;
   }   
   if( form.State.value == "-1" )
   {
     alert( "Select Your State!" );
     
     return;
   }
   if( form.pincode.value == "" ||
           isNaN( form.pincode.value) ||
           form.pincode.value.length != 6 )
   {
     alert( "Enter your pincode in format ######." );
     form.pincode.focus() ;
     return;
   }
 var email = form.emailid.value;
  atpos = email.indexOf("@");
  dotpos = email.lastIndexOf(".");
 if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
 {
     alert("Enter your correct email ID")
     form.emailid.focus() ;
     return;
 }
  if( form.dob.value == "" )
   {
     alert( "Enter your DOB!" );
     form.dob.focus() ;
     return;
   }
  if( form.mobileno.value == "" ||
           isNaN( form.mobileno.value) ||
           form.mobileno.value.length != 10 )
   {
     alert( "Enter your Mobile No. in the format 123." );
     form.mobileno.focus() ;
     return;
   }
   return( true );
}