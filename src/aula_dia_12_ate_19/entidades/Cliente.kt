package aula_dia_12_ate_19.entidades

import aula_dia_12_ate_19.enumerados.Sexo
import java.math.BigDecimal

class Cliente(
    nome: String,
    idade: Int,
    cpf: Int,
    sexo: Sexo,
    telefone: String,
    endereco: String,
    val pedidos: Array<String>,
    val divida: BigDecimal,

    ) : Pessoa(nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
    telefone = telefone,) {}
