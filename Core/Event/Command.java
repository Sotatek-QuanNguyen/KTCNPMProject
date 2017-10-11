package Event;

public enum Command {
	ChangeTAW,ChangeTCF,ChangeEF,ChangeTBF,
	ChangeH,ChangeES,CHandleXoaMH,CHandleTimKiemMH,
	Error,
	CQuanLyDSYC,CQuanLyDSDH,
	RThemYC,
	RXoaYC,
	RSuaYC,
	RTimKiemMH,
	RCapNhatDSMH,
	ChandleThemMH,
	ChandleSuaMH
	,;
	
	public static Command fromInteger(int x) {
        switch(x) {
        case 0:
            return ChangeTAW;
        case 1:
            return ChangeTCF;
        case 2:
            return ChangeEF;
        case 3:
        	return ChangeTBF;
        case 4:
            return ChangeH;
        case 5:
            return ChangeES;
        case 6:
        	return CHandleXoaMH;
        case 7:
        	return CHandleTimKiemMH;
        case 8:
            return Error;
        case 9:
        	return CQuanLyDSYC;
        case 10:
        	return CQuanLyDSDH;
        case 11:
            return RThemYC;
        case 12:
        	return RXoaYC;
        case 13:
        	return RSuaYC;
        case 14:
        	return RTimKiemMH;
        case 15:
        	return RCapNhatDSMH;
        case 16:
        	return ChandleThemMH;
        case 17: 
        	return ChandleSuaMH;
        }
        return null;
    }
}
