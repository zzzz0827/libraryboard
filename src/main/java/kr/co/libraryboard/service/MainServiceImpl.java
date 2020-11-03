package kr.co.libraryboard.service;

import kr.co.libraryboard.dao.MainMapper;
import kr.co.libraryboard.vo.UsrVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mainservice")
public class MainServiceImpl implements MainService{

    @Autowired
    MainMapper mainRepository;

    @Override
    public UsrVO getUsr() {
        return mainRepository.getUsr();
    }
}
