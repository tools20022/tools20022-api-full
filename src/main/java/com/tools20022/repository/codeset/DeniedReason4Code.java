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
import com.tools20022.repository.codeset.DeniedReason4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the denied reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#AccountServicerDeadlineMissed
 * DeniedReason4Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#DeniedSinceAlreadyCancelled
 * DeniedReason4Code.DeniedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#DeniedSinceInProgress
 * DeniedReason4Code.DeniedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#DeniedSinceRepoEnded
 * DeniedReason4Code.DeniedSinceRepoEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#DeniedSinceAlreadySettled
 * DeniedReason4Code.DeniedSinceAlreadySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#MarketDeadlineMissed
 * DeniedReason4Code.MarketDeadlineMissed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReason4Code#Other
 * DeniedReason4Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#ConditionalRegistrar
 * DeniedReason4Code.ConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#ConditionalCurrency
 * DeniedReason4Code.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code#ConditionalRealignement
 * DeniedReason4Code.ConditionalRealignement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DeniedReasonCode
 * DeniedReasonCode}</li>
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
 * "DeniedReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the denied reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeniedReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code AccountServicerDeadlineMissed = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceAlreadyCancelled"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code DeniedSinceAlreadyCancelled = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceInProgress"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code DeniedSinceInProgress = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceRepoEnded"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code DeniedSinceRepoEnded = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceRepoEnded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceAlreadySettled"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code DeniedSinceAlreadySettled = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceAlreadySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code MarketDeadlineMissed = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code Other = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code ConditionalRegistrar = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.ConditionalRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code ConditionalCurrency = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.ConditionalCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason4Code
	 * DeniedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * </ul>
	 */
	public static final DeniedReason4Code ConditionalRealignement = new DeniedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason4Code.mmObject();
			codeName = DeniedReasonCode.ConditionalRealignement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeniedReason4Code> codesByName = new LinkedHashMap<>();

	protected DeniedReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeniedReason4Code";
				definition = "Specifies the denied reason.";
				trace_lazy = () -> DeniedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeniedReason4Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.DeniedReason4Code.DeniedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.DeniedReason4Code.DeniedSinceInProgress, com.tools20022.repository.codeset.DeniedReason4Code.DeniedSinceRepoEnded,
						com.tools20022.repository.codeset.DeniedReason4Code.DeniedSinceAlreadySettled, com.tools20022.repository.codeset.DeniedReason4Code.MarketDeadlineMissed, com.tools20022.repository.codeset.DeniedReason4Code.Other,
						com.tools20022.repository.codeset.DeniedReason4Code.ConditionalRegistrar, com.tools20022.repository.codeset.DeniedReason4Code.ConditionalCurrency,
						com.tools20022.repository.codeset.DeniedReason4Code.ConditionalRealignement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(DeniedSinceAlreadyCancelled.getCodeName().get(), DeniedSinceAlreadyCancelled);
		codesByName.put(DeniedSinceInProgress.getCodeName().get(), DeniedSinceInProgress);
		codesByName.put(DeniedSinceRepoEnded.getCodeName().get(), DeniedSinceRepoEnded);
		codesByName.put(DeniedSinceAlreadySettled.getCodeName().get(), DeniedSinceAlreadySettled);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
	}

	public static DeniedReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeniedReason4Code[] values() {
		DeniedReason4Code[] values = new DeniedReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeniedReason4Code> {
		@Override
		public DeniedReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeniedReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}