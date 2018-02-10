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
import com.tools20022.repository.codeset.AcknowledgementReason6Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code#AccountServicerDeadlineMissed
 * AcknowledgementReason6Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code#MarketPracticeRuleDiscrepency
 * AcknowledgementReason6Code.MarketPracticeRuleDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code#Other
 * AcknowledgementReason6Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code#NotStraightThroughProcessing
 * AcknowledgementReason6Code.NotStraightThroughProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code#MarketDeadlineMissed
 * AcknowledgementReason6Code.MarketDeadlineMissed}</li>
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
 * "AcknowledgementReason6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information about the processed instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AcknowledgementReason6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code
	 * AcknowledgementReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason6Code AccountServicerDeadlineMissed = new AcknowledgementReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason6Code.mmObject();
			codeName = AcknowledgementReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code
	 * AcknowledgementReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeRuleDiscrepency"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason6Code MarketPracticeRuleDiscrepency = new AcknowledgementReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeRuleDiscrepency";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason6Code.mmObject();
			codeName = AcknowledgementReasonCode.MarketPracticeRuleDiscrepency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code
	 * AcknowledgementReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason6Code Other = new AcknowledgementReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason6Code.mmObject();
			codeName = AcknowledgementReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code
	 * AcknowledgementReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStraightThroughProcessing"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason6Code NotStraightThroughProcessing = new AcknowledgementReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStraightThroughProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason6Code.mmObject();
			codeName = AcknowledgementReasonCode.NotStraightThroughProcessing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AcknowledgementReason6Code
	 * AcknowledgementReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final AcknowledgementReason6Code MarketDeadlineMissed = new AcknowledgementReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.AcknowledgementReason6Code.mmObject();
			codeName = AcknowledgementReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AcknowledgementReason6Code> codesByName = new LinkedHashMap<>();

	protected AcknowledgementReason6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcknowledgementReason6Code";
				definition = "Specifies additional information about the processed instruction.";
				trace_lazy = () -> AcknowledgementReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AcknowledgementReason6Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.AcknowledgementReason6Code.MarketPracticeRuleDiscrepency,
						com.tools20022.repository.codeset.AcknowledgementReason6Code.Other, com.tools20022.repository.codeset.AcknowledgementReason6Code.NotStraightThroughProcessing,
						com.tools20022.repository.codeset.AcknowledgementReason6Code.MarketDeadlineMissed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(MarketPracticeRuleDiscrepency.getCodeName().get(), MarketPracticeRuleDiscrepency);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(NotStraightThroughProcessing.getCodeName().get(), NotStraightThroughProcessing);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
	}

	public static AcknowledgementReason6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AcknowledgementReason6Code[] values() {
		AcknowledgementReason6Code[] values = new AcknowledgementReason6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AcknowledgementReason6Code> {
		@Override
		public AcknowledgementReason6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AcknowledgementReason6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}