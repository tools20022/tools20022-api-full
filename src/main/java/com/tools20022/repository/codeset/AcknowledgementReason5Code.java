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
import com.tools20022.repository.codeset.AcknowledgementReason5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information about the processed instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#AccountServicerDeadlineMissed
 * AcknowledgementReason5Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#MarketPracticeRuleDiscrepency
 * AcknowledgementReason5Code.MarketPracticeRuleDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#Other
 * AcknowledgementReason5Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#ConditionalCurrency
 * AcknowledgementReason5Code.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#ConditionalRegistrar
 * AcknowledgementReason5Code.ConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#ConditionalRealignement
 * AcknowledgementReason5Code.ConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#NotStraightThroughProcessing
 * AcknowledgementReason5Code.NotStraightThroughProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#AcceptedWithoutVotingRights
 * AcknowledgementReason5Code.AcceptedWithoutVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code#MarketDeadlineMissed
 * AcknowledgementReason5Code.MarketDeadlineMissed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReasonCode
 * AcknowledgementReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcknowledgementReason5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the processed instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AcknowledgementReason5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code AccountServicerDeadlineMissed = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeRuleDiscrepency"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code MarketPracticeRuleDiscrepency = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeRuleDiscrepency";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.MarketPracticeRuleDiscrepency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code Other = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code ConditionalCurrency = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.ConditionalCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code ConditionalRegistrar = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.ConditionalRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code ConditionalRealignement = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.ConditionalRealignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStraightThroughProcessing"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code NotStraightThroughProcessing = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStraightThroughProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.NotStraightThroughProcessing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedWithoutVotingRights"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code AcceptedWithoutVotingRights = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedWithoutVotingRights";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.AcceptedWithoutVotingRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason5Code
	 * AcknowledgementReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason5Code MarketDeadlineMissed = new AcknowledgementReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason5Code.mmObject();
			codeName = AcknowledgementReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AcknowledgementReason5Code> codesByName = new LinkedHashMap<>();

	protected AcknowledgementReason5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcknowledgementReason5Code";
				definition = "Specifies additional information about the processed instruction.";
				trace_lazy = () -> AcknowledgementReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AcknowledgementReason5Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.AcknowledgementReason5Code.MarketPracticeRuleDiscrepency,
						com.tools20022.repository.codeset.AcknowledgementReason5Code.Other, com.tools20022.repository.codeset.AcknowledgementReason5Code.ConditionalCurrency,
						com.tools20022.repository.codeset.AcknowledgementReason5Code.ConditionalRegistrar, com.tools20022.repository.codeset.AcknowledgementReason5Code.ConditionalRealignement,
						com.tools20022.repository.codeset.AcknowledgementReason5Code.NotStraightThroughProcessing, com.tools20022.repository.codeset.AcknowledgementReason5Code.AcceptedWithoutVotingRights,
						com.tools20022.repository.codeset.AcknowledgementReason5Code.MarketDeadlineMissed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(MarketPracticeRuleDiscrepency.getCodeName().get(), MarketPracticeRuleDiscrepency);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(NotStraightThroughProcessing.getCodeName().get(), NotStraightThroughProcessing);
		codesByName.put(AcceptedWithoutVotingRights.getCodeName().get(), AcceptedWithoutVotingRights);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
	}

	public static AcknowledgementReason5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AcknowledgementReason5Code[] values() {
		AcknowledgementReason5Code[] values = new AcknowledgementReason5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AcknowledgementReason5Code> {
		@Override
		public AcknowledgementReason5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AcknowledgementReason5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}