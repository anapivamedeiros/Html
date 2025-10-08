HTML
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Conversor de Moedas</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <h1>Conversor de Moedas</h1>

  <form id="calcForm">
    <input type="number" id="Numero" name="Numero" placeholder="Digite o valor" required />

    <select id="moedaOrigem" required>
      <option value="" disabled selected>Moeda de origem</option>
      <option value="real">Real</option>
      <option value="dolar">Dolar</option>
      <option value="euro">Euro</option>
    </select>

    <select id="moedaDestino" required>
      <option value="" disabled selected>Moeda de destino</option>
      <option value="real">Real</option>
      <option value="dolar">Dolar</option>
      <option value="euro">Euro</option>
    </select>

    <div id="resultado" class="resultado-box"></div>
    
    <button type="submit">Converter</button>
  </form>

  <div id="erro"></div>
  <div id="resultado"></div>

  <script src="js/script.js"></script>
</body>
</html>



CSS
body {
  font-family: 'arial', cursive, sans-serif;
  background: linear-gradient(to right, rgb(204, 179, 221), #ebbcee);
  display: flex;
  flex-direction: column; 
  justify-content: center;
  align-items: center;       
  height: 100vh;             
  margin: 0;
}

    h1 {
    position: fixed;
    top: 0;
    width: 100%;
    background-color:linear-gradient(to right, rgb(197, 141, 180), #ffddef);
    display: center;
    color: #d63384;
    margin: 0;
    padding: 20px 0;
    text-align: center;
    box-shadow: 0 2px 10px rgba(255, 182, 193, 0.4);
    z-index: 1000;
    text-shadow: 1px 1px 2px #3f0d14;
}
    
    form {
        background-color: #f8d7eb;
        padding: 30px;
        border-radius: 20px;
        box-shadow: 0 0 15px rgba(20, 0, 15, 0.5);
        display: flex;
        flex-direction: column;
        gap: 15px;
        width: 320px;
        border: 2px solid #42052b;
    }

    input, select, button {
        padding: 12px;
        font-size: 16px;
        border: 1px solid #fff6fd;
        border-radius: 10px;
        box-sizing: border-box;
        background-color: #fff;
        color: #050103;
    }

    select {
        background-color: #fff0f5;
    }

    button {
        background-color: #e2abc7;
        color: white;
        border: none;
        cursor: pointer;
        transition: background-color 0.3s ease;
        font-weight: bold;
    }

    button:hover {
        background-color: #a85596;
    }


.resultado-box {
  margin-top: 20px;
  padding: 20px;
  background-color: #ffe0f0;
  border: 2px solid #c54278;
  border-radius: 15px;
  box-shadow: 0 0 12px rgba(201, 72, 123, 0.3);
  font-size: 18px;
  font-weight: center; 
  text-align: center;
  width: 270px;
  display: center; 
}



JS
document.getElementById('calcForm').addEventListener('submit', async function (e) {
  e.preventDefault();

  document.getElementById('resultado').textContent = "";
  document.getElementById('erro').textContent = "";

  const Numero = parseFloat(document.getElementById('Numero').value);
  const moedaOrigem = document.getElementById('moedaOrigem').value;
  const moedaDestino = document.getElementById('moedaDestino').value;

 
  if (!moedaOrigem || !moedaDestino || isNaN(Numero)) {
    document.getElementById('erro').textContent = "Preencha todos os campos corretamente.";
    return;
  }

  if (moedaOrigem === moedaDestino) {
    document.getElementById('erro').textContent = "Escolha moedas diferentes.";
    return;
  }

  
  const conversorMoedas = moedaOrigem + "Para" + moedaDestino.charAt(0).toUpperCase() + moedaDestino.slice(1);

 
  let real = 0, dolar = 0, euro = 0;
  if (moedaOrigem === "real") real = Numero;
  if (moedaOrigem === "dolar") dolar = Numero;
  if (moedaOrigem === "euro") euro = Numero;

  try {
    const response = await fetch('http://localhost:8080/ConversorMoedas', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
      },
      body: new URLSearchParams({
        real,
        dolar,
        euro,
        ConversorMoedas: conversorMoedas
      })
    });

    if (!response.ok) {
      throw new Error('Erro na requisição');
    }

    const data = await response.json();

    if (data.erro) {
      document.getElementById('erro').textContent = data.erro;
    } else {
      document.getElementById('resultado').textContent = `Resultado: ${data.resultado.toFixed(2)}`;
    }
  } catch (err) {
    document.getElementById('erro').textContent = 'Erro ao conectar com o servidor.';
    console.error(err);
  }
});
