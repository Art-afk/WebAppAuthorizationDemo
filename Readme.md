Use postgresDB 
generate token for authorization
https://www.allkeysgenerator.com/  
https://jwt.io/  
https://www.youtube.com/watch?v=KxqlJblhzfI&ab_channel=Amigoscode  

//-------------------//
http://localhost:8080/api/v1/auth/authenticate  
Body:  
{  
"email" : "example@gmail.com",  
"password" : "1234"  
}

//-------------//  
not realised check for forbidden any register;  
POST http://localhost:8080/api/v1/auth/registr  
{  
"firstname" : "alibaba",  
"lastname" : "alibyb",  
"email" : "example@gmail.com",  
"password" : "1234"  
}  
this request return:  
{  
"token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJleGFtcGxlQGdtYWlsLmNvbSIsImlhdCI6MTY4NTU0NzMzOCwiZXhwIjoxNjg1NTQ4Nzc4fQ.V1yVCUFJkrdaDY-3bjG-UpO5Mmx9mTFBR2zv4R1NYuI"  
}  
//-------------//  
http://localhost:8080/api/v1/demo-controller  
put token to field authorisation


