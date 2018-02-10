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
import com.tools20022.repository.codeset.RejectionReason32Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unrecognised or invalid depository.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#SafekeepingAccountRejection
 * RejectionReason32Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#AccountServicerDeadlineMissed
 * RejectionReason32Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#MarketDeadlineMissed
 * RejectionReason32Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#NotFoundRejection
 * RejectionReason32Code.NotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#ReferenceRejection
 * RejectionReason32Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#NoMatch
 * RejectionReason32Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code#Other
 * RejectionReason32Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SAFE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason32Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unrecognised or invalid depository."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason32Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code SafekeepingAccountRejection = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code AccountServicerDeadlineMissed = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code MarketDeadlineMissed = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code NotFoundRejection = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.NotFoundRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code ReferenceRejection = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code NoMatch = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason32Code
	 * RejectionReason32Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RejectionReason32Code Other = new RejectionReason32Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason32Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason32Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason32Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SAFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason32Code";
				definition = "Unrecognised or invalid depository.";
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason32Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason32Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReason32Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason32Code.NotFoundRejection,
						com.tools20022.repository.codeset.RejectionReason32Code.ReferenceRejection, com.tools20022.repository.codeset.RejectionReason32Code.NoMatch, com.tools20022.repository.codeset.RejectionReason32Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(NotFoundRejection.getCodeName().get(), NotFoundRejection);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static RejectionReason32Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason32Code[] values() {
		RejectionReason32Code[] values = new RejectionReason32Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason32Code> {
		@Override
		public RejectionReason32Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason32Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}