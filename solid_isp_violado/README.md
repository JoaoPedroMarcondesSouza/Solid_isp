# Interface Segregation Principle (ISP)

### Esse projeto viola o ISP.

#### Problemas

- A classe `StandardPrinter` é forçada a implementar métodos que ela não suporta (`scanDocument`, `xeroxDocument` e `faxDocument`), o que gera exceções;
- A classe `Fax` é forçada a implementar métodos que ela não suporta (`printDocument`, `scanDocument` e `xeroxDocument`), o que também gera exceções;

Esse _design_ é problemático porque força os clientes (as classes que implementam a interface `IODevice`) a implementar métodos desnecessário (para os quais não têm suporte).

Isso viola o ISP porque `StandardPrinter` e `Fax` não deveriam ser obrigadas a lidar com funcionalidades que não suportam.
