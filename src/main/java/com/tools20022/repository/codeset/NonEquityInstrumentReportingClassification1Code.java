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
import com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the non-equity financial instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
 * FinancialInstrumentReportingClassificationCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmStructuredFinanceProduct
 * NonEquityInstrumentReportingClassification1Code.mmStructuredFinanceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmSecuritisedDerivative
 * NonEquityInstrumentReportingClassification1Code.mmSecuritisedDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmDerivative
 * NonEquityInstrumentReportingClassification1Code.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmEmissionAllowance
 * NonEquityInstrumentReportingClassification1Code.mmEmissionAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmBond
 * NonEquityInstrumentReportingClassification1Code.mmBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmExchangeTradedCommodities
 * NonEquityInstrumentReportingClassification1Code.mmExchangeTradedCommodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#mmExchangeTradedNote
 * NonEquityInstrumentReportingClassification1Code.mmExchangeTradedNote}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonEquityInstrumentReportingClassification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the non-equity financial instruments."</li>
 * </ul>
 */
public class NonEquityInstrumentReportingClassification1Code extends FinancialInstrumentReportingClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredFinanceProduct"</li>
	 * </ul>
	 */
	public static final MMCode mmStructuredFinanceProduct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredFinanceProduct";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritisedDerivative"</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritisedDerivative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritisedDerivative";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * </ul>
	 */
	public static final MMCode mmDerivative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivative";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * </ul>
	 */
	public static final MMCode mmEmissionAllowance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * </ul>
	 */
	public static final MMCode mmBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedCommodities"</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeTradedCommodities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedCommodities";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code
	 * NonEquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedNote"</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeTradedNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedNote";
			owner_lazy = () -> NonEquityInstrumentReportingClassification1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NonEquityInstrumentReportingClassification1Code";
				definition = "Specifies the non-equity financial instruments.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmStructuredFinanceProduct,
						com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmSecuritisedDerivative, com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmDerivative,
						com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmEmissionAllowance, com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmBond,
						com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmExchangeTradedCommodities, com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmExchangeTradedNote);
				trace_lazy = () -> FinancialInstrumentReportingClassificationCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}