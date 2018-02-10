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
import com.tools20022.repository.codeset.RejectionReason20Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a rejection of the standing instruction request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code#FailedValidation
 * RejectionReason20Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code#NotIdentifiedCashAccount
 * RejectionReason20Code.NotIdentifiedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code#NotIdentifiedCorrespondentBank
 * RejectionReason20Code.NotIdentifiedCorrespondentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code#InvalidStandingInstructionType
 * RejectionReason20Code.InvalidStandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code#NoHolding
 * RejectionReason20Code.NoHolding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FAIL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason20Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason of a rejection of the standing instruction request."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason20Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code
	 * RejectionReason20Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * </ul>
	 */
	public static final RejectionReason20Code FailedValidation = new RejectionReason20Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason20Code.mmObject();
			codeName = RejectionReasonCode.FailedValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code
	 * RejectionReason20Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCashAccount"</li>
	 * </ul>
	 */
	public static final RejectionReason20Code NotIdentifiedCashAccount = new RejectionReason20Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason20Code.mmObject();
			codeName = RejectionReasonCode.NotIdentifiedCashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code
	 * RejectionReason20Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCorrespondentBank"</li>
	 * </ul>
	 */
	public static final RejectionReason20Code NotIdentifiedCorrespondentBank = new RejectionReason20Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason20Code.mmObject();
			codeName = RejectionReasonCode.NotIdentifiedCorrespondentBank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code
	 * RejectionReason20Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidStandingInstructionType"</li>
	 * </ul>
	 */
	public static final RejectionReason20Code InvalidStandingInstructionType = new RejectionReason20Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidStandingInstructionType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason20Code.mmObject();
			codeName = RejectionReasonCode.InvalidStandingInstructionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason20Code
	 * RejectionReason20Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoHolding"</li>
	 * </ul>
	 */
	public static final RejectionReason20Code NoHolding = new RejectionReason20Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoHolding";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason20Code.mmObject();
			codeName = RejectionReasonCode.NoHolding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason20Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason20Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FAIL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason20Code";
				definition = "Specifies the reason of a rejection of the standing instruction request.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason20Code.FailedValidation, com.tools20022.repository.codeset.RejectionReason20Code.NotIdentifiedCashAccount,
						com.tools20022.repository.codeset.RejectionReason20Code.NotIdentifiedCorrespondentBank, com.tools20022.repository.codeset.RejectionReason20Code.InvalidStandingInstructionType,
						com.tools20022.repository.codeset.RejectionReason20Code.NoHolding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(NotIdentifiedCashAccount.getCodeName().get(), NotIdentifiedCashAccount);
		codesByName.put(NotIdentifiedCorrespondentBank.getCodeName().get(), NotIdentifiedCorrespondentBank);
		codesByName.put(InvalidStandingInstructionType.getCodeName().get(), InvalidStandingInstructionType);
		codesByName.put(NoHolding.getCodeName().get(), NoHolding);
	}

	public static RejectionReason20Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason20Code[] values() {
		RejectionReason20Code[] values = new RejectionReason20Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason20Code> {
		@Override
		public RejectionReason20Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason20Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}