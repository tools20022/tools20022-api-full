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
import com.tools20022.repository.codeset.ValidationGroupStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the status of a single payment transaction or of a group of payment
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code#AcceptedTechnicalValidation
 * ValidationGroupStatus2Code.AcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code#AcceptedCustomerProfile
 * ValidationGroupStatus2Code.AcceptedCustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code#AcceptedSettlementInProcess
 * ValidationGroupStatus2Code.AcceptedSettlementInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code#AcceptedSettlementCompleted
 * ValidationGroupStatus2Code.AcceptedSettlementCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code#AcceptedWithChange
 * ValidationGroupStatus2Code.AcceptedWithChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code#Pending
 * ValidationGroupStatus2Code.Pending}</li>
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
 * "ValidationGroupStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the status of a single payment transaction or of a group of payment transactions."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ValidationGroupStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code
	 * ValidationGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * </ul>
	 */
	public static final ValidationGroupStatus2Code AcceptedTechnicalValidation = new ValidationGroupStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationGroupStatus2Code.mmObject();
			codeName = PaymentStatusCode.AcceptedTechnicalValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code
	 * ValidationGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedCustomerProfile"</li>
	 * </ul>
	 */
	public static final ValidationGroupStatus2Code AcceptedCustomerProfile = new ValidationGroupStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedCustomerProfile";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationGroupStatus2Code.mmObject();
			codeName = PaymentStatusCode.AcceptedCustomerProfile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code
	 * ValidationGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementInProcess"</li>
	 * </ul>
	 */
	public static final ValidationGroupStatus2Code AcceptedSettlementInProcess = new ValidationGroupStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedSettlementInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationGroupStatus2Code.mmObject();
			codeName = PaymentStatusCode.AcceptedSettlementInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code
	 * ValidationGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedSettlementCompleted"</li>
	 * </ul>
	 */
	public static final ValidationGroupStatus2Code AcceptedSettlementCompleted = new ValidationGroupStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedSettlementCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationGroupStatus2Code.mmObject();
			codeName = PaymentStatusCode.AcceptedSettlementCompleted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code
	 * ValidationGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithChange"</li>
	 * </ul>
	 */
	public static final ValidationGroupStatus2Code AcceptedWithChange = new ValidationGroupStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationGroupStatus2Code.mmObject();
			codeName = PaymentStatusCode.AcceptedWithChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationGroupStatus2Code
	 * ValidationGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final ValidationGroupStatus2Code Pending = new ValidationGroupStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationGroupStatus2Code.mmObject();
			codeName = PaymentStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ValidationGroupStatus2Code> codesByName = new LinkedHashMap<>();

	protected ValidationGroupStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValidationGroupStatus2Code";
				definition = "Indicates the status of a single payment transaction or of a group of payment transactions.";
				trace_lazy = () -> PaymentStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ValidationGroupStatus2Code.AcceptedTechnicalValidation, com.tools20022.repository.codeset.ValidationGroupStatus2Code.AcceptedCustomerProfile,
						com.tools20022.repository.codeset.ValidationGroupStatus2Code.AcceptedSettlementInProcess, com.tools20022.repository.codeset.ValidationGroupStatus2Code.AcceptedSettlementCompleted,
						com.tools20022.repository.codeset.ValidationGroupStatus2Code.AcceptedWithChange, com.tools20022.repository.codeset.ValidationGroupStatus2Code.Pending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(AcceptedCustomerProfile.getCodeName().get(), AcceptedCustomerProfile);
		codesByName.put(AcceptedSettlementInProcess.getCodeName().get(), AcceptedSettlementInProcess);
		codesByName.put(AcceptedSettlementCompleted.getCodeName().get(), AcceptedSettlementCompleted);
		codesByName.put(AcceptedWithChange.getCodeName().get(), AcceptedWithChange);
		codesByName.put(Pending.getCodeName().get(), Pending);
	}

	public static ValidationGroupStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ValidationGroupStatus2Code[] values() {
		ValidationGroupStatus2Code[] values = new ValidationGroupStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ValidationGroupStatus2Code> {
		@Override
		public ValidationGroupStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ValidationGroupStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}