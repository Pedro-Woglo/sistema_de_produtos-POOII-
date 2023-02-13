# v2_SistemadeProdutos

Importante: Controle de estoque de produtos com Administrador já setado com o login: "lol", senha:"123".

#Descrição do Programa:
Menu Inicial onde é possível:
(a)fazer o login como Administrador para cadastrar, visualizar, editar e remover produtos.
(b)fazer o cadastro do Cliente de primeiro acesso e, em seguida, o login com os dados cadastrados. 
Caso eles estejam corretos, abre o Menu do Cliente com as opções:visualizar lista de produtos, filtrar por categoria, filtrar por marca, 
ordenar por nome (ordem crescente e descrescente), ordenar por preço(ordem crescente e decrescente) e por fim, retornar ao Menu Inicial, onde é possível
encerrar o Programa. 
Obs:Antes de fazer o cadastro e login como Cliente, deve-se cadastrar os produtos como Adm para o Cliente ter acesso à lista de produtos. 

#Como o projeto foi estruturado:
Há uma classe abstrata de Produtos (ProdutoAbstrato) que implementa a interface ProdutosAcoes com os métodos novaDoacao e fazerPromocao. As classes Informatica,
Mercado e Livro tem atributos próprios, herdam da classe ProdutoAbstrato, implementam interfaces de comportamentos próprios das suas áreas e também a de ProdutosAcoes
com suas particularidades.
As classes Administrador e Cliente herdam de Pessoa, com login e senha e as classes dentro do pacote ValidarUsuario servem para validar os logins e senhas de 
acesso cadastrados. Caso estejam validados, abre os Menus próprios para Adm e Cliente. 
Os Menus foram estruturados da seguinte forma: 
(a)interfaces separadas com métodos próprios de Adm e Cliente;
(b) os MenusAbstratos como classes abstratas implementam as interfaces desenvolvendo esses métodos;
(c) por fim os Menus(MenuAdmClasseConcreta e MenuClienteClasseConcreta) herdam das classes abstratas, de modo que haja uma melhor organização do código. 
Na opção de Cadastro de Produtos para o Adm (para além dos dados básicos de nome do produto, preço, marca e categoria), é necessário informar
nos produtos de Informática, o Software(String) e memória(Double); em Mercado, a data de validade (Date) e seção do marcado(como Enums, é possível identificar
se o objeto pertence à parte de higiene, frios, grãos, bebidas e hortifruti do mercado) e em Livro, é necessário informar a editora(String) e o sobrenome do Autor(String).
A opção "editar Produto" é feita pelo nome do produto podendo ser modificado: nome, preço, marca e categoria. A opção remover produto também é feita pelo nome.
Comportamentos próprios de cada classe serão trabalhados no Menu nas próximas entregas.

-------------------------------------------------------

In English:

Important: Product inventory control with Administrator already set with login: "lol", password: "123".

#Program Description:
Initial Menu where you can:
(a)login as Administrator to register, view, edit and remove products.
(b)register the Customer for the first access, and then login with the registered data. 
If they are correct, opens the Customer Menu with the options: view list of products, filter by category, filter by brand, 
sort by name (ascending and descending order), sort by price (ascending and descending order) and finally, return to the initial menu, where you can
close the program. 
Note: Before registering and logging in as a Customer, you must register the products as Adm for the Customer to have access to the list of products. 

#How the project was structured:
There is a Product abstract class (ProductAbstract) that implements the ProductsActions interface with the methods newDonation and doPromotion. The classes Informatica, Market and Book classes have their own attributes, inherit from the ProductAbstract class, implement behavior interfaces of their own areas and also the ProductsActions class with its own particularities.
The classes Administrator and Client inherit from Person, with login and password and the classes within the package ValidarUsuario serve to validate all then. If they are validated, it opens the proper Menus for Adm and Client. 
The Menus were structured as follows: 
(a) separate interfaces with their own methods for Adm and Client;
(b) the AbstractMenus as abstract classes implement the these methods;
(c) finally the Menus (MenuAdmClassConcrete and MenuClientClassConcrete) inherit from the abstract classes, so that there is a better organization of the code.
In the Product Registration option for the Adm (beyond the basic data of product name, price, brand and category), it is necessary to inform
in Informatics products, the Software(String) and memory(Double); in Market, the expiration date (Date) and section of the marked (as Enums, it is possible to identify
if the object belongs to the hygiene, cold cuts, grains, drinks, and fruit and vegetables part of the market) and in Book, it is necessary to inform the publisher (String) and the Author's last name (String).
The option "edit Product" is done by product name and can be modified: name, price, brand and category. The "remove product" option is also done by name.
Behaviors specific to each class will be worked on in the Menu in the next deliveries.



