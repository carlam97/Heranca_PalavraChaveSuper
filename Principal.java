public class Principal {
    public static void main(String[] args){

        Aluno a = new Aluno();
        Professor p = new Professor();
        Pessoa ps = new Pessoa();

        //Dados do aluno
        a.setNome("Carla Martins");
        a.setEndereco("Rua das Flores");
        a.setTelefone("14 983782183");
        a.setCpf("111.222.333-44");

        //Notas do aluno
        a.setCursos("Big Data");
        a.setNota1(9.0);
        a.setNota2(7.5);

        //Prints
        System.out.println("A aluna:");
        System.out.println(a.getNome());
        System.out.println(a.getEndereco());
        System.out.println(a.getTelefone());
        System.out.println(a.getCpf());
        System.out.println(a.getCursos());

        if(a.verificaAprovado()){
        System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");

        }
    }
}
