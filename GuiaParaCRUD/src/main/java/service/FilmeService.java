package service;

importar br.com.fujideia.iesp.tecback.model.Filme;
importar br.com.fujideia.iesp.tecback.repository.FilmeRepository;
importar jakarta.ws.rs.NotFoundException;
importar lombok.extern.slf4j.Slf4j;
importar org.springframework.beans.factory.annotation.Autowired;
importar org.springframework.stereotype.Service;
importar java.util.List;
importar java.util.Objects;

@Slf4j
@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repositório;

    public Filme salvar(Filme filme){
        filme = repositório.save(filme);
        filme de retorno;
    }

    public Filme alterar(Filme filme){
        if(Objects.nonNull(filme.getId())){
            filme = repositório.save(filme);
        }else{
            lançar new NotFoundException();
        }
        retornar filme;
    }

    public List<Filme> listar(){
        return repository.findAll();
    }

    public Boolean excluir(Id inteiro){
        tentar {
            repositório.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            retorna falso;

        }
        retornar verdadeiro;
    }

    public Filme consultarPorId(Integer id){
        retornar repositório
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

}