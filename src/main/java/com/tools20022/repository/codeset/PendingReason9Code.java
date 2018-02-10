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
import com.tools20022.repository.codeset.PendingReason9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why a cancellation request sent for the related
 * instruction is pending.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#AccountServicerDeadlineMissed
 * PendingReason9Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#AwaitingConfirmation
 * PendingReason9Code.AwaitingConfirmation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason9Code#Other
 * PendingReason9Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#ConditionalRegistrar
 * PendingReason9Code.ConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#ConditionalCurrency
 * PendingReason9Code.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#ConditionalRealignement
 * PendingReason9Code.ConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#ConditionalDeliveryAwaitingCancellation
 * PendingReason9Code.ConditionalDeliveryAwaitingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code#IncompleteNumberCount
 * PendingReason9Code.IncompleteNumberCount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
 * PendingFailingReasonCode}</li>
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
 * "PendingReason9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why a cancellation request sent for the related instruction is pending."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PendingReason6Code
 * PendingReason6Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingReason9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingReason9Code AccountServicerDeadlineMissed = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingConfirmation"</li>
	 * </ul>
	 */
	public static final PendingReason9Code AwaitingConfirmation = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingReason9Code Other = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * </ul>
	 */
	public static final PendingReason9Code ConditionalRegistrar = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * </ul>
	 */
	public static final PendingReason9Code ConditionalCurrency = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * </ul>
	 */
	public static final PendingReason9Code ConditionalRealignement = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalRealignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryAwaitingCancellation"</li>
	 * </ul>
	 */
	public static final PendingReason9Code ConditionalDeliveryAwaitingCancellation = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalDeliveryAwaitingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason9Code
	 * PendingReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteNumberCount"</li>
	 * </ul>
	 */
	public static final PendingReason9Code IncompleteNumberCount = new PendingReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason9Code.mmObject();
			codeName = PendingFailingReasonCode.IncompleteNumberCount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingReason9Code> codesByName = new LinkedHashMap<>();

	protected PendingReason9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingReason9Code";
				definition = "Specifies the reason why a cancellation request sent for the related instruction is pending.";
				previousVersion_lazy = () -> PendingReason6Code.mmObject();
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingReason9Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.PendingReason9Code.AwaitingConfirmation,
						com.tools20022.repository.codeset.PendingReason9Code.Other, com.tools20022.repository.codeset.PendingReason9Code.ConditionalRegistrar, com.tools20022.repository.codeset.PendingReason9Code.ConditionalCurrency,
						com.tools20022.repository.codeset.PendingReason9Code.ConditionalRealignement, com.tools20022.repository.codeset.PendingReason9Code.ConditionalDeliveryAwaitingCancellation,
						com.tools20022.repository.codeset.PendingReason9Code.IncompleteNumberCount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(AwaitingConfirmation.getCodeName().get(), AwaitingConfirmation);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(ConditionalDeliveryAwaitingCancellation.getCodeName().get(), ConditionalDeliveryAwaitingCancellation);
		codesByName.put(IncompleteNumberCount.getCodeName().get(), IncompleteNumberCount);
	}

	public static PendingReason9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingReason9Code[] values() {
		PendingReason9Code[] values = new PendingReason9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingReason9Code> {
		@Override
		public PendingReason9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingReason9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}