# Factory Method

---

O foco deste padrão de projeto é fazer com que o cliente não esteja preso aos detalhes da
criação de um objeto, especialmente, com uso da palavra reservada `new`. Assim, por 
meio de abstração, o cliente não sabe dos detalhes a respeito do objeto criado, nem 
mesmo de outros detalhes a respeito da própria fábrica concreta, uma vez que esta 
também será criada utilizando abstração.