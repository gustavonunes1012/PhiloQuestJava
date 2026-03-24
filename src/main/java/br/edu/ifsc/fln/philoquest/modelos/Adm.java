package br.edu.ifsc.fln.philoquest.modelos;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Adm extends Usuario{
@Override
public boolean login(String matricula, String senha) {
    return false;
}

@Override
public void logout() {}

@Override
public void atualizarPerfil() {}

public void gerenciarUsuarios(){}
public void importarListasMatricula () {};
public void adicionarFilosofo(Filosofo filosofo){}
public void adicionarConceito (Conceito conceito) {}

    public Adm(String matricula, String nome, String senha) {
        super(matricula, nome, senha);
    }

}
