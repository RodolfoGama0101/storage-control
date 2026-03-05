package dev.rodolfo.storage_control.core.ports.in;

public interface PasswordEncoderPort {

    String encode(String password);

    boolean matches(String rawPassword, String encodedPassword);
}
