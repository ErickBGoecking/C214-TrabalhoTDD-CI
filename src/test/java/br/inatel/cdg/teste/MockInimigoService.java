package br.inatel.cdg.teste;

import br.inatel.cdg.InimigoConst;
import br.inatel.cdg.InimigoService;

import java.util.ArrayList;

public class MockInimigoService implements InimigoService {
    ArrayList<Integer> idArray = new ArrayList<>();

    @Override
    public String busca(int id) {
        if(id == 20)
            return InimigoConst.INIMIGO20;
        else if (id == 10)
            return InimigoConst.SKELETON;
        else if (id < 0)
            return InimigoConst.INEXISTENTE;
        else
            return InimigoConst.INIMIGO;

    }

    @Override
    public boolean array(int id){
        idArray.add(20);
        idArray.add(10);
        boolean confere = idArray.contains(id);
        return confere;
    }
}
