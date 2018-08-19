package unioeste.geral.endereco.manager;

import unioeste.geral.endereco.bo.*;

public class UCEnderecoGeralServicos {
    public Endereco cadastrarEndereco(Endereco endereco) { return endereco; }
    public Endereco obterEnderecoPorCEP(int CEP) { return new Endereco(); }
    public Endereco obterEnderecoPorID(int id) { return new Endereco(); }
    public EnderecoEspecifico obterEnderecoExterno(String site) { return new EnderecoEspecifico(); }
    public Cidade obterCidade(Cidade cidade) { return cidade; }
}
