package Abstract;

import java.util.Objects;

public class Professor extends Matricula {
    private String disciplinaMinistrada;
    private String nivelGraduacao;

    //Construtor
    public Professor(String nome, Integer idade, String email, String disciplinaMinistrada, String nivelGraduacao, Integer numeroMatricula) {
        super(numeroMatricula, "Professor", nome, idade, email);
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.nivelGraduacao = nivelGraduacao;
    }

    //GSetter

    public String getDisciplinaMinistrada() {
        return this.disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public String getGraduação() {
        return this.nivelGraduacao;
    }

    public void setGraduação(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    //Resto

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Professor)) {
            return false;
        }
        Professor professor = (Professor) o;
        return Objects.equals(disciplinaMinistrada, professor.disciplinaMinistrada) && Objects.equals(nivelGraduacao, professor.nivelGraduacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplinaMinistrada, nivelGraduacao);
    }

    @Override
    public String toString() {
        return super.toString()+
        ", "+nivelGraduacao+
        ", Ministro da Disciplina: "+disciplinaMinistrada;
    }


}
