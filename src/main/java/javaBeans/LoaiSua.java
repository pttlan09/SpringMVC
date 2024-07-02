package javaBeans;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class LoaiSua implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String maLoai;
    private String tenLoai;

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMaTen(){
        return maLoai+" - "+tenLoai;
    }
    public LoaiSua() {
    }
    
}
