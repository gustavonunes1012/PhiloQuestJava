package br.edu.ifsc.fln.philoquest.controllers;

import br.edu.ifsc.fln.philoquest.modelos.Aluno;
import br.edu.ifsc.fln.philoquest.modelos.enums.NivelAluno;
import br.edu.ifsc.fln.philoquest.services.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listarTodos() {
        return ResponseEntity.ok(alunoService.listarTodos());
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Aluno> buscarPorMatricula(@PathVariable String matricula) {
        return alunoService.buscarPorMatricula(matricula)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        Aluno salvo = alunoService.salvar(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/{matricula}")
    public ResponseEntity<Aluno> atualizar(@PathVariable String matricula, @RequestBody Aluno aluno) {
        Aluno atualizado = alunoService.atualizar(matricula, aluno);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity<Void> deletar(@PathVariable String matricula) {
        alunoService.deletar(matricula);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/nivel/{nivel}")
    public ResponseEntity<List<Aluno>> listarPorNivel(@PathVariable NivelAluno nivel) {
        return ResponseEntity.ok(alunoService.listarPorNivel(nivel));
    }

    @PatchMapping("/{matricula}/xp")
    public ResponseEntity<Aluno> adicionarXp(@PathVariable String matricula, @RequestParam int xp) {
        Aluno aluno = alunoService.adicionarXp(matricula, xp);
        return ResponseEntity.ok(aluno);
    }
}
