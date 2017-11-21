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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of the agent acting as main paying agent or sub paying agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmSystemPayingAgent
 * AgentRoleCode.mmSystemPayingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmCoDomicile
 * AgentRoleCode.mmCoDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmPrincipalAgent
 * AgentRoleCode.mmPrincipalAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmSubAgent
 * AgentRoleCode.mmSubAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmIssuerAgent
 * AgentRoleCode.mmIssuerAgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmRegistrar
 * AgentRoleCode.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode#mmPayingAgent
 * AgentRoleCode.mmPayingAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRole1Code
 * AgentRole1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AgentRole2Code
 * AgentRole2Code}</li>
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
 * <li>"SPAY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentRoleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of the agent acting as main paying agent or sub paying agent."
 * </li>
 * </ul>
 */
public class AgentRoleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The System Paying Agent (SPA) is the party within the CSD that is
	 * responsible for the distribution of cash and security proceeds related to
	 * a specific distribution to other CSD Parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The System Paying Agent (SPA) is the party within the CSD that is responsible for the distribution of cash and security proceeds related to a specific distribution to other CSD Parties."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSystemPayingAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemPayingAgent";
			definition = "The System Paying Agent (SPA) is the party within the CSD that is responsible for the distribution of cash and security proceeds related to a specific distribution to other CSD Parties.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "SPAY";
		}
	};
	/**
	 * Sub-agent appointed to execute the payment for the corporate action event
	 * on behalf of the issuer company/offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CODO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoDomicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCoDomicile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoDomicile";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "CODO";
		}
	};
	/**
	 * Identification of the agent acting as main agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the agent acting as main agent."</li>
	 * </ul>
	 */
	public static final MMCode mmPrincipalAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAgent";
			definition = "Identification of the agent acting as main agent.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "PRIN";
		}
	};
	/**
	 * Identification of the agent acting as co-domicile or sub agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the agent acting as co-domicile or sub agent."</li>
	 * </ul>
	 */
	public static final MMCode mmSubAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAgent";
			definition = "Identification of the agent acting as co-domicile or sub agent.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "SUBA";
		}
	};
	/**
	 * Party appointed to administer the event on behalf of the issuer
	 * company/offeror. The party may be contacted for more information about
	 * the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "ISAG";
		}
	};
	/**
	 * Party/agent responsible for maintaining the register of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * </ul>
	 */
	public static final MMCode mmRegistrar = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "REGR";
		}
	};
	/**
	 * Agent (principal or fiscal paying agent) appointed to execute the payment
	 * for the corporate action event on behalf of the issuer company/offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPayingAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			owner_lazy = () -> AgentRoleCode.mmObject();
			codeName = "PAYA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SPAY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentRoleCode";
				definition = "Identification of the agent acting as main paying agent or sub paying agent.";
				code_lazy = () -> Arrays.asList(AgentRoleCode.mmSystemPayingAgent, AgentRoleCode.mmCoDomicile, AgentRoleCode.mmPrincipalAgent, AgentRoleCode.mmSubAgent, AgentRoleCode.mmIssuerAgent, AgentRoleCode.mmRegistrar,
						AgentRoleCode.mmPayingAgent);
				derivation_lazy = () -> Arrays.asList(AgentRole1Code.mmObject(), AgentRole2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}