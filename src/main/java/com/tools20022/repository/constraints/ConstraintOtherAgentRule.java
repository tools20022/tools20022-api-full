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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.AgentExtension4;
import com.tools20022.repository.msg.PartyIdentificationSD1;

/**
 * This block can only be used to extend new agent block to ISO message.<br>
 * <br>
 * Agent fields in DTCC model are consolidated (factored) in one sequence
 * structure which is qualified by Agent Type. The rationale was the fact that
 * all of the attributes for every agent type are same (name address, telephone,
 * designated contact, etc) ISO model has separated dedicated sequences for each
 * agent type (Issuer Agent block, Drop Agent block, etc). <br>
 * <br>
 * Although DTCC Agent naming convention differs from ISO, most of the
 * DTCC-defined agent types have a corresponding ISO-defined agent types. With
 * the exception of 2. <br>
 * <br>
 * When ISO message is generated and there is a corresponding ISO-defined agent
 * block: that Agent Block details will be populated in ISO message, if there
 * are DTCC-defined elements that need to be extended, they will be extended to
 * that matching agent block. <br>
 * <br>
 * When ISO message is generated and there isn't a corresponding ISO-defined
 * agent block: whole new agent sequence will be generated and extended to the
 * root of the ISO message . Like other Agent blocks in Corporate Action
 * Notification. <br>
 * <br>
 * <br>
 * Translation Rules :<br>
 * DTCC = ISO <br>
 * <br>
 * Event Agent = Issuer Agent<br>
 * Event Agent (Bearer) = Physical Securities Agent<br>
 * Drop Agent = Drop Agent <br>
 * Note: Drop Agent and Drop Agent (Bearer) will not exist on the same event <br>
 * Information Agent = Information Agent<br>
 * Solicitation Agent = Solicitation Agent<br>
 * Remarketing Agent = Reselling Agent<br>
 * Transfer Agent = Registrar<br>
 * Others = Extension<br>
 * Drop Agent (Bearer) = Extesion
 */
public class ConstraintOtherAgentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationSD1
	 * PartyIdentificationSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This block can only be used to extend new agent block to ISO message.\r\n\r\nAgent fields in DTCC model are consolidated (factored) in one sequence structure which is qualified by Agent Type. The rationale was the fact that all of the attributes for every agent type are same (name address, telephone, designated contact, etc)  ISO model  has separated dedicated sequences for each agent type (Issuer Agent block, Drop Agent block, etc). \r\n\r\nAlthough DTCC Agent naming convention differs from ISO, most of the DTCC-defined agent types have a corresponding ISO-defined agent types. With the exception of 2. \r\n\r\nWhen ISO message is generated and there is a corresponding ISO-defined agent block: that Agent Block details will be populated in ISO message, if there are  DTCC-defined elements that need to be extended, they will be extended to that matching agent block.  \r\n\r\nWhen ISO message is generated and there isn't a corresponding ISO-defined agent block: whole new agent sequence will be generated and extended to the root of the ISO message . Like other Agent blocks in Corporate Action Notification. \r\n\r\n\r\nTranslation Rules :\r\nDTCC = ISO \r\n\r\nEvent Agent  = Issuer Agent\r\nEvent Agent (Bearer) = Physical Securities Agent\r\nDrop Agent = Drop Agent \r\nNote: Drop Agent and Drop Agent (Bearer) will not exist on the same event \r\nInformation Agent =  Information Agent\r\nSolicitation Agent =  Solicitation Agent\r\nRemarketing Agent =  Reselling Agent\r\nTransfer Agent = Registrar\r\nOthers = Extension\r\nDrop Agent (Bearer) = Extesion"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentificationSD1> forPartyIdentificationSD1 = new MMConstraint<PartyIdentificationSD1>() {
		{
			validator = ConstraintOtherAgentRule::checkPartyIdentificationSD1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgentRule";
			definition = "This block can only be used to extend new agent block to ISO message.\r\n\r\nAgent fields in DTCC model are consolidated (factored) in one sequence structure which is qualified by Agent Type. The rationale was the fact that all of the attributes for every agent type are same (name address, telephone, designated contact, etc)  ISO model  has separated dedicated sequences for each agent type (Issuer Agent block, Drop Agent block, etc). \r\n\r\nAlthough DTCC Agent naming convention differs from ISO, most of the DTCC-defined agent types have a corresponding ISO-defined agent types. With the exception of 2. \r\n\r\nWhen ISO message is generated and there is a corresponding ISO-defined agent block: that Agent Block details will be populated in ISO message, if there are  DTCC-defined elements that need to be extended, they will be extended to that matching agent block.  \r\n\r\nWhen ISO message is generated and there isn't a corresponding ISO-defined agent block: whole new agent sequence will be generated and extended to the root of the ISO message . Like other Agent blocks in Corporate Action Notification. \r\n\r\n\r\nTranslation Rules :\r\nDTCC = ISO \r\n\r\nEvent Agent  = Issuer Agent\r\nEvent Agent (Bearer) = Physical Securities Agent\r\nDrop Agent = Drop Agent \r\nNote: Drop Agent and Drop Agent (Bearer) will not exist on the same event \r\nInformation Agent =  Information Agent\r\nSolicitation Agent =  Solicitation Agent\r\nRemarketing Agent =  Reselling Agent\r\nTransfer Agent = Registrar\r\nOthers = Extension\r\nDrop Agent (Bearer) = Extesion";
			owner_lazy = () -> PartyIdentificationSD1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AgentExtension4
	 * AgentExtension4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAgentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This block can only be used to extend new agent block to ISO message.\r\n\r\n\r\nAgent fields in DTCC model are consolidated (factored) in one sequence structure which is qualified by Agent Type. The rationale was the fact that all of the attributes for every agent type are same (name address, telephone, designated contact, etc)  ISO model  has separated dedicated sequences for each agent type (Issuer Agent block, Drop Agent block, etc). \r\n\r\nAlthough DTCC Agent naming convention differs from ISO, most of the DTCC-defined agent types have a corresponding ISO-defined agent types. With the exception of 2. \r\n\r\nWhen ISO message is generated and there is a corresponding ISO-defined agent block: that Agent Block details will be populated in ISO message, if there are  DTCC-defined elements that need to be extended, they will be extended to that matching agent block.  \r\n\r\nWhen ISO message is generated and there isn't a corresponding ISO-defined agent block: whole new agent sequence will be generated and extended to the root of the ISO message . Like other Agent blocks in Corporate Action Notification. \r\n\r\n\r\nTranslation Rules :\r\nDTCC = ISO \r\n\r\nEvent Agent  = Issuer Agent\r\nEvent Agent (Bearer) = Physical Securities Agent\r\nDrop Agent = Drop Agent \r\nNote: Drop Agent and Drop Agent (Bearer) will not exist on the same event \r\nInformation Agent =  Information Agent\r\nSolicitation Agent =  Solicitation Agent\r\nRemarketing Agent =  Reselling Agent\r\nTransfer Agent = Registrar\r\nOthers = Extension\r\nDrop Agent (Bearer) = Extesion"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AgentExtension4> forAgentExtension4 = new MMConstraint<AgentExtension4>() {
		{
			validator = ConstraintOtherAgentRule::checkAgentExtension4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAgentRule";
			definition = "This block can only be used to extend new agent block to ISO message.\r\n\r\n\r\nAgent fields in DTCC model are consolidated (factored) in one sequence structure which is qualified by Agent Type. The rationale was the fact that all of the attributes for every agent type are same (name address, telephone, designated contact, etc)  ISO model  has separated dedicated sequences for each agent type (Issuer Agent block, Drop Agent block, etc). \r\n\r\nAlthough DTCC Agent naming convention differs from ISO, most of the DTCC-defined agent types have a corresponding ISO-defined agent types. With the exception of 2. \r\n\r\nWhen ISO message is generated and there is a corresponding ISO-defined agent block: that Agent Block details will be populated in ISO message, if there are  DTCC-defined elements that need to be extended, they will be extended to that matching agent block.  \r\n\r\nWhen ISO message is generated and there isn't a corresponding ISO-defined agent block: whole new agent sequence will be generated and extended to the root of the ISO message . Like other Agent blocks in Corporate Action Notification. \r\n\r\n\r\nTranslation Rules :\r\nDTCC = ISO \r\n\r\nEvent Agent  = Issuer Agent\r\nEvent Agent (Bearer) = Physical Securities Agent\r\nDrop Agent = Drop Agent \r\nNote: Drop Agent and Drop Agent (Bearer) will not exist on the same event \r\nInformation Agent =  Information Agent\r\nSolicitation Agent =  Solicitation Agent\r\nRemarketing Agent =  Reselling Agent\r\nTransfer Agent = Registrar\r\nOthers = Extension\r\nDrop Agent (Bearer) = Extesion";
			owner_lazy = () -> AgentExtension4.mmObject();
		}
	};

	/**
	 * This block can only be used to extend new agent block to ISO message.<br>
	 * <br>
	 * Agent fields in DTCC model are consolidated (factored) in one sequence
	 * structure which is qualified by Agent Type. The rationale was the fact
	 * that all of the attributes for every agent type are same (name address,
	 * telephone, designated contact, etc) ISO model has separated dedicated
	 * sequences for each agent type (Issuer Agent block, Drop Agent block,
	 * etc). <br>
	 * <br>
	 * Although DTCC Agent naming convention differs from ISO, most of the
	 * DTCC-defined agent types have a corresponding ISO-defined agent types.
	 * With the exception of 2. <br>
	 * <br>
	 * When ISO message is generated and there is a corresponding ISO-defined
	 * agent block: that Agent Block details will be populated in ISO message,
	 * if there are DTCC-defined elements that need to be extended, they will be
	 * extended to that matching agent block. <br>
	 * <br>
	 * When ISO message is generated and there isn't a corresponding ISO-defined
	 * agent block: whole new agent sequence will be generated and extended to
	 * the root of the ISO message . Like other Agent blocks in Corporate Action
	 * Notification. <br>
	 * <br>
	 * <br>
	 * Translation Rules :<br>
	 * DTCC = ISO <br>
	 * <br>
	 * Event Agent = Issuer Agent<br>
	 * Event Agent (Bearer) = Physical Securities Agent<br>
	 * Drop Agent = Drop Agent <br>
	 * Note: Drop Agent and Drop Agent (Bearer) will not exist on the same event <br>
	 * Information Agent = Information Agent<br>
	 * Solicitation Agent = Solicitation Agent<br>
	 * Remarketing Agent = Reselling Agent<br>
	 * Transfer Agent = Registrar<br>
	 * Others = Extension<br>
	 * Drop Agent (Bearer) = Extesion
	 */
	public static void checkPartyIdentificationSD1(PartyIdentificationSD1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * This block can only be used to extend new agent block to ISO message.<br>
	 * <br>
	 * <br>
	 * Agent fields in DTCC model are consolidated (factored) in one sequence
	 * structure which is qualified by Agent Type. The rationale was the fact
	 * that all of the attributes for every agent type are same (name address,
	 * telephone, designated contact, etc) ISO model has separated dedicated
	 * sequences for each agent type (Issuer Agent block, Drop Agent block,
	 * etc). <br>
	 * <br>
	 * Although DTCC Agent naming convention differs from ISO, most of the
	 * DTCC-defined agent types have a corresponding ISO-defined agent types.
	 * With the exception of 2. <br>
	 * <br>
	 * When ISO message is generated and there is a corresponding ISO-defined
	 * agent block: that Agent Block details will be populated in ISO message,
	 * if there are DTCC-defined elements that need to be extended, they will be
	 * extended to that matching agent block. <br>
	 * <br>
	 * When ISO message is generated and there isn't a corresponding ISO-defined
	 * agent block: whole new agent sequence will be generated and extended to
	 * the root of the ISO message . Like other Agent blocks in Corporate Action
	 * Notification. <br>
	 * <br>
	 * <br>
	 * Translation Rules :<br>
	 * DTCC = ISO <br>
	 * <br>
	 * Event Agent = Issuer Agent<br>
	 * Event Agent (Bearer) = Physical Securities Agent<br>
	 * Drop Agent = Drop Agent <br>
	 * Note: Drop Agent and Drop Agent (Bearer) will not exist on the same event <br>
	 * Information Agent = Information Agent<br>
	 * Solicitation Agent = Solicitation Agent<br>
	 * Remarketing Agent = Reselling Agent<br>
	 * Transfer Agent = Registrar<br>
	 * Others = Extension<br>
	 * Drop Agent (Bearer) = Extesion
	 */
	public static void checkAgentExtension4(AgentExtension4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}