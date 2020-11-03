package kr.co.libraryboard.dao;

import kr.co.libraryboard.vo.UsrVO;
import org.springframework.stereotype.Repository;

public interface MainMapper {
    UsrVO getUsr();
}
