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
import com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode#ProtectTransaction
 * ReorganisationTransactionTypeCode.ProtectTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode#CoverProtectTransaction
 * ReorganisationTransactionTypeCode.CoverProtectTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode#CoverProtectDirectlyToAgentHeaderTransaction
 * ReorganisationTransactionTypeCode.
 * CoverProtectDirectlyToAgentHeaderTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode#ProtectOnBehalfOfAnotherParticipantTransaction
 * ReorganisationTransactionTypeCode.
 * ProtectOnBehalfOfAnotherParticipantTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode#VoluntaryOfferInstructionTransaction
 * ReorganisationTransactionTypeCode.VoluntaryOfferInstructionTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode#CoverOnBehalfOfAnotherParticipantTransaction
 * ReorganisationTransactionTypeCode.
 * CoverOnBehalfOfAnotherParticipantTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionType1Code
 * ReorganisationTransactionType1Code}</li>
 * </ul>
 * </li>
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
 * "ReorganisationTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of reorganisation transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReorganisationTransactionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reorganisation is a protect transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
	 * ReorganisationTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reorganisation is a protect transaction type."</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionTypeCode ProtectTransaction = new ReorganisationTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectTransaction";
			definition = "Reorganisation is a protect transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.mmObject();
			codeName = "PROT";
		}
	};
	/**
	 * Reorganisation is a cover protect transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
	 * ReorganisationTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reorganisation is a cover protect transaction type."</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionTypeCode CoverProtectTransaction = new ReorganisationTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectTransaction";
			definition = "Reorganisation is a cover protect transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.mmObject();
			codeName = "COVR";
		}
	};
	/**
	 * Reorganisation is a cover protect directly to agent transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
	 * ReorganisationTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectDirectlyToAgentHeaderTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reorganisation is a cover protect directly to agent transaction type."</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionTypeCode CoverProtectDirectlyToAgentHeaderTransaction = new ReorganisationTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectDirectlyToAgentHeaderTransaction";
			definition = "Reorganisation is a cover protect directly to agent transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.mmObject();
			codeName = "COVA";
		}
	};
	/**
	 * Reorganisation is a protect on behalf of another participant transaction
	 * type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
	 * ReorganisationTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectOnBehalfOfAnotherParticipantTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reorganisation is a protect on behalf of another participant transaction type."
	 * </li>
	 * </ul>
	 */
	public static final ReorganisationTransactionTypeCode ProtectOnBehalfOfAnotherParticipantTransaction = new ReorganisationTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectOnBehalfOfAnotherParticipantTransaction";
			definition = "Reorganisation is a protect on behalf of another participant transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Reorganisation is a voluntary offer instruction transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
	 * ReorganisationTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoluntaryOfferInstructionTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reorganisation is a voluntary offer instruction transaction type."</li>
	 * </ul>
	 */
	public static final ReorganisationTransactionTypeCode VoluntaryOfferInstructionTransaction = new ReorganisationTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoluntaryOfferInstructionTransaction";
			definition = "Reorganisation is a voluntary offer instruction transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.mmObject();
			codeName = "VOIT";
		}
	};
	/**
	 * Reorganisation is a cover on behalf of another participant transaction
	 * type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationTransactionTypeCode
	 * ReorganisationTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverOnBehalfOfAnotherParticipantTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reorganisation is a cover on behalf of another participant transaction type."
	 * </li>
	 * </ul>
	 */
	public static final ReorganisationTransactionTypeCode CoverOnBehalfOfAnotherParticipantTransaction = new ReorganisationTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverOnBehalfOfAnotherParticipantTransaction";
			definition = "Reorganisation is a cover on behalf of another participant transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.mmObject();
			codeName = "COVP";
		}
	};
	final static private LinkedHashMap<String, ReorganisationTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected ReorganisationTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationTransactionTypeCode";
				definition = "Specifies the type of reorganisation transaction.";
				derivation_lazy = () -> Arrays.asList(ReorganisationTransactionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.ProtectTransaction, com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.CoverProtectTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.CoverProtectDirectlyToAgentHeaderTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.ProtectOnBehalfOfAnotherParticipantTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.VoluntaryOfferInstructionTransaction,
						com.tools20022.repository.codeset.ReorganisationTransactionTypeCode.CoverOnBehalfOfAnotherParticipantTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProtectTransaction.getCodeName().get(), ProtectTransaction);
		codesByName.put(CoverProtectTransaction.getCodeName().get(), CoverProtectTransaction);
		codesByName.put(CoverProtectDirectlyToAgentHeaderTransaction.getCodeName().get(), CoverProtectDirectlyToAgentHeaderTransaction);
		codesByName.put(ProtectOnBehalfOfAnotherParticipantTransaction.getCodeName().get(), ProtectOnBehalfOfAnotherParticipantTransaction);
		codesByName.put(VoluntaryOfferInstructionTransaction.getCodeName().get(), VoluntaryOfferInstructionTransaction);
		codesByName.put(CoverOnBehalfOfAnotherParticipantTransaction.getCodeName().get(), CoverOnBehalfOfAnotherParticipantTransaction);
	}

	public static ReorganisationTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReorganisationTransactionTypeCode[] values() {
		ReorganisationTransactionTypeCode[] values = new ReorganisationTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReorganisationTransactionTypeCode> {
		@Override
		public ReorganisationTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReorganisationTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}