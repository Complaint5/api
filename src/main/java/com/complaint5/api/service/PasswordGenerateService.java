package com.complaint5.api.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordGenerateService {

    private final int tamanhoSenha = 16;
    private StringBuilder senha = new StringBuilder();
    private String characteries = "ABCDEFGHIJKLMNOPQRSTUVWXYZ,.<>;:~^[]{}()-_=+()*&%$#@!\\/?\'\"çabcdefghijklmnopqrstuvwxyz";

    public String passwordGenerate() {
        senha.setLength(0);
        for (int i = 0; i < tamanhoSenha; i++) {
            senha.append(characteries.charAt((int) (Math.random() * characteries.length())));
        }
        return senha.toString();
    }
}
