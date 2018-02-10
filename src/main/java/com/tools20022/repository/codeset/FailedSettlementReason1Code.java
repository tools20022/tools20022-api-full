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
import com.tools20022.repository.codeset.FailedSettlementReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason of a settlement failure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#CreditAccountNotEligible
 * FailedSettlementReason1Code.CreditAccountNotEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#CreditAccountDisabled
 * FailedSettlementReason1Code.CreditAccountDisabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#DebitAccountNotEligible
 * FailedSettlementReason1Code.DebitAccountNotEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#DebitAccountDisabled
 * FailedSettlementReason1Code.DebitAccountDisabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#InsufficientSecurities
 * FailedSettlementReason1Code.InsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#IncompleteDistribution
 * FailedSettlementReason1Code.IncompleteDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code#InsufficientCash
 * FailedSettlementReason1Code.InsufficientCash}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReasonCode
 * FailedSettlementReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CANE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FailedSettlementReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason of a settlement failure."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FailedSettlementReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccountNotEligible"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code CreditAccountNotEligible = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccountNotEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.CreditAccountNotEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAccountDisabled"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code CreditAccountDisabled = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccountDisabled";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.CreditAccountDisabled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccountNotEligible"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code DebitAccountNotEligible = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccountNotEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.DebitAccountNotEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAccountDisabled"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code DebitAccountDisabled = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAccountDisabled";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.DebitAccountDisabled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientSecurities"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code InsufficientSecurities = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.InsufficientSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteDistribution"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code IncompleteDistribution = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.IncompleteDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailedSettlementReason1Code
	 * FailedSettlementReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCash"</li>
	 * </ul>
	 */
	public static final FailedSettlementReason1Code InsufficientCash = new FailedSettlementReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCash";
			owner_lazy = () -> com.tools20022.repository.codeset.FailedSettlementReason1Code.mmObject();
			codeName = FailedSettlementReasonCode.InsufficientCash.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FailedSettlementReason1Code> codesByName = new LinkedHashMap<>();

	protected FailedSettlementReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailedSettlementReason1Code";
				definition = "Specifies the reason of a settlement failure.";
				trace_lazy = () -> FailedSettlementReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailedSettlementReason1Code.CreditAccountNotEligible, com.tools20022.repository.codeset.FailedSettlementReason1Code.CreditAccountDisabled,
						com.tools20022.repository.codeset.FailedSettlementReason1Code.DebitAccountNotEligible, com.tools20022.repository.codeset.FailedSettlementReason1Code.DebitAccountDisabled,
						com.tools20022.repository.codeset.FailedSettlementReason1Code.InsufficientSecurities, com.tools20022.repository.codeset.FailedSettlementReason1Code.IncompleteDistribution,
						com.tools20022.repository.codeset.FailedSettlementReason1Code.InsufficientCash);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CreditAccountNotEligible.getCodeName().get(), CreditAccountNotEligible);
		codesByName.put(CreditAccountDisabled.getCodeName().get(), CreditAccountDisabled);
		codesByName.put(DebitAccountNotEligible.getCodeName().get(), DebitAccountNotEligible);
		codesByName.put(DebitAccountDisabled.getCodeName().get(), DebitAccountDisabled);
		codesByName.put(InsufficientSecurities.getCodeName().get(), InsufficientSecurities);
		codesByName.put(IncompleteDistribution.getCodeName().get(), IncompleteDistribution);
		codesByName.put(InsufficientCash.getCodeName().get(), InsufficientCash);
	}

	public static FailedSettlementReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FailedSettlementReason1Code[] values() {
		FailedSettlementReason1Code[] values = new FailedSettlementReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FailedSettlementReason1Code> {
		@Override
		public FailedSettlementReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FailedSettlementReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}