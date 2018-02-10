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
import com.tools20022.repository.codeset.InvestorProfileStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the investor profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#Disabled
 * InvestorProfileStatus1Code.Disabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#Disabling
 * InvestorProfileStatus1Code.Disabling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#Enabled
 * InvestorProfileStatus1Code.Enabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#Enabling
 * InvestorProfileStatus1Code.Enabling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#InAdmission
 * InvestorProfileStatus1Code.InAdmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#InAnalysis
 * InvestorProfileStatus1Code.InAnalysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#NotApproved
 * InvestorProfileStatus1Code.NotApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#PartiallySuspended
 * InvestorProfileStatus1Code.PartiallySuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#PendingApproval
 * InvestorProfileStatus1Code.PendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code#Suspended
 * InvestorProfileStatus1Code.Suspended}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
 * InvestorProfileStatusCode}</li>
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
 * "InvestorProfileStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the investor profile."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestorProfileStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code Disabled = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.Disabled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabling"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code Disabling = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabling";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.Disabling.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code Enabled = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.Enabled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabling"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code Enabling = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabling";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.Enabling.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InAdmission"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code InAdmission = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InAdmission";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.InAdmission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InAnalysis"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code InAnalysis = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InAnalysis";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.InAnalysis.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApproved"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code NotApproved = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApproved";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.NotApproved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySuspended"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code PartiallySuspended = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySuspended";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.PartiallySuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code PendingApproval = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.PendingApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
	 * InvestorProfileStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * </ul>
	 */
	public static final InvestorProfileStatus1Code Suspended = new InvestorProfileStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestorProfileStatus1Code.mmObject();
			codeName = InvestorProfileStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestorProfileStatus1Code> codesByName = new LinkedHashMap<>();

	protected InvestorProfileStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestorProfileStatus1Code";
				definition = "Specifies the status of the investor profile.";
				trace_lazy = () -> InvestorProfileStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestorProfileStatus1Code.Disabled, com.tools20022.repository.codeset.InvestorProfileStatus1Code.Disabling,
						com.tools20022.repository.codeset.InvestorProfileStatus1Code.Enabled, com.tools20022.repository.codeset.InvestorProfileStatus1Code.Enabling, com.tools20022.repository.codeset.InvestorProfileStatus1Code.InAdmission,
						com.tools20022.repository.codeset.InvestorProfileStatus1Code.InAnalysis, com.tools20022.repository.codeset.InvestorProfileStatus1Code.NotApproved,
						com.tools20022.repository.codeset.InvestorProfileStatus1Code.PartiallySuspended, com.tools20022.repository.codeset.InvestorProfileStatus1Code.PendingApproval,
						com.tools20022.repository.codeset.InvestorProfileStatus1Code.Suspended);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Disabled.getCodeName().get(), Disabled);
		codesByName.put(Disabling.getCodeName().get(), Disabling);
		codesByName.put(Enabled.getCodeName().get(), Enabled);
		codesByName.put(Enabling.getCodeName().get(), Enabling);
		codesByName.put(InAdmission.getCodeName().get(), InAdmission);
		codesByName.put(InAnalysis.getCodeName().get(), InAnalysis);
		codesByName.put(NotApproved.getCodeName().get(), NotApproved);
		codesByName.put(PartiallySuspended.getCodeName().get(), PartiallySuspended);
		codesByName.put(PendingApproval.getCodeName().get(), PendingApproval);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
	}

	public static InvestorProfileStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestorProfileStatus1Code[] values() {
		InvestorProfileStatus1Code[] values = new InvestorProfileStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestorProfileStatus1Code> {
		@Override
		public InvestorProfileStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestorProfileStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}