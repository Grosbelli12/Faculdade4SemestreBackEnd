package aula_dia_12_ate_19.entidades

import java.math.BigDecimal

class Servico (
    val orcamento :BigDecimal,
    val maoDeObra : BigDecimal, //hora
    val funcionario : Funcionario
) {
}