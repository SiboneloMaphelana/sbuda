package com.sbuda.sbuda.services;

import com.sbuda.sbuda.models.Program;
import com.sbuda.sbuda.repositories.ProgramRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramService {

    private final ProgramRepository programRepository;
    private Program program;


    public ProgramService(ProgramRepository programRepository){
        this.programRepository = programRepository;
    }

    public Program createProgram(Program program){
        return programRepository.save(program);
    }

    public List<Program> createPrograms(List<Program> programs){
        return programRepository.saveAll(programs);
    }

    public List<Program> getPrograms(){
        return programRepository.findAll();
    }

    public Optional<Program> getProgramById(Integer id){
        return programRepository.findById(id);
    }


}
