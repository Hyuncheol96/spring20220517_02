package com.its.board.controller;

import com.its.board.dto.BoardDTO;
import com.its.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 글쓰기 화면 요청
//    @GetMapping("/board/save")   // RequestMapping 미적용
    @GetMapping("/save")   // RequestMapping 적용
    public String saveForm() {
        return "board/save";   // 상위폴더도 같이 써야함.
    }
    // 글쓰기 처리
//    @PostMapping("/board/save")   // RequestMapping 미적용
    @PostMapping("/save")  // RequestMapping 적용
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boolean saveResult = boardService.save(boardDTO);
        if(saveResult) {
            return "redirect: /board/findAll";  // 이 주소로 가라는 표시
        } else {
            return "/board/save-fail";   // save-fail 이라는 jsp 파일을 찾으라는 표시
        }
    }

    // 목록 출력
    @GetMapping("/findAll")
    public String findAll(Model model) {    // Model model : 데이터를 가져가야 하기위해
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "/board/list";
    }

    @GetMapping("/detail")
    public String findById(@RequestParam("id") Long id, Model model) {
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        return "/board/detail";
    }
    @GetMapping("/passwordCheck")
    public String passwordCheck(@RequestParam("id") Long id, Model model) {
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        return "board/passwordCheck";
    }

    // 삭제 처리
    @GetMapping("delete")
    public String delete(@RequestParam("id") Long id) {
        boardService.delete(id);
        return "redirect:/board/findAll";
    }

    // 수정 화면 요청
    @GetMapping("/update")
    public String updateForm(@RequestParam("id") Long id, Model model) {
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("boardUpdate", boardDTO);
        return "board/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute BoardDTO boardDTO) {
        boardService.update(boardDTO);
        return "redirect:/board/detail?id="+boardDTO.getId(); // 수정처리 후 해당 글의 상세페이지 요청
    }

    // 글 작성화면(파일)
    @GetMapping("/saveFile")
    public String saveFileForm() {
        return "board/saveFile";
    }

    // 파일첨부 글작성 처리
    @PostMapping("/saveFile")
    public String saveFile(@ModelAttribute BoardDTO boardDTO) throws IOException {
        boardService.saveFile(boardDTO);
        return "redirect:/board/findAll";
    }

}

