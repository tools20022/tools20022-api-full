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
import com.tools20022.repository.codeset.ATMCounterType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of ATM cassette counters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code#CountersInquiry
 * ATMCounterType1Code.CountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code#CustomerTransaction
 * ATMCounterType1Code.CustomerTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCounterType1Code#CutOff
 * ATMCounterType1Code.CutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code#BusinessDay
 * ATMCounterType1Code.BusinessDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code#Operation
 * ATMCounterType1Code.Operation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code#OperatorAdjust
 * ATMCounterType1Code.OperatorAdjust}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
 * ATMCounterTypeCode}</li>
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
 * "ATMCounterType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of ATM cassette counters."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCounterType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * </ul>
	 */
	public static final ATMCounterType1Code CountersInquiry = new ATMCounterType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterType1Code.mmObject();
			codeName = ATMCounterTypeCode.CountersInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransaction"</li>
	 * </ul>
	 */
	public static final ATMCounterType1Code CustomerTransaction = new ATMCounterType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterType1Code.mmObject();
			codeName = ATMCounterTypeCode.CustomerTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOff"</li>
	 * </ul>
	 */
	public static final ATMCounterType1Code CutOff = new ATMCounterType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOff";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterType1Code.mmObject();
			codeName = ATMCounterTypeCode.CutOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDay"</li>
	 * </ul>
	 */
	public static final ATMCounterType1Code BusinessDay = new ATMCounterType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDay";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterType1Code.mmObject();
			codeName = ATMCounterTypeCode.BusinessDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operation"</li>
	 * </ul>
	 */
	public static final ATMCounterType1Code Operation = new ATMCounterType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operation";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterType1Code.mmObject();
			codeName = ATMCounterTypeCode.Operation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
	 * ATMCounterType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatorAdjust"</li>
	 * </ul>
	 */
	public static final ATMCounterType1Code OperatorAdjust = new ATMCounterType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperatorAdjust";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterType1Code.mmObject();
			codeName = ATMCounterTypeCode.OperatorAdjust.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCounterType1Code> codesByName = new LinkedHashMap<>();

	protected ATMCounterType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCounterType1Code";
				definition = "Type of ATM cassette counters.";
				trace_lazy = () -> ATMCounterTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCounterType1Code.CountersInquiry, com.tools20022.repository.codeset.ATMCounterType1Code.CustomerTransaction,
						com.tools20022.repository.codeset.ATMCounterType1Code.CutOff, com.tools20022.repository.codeset.ATMCounterType1Code.BusinessDay, com.tools20022.repository.codeset.ATMCounterType1Code.Operation,
						com.tools20022.repository.codeset.ATMCounterType1Code.OperatorAdjust);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(CustomerTransaction.getCodeName().get(), CustomerTransaction);
		codesByName.put(CutOff.getCodeName().get(), CutOff);
		codesByName.put(BusinessDay.getCodeName().get(), BusinessDay);
		codesByName.put(Operation.getCodeName().get(), Operation);
		codesByName.put(OperatorAdjust.getCodeName().get(), OperatorAdjust);
	}

	public static ATMCounterType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCounterType1Code[] values() {
		ATMCounterType1Code[] values = new ATMCounterType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCounterType1Code> {
		@Override
		public ATMCounterType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCounterType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}