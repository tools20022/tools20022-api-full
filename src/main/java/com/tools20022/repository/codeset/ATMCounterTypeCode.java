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
import com.tools20022.repository.codeset.ATMCounterTypeCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode#CutOff
 * ATMCounterTypeCode.CutOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode#OperatorAdjust
 * ATMCounterTypeCode.OperatorAdjust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode#CountersInquiry
 * ATMCounterTypeCode.CountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode#CustomerTransaction
 * ATMCounterTypeCode.CustomerTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode#BusinessDay
 * ATMCounterTypeCode.BusinessDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode#Operation
 * ATMCounterTypeCode.Operation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCounterType1Code
 * ATMCounterType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCounterType2Code
 * ATMCounterType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCounterTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of ATM cassette counters."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCounterTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Counters since the last cut-off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
	 * ATMCounterTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTOF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters since the last cut-off."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCounterTypeCode CutOff = new ATMCounterTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOff";
			definition = "Counters since the last cut-off.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterTypeCode.mmObject();
			codeName = "CTOF";
		}
	};
	/**
	 * Counters since the last update by an operator on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
	 * ATMCounterTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPER"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatorAdjust"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters since the last update by an operator on the ATM."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCounterTypeCode OperatorAdjust = new ATMCounterTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperatorAdjust";
			definition = "Counters since the last update by an operator on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterTypeCode.mmObject();
			codeName = "OPER";
		}
	};
	/**
	 * Counters since the last counters inquiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
	 * ATMCounterTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters since the last counters inquiry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCounterTypeCode CountersInquiry = new ATMCounterTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			definition = "Counters since the last counters inquiry.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterTypeCode.mmObject();
			codeName = "INQU";
		}
	};
	/**
	 * Counters for a customer transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
	 * ATMCounterTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTXN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters for a customer transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCounterTypeCode CustomerTransaction = new ATMCounterTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransaction";
			definition = "Counters for a customer transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterTypeCode.mmObject();
			codeName = "CTXN";
		}
	};
	/**
	 * Counters since the beginning of the business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
	 * ATMCounterTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDAY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counters since the beginning of the business day."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCounterTypeCode BusinessDay = new ATMCounterTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDay";
			definition = "Counters since the beginning of the business day.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterTypeCode.mmObject();
			codeName = "BDAY";
		}
	};
	/**
	 * Counters for an operation performed by an operator on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCounterTypeCode
	 * ATMCounterTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRTN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counters for an operation performed by an operator on the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCounterTypeCode Operation = new ATMCounterTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operation";
			definition = "Counters for an operation performed by an operator on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCounterTypeCode.mmObject();
			codeName = "PRTN";
		}
	};
	final static private LinkedHashMap<String, ATMCounterTypeCode> codesByName = new LinkedHashMap<>();

	protected ATMCounterTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCounterTypeCode";
				definition = "Type of ATM cassette counters.";
				derivation_lazy = () -> Arrays.asList(ATMCounterType1Code.mmObject(), ATMCounterType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCounterTypeCode.CutOff, com.tools20022.repository.codeset.ATMCounterTypeCode.OperatorAdjust,
						com.tools20022.repository.codeset.ATMCounterTypeCode.CountersInquiry, com.tools20022.repository.codeset.ATMCounterTypeCode.CustomerTransaction, com.tools20022.repository.codeset.ATMCounterTypeCode.BusinessDay,
						com.tools20022.repository.codeset.ATMCounterTypeCode.Operation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CutOff.getCodeName().get(), CutOff);
		codesByName.put(OperatorAdjust.getCodeName().get(), OperatorAdjust);
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(CustomerTransaction.getCodeName().get(), CustomerTransaction);
		codesByName.put(BusinessDay.getCodeName().get(), BusinessDay);
		codesByName.put(Operation.getCodeName().get(), Operation);
	}

	public static ATMCounterTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCounterTypeCode[] values() {
		ATMCounterTypeCode[] values = new ATMCounterTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCounterTypeCode> {
		@Override
		public ATMCounterTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCounterTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}