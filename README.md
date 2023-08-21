# App_Exercicios

## Dados

<p> Nome: Marcos Vinícius Barros Freire; </p>
<p> Nome: Marina Oliveira da Silva; </p>
<p> Turma: 2° PI - DS </p>
<p> Orientador: Prof° Aline Brito; </p>
<p> Sobre o projeto: App com finalidade de praticar exercícios em Java. O README será um arquivo onde será detalhado todo processo. </p>

## Índice
 
 * <a href="#t1"> Prints Git </a>
 * <a href="#t2"> Prints Android Studio </a>
 * <a href="#t3"> Execução do App</a>
 * <a href="#t4"> Elementos (Views) </a>
 * <a href="t5"> Referências </a>

<h2 id="t1">Prints Git</h2>

### Passo 1 (Criar um repositório)
<div align="center">
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/d33116d5-7d67-46f2-b986-ac6c73631c70" width="300px" height="250px">
</div>

### Passo 2 (Criar o projeto/pasta local)
<div align="center">
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/c7c510d2-cd86-4d0c-a3a9-9cc19624f3f7">
  <p> Escolher com qual tipo de View inciará o projeto </p>
  <br>
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/fd799aec-aed3-415e-93dc-5d1361a3b307">
  <p> Definir liguagem que será utlizada, nome do projeto assim como, a API (compatibilidade) do projeto </p>
</div>

### Passo 3 (Abir o Git Bash)
<div align="center">
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/43a48dd4-d3c0-466f-9ced-62b62474606e">
  <p> Ir na pasta onde se localiza o projeto, apertar com o botão direito do mouse. Após isso, basta clicar em mais opções (caso não apareça a opção "Git Bash here") e clicar em "Git Bash here"</p>
</div>

### Passo 4 (Linkar repositório local e do servidor)
<div align="center">
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/85965225-ce87-4f0a-951f-9abff4665e55">
  <p> Depois de abrir o Git Bash, vai no repositório do Git Hub e copie o link do mesmo </p>
  <br>
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/e4f8f999-9012-4338-b0e6-87e67415b231">
  <p> No Git Bash é necessário digitar o comando "git init", esse será o resposável por criar um repositório local. No caso o reósitório já existia.</p>
  <p> Depois disso é recomendado mudar o nome da branch. Por padrão será "master", entretanto, no repositótio do Git Hub geralmente o nome é main. Para não ter problemas com branch basta digitar o código "git branch -M "nome_da_branch". Nesse caso, o nome também já estava alterado. </p>
  <p> Logo após, é necessário vincular o repositório local com o repositório que está no servidor. Para que isso seja possível basta utlizar o comando "git remote add origin link_do_repositório. No caso, o comando já tinha sido executado. </p>
  <p> Depois, pega-se os arquivos que está no servidor e mescla com os arquivos locais, utlizando o comando "git pull --allow-unrelated-histories link_do_repositorio. </p>
</div>

### Passo 5 (Add, commit e push)

<div align="center">
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/d95e658c-22de-4bae-b689-e4d081e8f9f9">
  <p> Depois de todas as configurações iniciais, basta se utlizar alguns comandos para enviar os arquivos para o servidor. Primeiro começa-se com o "git add nome_do_arquivo". Esse comando permite monitorar os arquivos, basicamente é um pré-requisito para o commit. Caso queria, monitorar todos os arquivos basta colocar o ponto (.) no lugar do nome do arquivo.</p>
  <p> Para se certificar que quais arquivos estão sendo monitorados utliza-se o comando "git status". </p>
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/71cb7dc3-55c5-46c3-9036-591b0d569835">
  <p> Depois disso, basta dar o "commit" utlizando o comando "git commit -m "mensagem". </p>
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/5d1b0c34-386b-4a8e-952d-882c736c8f81">
  <p> Para certificar-se quais foram os commits feitos é necessário digitar o comando "git log". </p>
  <img src="https://github.com/Marcoss-Freire/App_Exercicios/assets/128001916/7105244a-3bcd-4b2e-b07b-f84ebfa58acd">
  <p> O commit foi realizado, porém, ainda não está no servidor. Para mandar para o mesmo, basta utlizar o comando "git push -u origin nome_da_branch".</p>
  <p> O 5° passo será o mais utlizado no decorrer do projeto, já que envolve commits. </p>
</div>

<h2 id="t2">Prints Android Studio</h2>

### Tela inicial (Home)
<div align="center">
  <img scr="img/tela_home.png">
  <br>
  <div align="justify">
    <p>A tela home é a Activity onde dará acesso a todas outras   activity, ou seja, por ela é possível entrar na tela de   exercícios e dados.</p>
    <p>Os elementos utlizados em sua totalidade foram:  ScrollView (Para ver os outros exercícios), TextView (Para   mostrar textos e outros), ImageButton (Para colocar um  icone clicável) e Linear Layout (Para organizar o Layout)</p>
  </div>
  <br>
  <img src="img/cod_home.png">
  <img src="img/cod_home2.png">
  </br>
  <div align="justify">
    <p>Na codficação foi utlizado códigos padrões. Adicionando funcionalidade de clicar nos ImageButton para ir para outra tela.<p>
  </div>  
</div>
<br>

### Tela de Dados

<div align="center">
  <img src="img/tela_dados.png">
  <br>
  <br>
  <div align="justify">
    <p>A tela de dados é uma Activity auto-explicativa, onde, é utlizada para exibir alguns dados sobre a instituição e outros.</p>
    <p>Em geral, nela foi utilizada elementos padrões, como TextViews, ImageButton, etc.</p>
  </div>
  </br>
  <img src="img/cod_dados.png">

  <img scr="img/cod_dados2.png">
  <div align="justify">
    <p>Na codficação foi utlizado códigos padrões. Adicionando funcionalidade de clicar nos ImageButton para ir para outra tela.<p>
  </div> 
</div>

### Tela do Exercício 3

<img src="img/tela_exe3.png">

<img src="img/cod_exe3.0.png">

<img src="img/cod_exe3.1.png">

<img src="img/cod_exe3.2.png">

<img src="img/cod_exe3.3.png">

### Tela de Exercício 6

<div align="center">
  <img src="img/tela_exe6.png">
  <br>
  <div align="justify">
    <p>Na Activity do Exercício 6, corresponde a resolução do mesmo. Basicamente consiste em escolher um código (Produto), digitar a quantidade e descobrir qual o valor a pagar.</p>
    <p>Os elementos utlizados foram: RadioButton (Para selecionar o código), RadioGroup (Para agrupar os RadioButton), ImageButton(Como ícones que levam a outras telas), Button(Para calcular), TextViews(Para apresentar textos), Toast(Para apresentar o resultado) e Linear Layout (Para organização de Layout)</p>
  </div

  <img src="img/cod_exe6.0.png">

  <img src="img/cod_exe6.1.png">

  <img src="img/cod_exe6.2.png">

  <img src="img/cod_exe6.3.png">
  <br>
  <p>No quesito da codificação foi utlizado comandos para verficar se o Radio estava selecionado, e depois um swich case para realizar determinada operação com a quantidade digitada dependendo do raio selecionado.<p>
  <p>Inicalmento, essa verificação do código estava sendo feita com "If e Else" junto com o "equals", porém o Android Studio recomendou esta forma de estruturar o código.</p>
</div>


<h2 id="t3">Execução do APP</h2>
</br>
<video src="video/Teste_de_execução.mp4">

