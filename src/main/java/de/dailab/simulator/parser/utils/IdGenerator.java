package de.dailab.simulator.parser.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * TODO: Maybe create a factory for multiple id generation methods
 *
 * @author Timo Hanisch
 * @version 1.0
 * @since 17.04.2015
 */
public class IdGenerator {

    public static final int RADIX = 32;

    // 130+ bits guarantee uniqueness
    public static final int DEFAULT_BIT_COUNT = 130;

    private static final SecureRandom random = new SecureRandom();

    private IdGenerator() {
    }

    public static String generateId() {
        return generateId(DEFAULT_BIT_COUNT);
    }

    public static String generateId(int bitCount) {
        return new BigInteger(bitCount, random).toString(RADIX);
    }
}
