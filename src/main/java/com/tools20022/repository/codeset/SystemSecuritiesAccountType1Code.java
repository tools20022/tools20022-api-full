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
import com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Lists the type of the securities account specific for a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountTypeCode
 * SystemSecuritiesAccountTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code#mmCSDParticipantAccount
 * SystemSecuritiesAccountType1Code.mmCSDParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code#mmCSDMirrorAccount
 * SystemSecuritiesAccountType1Code.mmCSDMirrorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code#mmInterCSDAccount
 * SystemSecuritiesAccountType1Code.mmInterCSDAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code#mmTechnicalOffsetAccount
 * SystemSecuritiesAccountType1Code.mmTechnicalOffsetAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code#mmCSDOmnibusAccount
 * SystemSecuritiesAccountType1Code.mmCSDOmnibusAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code#mmIssuanceAccount
 * SystemSecuritiesAccountType1Code.mmIssuanceAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CSDP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemSecuritiesAccountType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Lists the type of the securities account specific for a system."</li>
 * </ul>
 */
public class SystemSecuritiesAccountType1Code extends SystemSecuritiesAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDParticipantAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmCSDParticipantAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			owner_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDMirrorAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmCSDMirrorAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			owner_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCSDAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmInterCSDAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			owner_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalOffsetAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmTechnicalOffsetAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			owner_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOmnibusAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmCSDOmnibusAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			owner_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemSecuritiesAccountType1Code
	 * SystemSecuritiesAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmIssuanceAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			owner_lazy = () -> SystemSecuritiesAccountType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CSDP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemSecuritiesAccountType1Code";
				definition = "Lists the type of the securities account specific for a system.";
				code_lazy = () -> Arrays.asList(SystemSecuritiesAccountType1Code.mmCSDParticipantAccount, SystemSecuritiesAccountType1Code.mmCSDMirrorAccount, SystemSecuritiesAccountType1Code.mmInterCSDAccount,
						SystemSecuritiesAccountType1Code.mmTechnicalOffsetAccount, SystemSecuritiesAccountType1Code.mmCSDOmnibusAccount, SystemSecuritiesAccountType1Code.mmIssuanceAccount);
				trace_lazy = () -> SystemSecuritiesAccountTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}