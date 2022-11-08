package c4g5e2seguridadvotaciones.seguridad.Repositorios;

import c4g5e2seguridadvotaciones.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
