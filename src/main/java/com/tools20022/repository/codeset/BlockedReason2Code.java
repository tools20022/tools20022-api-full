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
import com.tools20022.repository.codeset.BlockedReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason an account is blocked.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Bankruptcy
 * BlockedReason2Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Commitment
 * BlockedReason2Code.Commitment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Confiscation
 * BlockedReason2Code.Confiscation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#MortisCausa
 * BlockedReason2Code.MortisCausa}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#PendingComplianceVerification
 * BlockedReason2Code.PendingComplianceVerification}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Pledged
 * BlockedReason2Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Reregistration
 * BlockedReason2Code.Reregistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Sanctions
 * BlockedReason2Code.Sanctions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code#Transfer
 * BlockedReason2Code.Transfer}</li>
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
 * "BlockedReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason an account is blocked."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BlockedReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Bankruptcy = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commitment"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Commitment = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commitment";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Commitment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confiscation"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Confiscation = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confiscation";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Confiscation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortisCausa"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code MortisCausa = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortisCausa";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.MortisCausa.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingComplianceVerification"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code PendingComplianceVerification = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingComplianceVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.PendingComplianceVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Pledged = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reregistration"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Reregistration = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reregistration";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Reregistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sanctions"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Sanctions = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sanctions";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Sanctions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BlockedReason2Code
	 * BlockedReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * </ul>
	 */
	public static final BlockedReason2Code Transfer = new BlockedReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			owner_lazy = () -> com.tools20022.repository.codeset.BlockedReason2Code.mmObject();
			codeName = BlockedReasonCode.Transfer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BlockedReason2Code> codesByName = new LinkedHashMap<>();

	protected BlockedReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BlockedReason2Code";
				definition = "Specifies the reason an account is blocked.";
				trace_lazy = () -> BlockedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BlockedReason2Code.Bankruptcy, com.tools20022.repository.codeset.BlockedReason2Code.Commitment,
						com.tools20022.repository.codeset.BlockedReason2Code.Confiscation, com.tools20022.repository.codeset.BlockedReason2Code.MortisCausa,
						com.tools20022.repository.codeset.BlockedReason2Code.PendingComplianceVerification, com.tools20022.repository.codeset.BlockedReason2Code.Pledged, com.tools20022.repository.codeset.BlockedReason2Code.Reregistration,
						com.tools20022.repository.codeset.BlockedReason2Code.Sanctions, com.tools20022.repository.codeset.BlockedReason2Code.Transfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(Commitment.getCodeName().get(), Commitment);
		codesByName.put(Confiscation.getCodeName().get(), Confiscation);
		codesByName.put(MortisCausa.getCodeName().get(), MortisCausa);
		codesByName.put(PendingComplianceVerification.getCodeName().get(), PendingComplianceVerification);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(Reregistration.getCodeName().get(), Reregistration);
		codesByName.put(Sanctions.getCodeName().get(), Sanctions);
		codesByName.put(Transfer.getCodeName().get(), Transfer);
	}

	public static BlockedReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BlockedReason2Code[] values() {
		BlockedReason2Code[] values = new BlockedReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BlockedReason2Code> {
		@Override
		public BlockedReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BlockedReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}