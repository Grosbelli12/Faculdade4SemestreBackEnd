import java.math.BigDecimal

class Cliente(
     nome: String,
     idade: Int,
     cpf: Int,
     sexo: String,
     telefone: String,
    val endereco: String,
    val pedidos: Array<String>,
    val divida: BigDecimal,

) : Pessoa (nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
    telefone = telefone) {}