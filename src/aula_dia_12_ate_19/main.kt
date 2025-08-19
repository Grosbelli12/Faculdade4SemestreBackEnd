package aula_dia_12_ate_19

import aula_dia_12_ate_19.enumerados.Sexo
import aula_dia_12_ate_19.enumerados.Experiencia
import aula_dia_12_ate_19.entidades.Funcionario
import aula_dia_12_ate_19.entidades.Servico
import aula_dia_12_ate_19.enumerados.Setor
import java.math.BigDecimal

fun main(){
    // val caixaDAgua = aula_dia_12_ate_19.entidades.CaixaDAgua(100, 1.80, 1.78, true, BigDecimal("1200"),
    // aula_dia_12_ate_19.enumerados.Cor.AZUL, 1.90, 1.89, aula_dia_12_ate_19.enumerados.MaterialCaixaDeAgua.POLIETILENO, "fibratec", 106.5, 2.54, 2.56)

    val instalacao : Servico = Servico( BigDecimal("800.00"), "120.12".toBigDecimal(),
        Funcionario(
            nome = "Gustavo",
            idade = 19,
            cpf = 119987789,
            sexo = Sexo.MASCULINO,
            telefone = "4699927878",
            salario = BigDecimal("2800.50"),
            experiencia = Experiencia.MEDIA,
            setor = Setor.MONTAGEM
        )
    )
    println(instalacao)

}