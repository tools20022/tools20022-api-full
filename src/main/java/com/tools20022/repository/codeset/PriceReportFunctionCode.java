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
import com.tools20022.repository.codeset.PriceReportFunctionCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode#NewPriceReport
 * PriceReportFunctionCode.NewPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode#CompleteReplacementPriceReport
 * PriceReportFunctionCode.CompleteReplacementPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode#PartialCorrectionPriceReport
 * PriceReportFunctionCode.PartialCorrectionPriceReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceReportFunction1Code
 * PriceReportFunction1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NEWP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceReportFunctionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the function of the price report."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceReportFunctionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The price report is ‘new’, that is the report is not being used as a
	 * correction of previously sent prices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode
	 * PriceReportFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPriceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The price report is ‘new’, that is the report is not being used as a correction of previously sent prices."
	 * </li>
	 * </ul>
	 */
	public static final PriceReportFunctionCode NewPriceReport = new PriceReportFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPriceReport";
			definition = "The price report is ‘new’, that is the report is not being used as a correction of previously sent prices.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceReportFunctionCode.mmObject();
			codeName = "NEWP";
		}
	};
	/**
	 * The price report conveys the correction of the complete set of prices
	 * previously sent for the same price report identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode
	 * PriceReportFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteReplacementPriceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The price report conveys the correction of the complete set of prices previously sent for the same price report identification."
	 * </li>
	 * </ul>
	 */
	public static final PriceReportFunctionCode CompleteReplacementPriceReport = new PriceReportFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteReplacementPriceReport";
			definition = "The price report conveys the correction of the complete set of prices previously sent for the same price report identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceReportFunctionCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * The price report conveys the correction of some of the prices previously
	 * sent for the same price report identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode
	 * PriceReportFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialCorrectionPriceReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The price report conveys the correction of some of the prices previously sent for the same price report identification."
	 * </li>
	 * </ul>
	 */
	public static final PriceReportFunctionCode PartialCorrectionPriceReport = new PriceReportFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCorrectionPriceReport";
			definition = "The price report conveys the correction of some of the prices previously sent for the same price report identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceReportFunctionCode.mmObject();
			codeName = "PART";
		}
	};
	final static private LinkedHashMap<String, PriceReportFunctionCode> codesByName = new LinkedHashMap<>();

	protected PriceReportFunctionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceReportFunctionCode";
				definition = "Specifies the function of the price report.";
				derivation_lazy = () -> Arrays.asList(PriceReportFunction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceReportFunctionCode.NewPriceReport, com.tools20022.repository.codeset.PriceReportFunctionCode.CompleteReplacementPriceReport,
						com.tools20022.repository.codeset.PriceReportFunctionCode.PartialCorrectionPriceReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewPriceReport.getCodeName().get(), NewPriceReport);
		codesByName.put(CompleteReplacementPriceReport.getCodeName().get(), CompleteReplacementPriceReport);
		codesByName.put(PartialCorrectionPriceReport.getCodeName().get(), PartialCorrectionPriceReport);
	}

	public static PriceReportFunctionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceReportFunctionCode[] values() {
		PriceReportFunctionCode[] values = new PriceReportFunctionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceReportFunctionCode> {
		@Override
		public PriceReportFunctionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceReportFunctionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}