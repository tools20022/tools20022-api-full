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
import com.tools20022.repository.codeset.DeniedReason7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#AccountServicerDeadlineMissed
 * DeniedReason7Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#CallDeniedSinceAlreadyApplied
 * DeniedReason7Code.CallDeniedSinceAlreadyApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#ConditionalCurrency
 * DeniedReason7Code.ConditionalCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#ConditionalRealignement
 * DeniedReason7Code.ConditionalRealignement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#ConditionalRegistrar
 * DeniedReason7Code.ConditionalRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#DeniedSinceCancelled
 * DeniedReason7Code.DeniedSinceCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#DeniedSinceInProgress
 * DeniedReason7Code.DeniedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#DeniedSinceNotAllowed
 * DeniedReason7Code.DeniedSinceNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#DeniedSinceRepoEnded
 * DeniedReason7Code.DeniedSinceRepoEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#DeniedSinceSettled
 * DeniedReason7Code.DeniedSinceSettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#InstructionProcessed
 * DeniedReason7Code.InstructionProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code#MarketDeadlineMissed
 * DeniedReason7Code.MarketDeadlineMissed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DeniedReason7Code#Other
 * DeniedReason7Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementDeniedReasonCode
 * SettlementDeniedReasonCode}</li>
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
 * "DeniedReason7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the denied reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeniedReason7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code AccountServicerDeadlineMissed = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallDeniedSinceAlreadyApplied"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code CallDeniedSinceAlreadyApplied = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallDeniedSinceAlreadyApplied";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.CallDeniedSinceAlreadyApplied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalCurrency"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code ConditionalCurrency = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.ConditionalCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRealignement"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code ConditionalRealignement = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRealignement";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.ConditionalRealignement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalRegistrar"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code ConditionalRegistrar = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.ConditionalRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceCancelled"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code DeniedSinceCancelled = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.DeniedSinceCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceInProgress"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code DeniedSinceInProgress = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.DeniedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceNotAllowed"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code DeniedSinceNotAllowed = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.DeniedSinceNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceRepoEnded"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code DeniedSinceRepoEnded = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.DeniedSinceRepoEnded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceSettled"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code DeniedSinceSettled = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceSettled";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.DeniedSinceSettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessed"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code InstructionProcessed = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.InstructionProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code MarketDeadlineMissed = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason7Code
	 * DeniedReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DeniedReason7Code Other = new DeniedReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason7Code.mmObject();
			codeName = SettlementDeniedReasonCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeniedReason7Code> codesByName = new LinkedHashMap<>();

	protected DeniedReason7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeniedReason7Code";
				definition = "Specifies the denied reason.";
				trace_lazy = () -> SettlementDeniedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeniedReason7Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.DeniedReason7Code.CallDeniedSinceAlreadyApplied,
						com.tools20022.repository.codeset.DeniedReason7Code.ConditionalCurrency, com.tools20022.repository.codeset.DeniedReason7Code.ConditionalRealignement,
						com.tools20022.repository.codeset.DeniedReason7Code.ConditionalRegistrar, com.tools20022.repository.codeset.DeniedReason7Code.DeniedSinceCancelled,
						com.tools20022.repository.codeset.DeniedReason7Code.DeniedSinceInProgress, com.tools20022.repository.codeset.DeniedReason7Code.DeniedSinceNotAllowed,
						com.tools20022.repository.codeset.DeniedReason7Code.DeniedSinceRepoEnded, com.tools20022.repository.codeset.DeniedReason7Code.DeniedSinceSettled,
						com.tools20022.repository.codeset.DeniedReason7Code.InstructionProcessed, com.tools20022.repository.codeset.DeniedReason7Code.MarketDeadlineMissed, com.tools20022.repository.codeset.DeniedReason7Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(CallDeniedSinceAlreadyApplied.getCodeName().get(), CallDeniedSinceAlreadyApplied);
		codesByName.put(ConditionalCurrency.getCodeName().get(), ConditionalCurrency);
		codesByName.put(ConditionalRealignement.getCodeName().get(), ConditionalRealignement);
		codesByName.put(ConditionalRegistrar.getCodeName().get(), ConditionalRegistrar);
		codesByName.put(DeniedSinceCancelled.getCodeName().get(), DeniedSinceCancelled);
		codesByName.put(DeniedSinceInProgress.getCodeName().get(), DeniedSinceInProgress);
		codesByName.put(DeniedSinceNotAllowed.getCodeName().get(), DeniedSinceNotAllowed);
		codesByName.put(DeniedSinceRepoEnded.getCodeName().get(), DeniedSinceRepoEnded);
		codesByName.put(DeniedSinceSettled.getCodeName().get(), DeniedSinceSettled);
		codesByName.put(InstructionProcessed.getCodeName().get(), InstructionProcessed);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DeniedReason7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeniedReason7Code[] values() {
		DeniedReason7Code[] values = new DeniedReason7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeniedReason7Code> {
		@Override
		public DeniedReason7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeniedReason7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}