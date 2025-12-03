document.getElementById("calcForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;

    // Lista de usuários (email → senha)
    const usuarios = {
        "joao@email.com": "123.456.789-00",
        "maria@email.com": "234.567.890-11",
        "pedro@email.com": "345.678.901-22",
        "ana@email.com": "456.789.012-33t2024",
        "carlos@email.com": "567.890.123-44",
        "juliana@email.com": "678.901.234-55",
        "roberto@email.com": "789.012.345-66",
        "fernanda@email.com": "890.123.456-77",
        "thiago@email.com": "901.234.567-88",
        "larissa@email.com": "123.456.789-99",
        "marcos@email.com": "234.567.890-00",
        "silvia@email.com": "345.678.901-11",
        "daniel@email.com": "456.789.012-22",
        "gabriela@email.com": "567.890.123-33",
        "fabio@email.com": "678.901.234-44",
        "camila@email.com": "789.012.345-55",
        "eduardo@email.com": "890.123.456-66",
        "mariana@email.com": "901.234.567-77",
        "lucas@email.com": "123.456.789-11",
        "tatiane@email.com": "234.567.890-22",

    };

    // Verifica se o email existe
    if (usuarios[email] && usuarios[email] === senha) {
        window.location.href = "sucesso.html";
    } else {
        window.location.href = "falha.html";
    }
});
