package aula_dia_12_ate_19.entidades

import aula_dia_12_ate_19.enumerados.Sexo

open class Pessoa(
    val nome: String,
    val idade: Int,
    val cpf: Int,
    val sexo: Sexo,
    val telefone: String,
) {
}