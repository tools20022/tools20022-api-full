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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AccountPartyRole;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5#mmRole
 * Intermediary5.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5#mmExtendedRole
 * Intermediary5.mmExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmRole
 * Intermediary12.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmExtendedRole
 * Intermediary12.mmExtendedRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary1#mmRole
 * Intermediary1.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#mmIntermediary
 * InvestmentAccount19.mmIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6#mmRole
 * Intermediary6.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6#mmExtendedRole
 * Intermediary6.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmIntermediary
 * InvestmentAccount29.mmIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13#mmRole
 * Intermediary13.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13#mmExtendedRole
 * Intermediary13.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmIntermediaryInformation
 * InvestmentAccount10.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount11#mmIntermediaryInformation
 * InvestmentAccount11.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmRole
 * Intermediary11.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmExtendedRole
 * Intermediary11.mmExtendedRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmIntermediaryInformation
 * InvestmentAccount22.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount24#mmIntermediaryInformation
 * InvestmentAccount24.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary2#mmRole
 * Intermediary2.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary3#mmRole
 * Intermediary3.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1#mmIntermediaryInformation
 * SafekeepingAccount1.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2#mmIntermediaryInformation
 * SafekeepingAccount2.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary21#mmRole
 * Intermediary21.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary23#mmRole
 * Intermediary23.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary22#mmRole
 * Intermediary22.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount12#mmIntermediaryInformation
 * InvestmentAccount12.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount25#mmIntermediaryInformation
 * InvestmentAccount25.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary17#mmRoleType
 * Intermediary17.mmRoleType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary18#mmRole
 * Intermediary18.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmIntermediaryInformation
 * InvestmentAccount40.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount41#mmIntermediaryInformation
 * InvestmentAccount41.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount43#mmIntermediaryInformation
 * InvestmentAccount43.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmIntermediary
 * InvestmentAccount44.mmIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingAccount5#mmAgent
 * SafekeepingAccount5.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel1#mmAgent
 * AccountSubLevel1.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary28#mmRole
 * Intermediary28.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel4#mmAgent
 * AccountSubLevel4.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel5#mmAgentCode
 * AccountSubLevel5.mmAgentCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel2#mmAgent
 * AccountSubLevel2.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel3#mmAgent
 * AccountSubLevel3.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel6#mmAgent
 * AccountSubLevel6.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel7#mmAgent
 * AccountSubLevel7.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel8#mmAgent
 * AccountSubLevel8.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountSubLevel9#mmAgent
 * AccountSubLevel9.mmAgent}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32#mmRole
 * Intermediary32.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmIntermediaryInformation
 * InvestmentAccount54.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmIntermediaryInformation
 * ReceiveInformation17.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmIntermediaryInformation
 * ReceiveInformation16.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmIntermediaryInformation
 * InvestmentAccount56.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmIntermediaryInformation
 * DeliverInformation16.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmIntermediaryInformation
 * DeliverInformation17.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmIntermediary
 * InvestmentAccount52.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmIntermediaryInformation
 * InvestmentAccount57.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Intermediary37#mmRole
 * Intermediary37.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3#mmAgent
 * AggregateHoldingBalance3.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#mmIntermediary
 * InvestmentAccount64.mmIntermediary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntermediaryRole";
				definition = "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders.";
				derivationElement_lazy = () -> Arrays.asList(Intermediary5.mmRole, Intermediary5.mmExtendedRole, Intermediary12.mmRole, Intermediary12.mmExtendedRole, Intermediary1.mmRole, InvestmentAccount19.mmIntermediary,
						Intermediary6.mmRole, Intermediary6.mmExtendedRole, InvestmentAccount29.mmIntermediary, Intermediary13.mmRole, Intermediary13.mmExtendedRole, InvestmentAccount10.mmIntermediaryInformation,
						InvestmentAccount11.mmIntermediaryInformation, Intermediary11.mmRole, Intermediary11.mmExtendedRole, InvestmentAccount22.mmIntermediaryInformation, InvestmentAccount24.mmIntermediaryInformation,
						Intermediary2.mmRole, Intermediary3.mmRole, SafekeepingAccount1.mmIntermediaryInformation, SafekeepingAccount2.mmIntermediaryInformation, Intermediary21.mmRole, Intermediary23.mmRole, Intermediary22.mmRole,
						InvestmentAccount12.mmIntermediaryInformation, InvestmentAccount25.mmIntermediaryInformation, Intermediary17.mmRoleType, Intermediary18.mmRole, InvestmentAccount40.mmIntermediaryInformation,
						InvestmentAccount41.mmIntermediaryInformation, InvestmentAccount43.mmIntermediaryInformation, InvestmentAccount44.mmIntermediary, SafekeepingAccount5.mmAgent, AccountSubLevel1.mmAgent, Intermediary28.mmRole,
						AccountSubLevel4.mmAgent, AccountSubLevel5.mmAgentCode, AccountSubLevel2.mmAgent, AccountSubLevel3.mmAgent, AccountSubLevel6.mmAgent, AccountSubLevel7.mmAgent, AccountSubLevel8.mmAgent, AccountSubLevel9.mmAgent,
						Intermediary32.mmRole, InvestmentAccount54.mmIntermediaryInformation, ReceiveInformation17.mmIntermediaryInformation, ReceiveInformation16.mmIntermediaryInformation, InvestmentAccount56.mmIntermediaryInformation,
						DeliverInformation16.mmIntermediaryInformation, DeliverInformation17.mmIntermediaryInformation, InvestmentAccount52.mmIntermediary, InvestmentAccount57.mmIntermediaryInformation, Intermediary37.mmRole,
						AggregateHoldingBalance3.mmAgent, InvestmentAccount64.mmIntermediary);
				superType_lazy = () -> AccountPartyRole.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Intermediary5.mmObject(), Intermediary12.mmObject(), Intermediary1.mmObject(), Intermediary7.mmObject(), Intermediary6.mmObject(), Intermediary13.mmObject(),
						Intermediary11.mmObject(), Intermediary2.mmObject(), Intermediary3.mmObject(), Intermediary21.mmObject(), Intermediary23.mmObject(), Intermediary22.mmObject(), Intermediary17.mmObject(), Intermediary18.mmObject(),
						Intermediary24.mmObject(), Intermediary26.mmObject(), Intermediary25.mmObject(), Intermediary27.mmObject(), Intermediary28.mmObject(), Intermediary32.mmObject(), Intermediary36.mmObject(), Intermediary34.mmObject(),
						Intermediary33.mmObject(), Intermediary35.mmObject(), Intermediary37.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return IntermediaryRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}