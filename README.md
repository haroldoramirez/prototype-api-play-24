# Prototype-Play24

### Idiomas
* Português, Espanhol e Inglês

### Versão
* **1.0.0**
  * Initial core
  
## Frameworks and tools
* **2.4.11** - [Play Framework](https://playframework.com/) (Java8) - Back End
* **0.13.13** - [Sbt](http://www.scala-sbt.org/0.13/docs/Basic-Def.html) - Scala Build Tool Version
* **1.7.6** - [AngularJS](https://angularjs.org/) with [AdminLTE](https://adminlte.io/) (Javascript and Bootstrap) - Front End
* **2.7.3** - [ChartJS](https://www.chartjs.org/) with [Contributors](https://github.com/chartjs/Chart.js/graphs/contributors)

## Características
* Dependências são gerenciadas pelo [Bower](https://bower.io/)
* Banco de dados [Postgresql](https://www.postgresql.org/)
* Internacionalização [i18n](https://www.w3.org/International/questions/qa-i18n)

## To do
 - [x] Funcionalidades de segurança implementadas
 - [x] Procedimento de deploy em ambiente de teste via universal files
 - [x] Procedimento de deploy em ambiente de produção via universal files
 - [x] Principais funcionalidades implementadas
 - [x] Implementado a parte de API
 
## Ambiente de Produção e comandos
 - Criar distro universal -> sbt universal:package-zip-tarball
 - Criar distro universal -> sbt war
  
### Licença
* PlayFramework - [Apache 2 license](https://www.apache.org/licenses/LICENSE-2.0.html)
* AngularJS and AdminLTE - [MIT License](https://github.com/angular/angular.js/blob/master/LICENSE)

### Instituição
Copyright ® 2019
