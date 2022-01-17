/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Animais;
import model.Endereco;
import model.Laticinio;
import model.Produtor;
import model.Vendas;

/**
 *
 * @author Gabriel
 */
public class BancoDeDados {

    /**
     * *************** CONEXÃO COM O BANCO DE DADOS ***********************
     */
    // objeto responsável pela conexão com o servidor do banco de dados
    Connection con;
    // objeto responsável por preparar as consultas dinâmicas
    PreparedStatement pst;
    // objeto responsável por executar as consultas estáticas
    Statement st;
    // objeto responsável por referenciar a tabela resultante da busca
    ResultSet rs;

    // NOME DO BANCO DE DADOS
    String database = "projeto";
    // URL: VERIFICAR QUAL A PORTA
    String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    // USUÁRIO
    String user = "root";
    // SENHA
    String password = "G@br1el__b1el14";

    boolean sucesso = false;

    // Conectar ao banco de dados
    public void connectToDb() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão feita com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

    }

    /**
     * ********************** INSERIR DADOS ********************************
     */
    public boolean inserirProdutores(Produtor novoFuncionario) {
        connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Produtor (nome,cpf,idade) values (?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, novoFuncionario.getNome()); //1- refere-se à primeira interrogação
            pst.setString(2, novoFuncionario.getCpf());  //2- refere-se à segunda interrogação
            pst.setString(3, String.valueOf(novoFuncionario.getIdade()));

            //e assim por diante....
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {   //Encerra a conexão
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    /**
     * ********************** INSERIR DADOS ********************************
     */
    public boolean inserirAnimal(Animais novoAnimal) {
        connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Animais (idAnimais,idadeAnimal,nLitros,vacinou,nomeAnimal) values (?,?,?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(novoAnimal.getId())); //1- refere-se à primeira interrogação
            pst.setString(2, String.valueOf(novoAnimal.getIdade()));  //2- refere-se à segunda interrogação

            pst.setString(3, String.valueOf(novoAnimal.getnLitros()));
            pst.setString(4, String.valueOf(novoAnimal.getVacinou()));
            pst.setString(5, novoAnimal.getNome());
            /*
            if(novoAnimal.isVacinou())
            {
                pst.setString(5,"Vacinado");
            }
            else
                pst.setString(5,"Não Vacinou");
             */
            //e assim por diante....
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {   //Encerra a conexão
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    public boolean inserirVendas(Vendas v) {
        connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Vendas (nomeComprador,quantidadeVendida,valor,dataCompra,cpfComprador) values (?,?,?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, v.getNome()); //1- refere-se à primeira interrogação
            pst.setString(2, String.valueOf(v.getQuantVendas()));  //2- refere-se à segunda interrogação
            pst.setString(3, String.valueOf(v.getValor()));
            pst.setString(4, v.getData());
            pst.setString(5, v.getCpf());

            //e assim por diante....
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {   //Encerra a conexão
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    //Inserindo Informações do Laticinio
    public boolean inserirLaticinios(Laticinio l) {
        connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Laticinio (CNPJ,Localizacao,Nome) values (?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, l.getCnpj()); //1- refere-se à primeira interrogação
            pst.setString(2, l.getLocalizacao());  //2- refere-se à segunda interrogação
            pst.setString(3, l.getNomeLaticinio());

            //e assim por diante....
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {   //Encerra a conexão
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    //Inserindo Dados do Endereço
    public boolean inserirEndereco(Endereco e) {
        connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Endereco (rua,Cidade,Pais,Complemento,Numero,idEndereco) values (?,?,?,?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, e.getRua()); //1- refere-se à primeira interrogação
            pst.setString(2, e.getCidade());  //2- refere-se à segunda interrogação
            pst.setString(3, e.getPais());
            pst.setString(4, e.getComplemento());
            pst.setString(5, String.valueOf(e.getNumero()));
            pst.setInt(6, e.getId());
            //e assim por diante....
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {   //Encerra a conexão
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    /**
     * ********************** BUSCAR DADOS ********************************
     */
    //Produtores
    public ArrayList<Produtor> buscarProdutoresSemFiltro() {
        ArrayList<Produtor> listaDeFuncionarios = new ArrayList<>();
        connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM Produtor";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql); //ref. a tabela resultante da busca
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                Produtor pesqProdutor = new Produtor(rs.getString("cpf"), rs.getString("nome"), rs.getInt("idade"));
                listaDeFuncionarios.add(pesqProdutor);
            }
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return listaDeFuncionarios;
    }

    //Buscar Laticinio
    public ArrayList<Laticinio> buscarLaticiniosSemFiltro() {
        ArrayList<Laticinio> listaDeLaticinios = new ArrayList<>();
        connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM Laticinio";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql); //ref. a tabela resultante da busca
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                Laticinio pesqLaticinio = new Laticinio(rs.getString("CNPJ"), rs.getString("Localizacao"), rs.getString("Nome"));
                listaDeLaticinios.add(pesqLaticinio);
            }
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return listaDeLaticinios;
    }

    //Buscando endereço dos funcionários
    public ArrayList<Endereco> buscarEnderecoSemFiltro() {
        ArrayList<Endereco> listaDeEnderecos = new ArrayList<>();
        connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM Produtor";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql); //ref. a tabela resultante da busca
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));

                Endereco pesqEndereco = new Endereco();

                pesqEndereco.setCidade(rs.getString("Cidade"));
                pesqEndereco.setPais(rs.getString("Pais"));
                pesqEndereco.setComplemento(rs.getString("Complemento"));
                pesqEndereco.setNumero(rs.getInt("Numero"));
                pesqEndereco.setId(rs.getInt("idEndereco"));
                listaDeEnderecos.add(pesqEndereco);

            }
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return listaDeEnderecos;
    }

    //Pesquisando Animais
    public ArrayList<Animais> buscarAnimaisSemFiltro() {
        ArrayList<Animais> listaDeAnimais = new ArrayList<>();
        connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM Animais";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql); //ref. a tabela resultante da busca
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                Animais pesqAnimais = new Animais();
                pesqAnimais.setIdade(rs.getInt("idadeAnimal"));
                pesqAnimais.setNome(rs.getString("nomeAnimal"));
                pesqAnimais.setId(rs.getInt("idAnimais"));
                pesqAnimais.setnLitros(rs.getInt("nLitros"));
                pesqAnimais.setVacinou(rs.getString("vacinou"));
                listaDeAnimais.add(pesqAnimais);
            }
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return listaDeAnimais;
    }

    public ArrayList<Vendas> buscarVendasSemFiltro() {
        ArrayList<Vendas> listaDeVendas = new ArrayList<>();
        connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM Vendas";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql); //ref. a tabela resultante da busca
            while (rs.next()) {
                //System.out.println(rs.getString("nome"));
                Vendas pesqVendas = new Vendas();
                pesqVendas.setCpf(rs.getString("cpfComprador"));
                pesqVendas.setData(rs.getString("dataCompra"));
                pesqVendas.setQuantVendas(rs.getInt("quantidadeVendida"));
                pesqVendas.setValor(rs.getFloat("valor"));
                pesqVendas.setNome(rs.getString("NomeComprador"));
                pesqVendas.setId(rs.getString("idVendas"));
                listaDeVendas.add(pesqVendas);
            }
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return listaDeVendas;
    }

    /**
     * ********************** ATUALIZAR DADOS ********************************
     */
    public boolean atualizarDadosProdutor(String cpf, String novoDado, String dadoSelecionado) {
        //Conectando ao banco de Dados
        connectToDb();
        //Testando qual dado o usuário selecionou para atualizar
        if (dadoSelecionado.equals("idade")) {
            //Comando em SQL
            String sql = "UPDATE Produtor SET idade=? WHERE cpf=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setString(2, cpf);
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        } else if (dadoSelecionado.equals("nome")) {
            //Comando em SQL
            String sql = "UPDATE Produtor SET nome=? WHERE cpf=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setString(2, cpf);
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        } else if (dadoSelecionado.equals("cpf")) {
            //Comando em SQL
            String sql = "UPDATE Produtor SET nome=? WHERE cpf=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setString(2, cpf);
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        return sucesso;
    }

    public boolean atualizarDadosVendas(String id, String novoDado, String dadoSelecionado) {
        //Conectando ao banco de Dados
        connectToDb();
        //Testando qual dado o usuário selecionou para atualizar
        if (dadoSelecionado.equals("cpf")) {
            //Comando em SQL
            String sql = "UPDATE Vendas SET cpfComprador=? WHERE idVendas=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("nome")) {
            //Comando em SQL
            String sql = "UPDATE Vendas SET nomeComprador=? WHERE idVendas=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("quantidade")) {
            //Comando em SQL
            String sql = "UPDATE Vendas SET quantidadeVendida=? WHERE idVendas=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(novoDado));
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("valor")) {
            //Comando em SQL
            String sql = "UPDATE Vendas SET valor=? WHERE idVendas=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setFloat(1, Float.parseFloat(novoDado));
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("data")) {
            //Comando em SQL
            String sql = "UPDATE Vendas SET dataCompra=? WHERE idVendas=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        return sucesso;
    }

    public boolean atualizarDadosEndereco(String id, String novoDado, String dadoSelecionado) {
        //Conectando ao banco de Dados
        connectToDb();
        //Testando qual dado o usuário selecionou para atualizar
        if (dadoSelecionado.equals("pais")) {
            //Comando em SQL
            String sql = "UPDATE Endereco SET Pais=? WHERE idEndereco=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("rua")) {
            //Comando em SQL
            String sql = "UPDATE Endereco SET rua=? WHERE idEndereco=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("complemento")) {
            //Comando em SQL
            String sql = "UPDATE Endereco SET Complemento=? WHERE idEndereco=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("Cidade")) {
            //Comando em SQL
            String sql = "UPDATE Endereco SET Cidade=? WHERE idEndereco=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("Numero")) {
            //Comando em SQL
            String sql = "UPDATE Endereco SET Numero=? WHERE idEndereco=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(novoDado));
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        return sucesso;
    }

    public boolean atualizarDadosAnimais(String id, String novoDado, String dadoSelecionado) {
        connectToDb();
        //Testando qual dado o usuário selecionou para atualizar
        if (dadoSelecionado.equals("vacinação")) {
            //Comando em SQL
            String sql = "UPDATE Animais SET vacinou=? WHERE idAnimais=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("nome")) {
            //Comando em SQL
            String sql = "UPDATE Animais SET nomeAnimal=? WHERE idAnimais=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, novoDado);
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("idade")) {
            //Comando em SQL
            String sql = "UPDATE Animais SET idadeAnimal=? WHERE idAnimais=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(novoDado));
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        if (dadoSelecionado.equals("litros")) {
            //Comando em SQL
            String sql = "UPDATE Animais SET nLitros=? WHERE idAnimais=?";

            //O comando recebe paramêtros -> consulta dinâmica (pst)
            try {
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(novoDado));
                pst.setInt(2, Integer.parseInt(id));
                pst.execute();
                sucesso = true;
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
                sucesso = false;
            } finally {
                try {
                    con.close();
                    pst.close();
                } catch (SQLException ex) {
                    System.out.println("Erro = " + ex.getMessage());
                }

            }
            return sucesso;
        }
        return sucesso;
    }

    /**
     * ********************** DELETAR REGISTROS ******************************
     */
    public boolean deletarProdutor(String cpf) {
        connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM Produtor WHERE cpf=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarAnimais(int id) {
        connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM Animais WHERE idAnimais=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarEndereco(int id) {
        connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM Endereco WHERE idEndereco=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarVendas(int id) {
        connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM Vendas WHERE idVendas=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

}
