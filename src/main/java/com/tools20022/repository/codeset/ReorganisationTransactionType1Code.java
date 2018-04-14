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
import com.tools20022.repository.codeset.ReorganisationTransactionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of reorganisation transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code#CoverOnBehalfOfAnotherParticipantTransaction
 * ReorganisationTransactionType1Code.
 * CoverOnBehalfOfAnotherParticipantTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code#CoverProtectDirectlyToAgentHeaderTransaction
 * ReorganisationTransactionType1Code.
 * CoverProtectDirectlyToAgentHeaderTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code#CoverProtectTransaction
 * ReorganisationTransactionType1Code.CoverProtectTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code#ProtectOnBehalfOfAnotherParticipantTransaction
 * ReorganisationTransactionType1Code.
 * ProtectOnBehalfOfAnotherParticipantTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code#ProtectTransaction
 * ReorganisationTransactionType1Code.ProtectTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code#VoluntaryOfferInstructionTransaction
 * ReorganisationTransactionType1Code.VoluntaryOfferInstructionTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
 * ReorganisationTransactionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReorganisationTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of reorganisation transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReorganisationTransactionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverOnBehalfOfAnotherParticipantTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionType1Code CoverOnBehalfOfAnotherParticipantTransaction = new ReorganisationTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverOnBehalfOfAnotherParticipantTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionType1Code.mmObject();
			codeName = ReorganisationTransactionTypeCode.CoverOnBehalfOfAnotherParticipantTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectDirectlyToAgentHeaderTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionType1Code CoverProtectDirectlyToAgentHeaderTransaction = new ReorganisationTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectDirectlyToAgentHeaderTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionType1Code.mmObject();
			codeName = ReorganisationTransactionTypeCode.CoverProtectDirectlyToAgentHeaderTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionType1Code CoverProtectTransaction = new ReorganisationTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionType1Code.mmObject();
			codeName = ReorganisationTransactionTypeCode.CoverProtectTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectOnBehalfOfAnotherParticipantTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionType1Code ProtectOnBehalfOfAnotherParticipantTransaction = new ReorganisationTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectOnBehalfOfAnotherParticipantTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionType1Code.mmObject();
			codeName = ReorganisationTransactionTypeCode.ProtectOnBehalfOfAnotherParticipantTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionType1Code ProtectTransaction = new ReorganisationTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionType1Code.mmObject();
			codeName = ReorganisationTransactionTypeCode.ProtectTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
	 * ReorganisationTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoluntaryOfferInstructionTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionType1Code VoluntaryOfferInstructionTransaction = new ReorganisationTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoluntaryOfferInstructionTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionType1Code.mmObject();
			codeName = ReorganisationTransactionTypeCode.VoluntaryOfferInstructionTransaction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReorganisationTransactionType1Code> codesByName = new LinkedHashMap<>();

	protected ReorganisationTransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationTransactionType1Code";
				definition = "Specifies the type of reorganisation transaction.";
				trace_lazy = () -> ReorganisationTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReorganisationTransactionType1Code.CoverOnBehalfOfAnotherParticipantTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionType1Code.CoverProtectDirectlyToAgentHeaderTransaction, com.tools20022.repository.codeset.ReorganisationTransactionType1Code.CoverProtectTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionType1Code.ProtectOnBehalfOfAnotherParticipantTransaction, com.tools20022.repository.codeset.ReorganisationTransactionType1Code.ProtectTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionType1Code.VoluntaryOfferInstructionTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CoverOnBehalfOfAnotherParticipantTransaction.getCodeName().get(), CoverOnBehalfOfAnotherParticipantTransaction);
		codesByName.put(CoverProtectDirectlyToAgentHeaderTransaction.getCodeName().get(), CoverProtectDirectlyToAgentHeaderTransaction);
		codesByName.put(CoverProtectTransaction.getCodeName().get(), CoverProtectTransaction);
		codesByName.put(ProtectOnBehalfOfAnotherParticipantTransaction.getCodeName().get(), ProtectOnBehalfOfAnotherParticipantTransaction);
		codesByName.put(ProtectTransaction.getCodeName().get(), ProtectTransaction);
		codesByName.put(VoluntaryOfferInstructionTransaction.getCodeName().get(), VoluntaryOfferInstructionTransaction);
	}

	public static ReorganisationTransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReorganisationTransactionType1Code[] values() {
		ReorganisationTransactionType1Code[] values = new ReorganisationTransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReorganisationTransactionType1Code> {
		@Override
		public ReorganisationTransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReorganisationTransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}