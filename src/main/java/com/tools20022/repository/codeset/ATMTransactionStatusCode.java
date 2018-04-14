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
import com.tools20022.repository.codeset.ATMTransactionStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Status of an ATM transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#Success
 * ATMTransactionStatusCode.Success}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#Doubt
 * ATMTransactionStatusCode.Doubt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#Failure
 * ATMTransactionStatusCode.Failure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#Full
 * ATMTransactionStatusCode.Full}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#Partial
 * ATMTransactionStatusCode.Partial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode#None
 * ATMTransactionStatusCode.None}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMTransactionStatus1Code
 * ATMTransactionStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMTransactionStatus2Code
 * ATMTransactionStatus2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTransactionStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of an ATM transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMTransactionStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction was successfully completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCSS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction was successfully completed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMTransactionStatusCode Success = new ATMTransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			definition = "Transaction was successfully completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMTransactionStatusCode.mmObject();
			codeName = "SCSS";
		}
	};
	/**
	 * Undetermined status, for instance possibly forgotten notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOBT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Doubt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undetermined status, for instance possibly forgotten notes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMTransactionStatusCode Doubt = new ATMTransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Doubt";
			definition = "Undetermined status, for instance possibly forgotten notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMTransactionStatusCode.mmObject();
			codeName = "DOBT";
		}
	};
	/**
	 * Transaction failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction failed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMTransactionStatusCode Failure = new ATMTransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failure";
			definition = "Transaction failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMTransactionStatusCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Total presented amount is equal to the amount to dispense.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Full"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total presented amount is equal to the amount to dispense."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMTransactionStatusCode Full = new ATMTransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Full";
			definition = "Total presented amount is equal to the amount to dispense.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMTransactionStatusCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Total presented amount is lower than the amount to dispense.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Partial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total presented amount is lower than the amount to dispense."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMTransactionStatusCode Partial = new ATMTransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Partial";
			definition = "Total presented amount is lower than the amount to dispense.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMTransactionStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Total presented amount is equal to zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatusCode
	 * ATMTransactionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total presented amount is equal to zero."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMTransactionStatusCode None = new ATMTransactionStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "Total presented amount is equal to zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMTransactionStatusCode.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, ATMTransactionStatusCode> codesByName = new LinkedHashMap<>();

	protected ATMTransactionStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransactionStatusCode";
				definition = "Status of an ATM transaction.";
				derivation_lazy = () -> Arrays.asList(ATMTransactionStatus1Code.mmObject(), ATMTransactionStatus2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMTransactionStatusCode.Success, com.tools20022.repository.codeset.ATMTransactionStatusCode.Doubt,
						com.tools20022.repository.codeset.ATMTransactionStatusCode.Failure, com.tools20022.repository.codeset.ATMTransactionStatusCode.Full, com.tools20022.repository.codeset.ATMTransactionStatusCode.Partial,
						com.tools20022.repository.codeset.ATMTransactionStatusCode.None);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Success.getCodeName().get(), Success);
		codesByName.put(Doubt.getCodeName().get(), Doubt);
		codesByName.put(Failure.getCodeName().get(), Failure);
		codesByName.put(Full.getCodeName().get(), Full);
		codesByName.put(Partial.getCodeName().get(), Partial);
		codesByName.put(None.getCodeName().get(), None);
	}

	public static ATMTransactionStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMTransactionStatusCode[] values() {
		ATMTransactionStatusCode[] values = new ATMTransactionStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMTransactionStatusCode> {
		@Override
		public ATMTransactionStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMTransactionStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}