
package DIO.padroes_de_projeto_java.services;

import DIO.padroes_de_projeto_java.model.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;



@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
        Endereco consultarCep(@PathVariable("cep") String cep);
    
}
