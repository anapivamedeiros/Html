function pesquisar() {
    const busca = document.getElementById("campoBusca").value.toLowerCase();
    
    // 📚 Lista de livros disponíveis (simulação)
    const livros = [
        "teto para dois",
        "a hipótese do amor",
        "uma farsa de amor na espanha",
        "orgulho e preconceito",
        "eleanor e grey"
    ];

    const resultado = document.getElementById("resultado");

    if (livros.includes(busca)) {
        resultado.textContent = "📘 Livro encontrado!";
        resultado.style.color = "green";
    } else {
        resultado.textContent = "❌ Livro não encontrado.";
        resultado.style.color = "red";
    }
}

