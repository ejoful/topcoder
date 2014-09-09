package me;

import org.junit.*;
import static org.junit.Assert.*;

public class ReversalChainTest {

    public ReversalChainTest() {}

    @Test
    public void test() throws Exception {
        assertEquals(1, ReversalChain.minReversal("1100", "0110"));
        assertEquals(2, ReversalChain.minReversal("111000", "101010"));
        assertEquals(-1, ReversalChain.minReversal("0", "1"));
        assertEquals(0, ReversalChain.minReversal("10101", "10101"));
        assertEquals(4, ReversalChain.minReversal("111000111000", "001100110011"));
        assertEquals(-1, ReversalChain.minReversal("001100", "100001"));
        assertEquals(19, ReversalChain.minReversal("1010101010101010101010101010101010101010", "1111111111111111111100000000000000000000"));
        assertEquals(-1, ReversalChain.minReversal("11110000001111", "10001111110001"));
        assertEquals(4, ReversalChain.minReversal("111110111100111000110000100000", "111000111000111000111000111000"));
        assertEquals(9, ReversalChain.minReversal("001000011000000111000000001111", "100100100100100100100100100100"));
        assertEquals(8, ReversalChain.minReversal("001000011000000111000000001111", "001001001001001001001001001001"));
        assertEquals(5, ReversalChain.minReversal("001001000011000011001001", "000000000000000011111111"));
        assertEquals(0, ReversalChain.minReversal("000000000000000000000000000000", "000000000000000000000000000000"));
        assertEquals(-1, ReversalChain.minReversal("0000000000", "1111111111"));
        assertEquals(4, ReversalChain.minReversal("1111000110", "1010101011"));
        assertEquals(4, ReversalChain.minReversal("10110111011110111011010", "11110111101111011110000"));
        assertEquals(2, ReversalChain.minReversal("11111111111111111100000000000000001111111111111111", "11111111110000000011111111111111110000000011111111"));
        assertEquals(5, ReversalChain.minReversal("111111000111100110111111000111100110", "001111001111001111001111001111001111"));
        assertEquals(2, ReversalChain.minReversal("01001", "00110"));
        assertEquals(10, ReversalChain.minReversal("01100111001011010101011110010010001111100011100100", "00111111101111000001101100111101001101000100100100"));
        assertEquals(12, ReversalChain.minReversal("11111100111010010010101100001010110110110100001111", "00000100000010110000110110011111111110110011111111"));
        assertEquals(16, ReversalChain.minReversal("00001011111010111110001111000001000001011011100100", "00111111001110010100010011010010101000110010011001"));
        assertEquals(-1, ReversalChain.minReversal("011111100001000011000101000001001100111110", "100010000101000011010110010110100110110101"));
        assertEquals(9, ReversalChain.minReversal("0101000000001011001001010101110000001100010100", "0001001000101100010100111000101110100000000010"));
        assertEquals(5, ReversalChain.minReversal("0101111110110100111011101111001110111", "1111100011101110111100111101001110111"));
        assertEquals(6, ReversalChain.minReversal("110110101000110010000101010", "101011110101010100000001001"));
        assertEquals(2, ReversalChain.minReversal("11111111111101100110111101111111110", "10111101111110011011111111111111110"));
        assertEquals(9, ReversalChain.minReversal("1111111101110000110111111110101100", "1111010101110110111011110110100111"));
        assertEquals(10, ReversalChain.minReversal("11010010110001011010000100100100001010", "01110000000101000000110111000001101011"));
        assertEquals(5, ReversalChain.minReversal("11110011101111111011111011111111", "01101001111111111111111111011111"));
        assertEquals(-1, ReversalChain.minReversal("111101101111", "110111111110"));
        assertEquals(12, ReversalChain.minReversal("01000101011011010101100111111011101001010111", "10011111011001111000111110001010111000110011"));
        assertEquals(7, ReversalChain.minReversal("011101011010011111111110101", "110010011111101111011111100"));
        assertEquals(5, ReversalChain.minReversal("0001000000000001000000001001000000011000000000", "0100100010000000000000110000100000000000000000"));
        assertEquals(6, ReversalChain.minReversal("010001111001110101110011011", "111101010110101101011100010"));
        assertEquals(6, ReversalChain.minReversal("1101011000010001000010101001", "0000011011100100000110101001"));
        assertEquals(4, ReversalChain.minReversal("000000001111000000010", "000000000110001001001"));
        assertEquals(5, ReversalChain.minReversal("100000000001011000100001000000000", "000000010000000110000000111000000"));
        assertEquals(-1, ReversalChain.minReversal("00000010110011000000000010000101000", "00000101010000100000000000101001001"));
        assertEquals(1, ReversalChain.minReversal("0000000000010000000000000000000", "0000000000000000000000010000000"));
        assertEquals(2, ReversalChain.minReversal("00001000100000000000000000000", "00000000000000000000000001010"));
        assertEquals(3, ReversalChain.minReversal("1111111111011110111111011111111111111111101111111", "1111111101111111111111111101011111111101111111111"));
        assertEquals(-1, ReversalChain.minReversal("10100110001010101000000010100111", "01000100100001110001000111001110"));
        assertEquals(-1, ReversalChain.minReversal("1111011011011010111100111100000110000111111", "0111111101011100010111010110010101001111110"));
        assertEquals(3, ReversalChain.minReversal("010111110001", "011110111000"));
        assertEquals(1, ReversalChain.minReversal("11101111110", "11110111110"));
        assertEquals(10, ReversalChain.minReversal("11001110111010101010010110001010001011010", "11011011011101000110100111110100000010001"));
        assertEquals(1, ReversalChain.minReversal("11111111011111111111110", "11111110111111111111101"));
        assertEquals(-1, ReversalChain.minReversal("1010000010101000111000001110010", "0001100000011100110100010111000"));
        assertEquals(-1, ReversalChain.minReversal("10010101100110010101100010100011010000000", "01010110001000110001000011000000010111011"));
        assertEquals(1, ReversalChain.minReversal("000000000000000000000000000000000010000", "000000000000000000000000000000000001000"));
        assertEquals(7, ReversalChain.minReversal("001010000000001000111101000010100", "011011000010000001010100100100000"));
        assertEquals(11, ReversalChain.minReversal("111100111111110101111101111100110110101111111", "110111011011111111011011111001101111111010111"));
        assertEquals(2, ReversalChain.minReversal("0010011010", "1000100110"));
        assertEquals(0, ReversalChain.minReversal("111111111111111111111111111111111111111111", "111111111111111111111111111111111111111111"));
        assertEquals(8, ReversalChain.minReversal("0010101000001010000000010000001000000000000", "0100000000100001010000000100000000000000110"));
        assertEquals(3, ReversalChain.minReversal("100000000100000001010100000000", "001010000000101000000000000001"));
        assertEquals(0, ReversalChain.minReversal("1111111111", "1111111111"));
        assertEquals(2, ReversalChain.minReversal("00000000110100", "00000010000110"));
        assertEquals(0, ReversalChain.minReversal("11", "11"));
        assertEquals(-1, ReversalChain.minReversal("010000101101000110110101100010", "101010110010001111000010010001"));
        assertEquals(8, ReversalChain.minReversal("010111011100100111110111111101100111111", "111110111111111111010001000110111011101"));
        assertEquals(8, ReversalChain.minReversal("000101010000111110100011101010011110110111", "110111001011101111010010000110100010101011"));
        assertEquals(-1, ReversalChain.minReversal("010001110111110010110", "011011111000011001101"));
        assertEquals(7, ReversalChain.minReversal("10010000011110110010", "11111000101000100001"));
        assertEquals(2, ReversalChain.minReversal("0000000010000100001", "0011000010000000000"));
        assertEquals(0, ReversalChain.minReversal("0000000000000000000000000000000000", "0000000000000000000000000000000000"));
        assertEquals(-1, ReversalChain.minReversal("0101001111110111110010011111111110001", "0110111010001110111101101011111101011"));
        assertEquals(6, ReversalChain.minReversal("10010000000001001001000001010000100000100", "00100000000000000010010001010001010100001"));
        assertEquals(3, ReversalChain.minReversal("001001010001000011", "000010000001001111"));
        assertEquals(11, ReversalChain.minReversal("11101110101111101011110110011111111010", "10111011111100111101111111101110011001"));
        assertEquals(8, ReversalChain.minReversal("000101100101010001010011110011001111", "000010101011111001010011011000111100"));
        assertEquals(0, ReversalChain.minReversal("11111111111111111111111111111111111111111111111111", "11111111111111111111111111111111111111111111111111"));
        assertEquals(-1, ReversalChain.minReversal("01001011110011000000110000010000010000000101001000", "10000000101100011011010000010000100010101010000000"));
        assertEquals(-1, ReversalChain.minReversal("00000100000010000000000110000100000000100000000100", "10000000000000000000001000001000001010000000000101"));
        assertEquals(5, ReversalChain.minReversal("11111110100111111111111111111101111011111101111111", "11101110101111111011111111111111111110111111011111"));
        assertEquals(8, ReversalChain.minReversal("00000000000100000100001010000000000000000000011000", "00000000000010000001000000000101000000001010000000"));
        assertEquals(-1, ReversalChain.minReversal("10100111011111001001101100010111010101011100101111", "01110010011001110111111100110100101110001110111001"));
        assertEquals(2, ReversalChain.minReversal("11111101011111111111110111111111111111111111111111", "10111111111111101111111111110111111111111111111111"));
        assertEquals(10, ReversalChain.minReversal("11011010011100110111100111111111011001101101011100", "10011011101111101111011011100100011111111010001011"));
        assertEquals(-1, ReversalChain.minReversal("10111101110111110110101000110010110111111101001100", "01110110011001111110110010111111111011011100000011"));
        assertEquals(7, ReversalChain.minReversal("11111111101111100111111011111111100001111101111101", "01111101111111100011111111111110111001111111010111"));
        assertEquals(10, ReversalChain.minReversal("01110111011110110110110011110111111010001110010011", "10110111011011101101111111001011111000111001110001"));
        assertEquals(-1, ReversalChain.minReversal("11011001001101000010000110010100000000000001010010", "00001100001100000001011001010010101100010010100000"));
        assertEquals(7, ReversalChain.minReversal("11111011111110011001011010110111101111111111111101", "11111101111110101101110010101101011110111111111111"));
        assertEquals(13, ReversalChain.minReversal("11000011011101101001000101011010011001010010111001", "11101011111101010010100001011010011110001000001010"));
        assertEquals(-1, ReversalChain.minReversal("01011000001001110000000100000011001001011111010100", "00101010100110010101001010110111001000001100000000"));
        assertEquals(8, ReversalChain.minReversal("01101011101111111101111111010110100011111111111011", "01101101011111110111111011111110110010110111011111"));
        assertEquals(4, ReversalChain.minReversal("01000100000000010000000000000100000000000000000000", "00010000000000000000000000010001000100000000000000"));
        assertEquals(12, ReversalChain.minReversal("00100001101000010100110010111010100000000010110010", "10010000001000100011010110010100000101101011100000"));
        assertEquals(-1, ReversalChain.minReversal("11000011110010011011000111111100001101001111000110", "00001100011011001111001110111110101110000001110110"));
        assertEquals(-1, ReversalChain.minReversal("00100100000101001100000110110000000001101000101111", "00001001000010010010110010100011010001100001010110"));
        assertEquals(3, ReversalChain.minReversal("1100010000101", "1001100001001"));
        assertEquals(5, ReversalChain.minReversal("000000000000010000000000110010010000000000001", "000000010010000000000000000101010010000000000"));
        assertEquals(12, ReversalChain.minReversal("0000111010010001101001100000011000100111", "0110010100011110100011010000000000001111"));
        assertEquals(13, ReversalChain.minReversal("101111100101100111001011110101101111011011111000", "110101111111110001111011111101110100111001000010"));
        assertEquals(15, ReversalChain.minReversal("0111110101011100111001111000111110111100101000101", "1011100111000111000100010111101101100111011111110"));
        assertEquals(16, ReversalChain.minReversal("101000100111110101011101110001111100010110", "111111111100000110011101011101000110010010"));
        assertEquals(17, ReversalChain.minReversal("01011000001111010000111000100111110000000000110", "10100100101101011101000000110010101010001010000"));
        assertEquals(19, ReversalChain.minReversal("10000001110100110111001110000000011101110101111100", "11010111110001101110001110111000010101110000100000"));
        assertEquals(24, ReversalChain.minReversal("11111111111111111111111110000000000000000000000000", "10101010101010101010101010101010101010101010101010"));
        assertEquals(20, ReversalChain.minReversal("11010110010011100111010000010110001010000001100110", "11010100000000110111110110000011010000111000011010"));
        assertEquals(21, ReversalChain.minReversal("10001111111101001100100100000101110111101110100111", "11111111101010011111110010110010110110001010001000"));
        assertEquals(22, ReversalChain.minReversal("00001111001001011111100111100010111011111111011011", "01001111111111011100001011100110011110100101011111"));
        assertEquals(10, ReversalChain.minReversal("1010101000101010000100100010001010001011110000100", "1100100100001001000010101001000111010010100010001"));
        assertEquals(9, ReversalChain.minReversal("01010111101010001100001011000111001110101101111001", "10111100110101100000101100011110001110101111010010"));
        assertEquals(3, ReversalChain.minReversal("1011000011", "0100101101"));
        assertEquals(2, ReversalChain.minReversal("100011101001", "010101110001"));
        assertEquals(2, ReversalChain.minReversal("011010", "100110"));
        assertEquals(2, ReversalChain.minReversal("10011000000000000000000000000000000000000000000000", "01101000000000000000000000000000000000000000000000"));
        assertEquals(2, ReversalChain.minReversal("010010", "001100"));
        assertEquals(2, ReversalChain.minReversal("101001", "100110"));
        assertEquals(2, ReversalChain.minReversal("00100100", "00011000"));
        assertEquals(2, ReversalChain.minReversal("11100101", "11011001"));
        assertEquals(2, ReversalChain.minReversal("101100", "110010"));
        assertEquals(-1, ReversalChain.minReversal("0110", "1001"));
        assertEquals(9, ReversalChain.minReversal("11010101010100100010101111000", "11111110000110000111100001000"));
        assertEquals(2, ReversalChain.minReversal("01101", "10011"));
        assertEquals(2, ReversalChain.minReversal("0110011", "0101101"));
        assertEquals(2, ReversalChain.minReversal("11011011", "11100111"));
        assertEquals(2, ReversalChain.minReversal("100110", "101001"));
        assertEquals(2, ReversalChain.minReversal("10011", "01101"));
        assertEquals(2, ReversalChain.minReversal("011010111001", "010111001110"));
        assertEquals(-1, ReversalChain.minReversal("10011000010000111010100110101001010101010110011010", "11001010101101010100100010001001010101010101010011"));
        assertEquals(-1, ReversalChain.minReversal("11101000001000100001101001111111001001010011110110", "00101111100110000000111000001100011011011110111010"));
        assertEquals(2, ReversalChain.minReversal("000111011101010101011010001110101010001000110", "000111011101010101100101001110101010001000110"));
        assertEquals(2, ReversalChain.minReversal("001001000", "000110000"));
        assertEquals(-1, ReversalChain.minReversal("00000000001111111111000000000011111111110000011111", "10101010101010101010101010101010101010101010101010"));
        assertEquals(3, ReversalChain.minReversal("10110000111", "01001011011"));
        assertEquals(2, ReversalChain.minReversal("100100", "011000"));
        assertEquals(2, ReversalChain.minReversal("001100", "010010"));
        assertEquals(6, ReversalChain.minReversal("1000000100000000100000010001110000", "1100000000000000100000010101000001"));
        assertEquals(10, ReversalChain.minReversal("11001111110011000100010111010111110101010110110001", "00010110111001010101110000001110111010111110111011"));
        assertEquals(2, ReversalChain.minReversal("10110100", "00101110"));
        assertEquals(-1, ReversalChain.minReversal("1001", "0110"));
        assertEquals(2, ReversalChain.minReversal("10010", "01100"));
        assertEquals(7, ReversalChain.minReversal("11011101111111101111101111111011111011101011110110", "01101111111110111111101111111011011111101111100011"));
        assertEquals(24, ReversalChain.minReversal("10101010101010101010101010101010101010101010101010", "11111111111111111111111110000000000000000000000000"));
        assertEquals(2, ReversalChain.minReversal("00110", "01001"));
        assertEquals(1, ReversalChain.minReversal("0010000", "0000010"));
        assertEquals(11, ReversalChain.minReversal("11001100111100110011110011001111001100111100110011", "11101110001110111000111011100011101110001110111000"));
        assertEquals(3, ReversalChain.minReversal("000111000", "001010100"));
        assertEquals(2, ReversalChain.minReversal("1001101001", "1101000011"));
        assertEquals(11, ReversalChain.minReversal("10101111001101011100000010110001010000101110001111", "11101010010000001011100000100101111101011110000111"));
        assertEquals(12, ReversalChain.minReversal("00010100001000010010010000000001010000001011111100", "00010001110011000001011000100010010001010000010000"));
        assertEquals(2, ReversalChain.minReversal("10110", "11001"));
        assertEquals(-1, ReversalChain.minReversal("101", "010"));
        assertEquals(2, ReversalChain.minReversal("00101101", "01110100"));
        assertEquals(5, ReversalChain.minReversal("100001000111100111011000011111", "100001010000011011111101100111"));
        assertEquals(1, ReversalChain.minReversal("0001", "0010"));
        assertEquals(6, ReversalChain.minReversal("111011011101101101000011011111010001", "011011011101101101000111011100010111"));
        assertEquals(2, ReversalChain.minReversal("1101110", "1110011"));
        assertEquals(5, ReversalChain.minReversal("11001000010100100100000100000000000000010000010000", "01011000010100100100000100000000000010000000001000"));
        assertEquals(-1, ReversalChain.minReversal("000000000000001111111111111111111000000000000000", "111010001111100001000001000100000110010010011100"));
        assertEquals(-1, ReversalChain.minReversal("01110", "10101"));
        assertEquals(-1, ReversalChain.minReversal("00000000000000000000000001000000000000000000000000", "00000000000000000000000000000000000000000000000000"));
        assertEquals(12, ReversalChain.minReversal("11101000001000101001101001111111001011010011110110", "00101111100110000000111000101100011011011110111110"));
        assertEquals(10, ReversalChain.minReversal("11001000001111111010100100100110101011101101101110", "11011100001010111101101011100010100101001111110010"));
        assertEquals(6, ReversalChain.minReversal("01000110011000100110101011010001100010000010010110", "01110100011000001101101001110010001100000010110000"));
        assertEquals(2, ReversalChain.minReversal("00100011", "00001101"));
        assertEquals(13, ReversalChain.minReversal("10111100110101100000101100011110001110101111010010", "01100111010100111101101011000010001011101100101110"));
        assertEquals(-1, ReversalChain.minReversal("00000000000000000000000001111111111111111111111111", "00000000000000000000000001111111111111111111111110"));
        assertEquals(6, ReversalChain.minReversal("111000111000101010101010101010101010101010101010", "001100110011010101010101010101010101010101010101"));
        assertEquals(7, ReversalChain.minReversal("111111111111111000000000000000000000000000000000", "111111010010001000000010000000000001010111000000"));
        assertEquals(2, ReversalChain.minReversal("0111101011", "1011011011"));
        assertEquals(9, ReversalChain.minReversal("01000110011000100110101011010001100010000010010110", "00010101110010011010110101001001001000000000110011"));
        assertEquals(25, ReversalChain.minReversal("11111111111111111111111110000000000000000000000000", "01010101010101010101010101010101010101010101010101"));
        assertEquals(0, ReversalChain.minReversal("00000000000000000000000000000000000000000000000000", "00000000000000000000000000000000000000000000000000"));
        assertEquals(20, ReversalChain.minReversal("01010101010101010101010101010101010101010101010101", "00000111110000011111000001111100000111110000011111"));
        assertEquals(-1, ReversalChain.minReversal("011101101011", "111011010111"));
        assertEquals(8, ReversalChain.minReversal("10110111011110111110111111011111110111111110", "00000000111111111111111111111111111111111111"));
    }
}
