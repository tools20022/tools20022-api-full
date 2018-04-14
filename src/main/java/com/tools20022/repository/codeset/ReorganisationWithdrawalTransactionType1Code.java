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
import com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code#ProtectWithdrawalTransaction
 * ReorganisationWithdrawalTransactionType1Code.ProtectWithdrawalTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code#VoluntaryOfferInstructionWithdrawal
 * ReorganisationWithdrawalTransactionType1Code.
 * VoluntaryOfferInstructionWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code#WithdrawalProtectOnBehalfOfAnotherParticipant
 * ReorganisationWithdrawalTransactionType1Code.
 * WithdrawalProtectOnBehalfOfAnotherParticipant}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionTypeCode
 * ReorganisationWithdrawalTransactionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReorganisationWithdrawalTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of withdrawal reorganisation transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReorganisationWithdrawalTransactionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code
	 * ReorganisationWithdrawalTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectWithdrawalTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationWithdrawalTransactionType1Code ProtectWithdrawalTransaction = new ReorganisationWithdrawalTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectWithdrawalTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.mmObject();
			codeName = ReorganisationWithdrawalTransactionTypeCode.ProtectWithdrawalTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code
	 * ReorganisationWithdrawalTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoluntaryOfferInstructionWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationWithdrawalTransactionType1Code VoluntaryOfferInstructionWithdrawal = new ReorganisationWithdrawalTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoluntaryOfferInstructionWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.mmObject();
			codeName = ReorganisationWithdrawalTransactionTypeCode.VoluntaryOfferInstructionWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code
	 * ReorganisationWithdrawalTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalProtectOnBehalfOfAnotherParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReorganisationWithdrawalTransactionType1Code WithdrawalProtectOnBehalfOfAnotherParticipant = new ReorganisationWithdrawalTransactionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalProtectOnBehalfOfAnotherParticipant";
			owner_lazy = () -> com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.mmObject();
			codeName = ReorganisationWithdrawalTransactionTypeCode.WithdrawalProtectOnBehalfOfAnotherParticipant.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReorganisationWithdrawalTransactionType1Code> codesByName = new LinkedHashMap<>();

	protected ReorganisationWithdrawalTransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReorganisationWithdrawalTransactionType1Code";
				definition = "Specifies the type of withdrawal reorganisation transaction.";
				trace_lazy = () -> ReorganisationWithdrawalTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.ProtectWithdrawalTransaction,
						com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.VoluntaryOfferInstructionWithdrawal,
						com.tools20022.repository.codeset.ReorganisationWithdrawalTransactionType1Code.WithdrawalProtectOnBehalfOfAnotherParticipant);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProtectWithdrawalTransaction.getCodeName().get(), ProtectWithdrawalTransaction);
		codesByName.put(VoluntaryOfferInstructionWithdrawal.getCodeName().get(), VoluntaryOfferInstructionWithdrawal);
		codesByName.put(WithdrawalProtectOnBehalfOfAnotherParticipant.getCodeName().get(), WithdrawalProtectOnBehalfOfAnotherParticipant);
	}

	public static ReorganisationWithdrawalTransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReorganisationWithdrawalTransactionType1Code[] values() {
		ReorganisationWithdrawalTransactionType1Code[] values = new ReorganisationWithdrawalTransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReorganisationWithdrawalTransactionType1Code> {
		@Override
		public ReorganisationWithdrawalTransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReorganisationWithdrawalTransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}