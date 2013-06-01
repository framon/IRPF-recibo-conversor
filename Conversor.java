import net.sf.jasperreports.engine.JasperExportManager;
class Conversor {
	public static void main(String... args) throws Exception {
		JasperExportManager.exportReportToPdfFile(args[0], args[0].replace(".jrprint", ".pdf")); 
	}
}
