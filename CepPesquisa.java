HTML
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/style.css" rel="stylesheet" />
    <title>CEPlocation</title>
</head>

<body>
    <form method="get" action=".">
        <label> Cep:
            <input type="text" name="cep" id="cep" size="10" maxlength="9" onblur="pesquisacep(this.value);">
        </label>
        <label> Rua:
            <input name="rua" id="rua" type="text" size="60" />
        </label>
        <label> Bairro:
            <input name="bairro" id="bairro" type="text" size="40" />
        </label>
        <label> Cidade:
            <input name="cidade" id="cidade" type="text" size="60" />
        </label>
        <label> Estado:
            <input name="estado" id="estado" type="text" size="60" />
        </label>
        <label> UF:
            <input name="uf" id="uf" type="text" size="60" />
        </label>
        <label> Região:
            <input name="regiao" id="regiao" type="text" size="40" />
        </label>
        <label> IBGE:
            <input name="ibge" id="ibge" type="text" size="60" />
        </label>
        <label> DDD:
            <input name="ddd" id="ddd" type="text" size="60" />
        </label>
    </form>
    <script src="JS/cep.js"></script>
</body>

</html>



Js
function pesquisacep(valor) {
    var cep = valor.replace(/\D/g, '');

    if (cep !== "") {
        var validacep = /^[0-9]{8}$/;

        if (validacep.test(cep)) {
            document.getElementById('rua').value = "...";
            document.getElementById('bairro').value = "...";
            document.getElementById('cidade').value = "...";
            document.getElementById('estado').value = "...";
            document.getElementById('uf').value = "...";
            document.getElementById('regiao').value = "...";
            document.getElementById('ibge').value = "...";
            document.getElementById('ddd').value = "...";

            fetch(`https://viacep.com.br/ws/${cep}/json/`)
                .then(response => {
                    if (!response.ok) {
                        throw new Error('Erro na requisição');
                    }
                    return response.json();
                })
                .then(data => {
                    if (data.erro) {
                        alert('CEP não encontrado');
                        return;
                    }

                    document.getElementById('rua').value = data.logradouro || "";
                    document.getElementById('bairro').value = data.bairro || "";
                    document.getElementById('cidade').value = data.localidade || "";
                    document.getElementById('estado').value = data.estado || "";
                    document.getElementById('uf').value = data.uf || "";
                    document.getElementById('regiao').value = data.regiao || "";
                    document.getElementById('ibge').value = data.ibge || "";
                    document.getElementById('ddd').value = data.ddd || "";
                })
                .catch(error => {
                    alert('Erro ao buscar CEP: ' + error.message);
                });
        } else {
            alert('Formato de CEP inválido.');
        }
    }
}


CSS
body {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: #222;
    font-family: Arial, sans-serif;
}

form {
    display: flex;
    flex-direction: column;
    gap: 10px;
    background-color: #333;
    padding: 20px;
    border-radius: 8px;
}

label {
    display: flex;
    flex-direction: column;
    color: aliceblue;
}

input {
    padding: 8px;
    border: 1px solid #555;
    border-radius: 4px;
    font-size: 1rem;
}
