package aula_dia_12_ate_19.entidades

import aula_dia_12_ate_19.enumerados.Cor
import aula_dia_12_ate_19.enumerados.MaterialCaixaDeAgua
import java.math.BigDecimal

class CaixaDAgua( // Os 2 parenteses são o construtor da classe
    val capacidade :Int, // Litros
    val diametroSuperior :Double,
    val diametroInferior :Double,
    val tampa :Boolean,
    val preco: BigDecimal,
    val cor : Cor,
    val alturaSemTampa :Double,
    val alturaComTampa :Double,
    val material: MaterialCaixaDeAgua,
    val marca : String,
    val peso :Double, //kg
    val largura :Double,
    val profundidade :Double
)// Aqui vai todos os atributos da classe
 {


}