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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the investor profile.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#InAnalysis
 * InvestorProfileStatusCode.InAnalysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#PendingApproval
 * InvestorProfileStatusCode.PendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#NotApproved
 * InvestorProfileStatusCode.NotApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#InAdmission
 * InvestorProfileStatusCode.InAdmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#Enabling
 * InvestorProfileStatusCode.Enabling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#Enabled
 * InvestorProfileStatusCode.Enabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#PartiallySuspended
 * InvestorProfileStatusCode.PartiallySuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#Suspended
 * InvestorProfileStatusCode.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#Disabling
 * InvestorProfileStatusCode.Disabling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode#Disabled
 * InvestorProfileStatusCode.Disabled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InvestorProfileStatus1Code
 * InvestorProfileStatus1Code}</li>
 * </ul>
 * </li>
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
 * "InvestorProfileStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the investor profile."</li>
 * </ul>
 */
public class InvestorProfileStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the investor profile is in analysis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InAnalysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is in analysis."</li>
	 * </ul>
	 */
	public static final MMCode InAnalysis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InAnalysis";
			definition = "Status of the investor profile is in analysis.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "ANLY";
		}
	};
	/**
	 * Status of the investor profile is pending approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is pending approval."</li>
	 * </ul>
	 */
	public static final MMCode PendingApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			definition = "Status of the investor profile is pending approval.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Status of the investor profile is not approved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApproved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is not approved."</li>
	 * </ul>
	 */
	public static final MMCode NotApproved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApproved";
			definition = "Status of the investor profile is not approved.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "NAPP";
		}
	};
	/**
	 * Status of the investor profile is in admission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InAdmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is in admission."</li>
	 * </ul>
	 */
	public static final MMCode InAdmission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InAdmission";
			definition = "Status of the investor profile is in admission.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "ADMI";
		}
	};
	/**
	 * Status of the investor profile is in the process of being enabled
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENBG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the investor profile is in the process of being enabled"</li>
	 * </ul>
	 */
	public static final MMCode Enabling = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabling";
			definition = "Status of the investor profile is in the process of being enabled";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "ENBG";
		}
	};
	/**
	 * Status of the investor profile is enabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is enabled."</li>
	 * </ul>
	 */
	public static final MMCode Enabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Status of the investor profile is enabled.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Status of the investor profile is partially suspended .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PSUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is partially suspended ."</li>
	 * </ul>
	 */
	public static final MMCode PartiallySuspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySuspended";
			definition = "Status of the investor profile is partially suspended .";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "PSUS";
		}
	};
	/**
	 * Status of the investor profile is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is suspended."</li>
	 * </ul>
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Status of the investor profile is suspended.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "SUPS";
		}
	};
	/**
	 * Status of the investor profile is in the process of being disabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the investor profile is in the process of being disabled."</li>
	 * </ul>
	 */
	public static final MMCode Disabling = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabling";
			definition = "Status of the investor profile is in the process of being disabled.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "DISG";
		}
	};
	/**
	 * Status of the investor profile is disabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestorProfileStatusCode
	 * InvestorProfileStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the investor profile is disabled."</li>
	 * </ul>
	 */
	public static final MMCode Disabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Status of the investor profile is disabled.";
			owner_lazy = () -> InvestorProfileStatusCode.mmObject();
			codeName = "DISA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestorProfileStatusCode";
				definition = "Specifies the status of the investor profile.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestorProfileStatusCode.InAnalysis, com.tools20022.repository.codeset.InvestorProfileStatusCode.PendingApproval,
						com.tools20022.repository.codeset.InvestorProfileStatusCode.NotApproved, com.tools20022.repository.codeset.InvestorProfileStatusCode.InAdmission, com.tools20022.repository.codeset.InvestorProfileStatusCode.Enabling,
						com.tools20022.repository.codeset.InvestorProfileStatusCode.Enabled, com.tools20022.repository.codeset.InvestorProfileStatusCode.PartiallySuspended,
						com.tools20022.repository.codeset.InvestorProfileStatusCode.Suspended, com.tools20022.repository.codeset.InvestorProfileStatusCode.Disabling, com.tools20022.repository.codeset.InvestorProfileStatusCode.Disabled);
				derivation_lazy = () -> Arrays.asList(InvestorProfileStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}