import java.math.BigDecimal

fun main(){
    //val caixaDAgua = CaixaDAgua(100, 1.80, 1.78, true, BigDecimal("1200"),
       // "zul", 1.90, 1.89, "Fibra", "fibratec", 106.5, 2.54, 2.56)

    val instalacao : Servico = Servico( BigDecimal("800.00"), "120.12".toBigDecimal(),
        Funcionario(
            nome = "Gustavo",
            idade = 19,
            cpf = 119987789,
            sexo = "Macho",
            telefone = "4699927878",
            funcao = "Instalacao",
            salario = BigDecimal("2800.50"),
            experiencia = 3,
        )
    )
    println(instalacao)
}