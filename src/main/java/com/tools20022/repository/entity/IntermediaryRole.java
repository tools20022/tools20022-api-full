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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that provides services relating to financial products to investors, for
 * example, advice on products and placement of orders.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IntermediaryRole" src="doc-files/IntermediaryRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5#Role
 * Intermediary5.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5#ExtendedRole
 * Intermediary5.ExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#Role
 * Intermediary12.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#ExtendedRole
 * Intermediary12.ExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary1#Role
 * Intermediary1.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#Intermediary
 * InvestmentAccount19.Intermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6#Role
 * Intermediary6.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6#ExtendedRole
 * Intermediary6.ExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#Intermediary
 * InvestmentAccount29.Intermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13#Role
 * Intermediary13.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13#ExtendedRole
 * Intermediary13.ExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#IntermediaryInformation
 * InvestmentAccount10.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#IntermediaryInformation
 * InvestmentAccount11.IntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#Role
 * Intermediary11.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#ExtendedRole
 * Intermediary11.ExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#IntermediaryInformation
 * InvestmentAccount22.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#IntermediaryInformation
 * InvestmentAccount24.IntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary2#Role
 * Intermediary2.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary3#Role
 * Intermediary3.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#IntermediaryInformation
 * SafekeepingAccount1.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#IntermediaryInformation
 * SafekeepingAccount2.IntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary21#Role
 * Intermediary21.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary23#Role
 * Intermediary23.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary22#Role
 * Intermediary22.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount12#IntermediaryInformation
 * InvestmentAccount12.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount25#IntermediaryInformation
 * InvestmentAccount25.IntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary17#RoleType
 * Intermediary17.RoleType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary18#Role
 * Intermediary18.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#IntermediaryInformation
 * InvestmentAccount40.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#IntermediaryInformation
 * InvestmentAccount41.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#IntermediaryInformation
 * InvestmentAccount43.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#Intermediary
 * InvestmentAccount44.Intermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount5#Agent
 * SafekeepingAccount5.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel1#Agent
 * AccountSubLevel1.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary28#Role
 * Intermediary28.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel4#Agent
 * AccountSubLevel4.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel5#AgentCode
 * AccountSubLevel5.AgentCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel2#Agent
 * AccountSubLevel2.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel3#Agent
 * AccountSubLevel3.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel6#Agent
 * AccountSubLevel6.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel7#Agent
 * AccountSubLevel7.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel8#Agent
 * AccountSubLevel8.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel9#Agent
 * AccountSubLevel9.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32#Role
 * Intermediary32.Role}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#IntermediaryInformation
 * InvestmentAccount54.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#IntermediaryInformation
 * ReceiveInformation17.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#IntermediaryInformation
 * ReceiveInformation16.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#IntermediaryInformation
 * InvestmentAccount56.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#IntermediaryInformation
 * DeliverInformation16.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#IntermediaryInformation
 * DeliverInformation17.IntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#Intermediary
 * InvestmentAccount52.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#IntermediaryInformation
 * InvestmentAccount57.IntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary37#Role
 * Intermediary37.Role}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3#Agent
 * AggregateHoldingBalance3.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#Intermediary
 * InvestmentAccount64.Intermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5 Intermediary5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12 Intermediary12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary1 Intermediary1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary7 Intermediary7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6 Intermediary6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13 Intermediary13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11 Intermediary11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary2 Intermediary2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary3 Intermediary3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary21 Intermediary21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary23 Intermediary23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary22 Intermediary22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary17 Intermediary17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary18 Intermediary18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary24 Intermediary24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary26 Intermediary26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary25 Intermediary25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27 Intermediary27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary28 Intermediary28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32 Intermediary32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36 Intermediary36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary34 Intermediary34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary33 Intermediary33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35 Intermediary35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary37 Intermediary37}</li>
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
 * "IntermediaryRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders."
 * </li>
 * </ul>
 */
public class IntermediaryRole extends AccountPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IntermediaryRole";
				definition = "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary5.Role, com.tools20022.repository.msg.Intermediary5.ExtendedRole, com.tools20022.repository.msg.Intermediary12.Role,
						com.tools20022.repository.msg.Intermediary12.ExtendedRole, com.tools20022.repository.msg.Intermediary1.Role, com.tools20022.repository.msg.InvestmentAccount19.Intermediary,
						com.tools20022.repository.msg.Intermediary6.Role, com.tools20022.repository.msg.Intermediary6.ExtendedRole, com.tools20022.repository.msg.InvestmentAccount29.Intermediary,
						com.tools20022.repository.msg.Intermediary13.Role, com.tools20022.repository.msg.Intermediary13.ExtendedRole, com.tools20022.repository.msg.InvestmentAccount10.IntermediaryInformation,
						com.tools20022.repository.msg.InvestmentAccount11.IntermediaryInformation, com.tools20022.repository.msg.Intermediary11.Role, com.tools20022.repository.msg.Intermediary11.ExtendedRole,
						com.tools20022.repository.msg.InvestmentAccount22.IntermediaryInformation, com.tools20022.repository.msg.InvestmentAccount24.IntermediaryInformation, com.tools20022.repository.msg.Intermediary2.Role,
						com.tools20022.repository.msg.Intermediary3.Role, com.tools20022.repository.msg.SafekeepingAccount1.IntermediaryInformation, com.tools20022.repository.msg.SafekeepingAccount2.IntermediaryInformation,
						com.tools20022.repository.msg.Intermediary21.Role, com.tools20022.repository.msg.Intermediary23.Role, com.tools20022.repository.msg.Intermediary22.Role,
						com.tools20022.repository.msg.InvestmentAccount12.IntermediaryInformation, com.tools20022.repository.msg.InvestmentAccount25.IntermediaryInformation, com.tools20022.repository.msg.Intermediary17.RoleType,
						com.tools20022.repository.msg.Intermediary18.Role, com.tools20022.repository.msg.InvestmentAccount40.IntermediaryInformation, com.tools20022.repository.msg.InvestmentAccount41.IntermediaryInformation,
						com.tools20022.repository.msg.InvestmentAccount43.IntermediaryInformation, com.tools20022.repository.msg.InvestmentAccount44.Intermediary, com.tools20022.repository.msg.SafekeepingAccount5.Agent,
						com.tools20022.repository.msg.AccountSubLevel1.Agent, com.tools20022.repository.msg.Intermediary28.Role, com.tools20022.repository.msg.AccountSubLevel4.Agent,
						com.tools20022.repository.msg.AccountSubLevel5.AgentCode, com.tools20022.repository.msg.AccountSubLevel2.Agent, com.tools20022.repository.msg.AccountSubLevel3.Agent,
						com.tools20022.repository.msg.AccountSubLevel6.Agent, com.tools20022.repository.msg.AccountSubLevel7.Agent, com.tools20022.repository.msg.AccountSubLevel8.Agent, com.tools20022.repository.msg.AccountSubLevel9.Agent,
						com.tools20022.repository.msg.Intermediary32.Role, com.tools20022.repository.msg.InvestmentAccount54.IntermediaryInformation, com.tools20022.repository.msg.ReceiveInformation17.IntermediaryInformation,
						com.tools20022.repository.msg.ReceiveInformation16.IntermediaryInformation, com.tools20022.repository.msg.InvestmentAccount56.IntermediaryInformation,
						com.tools20022.repository.msg.DeliverInformation16.IntermediaryInformation, com.tools20022.repository.msg.DeliverInformation17.IntermediaryInformation, com.tools20022.repository.msg.InvestmentAccount52.Intermediary,
						com.tools20022.repository.msg.InvestmentAccount57.IntermediaryInformation, com.tools20022.repository.msg.Intermediary37.Role, com.tools20022.repository.msg.AggregateHoldingBalance3.Agent,
						com.tools20022.repository.msg.InvestmentAccount64.Intermediary);
				superType_lazy = () -> AccountPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Intermediary5.mmObject(), Intermediary12.mmObject(), Intermediary1.mmObject(), Intermediary7.mmObject(), Intermediary6.mmObject(), Intermediary13.mmObject(),
						Intermediary11.mmObject(), Intermediary2.mmObject(), Intermediary3.mmObject(), Intermediary21.mmObject(), Intermediary23.mmObject(), Intermediary22.mmObject(), Intermediary17.mmObject(), Intermediary18.mmObject(),
						Intermediary24.mmObject(), Intermediary26.mmObject(), Intermediary25.mmObject(), Intermediary27.mmObject(), Intermediary28.mmObject(), Intermediary32.mmObject(), Intermediary36.mmObject(), Intermediary34.mmObject(),
						Intermediary33.mmObject(), Intermediary35.mmObject(), Intermediary37.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}