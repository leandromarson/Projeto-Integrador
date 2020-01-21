package pacote;



import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class EstadosTMR extends AbstractTableModel{
    
    private List<Estados> linhas;
    private String[] colunas = new String[]{"Estado","Bioma","População","Num. Infectados","Num. Mortes","% Infectados / População","% Mortes / Infectados","% Mortes / População"};
    
    public EstadosTMR(){
        linhas = new ArrayList<Estados>();
    }
    
    public EstadosTMR(List<Estados> lista) {
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
                return e.getPopTotal();
            case 3:
                return e.getNumInfectados();
            case 4:
                return e.getNumMortes();
            case 5:
                return e.getPorcentInfectados();
            case 6:
                return e.getPorcentMortesTotInf();
            case 7:
                return e.getPorcentMortesTotPop();
                
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
                e.setPopTotal((int) aValue);
                break;
            case 3:
                e.setNumInfectados((int) aValue);
                break;
            case 4:
                e.setNumMortes((int) aValue);
                break;
            case 5:
                e.setPorcentInfectados((float) aValue);
                break;
            case 6:
                e.setPorcentMortesTotInf((float) aValue);
                break;
            case 7:
                e.setPorcentMortesTotPop((float) aValue);
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
        e.setPopTotal(aValue.getPopTotal());
        e.setNumInfectados(aValue.getNumInfectados());
        e.setNumMortes(aValue.getNumMortes());
        e.setPorcentInfectados(aValue.getPorcentInfectados());
        e.setPorcentMortesTotInf(aValue.getPorcentMortesTotInf());
        e.setPorcentMortesTotPop(aValue.getPorcentMortesTotPop());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Estados getEstados(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addEstadosR(Estados e) {
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