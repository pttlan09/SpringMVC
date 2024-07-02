package businessLogics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javaBeans.LoaiSua;


/**
 *
 * @author hv
 */
public class LoaiSuaBL {
	
	public static int themLoaiSua(LoaiSua ls) throws SQLException
	{
		String sql="insert into loai_sua(ma_loai_sua,ten_loai) values(?,?)";
		try(Connection conn=CSDL.LayKetNoi()){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, ls.getMaLoai());
			pst.setString(2, ls.getMaTen());
			return pst.executeUpdate();
			
		}
		catch (Exception e) {
			return 0;
		}
		
		
		
		
		
		
	}
    public static List<LoaiSua> DocTatCa(){
        List<LoaiSua> dsls = null;
        try {
            Connection con = CSDL.LayKetNoi();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from loai_sua");
            dsls = new ArrayList<>();
            while(rs.next()){
                LoaiSua ls = new LoaiSua();
                ls.setMaLoai(rs.getString("ma_loai_sua"));
                ls.setTenLoai(rs.getString("ten_loai"));
                dsls.add(ls);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSuaBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsls;
    }
    public static void main(String[] args) throws SQLException {
		LoaiSua ls=new LoaiSua();
		ls.setMaLoai("AB");
		ls.setTenLoai("sữa AB");
		themLoaiSua(ls);
	}
}
