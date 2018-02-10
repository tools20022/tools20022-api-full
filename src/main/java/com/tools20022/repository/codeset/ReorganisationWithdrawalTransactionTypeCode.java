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
import com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of withdrawal reorganisation transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode#ProtectWithdrawalTransaction
 * ReorganisationWithdrawalTransactionTypeCode.ProtectWithdrawalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode#WithdrawalProtectOnBehalfOfAnotherParticipant
 * ReorganisationWithdrawalTransactionTypeCode.
 * WithdrawalProtectOnBehalfOfAnotherParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode#VoluntaryOfferInstructionWithdrawal
 * ReorganisationWithdrawalTransactionTypeCode.
 * VoluntaryOfferInstructionWithdrawal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code
 * ReorganisationWithdrawalTransactionType1Code}</li>
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
 * "ReorganisationWithdrawalTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of withdrawal reorganisation transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReorganisationWithdrawalTransactionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The reorganisation instruction cancellation is a protect withdrawal
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode
	 * ReorganisationWithdrawalTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectWithdrawalTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reorganisation instruction cancellation is a protect withdrawal transaction."
	 * </li>
	 * </ul>
	 */
	public static final ReorganisationWithdrawalTransactionTypeCode ProtectWithdrawalTransaction = new ReorganisationWithdrawalTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectWithdrawalTransaction";
			definition = "The reorganisation instruction cancellation is a protect withdrawal transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.mmObject();
			codeName = "PROW";
		}
	};
	/**
	 * The reorganisation instruction cancellation is a withdrawal protect
	 * transaction on behalf of another participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode
	 * ReorganisationWithdrawalTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRPW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalProtectOnBehalfOfAnotherParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reorganisation instruction cancellation is a withdrawal protect transaction on behalf of another participant."
	 * </li>
	 * </ul>
	 */
	public static final ReorganisationWithdrawalTransactionTypeCode WithdrawalProtectOnBehalfOfAnotherParticipant = new ReorganisationWithdrawalTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalProtectOnBehalfOfAnotherParticipant";
			definition = "The reorganisation instruction cancellation is a withdrawal protect transaction on behalf of another participant.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.mmObject();
			codeName = "PRPW";
		}
	};
	/**
	 * The reorganisation instruction cancellation is a voluntary offer
	 * instruction withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode
	 * ReorganisationWithdrawalTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOIW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoluntaryOfferInstructionWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The reorganisation instruction cancellation is a voluntary offer instruction withdrawal transaction."
	 * </li>
	 * </ul>
	 */
	public static final ReorganisationWithdrawalTransactionTypeCode VoluntaryOfferInstructionWithdrawal = new ReorganisationWithdrawalTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoluntaryOfferInstructionWithdrawal";
			definition = "The reorganisation instruction cancellation is a voluntary offer instruction withdrawal transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.mmObject();
			codeName = "VOIW";
		}
	};
	final static private LinkedHashMap<String, ReorganisationWithdrawalTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected ReorganisationWithdrawalTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationWithdrawalTransactionTypeCode";
				definition = "Specifies the type of withdrawal reorganisation transaction.";
				derivation_lazy = () -> Arrays.asList(ReorganisationWithdrawalTransactionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.ProtectWithdrawalTransaction,
						com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.WithdrawalProtectOnBehalfOfAnotherParticipant,
						com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode.VoluntaryOfferInstructionWithdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProtectWithdrawalTransaction.getCodeName().get(), ProtectWithdrawalTransaction);
		codesByName.put(WithdrawalProtectOnBehalfOfAnotherParticipant.getCodeName().get(), WithdrawalProtectOnBehalfOfAnotherParticipant);
		codesByName.put(VoluntaryOfferInstructionWithdrawal.getCodeName().get(), VoluntaryOfferInstructionWithdrawal);
	}

	public static ReorganisationWithdrawalTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReorganisationWithdrawalTransactionTypeCode[] values() {
		ReorganisationWithdrawalTransactionTypeCode[] values = new ReorganisationWithdrawalTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReorganisationWithdrawalTransactionTypeCode> {
		@Override
		public ReorganisationWithdrawalTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReorganisationWithdrawalTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}