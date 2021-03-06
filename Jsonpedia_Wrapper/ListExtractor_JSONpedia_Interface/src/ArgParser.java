import java.util.ArrayList;
import java.util.List;
import com.beust.jcommander.Parameter;

/** The template class for the Commandline arguments for JSONpedia interface.
 * 
 * @author Krishanu Konar
 * @version 1.0
 */


public class ArgParser {
	/** Define different parameters for the command line
	 * 
	 * @param lang This is the language (or wikipedia edition) of the resource being queried.
	 * @param resource This is the resource you want to query.
	 * @param procs The processors used by JSONpedia
	 * @param filters The filters to be used
	 */

	@Parameter(names = { "-l", "--lang" }, description = "Resource Language", required = true)
	private String lang;

	@Parameter(names = {"-r", "--resource"}, description = "Wikipedia Resource Name", required = true)
	private String resource;

	@Parameter(names = {"-p", "--procs"}, description = "JSONpedia Processors to be used")
	private List<String> procs = new ArrayList<String>();

	@Parameter(names = {"-f", "--filters"}, description = "Filters to be used")
	private List<String> filters = new ArrayList<String>();

	/** returns the language used by the resource
	 * 
	 * @return A String "lang"
	 */
	public String getLang() {
		return lang;
	}

	/** returns the resource name
	 * 
	 * @return A String "resource"
	 */
	public String getResourceName() {
		return resource;
	}

	/** returns the list of processors used.
	 * If no Processors are given, the default "Structure" Extractor is used.
	 * 
	 * @return A List "procs"
	 */
	public List<String> getProcs() {
		if (procs.isEmpty())
			procs.add("Structure");
		return procs;
	}

	/** returns the list of filters used
	 * 
	 * @return A String "filters"
	 */
	public List<String> getFilters() {
		return filters;
	}

}
