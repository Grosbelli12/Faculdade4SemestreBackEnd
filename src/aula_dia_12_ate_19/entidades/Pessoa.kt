package aula_dia_12_ate_19.entidades

import aula_dia_12_ate_19.enumerados.Sexo
import java.math.BigDecimal

open class Pessoa(
    val nome: String,
    val idade: Int,
    val cpf: Int,
    val sexo: Sexo,
    val telefone: String
) {
    //Comportamento
    open fun receberConta(conta: Conta, aReceber: BigDecimal) {
        conta.saldo = conta.saldo.add(aReceber)
    }
}

