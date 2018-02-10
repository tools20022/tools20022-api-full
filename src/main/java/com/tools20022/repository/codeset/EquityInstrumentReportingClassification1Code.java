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
import com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the equity financial instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code#Share
 * EquityInstrumentReportingClassification1Code.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code#Other
 * EquityInstrumentReportingClassification1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code#ElectronicTradedFund
 * EquityInstrumentReportingClassification1Code.ElectronicTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code#DepositaryReceipt
 * EquityInstrumentReportingClassification1Code.DepositaryReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code#Certificate
 * EquityInstrumentReportingClassification1Code.Certificate}</li>
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
 * "EquityInstrumentReportingClassification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the equity financial instruments."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EquityInstrumentReportingClassification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
	 * EquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * </ul>
	 */
	public static final EquityInstrumentReportingClassification1Code Share = new EquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.Share.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
	 * EquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final EquityInstrumentReportingClassification1Code Other = new EquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
	 * EquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicTradedFund"</li>
	 * </ul>
	 */
	public static final EquityInstrumentReportingClassification1Code ElectronicTradedFund = new EquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicTradedFund";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.ElectronicTradedFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
	 * EquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositaryReceipt"</li>
	 * </ul>
	 */
	public static final EquityInstrumentReportingClassification1Code DepositaryReceipt = new EquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositaryReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.DepositaryReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code
	 * EquityInstrumentReportingClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * </ul>
	 */
	public static final EquityInstrumentReportingClassification1Code Certificate = new EquityInstrumentReportingClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			owner_lazy = () -> com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.mmObject();
			codeName = FinancialInstrumentReportingClassificationCode.Certificate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EquityInstrumentReportingClassification1Code> codesByName = new LinkedHashMap<>();

	protected EquityInstrumentReportingClassification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EquityInstrumentReportingClassification1Code";
				definition = "Specifies the equity financial instruments.";
				trace_lazy = () -> FinancialInstrumentReportingClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.Share, com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.Other,
						com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.ElectronicTradedFund, com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.DepositaryReceipt,
						com.tools20022.repository.codeset.EquityInstrumentReportingClassification1Code.Certificate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Share.getCodeName().get(), Share);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ElectronicTradedFund.getCodeName().get(), ElectronicTradedFund);
		codesByName.put(DepositaryReceipt.getCodeName().get(), DepositaryReceipt);
		codesByName.put(Certificate.getCodeName().get(), Certificate);
	}

	public static EquityInstrumentReportingClassification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EquityInstrumentReportingClassification1Code[] values() {
		EquityInstrumentReportingClassification1Code[] values = new EquityInstrumentReportingClassification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EquityInstrumentReportingClassification1Code> {
		@Override
		public EquityInstrumentReportingClassification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EquityInstrumentReportingClassification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}