HTML
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    
    <header>
        <div class="container" >
            <img src="foto-ana.jpg" alt="Foto de Ana Laura" class="foto-perfil">
            <section>
                <div class="info">
            <h1>Meu Portifólio</h1>
            </section>
            </div>
            <nav>
                <ul>
                    <li><a href= "#sobre">Sobre Mim</a></li> 
                    <li><a href= "#hobbies">Hobbies</a></li>
                    <li><a href= "#habilidades">Habilidades</a></li>
                    <li><a href= "#contato">Contato</a></li>
                    </li>
                </ul>
            </nav>
        </div>
    </header>

    <div class="container">
        <main>
            <section id="sobre" class="secao">
                <h2>Sobre Mim</h2>
                <p>
                    Olá! Meu nome é Ana Laura, sou estudante do Ensino Médio no SESI de Votorantim e também curso o Técnico em Análise e Desenvolvimento de Sistemas no SENAI. Sou muito grata pela 
                    oportunidade de estar nesse curso, que tem ampliado meu conhecimento em lógica, tecnologia e resolução de problemas. Apesar de não planejar seguir carreira na área de Tecnologia da Informação, valorizo muito tudo o que estou aprendendo, pois sei que esses conhecimentos serão úteis em diversas áreas da minha vida. Meu verdadeiro sonho é atuar na área da saúde, onde pretendo construir minha carreira e contribuir positivamente para a vida das pessoas. Acredito que empatia, dedicação e constante aprendizado são essenciais para alcançar esse objetivo.
                    <br>Busco sempre novas experiências que contribuam para meu desenvolvimento pessoal e profissional, e estou aberta a desafios que me façam crescer. No meu tempo livre, gosto de aprender, explorar novos interesses e me envolver em atividades que ampliem minha visão de mundo.
                    </p>
                </p>
            </section>
            <section id="hobbies" class="secao">
                <h2>Meus Hobbies</h2>
                <ul>
                    <li>Ler livros</li>
                    <ul>
                        <li>Romances</li>
                        <li>Suspenses</li>
                    </ul>
                    <li>Viajar</li>
                    <li>Ir ao cinema</li>
                    <li>Fazer compras</li>
                    <li>Tempo de qualidade com a minha família</li>
                    <li>Sair com as minhas amigas</li>
                    <img src="foto-hobbies.png" alt="Foto Hobbies" class="foto-hobbies">
                </ul>
            </section>
            <section id="habilidades" class="secao">
                <h2>Tabela de habilidades</h2>
                <table>
                    <thead>
                        <tr>
                            <th>Tecnologia</th>
                            <th>Nível de conhecimento</th>
                            <th>Ano de programação</th>
                            <th>Link github</th>
                            <th>Ícones</th>
                        </tr>
                    </thead>
                    <body>
                        <tr>
                            <td>HTML</td>
                            <td>Iniciante</td>
                            <td>2025</td>
                            <td><a href= "https://github.com/anapivamedeiros/Html.git">Link HTML</a></td>
                            <td><img src="html-img.jpg"></td>
                            
                        </tr>
                        <tr>
                            <td>JAVA</td>
                            <td>Intermediário</td>
                            <td>2025</td>
                            <td><a href= "https://github.com/anapivamedeiros/JAVA.git">Link JAVA</a></td>
                            <td><img src="java-img.png"></td>
                        </tr>
                        <tr>
                            <td>CSS</td>
                            <td>Iniciante</td>
                            <td>2025</td>
                            <td><a href= "https://github.com/anapivamedeiros/Html.git">Link CSS</a></td>
                            <td><img src="css-img.png"></td>
                        </tr>
                    </body>
                </table>
            </section>
            <section id="contato" class="secao">
                <h2>Contato</h2>
                <p>Envia-me uma mensagem!</p>
                   <div class="formulario">
                    <label for="nome">Nome:</label>
                    <textarea id="text" id="nome" nome="nome_usuario" required></textarea>
                </div>
                <div class="formulario">
                    <label for="email">Email:</label>
                    <textarea id="email" id="email" nome="email_usuario" required></textarea>
                </div>
                <div class="formulario">
                    <label for="mensagem">Mensagem:</label>
                    <textarea id="mensagem" id="mensagem" nome="mensagem_usuario" required></textarea>
                </div>
                <button type="submit">Enviar</button>
            </section>
            
        </main>
    </div>
    <footer>
        <p>&copy; 2025 - Meu Portifólio. Todos os direitos reservados.</p>
        <a>
            <a href="https://github.com/anapivamedeiros" target="_blank">
            <img src="git-foto.webp">
            <p>GitHub</p>
        </a>
        <a>
            <a href="https://anapiva1a@gmail.com" target="_blank">
            <img src="email-foto.png">
            <p>E-mail</p>
        </a>
        <a>
            <a href="https://wa.me/5515991453623" target="_blank">
            <img src="whatsapp-foto.png">
            <p>Whatsapp</p>
        </a>
    </footer>
</body>
</html>






CSS
body{
  font-family: Arial, Helvetica, sans-serif;
  background-color: rgb(202, 165, 171) ;
  margin: 0;
  padding: 0;
  color:black (0, 0, 0);
  line-height: 1.0;
}
.container{  
    width: 85%;
    margin: 20px 0;
    overflow: hidden;
    padding: 30px;
    display: flex;
    align-items: center;
    margin: 10px auto;
    gap: 10px;
}
header img {
      width: 200px; 
      height: 200px; 
      border-radius: 50%;
      object-fit: cover; 
      text-align:center;
    }
header .container {
  display: flex;
  align-items: center;      
  justify-content:center;  
  gap: 100px;                
}
header{
    background-color: rgb(179, 144, 189);
    color:rgb(0, 0, 0);
    padding: 20px 0;
    border-bottom: rgb(2, 2, 2) 3px solid;
}
header h1{
    text-align: center;
    margin: 0;
    text-transform: uppercase;
    font-size: 30px;
    padding-top: 10px;
    min-height: 70px;
}
nav ul{
    padding: 0;
    list-style: none;
    text-align: center;
    font-size: 15px;
}
nav li{
    display: inline;
    padding: 0 20px;
}
nav a{
    color: rgb(0, 0, 0);
    text-decoration: none;
    font-weight: bold;
}
nav a:hover{
    color:blueviolet;
    text-decoration: underline;
}
.secao{
    padding: 20px;
    margin-top: 20px;
    background: linear-gradient(to right, white, rgb(189, 167, 189));
    border-radius: 30px;
    box-shadow: 0 2px 5px rgb(83, 82, 82);
}
h2{
    color:rgb(0, 0, 0);
    border-bottom: 2px solid rgb(0, 0, 0);
    padding-bottom: 10px;
    text-align: center;
}
table{
    width: 100%;
    margin-top: 20px;
    border-collapse: collapse;
}
th, td{
    padding: 12px;
    border: 1px solid rgb(0, 0, 0);
    text-align: center;
}
thead{
    background-color: rgb(179, 144, 189);
}
.formulario{
    margin-bottom: 15px;
}
.formulario label{
    display: block;
    margin-bottom: 5px;
}
.formulario imput, textarea{
    width: 98%;
    border-radius: 10px;
    padding: 10px;
}
button:hover{
    background-color: rgb(179, 144, 189);
}
footer{
    margin: top 2px;
    padding: 20px;
    background-color: rgb(179, 144, 189);
    color:rgb(0, 0, 0);
    align-items: center;
    display: flex;
    justify-content: center;
}
footer img{
    width: 40px;
    height: 40px;
    border-radius: 80%;
    align-items: center;
}
footer a{
    margin: 10px;
}
footer p{
    margin: 10px;
}
table img{
    width: 70px;
    height: auto;
}
.foto-hobbies{
   margin: 20px auto;
   width: 50%;
   height: auto;
   display: block;
}

