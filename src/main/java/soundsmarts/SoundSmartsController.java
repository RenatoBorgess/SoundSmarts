package soundsmarts;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SoundSmartsController {

	private SoundSmartsService soundSmartsService;
	public SoundSmartsController(SoundSmartsService soundSmartsService) {
		this.soundSmartsService = soundSmartsService;
	}
	@GetMapping("/alunos")
	public Iterable<Aluno> getTodasOsAlunos() {
		return soundSmartsService.getTodosAlunos();

	}
	@GetMapping("/alunos/{id}")
	public Optional<Aluno> getAlunoById(){
		return soundSmartsService.getAlunoById(null);
	}

	@GetMapping("/professores")
	public String pegaProfessores() {
		return "Professores";
	}

	@GetMapping("/cursos")
	public String pegaCursos() {
		return "Cursos";
	}

	@GetMapping("/instrumentos")
	public String pegainstrumentos() {
		return "Instrumentos";
	}
	
	@PostMapping("/aluno")
	public Aluno criaAluno(@Valid @RequestBody Aluno aluno) {
	    return alunoRepository.save(aluno);
	
}
