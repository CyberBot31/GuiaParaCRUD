package controller;

importar org.springframework.beans.factory.annotation.Autowired;
importar org.springframework.web.bind.annotation.*;
importar java.util.List;

@RestController
@RequestMapping("/api/filme")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public List<Filme> getAllFilmes() {
        return filmeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Filme getFilmeById(@PathVariable Long id) {
        return filmeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Filme createFilme(@RequestBody Filme filme) {
        return filmeRepository.save(filme);
    }

    @PutMapping("/{id}")
    public Filme updateFilme(@PathVariable Long id, @RequestBody Filme filme) {
        filme.setId(id);
        retornar filmeRepository.save(filme);
    }

    @DeleteMapping("/{id}")
    public void deleteFilme(@PathVariable Long id) {
        filmeRepository.deleteById(id);
    }
}
