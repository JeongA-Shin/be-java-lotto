package kr.codesquad.exception;

public enum ErrorCode {

    MONEY_NOT_ENOUGH("돈이 충분하지 않습니다."),
    ILLEGAL_LOTTO_NUM_COUNT("로또 번호의 수는 6개여야 합니다"),
    ILLEGAL_INPUT_FORMAT("입력 양식을 다시 확인해주세요");
    private final String message;
    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
