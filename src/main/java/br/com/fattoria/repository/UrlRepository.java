package br.com.fattoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fattoria.entity.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long>{

}
