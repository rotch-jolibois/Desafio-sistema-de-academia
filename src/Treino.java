import java.time.LocalDate;
import java.util.List;

public class Treino<ItemTreino> {
    private int id;
    private String nome;
    private String objetivo;
    private LocalDate dataCriacao;
    private Professor professor;
    private List<ItemTreino> itens;
}
