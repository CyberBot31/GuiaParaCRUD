package repository;


importar br.com.fujideia.iesp.tecback.model.Filme;
importar org.springframework.data.jpa.repository.JpaRepository;
importar org.springframework.data.jpa.repository.Query;
importar org.springframework.data.repository.query.Param;
importar org.springframework.stereotype.Repository;
importar java.util.List; Interface pública

@Repository FilmeRepository estende JpaRepository<Filme,Integer> { }
