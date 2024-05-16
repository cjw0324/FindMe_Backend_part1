package com.findme.FindMeBack.Controller.ApiDataSaveController.Dto.InfoDto;


import lombok.Getter;
import lombok.Setter;

// 분실물 세부 정보 조회 시 필요한 파라미터들 저장 클래스
@Getter
@Setter
public class SearchItemsWithDetail {
    public String ATC_ID;  // 관리 ID
    public String FD_SN;   // 습득 순번
}