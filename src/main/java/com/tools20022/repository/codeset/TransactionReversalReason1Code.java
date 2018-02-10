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
import com.tools20022.repository.codeset.TransactionReversalReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a transaction to be reversed by an instructed agent
 * or somebody acting on behalf of an instructed agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code#ClosedAccountNumber
 * TransactionReversalReason1Code.ClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code#Duplication
 * TransactionReversalReason1Code.Duplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code#InvalidBankOperationCode
 * TransactionReversalReason1Code.InvalidBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code#NoMandate
 * TransactionReversalReason1Code.NoMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code#CollectionNotDue
 * TransactionReversalReason1Code.CollectionNotDue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionReasonCode
 * TransactionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AC04"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionReversalReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transaction to be reversed by an instructed agent or somebody acting on behalf of an instructed agent."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionReversalReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code
	 * TransactionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * </ul>
	 */
	public static final TransactionReversalReason1Code ClosedAccountNumber = new TransactionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReversalReason1Code.mmObject();
			codeName = TransactionReasonCode.ClosedAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code
	 * TransactionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplication"</li>
	 * </ul>
	 */
	public static final TransactionReversalReason1Code Duplication = new TransactionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplication";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReversalReason1Code.mmObject();
			codeName = TransactionReasonCode.Duplication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code
	 * TransactionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBankOperationCode"</li>
	 * </ul>
	 */
	public static final TransactionReversalReason1Code InvalidBankOperationCode = new TransactionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBankOperationCode";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReversalReason1Code.mmObject();
			codeName = TransactionReasonCode.InvalidBankOperationCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code
	 * TransactionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMandate"</li>
	 * </ul>
	 */
	public static final TransactionReversalReason1Code NoMandate = new TransactionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMandate";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReversalReason1Code.mmObject();
			codeName = TransactionReasonCode.NoMandate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionReversalReason1Code
	 * TransactionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionNotDue"</li>
	 * </ul>
	 */
	public static final TransactionReversalReason1Code CollectionNotDue = new TransactionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectionNotDue";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionReversalReason1Code.mmObject();
			codeName = TransactionReasonCode.CollectionNotDue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionReversalReason1Code> codesByName = new LinkedHashMap<>();

	protected TransactionReversalReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AC04");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReversalReason1Code";
				definition = "Specifies the reason for a transaction to be reversed by an instructed agent or somebody acting on behalf of an instructed agent.";
				trace_lazy = () -> TransactionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionReversalReason1Code.ClosedAccountNumber, com.tools20022.repository.codeset.TransactionReversalReason1Code.Duplication,
						com.tools20022.repository.codeset.TransactionReversalReason1Code.InvalidBankOperationCode, com.tools20022.repository.codeset.TransactionReversalReason1Code.NoMandate,
						com.tools20022.repository.codeset.TransactionReversalReason1Code.CollectionNotDue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClosedAccountNumber.getCodeName().get(), ClosedAccountNumber);
		codesByName.put(Duplication.getCodeName().get(), Duplication);
		codesByName.put(InvalidBankOperationCode.getCodeName().get(), InvalidBankOperationCode);
		codesByName.put(NoMandate.getCodeName().get(), NoMandate);
		codesByName.put(CollectionNotDue.getCodeName().get(), CollectionNotDue);
	}

	public static TransactionReversalReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionReversalReason1Code[] values() {
		TransactionReversalReason1Code[] values = new TransactionReversalReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionReversalReason1Code> {
		@Override
		public TransactionReversalReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionReversalReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}