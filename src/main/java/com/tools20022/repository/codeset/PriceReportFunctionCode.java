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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the function of the price report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode#mmNewPriceReport
 * PriceReportFunctionCode.mmNewPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode#mmCompleteReplacementPriceReport
 * PriceReportFunctionCode.mmCompleteReplacementPriceReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceReportFunctionCode#mmPartialCorrectionPriceReport
 * PriceReportFunctionCode.mmPartialCorrectionPriceReport}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class PriceReportFunctionCode {

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
	public static final MMCode mmNewPriceReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPriceReport";
			definition = "The price report is ‘new’, that is the report is not being used as a correction of previously sent prices.";
			owner_lazy = () -> PriceReportFunctionCode.mmObject();
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
	public static final MMCode mmCompleteReplacementPriceReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteReplacementPriceReport";
			definition = "The price report conveys the correction of the complete set of prices previously sent for the same price report identification.";
			owner_lazy = () -> PriceReportFunctionCode.mmObject();
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
	public static final MMCode mmPartialCorrectionPriceReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialCorrectionPriceReport";
			definition = "The price report conveys the correction of some of the prices previously sent for the same price report identification.";
			owner_lazy = () -> PriceReportFunctionCode.mmObject();
			codeName = "PART";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("NEWP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PriceReportFunctionCode";
				definition = "Specifies the function of the price report.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceReportFunctionCode.mmNewPriceReport, com.tools20022.repository.codeset.PriceReportFunctionCode.mmCompleteReplacementPriceReport,
						com.tools20022.repository.codeset.PriceReportFunctionCode.mmPartialCorrectionPriceReport);
				derivation_lazy = () -> Arrays.asList(PriceReportFunction1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}