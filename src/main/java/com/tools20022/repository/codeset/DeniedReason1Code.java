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
import com.tools20022.repository.codeset.DeniedReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#AccountServicerDeadlineMissed
 * DeniedReason1Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#CallDeniedSinceAlreadyApplied
 * DeniedReason1Code.CallDeniedSinceAlreadyApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#DeniedSinceAlreadyCancelled
 * DeniedReason1Code.DeniedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#DeniedSinceNotAllowed
 * DeniedReason1Code.DeniedSinceNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#DeniedSinceInProgress
 * DeniedReason1Code.DeniedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#DeniedSinceRepoEnded
 * DeniedReason1Code.DeniedSinceRepoEnded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#DeniedSinceAlreadySettled
 * DeniedReason1Code.DeniedSinceAlreadySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#InstructionProcessed
 * DeniedReason1Code.InstructionProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code#MarketDeadlineMissed
 * DeniedReason1Code.MarketDeadlineMissed}</li>
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
 * "DeniedReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the denied reason."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DeniedReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code AccountServicerDeadlineMissed = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallDeniedSinceAlreadyApplied"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code CallDeniedSinceAlreadyApplied = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallDeniedSinceAlreadyApplied";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.CallDeniedSinceAlreadyApplied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceAlreadyCancelled"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code DeniedSinceAlreadyCancelled = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceNotAllowed"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code DeniedSinceNotAllowed = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceInProgress"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code DeniedSinceInProgress = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceRepoEnded"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code DeniedSinceRepoEnded = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceRepoEnded";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceRepoEnded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedSinceAlreadySettled"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code DeniedSinceAlreadySettled = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedSinceAlreadySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.DeniedSinceAlreadySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessed"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code InstructionProcessed = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.InstructionProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DeniedReason1Code
	 * DeniedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final DeniedReason1Code MarketDeadlineMissed = new DeniedReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.DeniedReason1Code.mmObject();
			codeName = DeniedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DeniedReason1Code> codesByName = new LinkedHashMap<>();

	protected DeniedReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeniedReason1Code";
				definition = "Specifies the denied reason.";
				trace_lazy = () -> DeniedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeniedReason1Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.DeniedReason1Code.CallDeniedSinceAlreadyApplied,
						com.tools20022.repository.codeset.DeniedReason1Code.DeniedSinceAlreadyCancelled, com.tools20022.repository.codeset.DeniedReason1Code.DeniedSinceNotAllowed,
						com.tools20022.repository.codeset.DeniedReason1Code.DeniedSinceInProgress, com.tools20022.repository.codeset.DeniedReason1Code.DeniedSinceRepoEnded,
						com.tools20022.repository.codeset.DeniedReason1Code.DeniedSinceAlreadySettled, com.tools20022.repository.codeset.DeniedReason1Code.InstructionProcessed,
						com.tools20022.repository.codeset.DeniedReason1Code.MarketDeadlineMissed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(CallDeniedSinceAlreadyApplied.getCodeName().get(), CallDeniedSinceAlreadyApplied);
		codesByName.put(DeniedSinceAlreadyCancelled.getCodeName().get(), DeniedSinceAlreadyCancelled);
		codesByName.put(DeniedSinceNotAllowed.getCodeName().get(), DeniedSinceNotAllowed);
		codesByName.put(DeniedSinceInProgress.getCodeName().get(), DeniedSinceInProgress);
		codesByName.put(DeniedSinceRepoEnded.getCodeName().get(), DeniedSinceRepoEnded);
		codesByName.put(DeniedSinceAlreadySettled.getCodeName().get(), DeniedSinceAlreadySettled);
		codesByName.put(InstructionProcessed.getCodeName().get(), InstructionProcessed);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
	}

	public static DeniedReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DeniedReason1Code[] values() {
		DeniedReason1Code[] values = new DeniedReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DeniedReason1Code> {
		@Override
		public DeniedReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DeniedReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}