package soundsmarts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoundSmartsService {

	@Autowired
	public AlunoRepository alunoRepository;
	
	public Iterable<Aluno> getTodosAlunos() {
		
		return alunoRepository.findAll();
}
	public Optional<Aluno> getAlunoById(Integer id){
		return alunoRepository.findById(id);
	}
	public AlunoRepository {

		
	}
	
}
