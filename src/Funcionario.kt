import java.awt.List
import java.math.BigDecimal

class Funcionario(
     nome: String,
     idade: Int,
     cpf: Int,
     sexo: String,
    telefone: String,
    val funcao: String,
    val salario: BigDecimal,
    val experiencia: Int //ANOS
) : Pessoa (nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
    telefone = telefone) {}