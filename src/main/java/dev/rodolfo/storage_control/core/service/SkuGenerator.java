package dev.rodolfo.storage_control.core.service;

import java.util.Random;

public class SkuGenerator {

    public SkuGenerator() {}

    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SUFFIX_LENGTH = 5;

    public static String generateSemanticSku(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }

        String cleanName = itemName.trim().toUpperCase().replaceAll("[^A-Z0-9]", "").toUpperCase();
        String prefix = cleanName.length() >= 3 ? cleanName.substring(0, 3) : cleanName;

        String suffix = generateRandomSku(SUFFIX_LENGTH);

        return prefix + "-" + suffix;
    }

    public static String generateRandomSku(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHANUMERIC.length());
            sb.append(ALPHANUMERIC.charAt(index));
        }

        return sb.toString();
    }
}
