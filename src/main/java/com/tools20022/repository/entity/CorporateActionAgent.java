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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.AgentRole1FormatChoice;
import com.tools20022.repository.codeset.AgentRoleCode;
import com.tools20022.repository.entity.CorporateActionPartyRole;
import com.tools20022.repository.msg.CorporateActionAgent1;
import com.tools20022.repository.msg.IssuerAgent1;
import com.tools20022.repository.msg.IssuerAgent2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A firm authorised to act as an intermediary between issuer and shareholders.
 * It takes care of the needs of the shareholders such as reporting, inquiries
 * and regulatory compliance.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionAgent" src="doc-files/CorporateActionAgent.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionAgent#AgentRole
 * CorporateActionAgent.AgentRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#CorporateActionOtherAgentDetails
 * CorporateActionOption1.CorporateActionOtherAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
 * CorporateActionPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerAgent1 IssuerAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AgentRole1FormatChoice
 * AgentRole1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionAgent1
 * CorporateActionAgent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IssuerAgent2 IssuerAgent2}</li>
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
 * "CorporateActionAgent"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A firm authorised to act as an intermediary between issuer and shareholders. It takes care of the needs of the shareholders such as reporting, inquiries and regulatory compliance."
 * </li>
 * </ul>
 */
public class CorporateActionAgent extends CorporateActionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the agent role played by a party in a corporate action process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AgentRoleCode
	 * AgentRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.IssuerAgent1#Role
	 * IssuerAgent1.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AgentRole1FormatChoice#Code
	 * AgentRole1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AgentRole1FormatChoice#Proprietary
	 * AgentRole1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAgent1#AgentRole
	 * CorporateActionAgent1.AgentRole}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IssuerAgent2#Role
	 * IssuerAgent2.Role}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionAgent
	 * CorporateActionAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the agent role played by a party in a corporate action process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AgentRole = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IssuerAgent1.Role, com.tools20022.repository.choice.AgentRole1FormatChoice.Code, com.tools20022.repository.choice.AgentRole1FormatChoice.Proprietary,
					com.tools20022.repository.msg.CorporateActionAgent1.AgentRole, com.tools20022.repository.msg.IssuerAgent2.Role);
			elementContext_lazy = () -> CorporateActionAgent.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgentRole";
			definition = "Specifies the agent role played by a party in a corporate action process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AgentRoleCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionAgent";
				definition = "A firm authorised to act as an intermediary between issuer and shareholders. It takes care of the needs of the shareholders such as reporting, inquiries and regulatory compliance.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption1.CorporateActionOtherAgentDetails);
				superType_lazy = () -> CorporateActionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionAgent.AgentRole);
				derivationComponent_lazy = () -> Arrays.asList(IssuerAgent1.mmObject(), AgentRole1FormatChoice.mmObject(), CorporateActionAgent1.mmObject(), IssuerAgent2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}