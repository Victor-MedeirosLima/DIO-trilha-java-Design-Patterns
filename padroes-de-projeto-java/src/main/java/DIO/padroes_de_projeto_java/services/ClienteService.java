
package DIO.padroes_de_projeto_java.services;

import DIO.padroes_de_projeto_java.model.Cliente;


public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
    
}
