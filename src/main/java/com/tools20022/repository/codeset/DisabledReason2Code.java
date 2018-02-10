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
import com.tools20022.repository.codeset.DisabledReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason an account is disabled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#AccountClosingInProcess
 * DisabledReason2Code.AccountClosingInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Bankruptcy
 * DisabledReason2Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Commitment
 * DisabledReason2Code.Commitment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Confiscation
 * DisabledReason2Code.Confiscation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#MortisCausa
 * DisabledReason2Code.MortisCausa}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#PendingComplianceVerification
 * DisabledReason2Code.PendingComplianceVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Pledged
 * DisabledReason2Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Reregistration
 * DisabledReason2Code.Reregistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Sanctions
 * DisabledReason2Code.Sanctions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Transfer
 * DisabledReason2Code.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code#Rejected
 * DisabledReason2Code.Rejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BlockedReasonCode
 * BlockedReasonCode}</li>
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
 * "DisabledReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason an account is disabled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DisabledReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosingInProcess"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code AccountClosingInProcess = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosingInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.AccountClosingInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Bankruptcy = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commitment"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Commitment = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commitment";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Commitment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confiscation"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Confiscation = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confiscation";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Confiscation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortisCausa"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code MortisCausa = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortisCausa";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.MortisCausa.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingComplianceVerification"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code PendingComplianceVerification = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingComplianceVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.PendingComplianceVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Pledged = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reregistration"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Reregistration = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reregistration";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Reregistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sanctions"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Sanctions = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sanctions";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Sanctions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Transfer = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Transfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DisabledReason2Code
	 * DisabledReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final DisabledReason2Code Rejected = new DisabledReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.DisabledReason2Code.mmObject();
			codeName = BlockedReasonCode.Rejected.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DisabledReason2Code> codesByName = new LinkedHashMap<>();

	protected DisabledReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisabledReason2Code";
				definition = "Specifies the reason an account is disabled.";
				trace_lazy = () -> BlockedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisabledReason2Code.AccountClosingInProcess, com.tools20022.repository.codeset.DisabledReason2Code.Bankruptcy,
						com.tools20022.repository.codeset.DisabledReason2Code.Commitment, com.tools20022.repository.codeset.DisabledReason2Code.Confiscation, com.tools20022.repository.codeset.DisabledReason2Code.MortisCausa,
						com.tools20022.repository.codeset.DisabledReason2Code.PendingComplianceVerification, com.tools20022.repository.codeset.DisabledReason2Code.Pledged,
						com.tools20022.repository.codeset.DisabledReason2Code.Reregistration, com.tools20022.repository.codeset.DisabledReason2Code.Sanctions, com.tools20022.repository.codeset.DisabledReason2Code.Transfer,
						com.tools20022.repository.codeset.DisabledReason2Code.Rejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountClosingInProcess.getCodeName().get(), AccountClosingInProcess);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(Commitment.getCodeName().get(), Commitment);
		codesByName.put(Confiscation.getCodeName().get(), Confiscation);
		codesByName.put(MortisCausa.getCodeName().get(), MortisCausa);
		codesByName.put(PendingComplianceVerification.getCodeName().get(), PendingComplianceVerification);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(Reregistration.getCodeName().get(), Reregistration);
		codesByName.put(Sanctions.getCodeName().get(), Sanctions);
		codesByName.put(Transfer.getCodeName().get(), Transfer);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
	}

	public static DisabledReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DisabledReason2Code[] values() {
		DisabledReason2Code[] values = new DisabledReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DisabledReason2Code> {
		@Override
		public DisabledReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DisabledReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}