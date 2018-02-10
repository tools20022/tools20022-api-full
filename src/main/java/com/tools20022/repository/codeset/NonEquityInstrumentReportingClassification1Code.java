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
import com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the non-equity financial instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#StructuredFinanceProduct
 * NonEquityInstrumentReportingClassification1Code.StructuredFinanceProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#SecuritisedDerivative
 * NonEquityInstrumentReportingClassification1Code.SecuritisedDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#Derivative
 * NonEquityInstrumentReportingClassification1Code.Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#EmissionAllowance
 * NonEquityInstrumentReportingClassification1Code.EmissionAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#Bond
 * NonEquityInstrumentReportingClassification1Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#ExchangeTradedCommodities
 * NonEquityInstrumentReportingClassification1Code.ExchangeTradedCommodities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code#ExchangeTradedNote
 * NonEquityInstrumentReportingClassification1Code.ExchangeTradedNote}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentReportingClassificationCode
 * FinancialInstrumentReportingClassificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonEquityInstrumentReportingClassification1Code extends MMCode {

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
	public static final NonEquityInstrumentReportingClassification1Code StructuredFinanceProduct = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredFinanceProduct";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.StructuredFinanceProduct.getCodeName().orElse(name);
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
	public static final NonEquityInstrumentReportingClassification1Code SecuritisedDerivative = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritisedDerivative";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.SecuritisedDerivative.getCodeName().orElse(name);
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
	public static final NonEquityInstrumentReportingClassification1Code Derivative = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Derivative";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.Derivative.getCodeName().orElse(name);
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
	public static final NonEquityInstrumentReportingClassification1Code EmissionAllowance = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.EmissionAllowance.getCodeName().orElse(name);
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
	public static final NonEquityInstrumentReportingClassification1Code Bond = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.Bond.getCodeName().orElse(name);
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
	public static final NonEquityInstrumentReportingClassification1Code ExchangeTradedCommodities = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedCommodities";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.ExchangeTradedCommodities.getCodeName().orElse(name);
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
	public static final NonEquityInstrumentReportingClassification1Code ExchangeTradedNote = new NonEquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedNote";
			owner_lazy = () -> com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.ExchangeTradedNote.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NonEquityInstrumentReportingClassification1Code> codesByName = new LinkedHashMap<>();

	protected NonEquityInstrumentReportingClassification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonEquityInstrumentReportingClassification1Code";
				definition = "Specifies the non-equity financial instruments.";
				trace_lazy = () -> FinancialInstrumentReportingClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.StructuredFinanceProduct,
						com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.SecuritisedDerivative, com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.Derivative,
						com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.EmissionAllowance, com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.Bond,
						com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.ExchangeTradedCommodities, com.tools20022.repository.codeset.NonEquityInstrumentReportingClassification1Code.ExchangeTradedNote);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StructuredFinanceProduct.getCodeName().get(), StructuredFinanceProduct);
		codesByName.put(SecuritisedDerivative.getCodeName().get(), SecuritisedDerivative);
		codesByName.put(Derivative.getCodeName().get(), Derivative);
		codesByName.put(EmissionAllowance.getCodeName().get(), EmissionAllowance);
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(ExchangeTradedCommodities.getCodeName().get(), ExchangeTradedCommodities);
		codesByName.put(ExchangeTradedNote.getCodeName().get(), ExchangeTradedNote);
	}

	public static NonEquityInstrumentReportingClassification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NonEquityInstrumentReportingClassification1Code[] values() {
		NonEquityInstrumentReportingClassification1Code[] values = new NonEquityInstrumentReportingClassification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NonEquityInstrumentReportingClassification1Code> {
		@Override
		public NonEquityInstrumentReportingClassification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NonEquityInstrumentReportingClassification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}