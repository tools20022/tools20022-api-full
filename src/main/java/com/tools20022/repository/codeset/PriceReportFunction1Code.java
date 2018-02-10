/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PriceReportFunction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the function of the price report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code#CompleteReplacementPriceReport
 * PriceReportFunction1Code.CompleteReplacementPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code#NewPriceReport
 * PriceReportFunction1Code.NewPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code#PartialCorrectionPriceReport
 * PriceReportFunction1Code.PartialCorrectionPriceReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode
 * PriceReportFunctionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceReportFunction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the function of the price report."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceReportFunction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code
	 * PriceReportFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteReplacementPriceReport"</li>
	 * </ul>
	 */
	public static final PriceReportFunction1Code CompleteReplacementPriceReport = new PriceReportFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteReplacementPriceReport";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceReportFunction1Code.mmObject();
			codeName = PriceReportFunctionCode.CompleteReplacementPriceReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code
	 * PriceReportFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPriceReport"</li>
	 * </ul>
	 */
	public static final PriceReportFunction1Code NewPriceReport = new PriceReportFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPriceReport";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceReportFunction1Code.mmObject();
			codeName = PriceReportFunctionCode.NewPriceReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code
	 * PriceReportFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialCorrectionPriceReport"</li>
	 * </ul>
	 */
	public static final PriceReportFunction1Code PartialCorrectionPriceReport = new PriceReportFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCorrectionPriceReport";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceReportFunction1Code.mmObject();
			codeName = PriceReportFunctionCode.PartialCorrectionPriceReport.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PriceReportFunction1Code> codesByName = new LinkedHashMap<>();

	protected PriceReportFunction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REPL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceReportFunction1Code";
				definition = "Specifies the function of the price report.";
				trace_lazy = () -> PriceReportFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceReportFunction1Code.CompleteReplacementPriceReport, com.tools20022.repository.codeset.PriceReportFunction1Code.NewPriceReport,
						com.tools20022.repository.codeset.PriceReportFunction1Code.PartialCorrectionPriceReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CompleteReplacementPriceReport.getCodeName().get(), CompleteReplacementPriceReport);
		codesByName.put(NewPriceReport.getCodeName().get(), NewPriceReport);
		codesByName.put(PartialCorrectionPriceReport.getCodeName().get(), PartialCorrectionPriceReport);
	}

	public static PriceReportFunction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceReportFunction1Code[] values() {
		PriceReportFunction1Code[] values = new PriceReportFunction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceReportFunction1Code> {
		@Override
		public PriceReportFunction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceReportFunction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}