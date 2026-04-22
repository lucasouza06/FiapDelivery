# FiapDelivery - Refatoração e POO

Este projeto faz parte do **Check Point 2** da disciplina de Programação Orientada a Objetos da **FIAP**. O objetivo principal foi diagnosticar falhas de arquitetura num código legado e aplicar princípios de **Clean Code** e **Orientação a Objetos** para construir uma solução escalável, segura e profissional.

## Melhorias Implementadas

### 1. Herança e Abstração
Foi introduzida a classe abstrata `Veiculo` para centralizar atributos comuns como `placa` e `capacidade`. As classes `Caminhao` e `Moto` agora herdam de `Veiculo`, eliminando a duplicação de código e seguindo o princípio **DRY (Don't Repeat Yourself)**.

### 2. Encapsulamento e Integridade de Dados
Todos os atributos foram alterados de `public` para `private`. O acesso e a modificação dos dados são feitos exclusivamente através de métodos **Getters e Setters**. Além disso, os construtores foram implementados com **validações rigorosas** para impedir que objetos sejam criados com estados inválidos (ex: capacidade negativa).

### 3. Polimorfismo
A classe `Rota` foi refatorada para utilizar o tipo genérico `Veiculo`. Isso permite que uma única implementação de rota aceite qualquer tipo de transporte (seja um Caminhão, uma Moto ou novos veículos futuros) sem necessidade de alterar o código-fonte da classe `Rota`.

### 4. Clean Code e Documentação
* **Nomenclatura:** Variáveis crípticas como `pl`, `cap` e `s` foram substituídas por nomes semânticos como `placa`, `capacidade` e `status`.
* **JavaDoc:** Todo o código foi documentado utilizando o padrão JavaDoc, facilitando a manutenção e o entendimento por outros desenvolvedores.

---

##  Diagrama de Classes (UML)

Abaixo está a representação da nova arquitetura do sistema:



---

##  Resultados da Execução

O sistema foi validado no ambiente de desenvolvimento, demonstrando o comportamento polimórfico e a eficácia das validações de segurança:

```text
=== Iniciando Entrega ===
Pacote  : Pacote [codigo=BR999, peso=10,50 kg, status=Em Trânsito]
Veículo : Caminhao [placa=ABC-1234, capacidade=5000,00 kg, eixos=4]
Status  : Entrega em andamento!
========================

=== Iniciando Entrega ===
Pacote  : Pacote [codigo=SP001, peso=2,00 kg, status=Em Trânsito]
Veículo : Moto [placa=XYZ-5678, capacidade=30,00 kg, temBau=Sim]
Status  : Entrega em andamento!
========================

=== Testando Validação de Dados ===
Erro capturado corretamente: A capacidade deve ser maior que zero. Valor recebido: -500.0

## Tecnologias Utilizadas

* **Java 25 (LTS)**
* **Visual Studio Code**
* **Draw.io** (para modelagem UML)

---

**Desenvolvido por:** Lucas Andrade Souza  
**RM:** [564066]  
**Turma:** 2º Ano - Ciência da Computação - FIAP