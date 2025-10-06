HTML
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora básica</title>
     <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Calculadora Básica</h1>
    <form id="calcForm">
        <input type="number" id="num1" name="num1" placeholder="Numero 1" required/>
    <select id="operacao" name ="operacao" required>
         <option value="" disabled selected> Selecione operação</option>
         <option value="somar">Somar</option>
         <option value="subtrair">Subtrair</option>
         <option value="multiplicar">Multiplicar</option>
         <option value="disao">Dividir</option>
    </select>
    <input type="number" id ="num2" name ="num2" placeholder="Numero 2" required/>
    <button type="submit">Calcular</button>
 </form>
 <div id="erro"></div>
 <div id="resultado"></div>
 <script src="js/script.js"></script>
</body>
</html>



CSS
body {
    font-family: 'Comic Sans MS', cursive, sans-serif;
    background: linear-gradient(to right, #cab3bc, #bd7a9b);
    display: flex;
    flex-direction: column;
    align-items: center;
    margin: 0;
    padding-top: 100px;
        
    }

    h1 {
    position: fixed;
    top: 0;
    width: 100%;
    background-color: #fff0f5;
    color: #bd7a9b;
    margin: 0;
    padding: 20px 0;
    text-align: center;
    box-shadow: 0 2px 10px rgba(255, 182, 193, 0.4);
    z-index: 1000;
    text-shadow: 1px 1px 2px #000000;
}
    
    form {
        background-color: #fff0f5;
        padding: 30px;
        border-radius: 20px;
        box-shadow: 0 0 15px rgba(255, 192, 203, 0.5);
        display: flex;
        flex-direction: column;
        gap: 15px;
        width: 320px;
        border: 2px solid #bd7a9b;
    }

    input, select, button {
        padding: 12px;
        font-size: 16px;
        border: 1px solid #bd7a9b;
        border-radius: 10px;
        box-sizing: border-box;
        background-color: #fff;
        color: #d63384;
    }

    select {
        background-color: #fff0f5;
    }

    button {
        background-color: #ff69b4;
        color: white;
        border: none;
        cursor: pointer;
        transition: background-color 0.3s ease;
        font-weight: bold;
    }



JS
document.getElementById('calcForm').addEventListener('submit', async function (e) {
  e.preventDefault(); 

  
  document.getElementById('resultado').textContent = "";
  document.getElementById('erro').textContent = "";
 
  const num1 = document.getElementById('num1').value;
  const num2 = document.getElementById('num2').value;
  const operacao = document.getElementById('operacao').value;
  try {
    const response = await fetch('http://localhost:8080/Calcular', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
      },
      body: new URLSearchParams({
        num1,
        num2,
        operacao
      })
    });

    if (!response.ok) {
      throw new Error('Erro na requisição');
    }

    const data = await response.json();

    alert(data.resultado);
    if (data.erro) {
      document.getElementById('erro').textContent = data.erro;
    } else {
      document.getElementById('resultado').textContent = 'Resultado: ' + data.resultado;
    }

  } catch (err) {
    document.getElementById('erro').textContent = 'Erro ao conectar com o servidor';
    console.error(err);
  }
});
/*
  let resultado = 0;
    let erro = 0;

    switch(operacao) {
        case"somar":
        resultado = num1 + num2;
        break;
        case"subtrair":
        resultado = num1 - num2;
        break;
        case"multiplicar":
        resultado = num1 * num2;
        break;
        case"dividir":
        if(num2 == 0){
            erro = "Divisão por zero não permitida.";
        } else{
            resultado = num1 / num2;
        }
        break;
        default:
            erro = "Operação inválida.";
    }
            */
