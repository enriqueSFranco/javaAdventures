package org.bitmanipulation;

public class BitManipulation {
    int a = 5; // binario = 101 & 001
    int b = 3; // 011

    // operacion AND
    int resultAnd = a & b; // Resultado: 001 (1 en binario)

    // operacion OR
    int resultOr = a | b; // Resultado: 111 (7 en binario)

    // Operación XOR
    int resultXor = a ^ b; // Resultado: 110 (6 en binario)

    // Operación de desplazamiento a la izquierda
    int resultShiftLeft = a << 1; // Resultado: 1010 (10 en binario)
}
