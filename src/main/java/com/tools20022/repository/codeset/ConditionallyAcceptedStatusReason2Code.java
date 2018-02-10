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
import com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code#AwaitingDocuments
 * ConditionallyAcceptedStatusReason2Code.AwaitingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code#AwaitingRedemptionMoney
 * ConditionallyAcceptedStatusReason2Code.AwaitingRedemptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code#AwaitingSubscriptionMoney
 * ConditionallyAcceptedStatusReason2Code.AwaitingSubscriptionMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code#PossibleDuplicate
 * ConditionallyAcceptedStatusReason2Code.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code#TradingLimitExceeded
 * ConditionallyAcceptedStatusReason2Code.TradingLimitExceeded}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
 * ConditionallyAcceptedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DOCC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionallyAcceptedStatusReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a conditionally accepted status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConditionallyAcceptedStatusReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code
	 * ConditionallyAcceptedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocuments"</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason2Code AwaitingDocuments = new ConditionallyAcceptedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocuments";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code
	 * ConditionallyAcceptedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingRedemptionMoney"</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason2Code AwaitingRedemptionMoney = new ConditionallyAcceptedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingRedemptionMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingRedemptionMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code
	 * ConditionallyAcceptedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSubscriptionMoney"</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason2Code AwaitingSubscriptionMoney = new ConditionallyAcceptedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSubscriptionMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingSubscriptionMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code
	 * ConditionallyAcceptedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason2Code PossibleDuplicate = new ConditionallyAcceptedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.PossibleDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code
	 * ConditionallyAcceptedStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingLimitExceeded"</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason2Code TradingLimitExceeded = new ConditionallyAcceptedStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingLimitExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.mmObject();
			codeName = ConditionallyAcceptedStatusReasonCode.TradingLimitExceeded.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ConditionallyAcceptedStatusReason2Code> codesByName = new LinkedHashMap<>();

	protected ConditionallyAcceptedStatusReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DOCC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReason2Code";
				definition = "Specifies the reason for a conditionally accepted status.";
				trace_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.AwaitingDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.AwaitingRedemptionMoney,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.AwaitingSubscriptionMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.PossibleDuplicate,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason2Code.TradingLimitExceeded);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingDocuments.getCodeName().get(), AwaitingDocuments);
		codesByName.put(AwaitingRedemptionMoney.getCodeName().get(), AwaitingRedemptionMoney);
		codesByName.put(AwaitingSubscriptionMoney.getCodeName().get(), AwaitingSubscriptionMoney);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(TradingLimitExceeded.getCodeName().get(), TradingLimitExceeded);
	}

	public static ConditionallyAcceptedStatusReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConditionallyAcceptedStatusReason2Code[] values() {
		ConditionallyAcceptedStatusReason2Code[] values = new ConditionallyAcceptedStatusReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConditionallyAcceptedStatusReason2Code> {
		@Override
		public ConditionallyAcceptedStatusReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConditionallyAcceptedStatusReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}