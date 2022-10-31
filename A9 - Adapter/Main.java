package Adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new UserMultiMulti("Jonas", "escamadoegeladinho@gmail.com", "jhonnyboy"));
        usuarios.add(new UserSingleMulti("Bruno", "trincheira@gmail.com", "redecorate"));
        usuarios.add(new UserSingleSingle("Rayslla", "caraembacada@gmail.com", "polarize"));

        Map<String, BancoDeDados> mapaBD = new HashMap<String, BancoDeDados>();

        mapaBD.put(UserMultiMulti.class.toString(),new MySql());
        mapaBD.put(UserSingleMulti.class.toString(), new FireBird());
        mapaBD.put(UserSingleSingle.class.toString(),new Paradox());


        for(int i = 0; i < usuarios.size();i++){
            iAdapter adapter = new AdapterBD(usuarios.get(i));
            BancoDeDados bd = mapaBD.get(usuarios.get(i).getClass().toString());

            if(adapter != null){
                adapter.iniciarConexao(bd);
                adapter.terminarConexao(bd);
            }
        }
    }
}
