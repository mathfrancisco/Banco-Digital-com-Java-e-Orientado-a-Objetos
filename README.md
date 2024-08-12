Banco Digital com Java e Orientação a Objetos
Desenvolvi um programa para criar um sistema de banco digital utilizando Java e conceitos de Orientação a Objetos. O sistema permite que os clientes criem contas correntes e poupanças, realizem operações bancárias como depósito, saque e transferência entre contas da mesma instituição. Além disso, implementei funcionalidades adicionais, como uma interface para realizar operações, um método para imprimir extratos e outro para mostrar a lista de clientes do banco.

Tecnologias utilizadas

IntelliJ IDEA
OpenJDK Azul Zulu v. 17.0.15
Online Markdown Editor Dillinger
Síntese de conceitos fundamentais da POO

Abstração
Ao desenvolver o sistema de banco digital, eu me concentrei nos aspectos essenciais do domínio bancário, ignorando características menos importantes ou acidentais. Isso permitiu que eu criasse objetos que representam entidades reais do domínio, como contas e clientes.

Encapsulamento
Para facilitar a manutenção e evolução do sistema, eu usei encapsulamento para esconder a implementação dos objetos e criar interfaces de uso mais concisas e fáceis de usar. Isso permitiu que eu modificasse a implementação dos objetos sem afetar a forma como eles são utilizados pelo resto do sistema.

Herança
Ao criar as classes ContaCorrente e ContaPoupanca, eu usei herança para reutilizar o comportamento da classe Conta e estender suas funcionalidades. Isso permitiu que eu criasse classes mais específicas e especializadas sem ter que reescrever todo o código.

Polimorfismo
Ao criar a interface OperacaoBancaria, eu usei polimorfismo para permitir que objetos de diferentes classes (como Deposito, Saque e Transferencia) sejam tratados como objetos da mesma classe. Isso permitiu que eu criasse um método que pode ser usado para realizar diferentes operações bancárias sem ter que saber a classe específica do objeto.                      
