package pacote;



import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class EstadosTMC extends AbstractTableModel{
    
    private List<Estados> linhas;
    private String[] colunas = new String[]{"Estado","Bioma","% Infectados","% Mortes"};
    
    public EstadosTMC(){
        linhas = new ArrayList<Estados>();
    }
    
    public EstadosTMC(List<Estados> lista) {
        linhas = new ArrayList<Estados>(lista);
    }

    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estados e = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return e.getNome();
            case 1:
                return e.getBioma();
            case 2:
                return e.getPorcentInfectados();
            case 3:
                return e.getPorcentMortesTotInf();
                 
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Estados e = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                e.setNome(aValue.toString());
                break;
            case 1:
                e.setBioma(aValue.toString());
                break;
            case 2:
                e.setPorcentInfectados((float) aValue);
                break;
            case 3:
                e.setPorcentMortesTotInf((float) aValue);
                break;
            
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Estados aValue, int rowIndex) {
        Estados e = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        
        e.setNome(aValue.getNome());
        e.setBioma(aValue.getBioma());
        e.setPorcentInfectados(aValue.getPorcentInfectados());
        e.setPorcentMortesTotInf(aValue.getPorcentMortesTotInf());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Estados getEstadosC(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addEstadosC(Estados e) {
        // Adiciona o registro.
        linhas.add(e);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addLista(List<Estados> e) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(e);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   

        
}
