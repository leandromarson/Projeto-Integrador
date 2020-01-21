package pacote;

//importaçoes de bibliotecas
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Tela extends javax.swing.JFrame {
    //Inicialização dos modelos de tabela
    EstadosTM Modelo;
    EstadosTMR ModeloResolvido;
    PaisesTM ModeloPais;
    PaisesTMR ModeloPaisResolvido;
    EstadosTMC ModeloClassificacao;
    
    
    
    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        //Inicialização dos modelos de tabela
        Modelo = new EstadosTM();
        ModeloPais = new PaisesTM();
        ModeloResolvido = new EstadosTMR();
        ModeloPaisResolvido = new PaisesTMR();
        ModeloClassificacao = new EstadosTMC();
        //Definindo qual tabela recebera qual modelo
        tblDadosIniciais.setModel(Modelo);
        tblPaisesDadosIniciais.setModel(ModeloPais);
        tblDadosResolvidos.setModel(ModeloResolvido);
        tblDadosResolvidosGeral.setModel(ModeloPaisResolvido);
        tblClassificacao.setModel(ModeloClassificacao);
        
        
        //Ordenação de colunas
        tblDadosIniciais.setRowSorter(new TableRowSorter(Modelo));
        tblDadosResolvidos.setRowSorter(new TableRowSorter(ModeloResolvido));
        tblClassificacao.setRowSorter(new TableRowSorter(ModeloClassificacao));
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblClassificacao.getModel());
        tblClassificacao.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(27);
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDadosIniciais = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaisesDadosIniciais = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClassificacao = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDadosResolvidosGeral = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDadosResolvidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Integrador");
        setBackground(new java.awt.Color(51, 51, 51));
        setExtendedState(1);
        setForeground(new java.awt.Color(51, 51, 51));

        btnCadastrar.setText("Cadastrar e Calcular");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tblDadosIniciais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Bioma", "População", "Num. Infectados", "Num. Mortes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDadosIniciais);

        tblPaisesDadosIniciais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "País", "População"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPaisesDadosIniciais);

        tblClassificacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Bioma", "% Infectados", "% Mortes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblClassificacao);

        jLabel1.setText("Tabela de Dados Resolvidos dos Estados ");

        jLabel2.setText("Tabela Dados Iniciais");

        tblDadosResolvidosGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Mortes", "Num. Inf.", "% Inf. / Pop.", "% Mortes / Inf.", "% Mortes / Pop.", "Estado c/ > % Inf. / Pop.", "Estado c/ > % Mortes / Inf.", "Estado c/ > % Mortes / Pop.", "Estado c/ > Num. Inf.", "Estado c/ > Num. Mortes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblDadosResolvidosGeral);

        jLabel3.setText("Classificação Geral dos Estados");

        jLabel4.setText("Tabela de Dados Gerais ");

        tblDadosResolvidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Bioma", "População", "Num. Infectados", "Num. Mortes", "% Infectados / População", "% Mortes / Infectados", "% Mortes / População"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblDadosResolvidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(649, 649, 649))
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Ao clicar no botão cadastrar
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //Cadastrando Dados do país e estados
        Paises br = new Paises(208494900,"Brasil");//criando um objeto para o país
        Estados e[] = new Estados[27];//criando um vetor de objetos para os estados
        e[0]= new Estados(881935,"Acre",101224,60340,"Amazônia");
        e[1]= new Estados(3337357,"Alagoas",53504,25302,"Caatinga");
        e[2]= new Estados(845731,"Amapá",69624,43600,"Amazônia");
        e[3]= new Estados(4144597,"Amazonas",203670,140790,"Amazônia");
        e[4]= new Estados(14873064,"Bahia",150520,70302,"Caatinga");
        e[5]= new Estados(9132078,"Ceará",43594,25312,"Caatinga");
        e[6]= new Estados(3015268,"Distrito Federal",33500,19203,"Cerrado");
        e[7]= new Estados(4018650,"Espírito Santo",30201,15208,"Mata Atlântica");
        e[8]= new Estados(7018354,"Goiás",88213,38316,"Cerrado");
        e[9]= new Estados(7075181,"Maranhão",80312,40156,"Cerrado");
        e[10]= new Estados(3484466,"Mato Grosso",270201,187453,"Amazônia");
        e[11]= new Estados(2778986,"Mato Grosso do Sul",50321,22214,"Pantanal");
        e[12]= new Estados(21168791,"Minas Gerais",92098,30213,"Cerrado");
        e[13]= new Estados(8602865,"Pará",450312,215100,"Amazônia");
        e[14]= new Estados(4018127,"Paraíba",33234,13231,"Caatinga");
        e[15]= new Estados(11433957,"Paraná",90440,39987,"Mata Atlântica");
        e[16]= new Estados(9957071,"Pernanbuco",60211,37215,"Caatinga");
        e[17]= new Estados(3273227,"Piauí",47311,19204,"Caatinga");
        e[18]= new Estados(17264943,"Mata Atlântica",80208,28221,"Mata Atlântica");
        e[19]= new Estados(3506853,"Rio Grande do Norte",43113,18211,"Caatinga");
        e[20]= new Estados(11377239,"Rio Grande do Sul",60221,30442,"Pampa");
        e[21]= new Estados(1777225,"Rondônia",175630,74003,"Amazônia");
        e[22]= new Estados(605761,"Roraima",90401,49752,"Amazônia");
        e[23]= new Estados(7164788,"Santa Catarina",64887,29215,"Mata Atlântica");
        e[24]= new Estados(45919049,"São Paulo",75718,30213,"Mata Atlântica");
        e[25]= new Estados(2298696,"Sergipe",48563,25902,"Caatinga");
        e[26]= new Estados(1572866,"Tocantins",47835,12324,"Cerrado");
        
        //Inserindo dados dos estados na tabela
        for (int x = 0; x < 27; x++) {
            Modelo.addEstados(e[x]);
        }
        //Inserindo dados do país na tabela
        ModeloPais.addPaises(br);
        
        //Fazendo calculos das porcentagens
        for (int x = 0; x < 27; x++)
        {
            float porcInfPopTot = ((float)e[x].getNumInfectados()*100)/(float)e[x].getPopTotal();
            e[x].setPorcentInfectados(porcInfPopTot);
            
            float porcMortesInf = ((float)e[x].getNumMortes()*100)/(float)e[x].getNumInfectados();
            e[x].setPorcentMortesTotInf(porcMortesInf);
            
            float porcMortesPopTot = ((float)e[x].getNumMortes()*100)/(float)e[x].getPopTotal();
            e[x].setPorcentMortesTotPop(porcMortesPopTot);
                        
        }
        
       //Inserindo Dados na tabela de estados resolvida      
        for (int x = 0; x < 27; x++) {
            ModeloResolvido.addEstadosR(e[x]);
        }
        
        //Fazendo Calculos de Dados Gerais
        
        //somas dos valores
        int somaInf = 0;
        int somaMortes = 0;
        for (int x = 0; x < 27; x++) {
            somaInf+=(e[x].numInfectados);
            somaMortes+=(e[x].numMortes);            
        }
        br.setNumInfectados(somaInf);
        br.setNumMortes(somaMortes);
        
        //Calculos de porcentagens
        float porcInfPopTot = ((float)br.getNumInfectados()*100)/(float)br.getPopTotal();
        br.setPorcentInfectados(porcInfPopTot);
        float porcMortesInf = ((float)br.getNumMortes()*100)/(float)br.getNumInfectados();
        br.setPorcentMortesTotInf(porcMortesInf);
        float porcMortesPopTot = ((float)br.getNumMortes()*100)/(float)br.getPopTotal();
        br.setPorcentMortesTotPop(porcMortesPopTot);
        
        //Definindo o estado com maior porcentagem de infectados
        float maior = 0;
        String nomeEstado = null;
        for (int x = 0; x < 27; x++) {
            if(e[x].getPorcentInfectados()>maior){
                maior = e[x].getPorcentInfectados();
                nomeEstado = e[x].getNome();
            }
        }
        br.setEstadoMaiorPorcentInf(nomeEstado+"("+maior+")");
        //Definindo o estado com maior porcentagem de mortes por infectados
        maior = 0;
        nomeEstado = null;
        
        for (int x = 0; x < 27; x++) {
            if(e[x].getPorcentMortesTotInf()>maior){
                maior = e[x].getPorcentMortesTotInf();
                nomeEstado = e[x].getNome();
            }
        }
        br.setEstadoMaiorPorcentMortesInf(nomeEstado+"("+maior+")");
        //Definindo o estado com maior porcentagem de mortes pela população do estado
        maior = 0;
        nomeEstado = null;
        
        for (int x = 0; x < 27; x++) {
            if(e[x].getPorcentMortesTotPop()>maior){
                maior = e[x].getPorcentMortesTotPop();
                nomeEstado = e[x].getNome();
            }
        }
        br.setEstadoMaiorPorcentMortesPopTot(nomeEstado+"("+maior+")");
        //Definindo o estado com maior numero de infectados
        maior = 0;
        nomeEstado = null;
        
        for (int x = 0; x < 27; x++) {
            if(e[x].getNumInfectados()>maior){
                maior = e[x].getNumInfectados();
                nomeEstado = e[x].getNome();
            }
        }
        br.setEstadoMaiorNumInf(nomeEstado+"("+maior+")");
        //Definindo o estado com maior numero de mortes
        maior = 0;
        nomeEstado = null;
        
        for (int x = 0; x < 27; x++) {
            if(e[x].getNumMortes()>maior){
                maior = e[x].getNumMortes();
                nomeEstado = e[x].getNome();
            }
        }
        br.setEstadoMaiorNumMortes(nomeEstado+"("+maior+")");
        
        //Inserindo Dados na tabela de valores resolvidos gerais
        ModeloPaisResolvido.addPaisesR(br);
        
        //Inserindo dados na tabela de classificação
               
        for (int x = 0; x < 27; x++) {
            ModeloClassificacao.addEstadosC(e[x]);
        }
        
        //desabilitando botao Cadastrar
        btnCadastrar.setEnabled(false);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    //Metodo Main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
        
          
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblClassificacao;
    private javax.swing.JTable tblDadosIniciais;
    private javax.swing.JTable tblDadosResolvidos;
    private javax.swing.JTable tblDadosResolvidosGeral;
    private javax.swing.JTable tblPaisesDadosIniciais;
    // End of variables declaration//GEN-END:variables
}
