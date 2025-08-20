package aula_dia_12_ate_19.entidades

import aula_dia_12_ate_19.enumerados.TipoDaConta
import java.math.BigDecimal

class Conta (
    var saldo: BigDecimal,
    val ativa: Boolean,
    val numeroDaConta: Int,
    val agencia: Int,
    val senha: Int,
    val titular: Pessoa,
    val tipoDaConta: TipoDaConta
){
}