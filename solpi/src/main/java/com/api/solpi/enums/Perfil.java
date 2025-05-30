package com.api.solpi.enums;

public enum Perfil {
    ORCAMENTO(1),
    ENGENHARIA(2),
    TECNICO(3),
    GESTOR(4);

    private final int codigo;

    Perfil(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
