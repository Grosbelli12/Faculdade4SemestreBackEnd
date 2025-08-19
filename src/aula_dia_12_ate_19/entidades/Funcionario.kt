package aula_dia_12_ate_19.entidades

import aula_dia_12_ate_19.enumerados.Experiencia
import aula_dia_12_ate_19.enumerados.Setor
import aula_dia_12_ate_19.enumerados.Sexo
import java.math.BigDecimal

class Funcionario(
    nome: String,
    idade: Int,
    cpf: Int,
    sexo: Sexo,
    telefone: String,
    val salario: BigDecimal,
    val experiencia: Experiencia,
    val setor: Setor
) : Pessoa(nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo,
    telefone = telefone) {


    //Comportamento do Profissional
    fun instalarCaixaDAgua(clt: Funcionario): Boolean {

        if ( clt.setor.equals(Setor.MONTAGEM)){
           return true;
        }else{
            return false;
        }
    }
}