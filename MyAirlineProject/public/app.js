/**
 * 
 */

 function validateRegistration()
		{
		//	alert('You are in validation code....');
			
			let email=document.getElementById("myEmail").value;
			let pass=document.getElementById("myPass").value;
			let dob=document.getElementById("myDob").value;
			let addr=document.getElementById("myAdd").value;
			
			if(email=='') {
				//alert('Email cannot be blank');
				document.getElementById("emailErr").innerHTML='Email cannot be blank';
				return false;
			}
			if(pass=='') {
				//alert('Password cannot be blank');
				document.getElementById("passErr").innerHTML='Password cannot be blank';

				return false;
			}
			if(dob=='') {
				//alert('Birthdate cannot be blank');
				document.getElementById("dobErr").innerHTML='Birthdate cannot be blank';

				return false;
			}
			if(addr=='') {
				//alert('Address cannot be blank');
				document.getElementById("addErr").innerHTML='Address cannot be blank';

				return false;
			}
			return true;
		}	
		
		function clearEmailErrMsg(){
			document.getElementById("emailErr").innerHTML='';
		}
		function clearPassErrMsg(){
			document.getElementById("passErr").innerHTML='';
		}

		function clearDobErrMsg(){
			document.getElementById("dobErr").innerHTML='';
		}

		function clearAddErrMsg(){
			document.getElementById("addErr").innerHTML='';
		}

			
			