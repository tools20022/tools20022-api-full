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
import com.tools20022.repository.codeset.TransactionGroupStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a group of payment transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#AcceptedTechnicalValidation
 * TransactionGroupStatus1Code.AcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#Received
 * TransactionGroupStatus1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#PartiallyAccepted
 * TransactionGroupStatus1Code.PartiallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#Rejected
 * TransactionGroupStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#Pending
 * TransactionGroupStatus1Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#AcceptedCustomerProfile
 * TransactionGroupStatus1Code.AcceptedCustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#AcceptedSettlementInProcess
 * TransactionGroupStatus1Code.AcceptedSettlementInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#AcceptedSettlementCompleted
 * TransactionGroupStatus1Code.AcceptedSettlementCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#AcceptedCancellationRequest
 * TransactionGroupStatus1Code.AcceptedCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code#AcceptedWithChange
 * TransactionGroupStatus1Code.AcceptedWithChange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentStatusCode
 * PaymentStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionGroupStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a group of payment transactions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionGroupStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code AcceptedTechnicalValidation = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedTechnicalValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code Received = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAccepted"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code PartiallyAccepted = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.PartiallyAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code Rejected = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code Pending = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCustomerProfile"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code AcceptedCustomerProfile = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedCustomerProfile";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedCustomerProfile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementInProcess"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code AcceptedSettlementInProcess = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedSettlementInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedSettlementInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementCompleted"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code AcceptedSettlementCompleted = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedSettlementCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedSettlementCompleted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCancellationRequest"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code AcceptedCancellationRequest = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedCancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedCancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus1Code
	 * TransactionGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithChange"</li>
	 * </ul>
	 */
	public static final TransactionGroupStatus1Code AcceptedWithChange = new TransactionGroupStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithChange";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionGroupStatus1Code.mmObject();
			codeName = PaymentStatusCode.AcceptedWithChange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionGroupStatus1Code> codesByName = new LinkedHashMap<>();

	protected TransactionGroupStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionGroupStatus1Code";
				definition = "Specifies the status of a group of payment transactions.";
				trace_lazy = () -> PaymentStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionGroupStatus1Code.AcceptedTechnicalValidation, com.tools20022.repository.codeset.TransactionGroupStatus1Code.Received,
						com.tools20022.repository.codeset.TransactionGroupStatus1Code.PartiallyAccepted, com.tools20022.repository.codeset.TransactionGroupStatus1Code.Rejected,
						com.tools20022.repository.codeset.TransactionGroupStatus1Code.Pending, com.tools20022.repository.codeset.TransactionGroupStatus1Code.AcceptedCustomerProfile,
						com.tools20022.repository.codeset.TransactionGroupStatus1Code.AcceptedSettlementInProcess, com.tools20022.repository.codeset.TransactionGroupStatus1Code.AcceptedSettlementCompleted,
						com.tools20022.repository.codeset.TransactionGroupStatus1Code.AcceptedCancellationRequest, com.tools20022.repository.codeset.TransactionGroupStatus1Code.AcceptedWithChange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(PartiallyAccepted.getCodeName().get(), PartiallyAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(AcceptedCustomerProfile.getCodeName().get(), AcceptedCustomerProfile);
		codesByName.put(AcceptedSettlementInProcess.getCodeName().get(), AcceptedSettlementInProcess);
		codesByName.put(AcceptedSettlementCompleted.getCodeName().get(), AcceptedSettlementCompleted);
		codesByName.put(AcceptedCancellationRequest.getCodeName().get(), AcceptedCancellationRequest);
		codesByName.put(AcceptedWithChange.getCodeName().get(), AcceptedWithChange);
	}

	public static TransactionGroupStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionGroupStatus1Code[] values() {
		TransactionGroupStatus1Code[] values = new TransactionGroupStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionGroupStatus1Code> {
		@Override
		public TransactionGroupStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionGroupStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}