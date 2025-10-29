HTML
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quizz</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <header>
        <h3>Questão 1/5</h3> 
        <h3 class="j2">Pontos: 0</h3>
    <div>
    </header>
    <div class="container">
    <h2>Quais comandos fazem parte da DDL(Data Definition Language)?</h2>
    
    <div class="resposta">
    <button class="op1">SELECT, INSERT, UPDATE</button>
    <button class="op2">GRANT, REVOKE</button>
    <div class="resposta">
    <button class="op3">CREATE, ALTER, DROP</button>
    <button class="op4">SUM, COUNT, AVG</button>
</div>
</div>

</body>
</html>



CSS

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body {
    font-family: Arial, sans-serif;
    background-color:lightgray;
    flex-direction: column;
    margin: 100;
    margin-top: 0;
}
/*Cabeçalho*/
header {
    background-color: #65029e;
    color: lightgray;
    width: 100%;
    height: auto;
}
header h1 {
    text-align: center;
    font-size: 2em;
    display:inline; 
}
.j2{
    margin-left: 90%;
    display: inline;
}
h2{
    text-align: center;
}
/*Tabela*/
.container {
    width: 90%;
    max-width: 700px;
    text-align: center;
    margin: 0 auto;
    padding: 20px;
    margin-top: 200px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    background-color: rgb(229, 233, 236);
}
.op1{
background-color: crimson;
width: 220px;
height: 50px;
}
.op2{
background-color: blue;
width: 220px;
height: 50px;
}
.op3{
background-color: darkgoldenrod;
width: 220px;
height: 50px;
}
.op4{
background-color: green;
width: 220px;
height: 50px;
}

.resposta button{
    color: white;
    padding: 20px;
    border-radius: 8px;
    border: none;
    margin-top: 20px;
    margin-left: 10px;
    cursor: pointer;
}
