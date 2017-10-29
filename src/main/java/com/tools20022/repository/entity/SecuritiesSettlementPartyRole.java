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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlingCapacityCode;
import com.tools20022.repository.codeset.TaxLiabilityCode;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of the settlement of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlementPartyRole"
 * src="doc-files/SecuritiesSettlementPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlement
 * SecuritiesSettlementPartyRole.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlementSystem
 * SecuritiesSettlementPartyRole.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SettlingCapacity
 * SecuritiesSettlementPartyRole.SettlingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#TaxCapacity
 * SecuritiesSettlementPartyRole.TaxCapacity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PartyRole
 * SecuritiesSettlement.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#SettlementParty
 * SecuritiesSettlementSystem.SettlementParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#Party1
 * ReceivingPartiesAndAccount7.Party1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#Party2
 * ReceivingPartiesAndAccount7.Party2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#Depository
 * SettlementParties32.Depository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#Party1
 * SettlementParties32.Party1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#Party2
 * SettlementParties32.Party2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#Party3
 * SettlementParties32.Party3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#Party4
 * SettlementParties32.Party4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32#Party5
 * SettlementParties32.Party5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10#Party1
 * ReceivingPartiesAndAccount10.Party1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10#Party2
 * ReceivingPartiesAndAccount10.Party2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#Party1
 * ReceivingPartiesAndAccount11.Party1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#Party2
 * ReceivingPartiesAndAccount11.Party2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#SettlementPartiesDetails
 * InvestmentAccount54.SettlementPartiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#Party1
 * ReceivingPartiesAndAccount15.Party1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15#Party2
 * ReceivingPartiesAndAccount15.Party2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
 * ReceivingSettlementParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
 * DeliveringSettlementParty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingAgent
 * ReceivingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalSettlementAgentRole
 * LocalSettlementAgentRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliverersCustodian
 * DeliverersCustodian}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliverersIntermediary
 * DeliverersIntermediary}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringAgent
 * DeliveringAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PlaceOfSettlement
 * PlaceOfSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReceiversCustodian
 * ReceiversCustodian}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReceiversIntermediary
 * ReceiversIntermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount1
 * DeliveringPartiesAndAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount4
 * DeliveringPartiesAndAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8
 * DeliveringPartiesAndAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
 * ReceivingPartiesAndAccount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4
 * ReceivingPartiesAndAccount4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
 * ReceivingPartiesAndAccount8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties2
 * SettlementParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties13
 * SettlementParties13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice
 * TaxCapacityParty1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties5
 * SettlementParties5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties11
 * SettlementParties11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties26
 * SettlementParties26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties12
 * SettlementParties12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties19
 * SettlementParties19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties21
 * SettlementParties21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice
 * TaxCapacityParty2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties18
 * SettlementParties18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties27
 * SettlementParties27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties4
 * SettlementParties4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties8
 * SettlementParties8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties15
 * SettlementParties15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties16
 * SettlementParties16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties24
 * SettlementParties24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties28
 * SettlementParties28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties7
 * SettlementParties7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties10
 * SettlementParties10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties17
 * SettlementParties17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties6
 * SettlementParties6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties3
 * SettlementParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties23
 * SettlementParties23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice
 * TaxCapacityParty3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3
 * ReceivingPartiesAndAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount3
 * DeliveringPartiesAndAccount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14
 * SettlementParties14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties20
 * SettlementParties20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties22
 * SettlementParties22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount5
 * DeliveringPartiesAndAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount6
 * ReceivingPartiesAndAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7
 * DeliveringPartiesAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7
 * ReceivingPartiesAndAccount7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties2Choice
 * SettlementParties2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount6
 * DeliveringPartiesAndAccount6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount5
 * ReceivingPartiesAndAccount5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9
 * ReceivingPartiesAndAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
 * DeliveringPartiesAndAccount9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties32
 * SettlementParties32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount10
 * DeliveringPartiesAndAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount10
 * ReceivingPartiesAndAccount10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties3Choice
 * SettlementParties3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11
 * ReceivingPartiesAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11
 * DeliveringPartiesAndAccount11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties4Choice
 * SettlementParties4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties36
 * SettlementParties36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties39
 * SettlementParties39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties40
 * SettlementParties40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice
 * TaxCapacityParty4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties42
 * SettlementParties42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
 * DeliveringPartiesAndAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
 * DeliveringPartiesAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14
 * ReceivingPartiesAndAccount14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
 * ReceivingPartiesAndAccount13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties5Choice
 * SettlementParties5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount15
 * ReceivingPartiesAndAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount15
 * DeliveringPartiesAndAccount15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties43
 * SettlementParties43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties44
 * SettlementParties44}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCapacityParty5Choice
 * TaxCapacityParty5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties49
 * SettlementParties49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties58
 * SettlementParties58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
 * ReceivingPartiesAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
 * DeliveringPartiesAndAccount16}</li>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementParties7Choice
 * SettlementParties7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties61
 * SettlementParties61}</li>
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
 * "SecuritiesSettlementPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Role played by a party in the context of the settlement of securities."</li>
 * </ul>
 */
public class SecuritiesSettlementPartyRole extends SettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the settlement process in which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PartyRole
	 * SecuritiesSettlement.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement process in which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement process in which a party plays a role.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the system which may be used by a party in a settlement
	 * process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#SettlementParty
	 * SecuritiesSettlementSystem.SettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which may be used by a party in a settlement process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlementSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Specifies the system which may be used by a party in a settlement process.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.SettlementParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role of a party in the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlingCapacityCode
	 * SettlingCapacityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#SettlingCapacity
	 * SettlementDetails50.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#SettlingCapacity
	 * SettlementDetails51.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#SettlingCapacity
	 * SettlementDetails9.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#SettlingCapacity
	 * SettlementDetails17.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#SettlingCapacity
	 * SettlementDetails30.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#SettlingCapacity
	 * SettlementDetails32.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#SettlingCapacity
	 * SettlementDetails60.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#SettlingCapacity
	 * SettlementDetails64.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#SettlingCapacity
	 * SettlementDetails3.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#SettlingCapacity
	 * SettlementDetails16.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#SettlingCapacity
	 * SettlementDetails31.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#SettlingCapacity
	 * SettlementDetails40.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#SettlingCapacity
	 * SettlementDetails62.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#SettlingCapacity
	 * SettlementDetails63.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#SettlingCapacity
	 * SettlementDetails6.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#SettlingCapacity
	 * SettlementDetails20.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#SettlingCapacity
	 * SettlementDetails24.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#SettlingCapacity
	 * SettlementDetails33.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#SettlingCapacity
	 * SettlementDetails45.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#SettlingCapacity
	 * SettlementDetails54.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#SettlingCapacity
	 * SettlementDetails1.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#SettlingCapacity
	 * SettlementDetails19.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#SettlingCapacity
	 * SettlementDetails22.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#SettlingCapacity
	 * SettlementDetails35.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#SettlingCapacity
	 * SettlementDetails42.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#SettlingCapacity
	 * SettlementDetails52.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#SettlingCapacity
	 * SettlementDetails8.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#SettlingCapacity
	 * SettlementDetails11.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#SettlingCapacity
	 * SettlementDetails23.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#SettlingCapacity
	 * SettlementDetails37.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#SettlingCapacity
	 * SettlementDetails44.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#SettlingCapacity
	 * SettlementDetails53.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#SettlingCapacity
	 * SettlementDetails7.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#SettlingCapacity
	 * SettlementDetails12.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#SettlingCapacity
	 * SettlementDetails28.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#SettlingCapacity
	 * SettlementDetails38.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#SettlingCapacity
	 * SettlementDetails47.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#SettlingCapacity
	 * SettlementDetails56.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#SettlingCapacity
	 * SettlementDetails2.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#SettlingCapacity
	 * SettlementDetails13.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#SettlingCapacity
	 * SettlementDetails27.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#SettlingCapacity
	 * SettlementDetails39.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#SettlingCapacity
	 * SettlementDetails48.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#SettlingCapacity
	 * SettlementDetails57.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#SettlingCapacity
	 * SettlementDetails43.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#SettlingCapacity
	 * SettlementDetails10.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#SettlingCapacity
	 * SettlementDetails29.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#SettlingCapacity
	 * SettlementDetails5.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#SettlingCapacity
	 * SettlementDetails26.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#SettlingCapacity
	 * SettlementDetails65.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#SettlingCapacity
	 * SettlementDetails14.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#SettlingCapacity
	 * SettlementDetails41.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#SettlingCapacity
	 * SettlementDetails61.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#SettlingCapacity
	 * SettlementDetails59.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#SettlingCapacity
	 * SettlementDetails15.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#SettlingCapacity
	 * SettlementDetails36.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#SettlingCapacity
	 * SettlementDetails66.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#SettlingCapacity
	 * SettlementDetails67.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#SettlingCapacity
	 * SettlementDetails70.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#SettlingCapacity
	 * SettlementDetails68.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#SettlingCapacity
	 * SettlementDetails69.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#SettlingCapacity
	 * SettlementDetails71.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#SettlingCapacity
	 * SettlementDetails72.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#SettlingCapacity
	 * SettlementDetails75.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#SettlingCapacity
	 * SettlementDetails73.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#SettlingCapacity
	 * SettlementDetails74.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#SettlingCapacity
	 * SettlementDetails81.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#SettlingCapacity
	 * SettlementDetails76.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#SettlingCapacity
	 * SettlementDetails80.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#SettlingCapacity
	 * SettlementDetails78.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#SettlingCapacity
	 * SettlementDetails77.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#SettlingCapacity
	 * SettlementDetails79.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#SettlingCapacity
	 * SettlementDetails87.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#SettlingCapacity
	 * SettlementDetails83.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#SettlingCapacity
	 * SettlementDetails86.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#SettlingCapacity
	 * SettlementDetails85.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#SettlingCapacity
	 * SettlementDetails93.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#SettlingCapacity
	 * SettlementDetails90.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#SettlingCapacity
	 * SettlementDetails96.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#SettlingCapacity
	 * SettlementDetails97.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#SettlingCapacity
	 * SettlementDetails94.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#SettlingCapacity
	 * SettlementDetails95.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#SettlingCapacity
	 * SettlementDetails91.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#SettlingCapacity
	 * SettlementDetails92.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#SettlingCapacity
	 * SettlementDetails98.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#SettlingCapacity
	 * SettlementDetails101.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#SettlingCapacity
	 * SettlementDetails105.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#SettlingCapacity
	 * SettlementDetails106.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#SettlingCapacity
	 * SettlementDetails104.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#SettlingCapacity
	 * SettlementDetails111.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#SettlingCapacity
	 * SettlementDetails112.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#SettlingCapacity
	 * SettlementDetails110.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#SettlingCapacity
	 * SettlementDetails107.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#SettlingCapacity
	 * SettlementDetails115.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#SettlingCapacity
	 * SettlementDetails117.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#SettlingCapacity
	 * SettlementDetails116.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#SettlingCapacity
	 * SettlementDetails113.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#SettlingCapacity
	 * SettlementDetails128.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#SettlingCapacity
	 * SettlementDetails120.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#SettlingCapacity
	 * SettlementDetails119.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#SettlingCapacity
	 * SettlementDetails126.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#SettlingCapacity
	 * SettlementDetails122.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#SettlingCapacity
	 * SettlementDetails127.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#SettlingCapacity
	 * SettlementDetails121.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#SettlingCapacity
	 * SettlementDetails134.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#SettlingCapacity
	 * SettlementDetails137.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#SettlingCapacity
	 * SettlementDetails132.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#SettlingCapacity
	 * SettlementDetails138.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#SettlingCapacity
	 * SettlementDetails130.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#SettlingCapacity
	 * SettlementDetails133.SettlingCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#SettlingCapacity
	 * SettlementDetails139.SettlingCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role of a party in the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlingCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails51.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails9.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails17.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails30.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails32.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails60.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails64.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails3.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails16.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails31.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails40.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails62.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails63.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails6.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails20.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails24.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails33.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails45.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails54.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails1.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails19.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails22.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails35.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails42.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails52.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails8.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails11.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails23.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails37.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails44.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails53.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails7.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails12.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails28.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails38.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails47.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails56.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails2.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails13.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails27.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails39.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails48.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails57.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails43.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails10.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails29.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails5.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails26.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails65.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails14.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails41.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails61.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails59.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails15.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails36.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails66.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails67.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails70.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails68.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails69.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails71.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails72.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails75.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails73.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails74.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails81.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails76.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails80.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails78.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails77.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails79.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails87.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails83.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails86.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails85.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails93.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails90.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails96.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails97.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails94.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails95.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails91.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails92.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails98.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails101.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails105.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails106.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails104.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails111.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails112.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails110.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails107.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails115.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails117.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails116.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails113.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails128.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails120.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails119.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails126.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails122.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails127.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails121.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails134.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails137.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails132.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails138.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails130.SettlingCapacity, com.tools20022.repository.msg.SettlementDetails133.SettlingCapacity,
					com.tools20022.repository.msg.SettlementDetails139.SettlingCapacity);
			elementContext_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingCapacity";
			definition = "Role of a party in the settlement of the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlingCapacityCode.mmObject();
		}
	};
	/**
	 * Tax role capacity of the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
	 * TaxLiabilityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice#Code
	 * TaxCapacityParty1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty1Choice#Proprietary
	 * TaxCapacityParty1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#TaxCapacity
	 * SettlementDetails50.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice#Code
	 * TaxCapacityParty2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty2Choice#Proprietary
	 * TaxCapacityParty2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#TaxCapacity
	 * SettlementDetails51.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#TaxCapacity
	 * SettlementDetails9.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#TaxCapacity
	 * SettlementDetails17.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#TaxCapacity
	 * SettlementDetails30.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#TaxCapacity
	 * SettlementDetails32.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#TaxCapacity
	 * SettlementDetails60.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#TaxCapacity
	 * SettlementDetails64.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#TaxCapacity
	 * SettlementDetails3.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#TaxCapacity
	 * SettlementDetails16.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#TaxCapacity
	 * SettlementDetails31.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#TaxCapacity
	 * SettlementDetails40.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#TaxCapacity
	 * SettlementDetails62.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#TaxCapacity
	 * SettlementDetails63.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#TaxCapacity
	 * SettlementDetails6.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#TaxCapacity
	 * SettlementDetails20.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#TaxCapacity
	 * SettlementDetails24.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#TaxCapacity
	 * SettlementDetails33.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#TaxCapacity
	 * SettlementDetails45.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#TaxCapacity
	 * SettlementDetails54.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#TaxCapacity
	 * SettlementDetails1.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#TaxCapacity
	 * SettlementDetails19.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#TaxCapacity
	 * SettlementDetails22.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#TaxCapacity
	 * SettlementDetails35.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#TaxCapacity
	 * SettlementDetails42.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#TaxCapacity
	 * SettlementDetails52.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#TaxCapacity
	 * SettlementDetails8.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#TaxCapacity
	 * SettlementDetails11.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#TaxCapacity
	 * SettlementDetails23.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#TaxCapacity
	 * SettlementDetails37.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#TaxCapacity
	 * SettlementDetails44.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#TaxCapacity
	 * SettlementDetails53.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#TaxCapacity
	 * SettlementDetails7.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#TaxCapacity
	 * SettlementDetails12.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#TaxCapacity
	 * SettlementDetails28.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#TaxCapacity
	 * SettlementDetails38.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#TaxCapacity
	 * SettlementDetails47.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#TaxCapacity
	 * SettlementDetails56.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#TaxCapacity
	 * SettlementDetails2.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#TaxCapacity
	 * SettlementDetails13.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#TaxCapacity
	 * SettlementDetails27.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#TaxCapacity
	 * SettlementDetails39.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#TaxCapacity
	 * SettlementDetails48.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#TaxCapacity
	 * SettlementDetails57.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice#Code
	 * TaxCapacityParty3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty3Choice#Proprietary
	 * TaxCapacityParty3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#TaxCapacity
	 * SettlementDetails43.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#TaxCapacity
	 * SettlementDetails4.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#TaxCapacity
	 * SettlementDetails10.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#TaxCapacity
	 * SettlementDetails29.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#TaxCapacity
	 * SettlementDetails5.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#TaxCapacity
	 * SettlementDetails26.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#TaxCapacity
	 * SettlementDetails65.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#TaxCapacity
	 * SettlementDetails14.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#TaxCapacity
	 * SettlementDetails41.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#TaxCapacity
	 * SettlementDetails61.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#TaxCapacity
	 * SettlementDetails59.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#TaxCapacity
	 * SettlementDetails15.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#TaxCapacity
	 * SettlementDetails36.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#TaxCapacity
	 * SettlementDetails18.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#TaxCapacity
	 * SettlementDetails66.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#TaxCapacity
	 * SettlementDetails67.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#TaxCapacity
	 * SettlementDetails70.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#TaxCapacity
	 * SettlementDetails68.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#TaxCapacity
	 * SettlementDetails69.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#TaxCapacity
	 * SettlementDetails71.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#TaxCapacity
	 * SettlementDetails72.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#TaxCapacity
	 * SettlementDetails75.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#TaxCapacity
	 * SettlementDetails73.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#TaxCapacity
	 * SettlementDetails74.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#TaxCapacity
	 * SettlementDetails81.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#TaxCapacity
	 * SettlementDetails76.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#TaxCapacity
	 * SettlementDetails80.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#TaxCapacity
	 * SettlementDetails78.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#TaxCapacity
	 * SettlementDetails77.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#TaxCapacity
	 * SettlementDetails79.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#TaxCapacity
	 * SettlementDetails87.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#TaxCapacity
	 * SettlementDetails83.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#TaxCapacity
	 * SettlementDetails86.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#TaxCapacity
	 * SettlementDetails85.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#TaxCapacity
	 * SettlementDetails93.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#TaxCapacity
	 * SettlementDetails90.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#TaxCapacity
	 * SettlementDetails96.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#TaxCapacity
	 * SettlementDetails97.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#TaxCapacity
	 * SettlementDetails94.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#TaxCapacity
	 * SettlementDetails100.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice#Code
	 * TaxCapacityParty4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty4Choice#Proprietary
	 * TaxCapacityParty4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#TaxCapacity
	 * SettlementDetails95.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#TaxCapacity
	 * SettlementDetails91.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#TaxCapacity
	 * SettlementDetails92.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#TaxCapacity
	 * SettlementDetails98.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#TaxCapacity
	 * SettlementDetails101.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#TaxCapacity
	 * SettlementDetails105.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#TaxCapacity
	 * SettlementDetails106.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#TaxCapacity
	 * SettlementDetails104.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#TaxCapacity
	 * SettlementDetails111.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#TaxCapacity
	 * SettlementDetails112.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#TaxCapacity
	 * SettlementDetails110.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#TaxCapacity
	 * SettlementDetails103.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#TaxCapacity
	 * SettlementDetails107.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#TaxCapacity
	 * SettlementDetails115.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#TaxCapacity
	 * SettlementDetails117.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty5Choice#Code
	 * TaxCapacityParty5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCapacityParty5Choice#Proprietary
	 * TaxCapacityParty5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#TaxCapacity
	 * SettlementDetails116.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#TaxCapacity
	 * SettlementDetails113.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#TaxCapacity
	 * SettlementDetails128.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#TaxCapacity
	 * SettlementDetails120.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#TaxCapacity
	 * SettlementDetails119.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#TaxCapacity
	 * SettlementDetails126.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#TaxCapacity
	 * SettlementDetails122.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#TaxCapacity
	 * SettlementDetails127.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#TaxCapacity
	 * SettlementDetails121.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#TaxCapacity
	 * SettlementDetails134.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#TaxCapacity
	 * SettlementDetails137.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#TaxCapacity
	 * SettlementDetails132.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#TaxCapacity
	 * SettlementDetails138.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#TaxCapacity
	 * SettlementDetails130.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#TaxCapacity
	 * SettlementDetails133.TaxCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#TaxCapacity
	 * SettlementDetails139.TaxCapacity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax role capacity of the instructing party."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxCapacity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TaxCapacityParty1Choice.Code, com.tools20022.repository.choice.TaxCapacityParty1Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails50.TaxCapacity, com.tools20022.repository.choice.TaxCapacityParty2Choice.Code, com.tools20022.repository.choice.TaxCapacityParty2Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails51.TaxCapacity, com.tools20022.repository.msg.SettlementDetails9.TaxCapacity, com.tools20022.repository.msg.SettlementDetails17.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails30.TaxCapacity, com.tools20022.repository.msg.SettlementDetails32.TaxCapacity, com.tools20022.repository.msg.SettlementDetails60.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails64.TaxCapacity, com.tools20022.repository.msg.SettlementDetails3.TaxCapacity, com.tools20022.repository.msg.SettlementDetails16.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails31.TaxCapacity, com.tools20022.repository.msg.SettlementDetails40.TaxCapacity, com.tools20022.repository.msg.SettlementDetails62.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails63.TaxCapacity, com.tools20022.repository.msg.SettlementDetails6.TaxCapacity, com.tools20022.repository.msg.SettlementDetails20.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails24.TaxCapacity, com.tools20022.repository.msg.SettlementDetails33.TaxCapacity, com.tools20022.repository.msg.SettlementDetails45.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails54.TaxCapacity, com.tools20022.repository.msg.SettlementDetails1.TaxCapacity, com.tools20022.repository.msg.SettlementDetails19.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails22.TaxCapacity, com.tools20022.repository.msg.SettlementDetails35.TaxCapacity, com.tools20022.repository.msg.SettlementDetails42.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails52.TaxCapacity, com.tools20022.repository.msg.SettlementDetails8.TaxCapacity, com.tools20022.repository.msg.SettlementDetails11.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails23.TaxCapacity, com.tools20022.repository.msg.SettlementDetails37.TaxCapacity, com.tools20022.repository.msg.SettlementDetails44.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails53.TaxCapacity, com.tools20022.repository.msg.SettlementDetails7.TaxCapacity, com.tools20022.repository.msg.SettlementDetails12.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails28.TaxCapacity, com.tools20022.repository.msg.SettlementDetails38.TaxCapacity, com.tools20022.repository.msg.SettlementDetails47.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails56.TaxCapacity, com.tools20022.repository.msg.SettlementDetails2.TaxCapacity, com.tools20022.repository.msg.SettlementDetails13.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails27.TaxCapacity, com.tools20022.repository.msg.SettlementDetails39.TaxCapacity, com.tools20022.repository.msg.SettlementDetails48.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails57.TaxCapacity, com.tools20022.repository.choice.TaxCapacityParty3Choice.Code, com.tools20022.repository.choice.TaxCapacityParty3Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails43.TaxCapacity, com.tools20022.repository.msg.SettlementDetails4.TaxCapacity, com.tools20022.repository.msg.SettlementDetails10.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails29.TaxCapacity, com.tools20022.repository.msg.SettlementDetails5.TaxCapacity, com.tools20022.repository.msg.SettlementDetails26.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails65.TaxCapacity, com.tools20022.repository.msg.SettlementDetails14.TaxCapacity, com.tools20022.repository.msg.SettlementDetails41.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails61.TaxCapacity, com.tools20022.repository.msg.SettlementDetails59.TaxCapacity, com.tools20022.repository.msg.SettlementDetails15.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails36.TaxCapacity, com.tools20022.repository.msg.SettlementDetails18.TaxCapacity, com.tools20022.repository.msg.SettlementDetails66.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails67.TaxCapacity, com.tools20022.repository.msg.SettlementDetails70.TaxCapacity, com.tools20022.repository.msg.SettlementDetails68.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails69.TaxCapacity, com.tools20022.repository.msg.SettlementDetails71.TaxCapacity, com.tools20022.repository.msg.SettlementDetails72.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails75.TaxCapacity, com.tools20022.repository.msg.SettlementDetails73.TaxCapacity, com.tools20022.repository.msg.SettlementDetails74.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails81.TaxCapacity, com.tools20022.repository.msg.SettlementDetails76.TaxCapacity, com.tools20022.repository.msg.SettlementDetails80.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails78.TaxCapacity, com.tools20022.repository.msg.SettlementDetails77.TaxCapacity, com.tools20022.repository.msg.SettlementDetails79.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails87.TaxCapacity, com.tools20022.repository.msg.SettlementDetails83.TaxCapacity, com.tools20022.repository.msg.SettlementDetails86.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails85.TaxCapacity, com.tools20022.repository.msg.SettlementDetails93.TaxCapacity, com.tools20022.repository.msg.SettlementDetails90.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails96.TaxCapacity, com.tools20022.repository.msg.SettlementDetails97.TaxCapacity, com.tools20022.repository.msg.SettlementDetails94.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails100.TaxCapacity, com.tools20022.repository.choice.TaxCapacityParty4Choice.Code, com.tools20022.repository.choice.TaxCapacityParty4Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails95.TaxCapacity, com.tools20022.repository.msg.SettlementDetails91.TaxCapacity, com.tools20022.repository.msg.SettlementDetails92.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails98.TaxCapacity, com.tools20022.repository.msg.SettlementDetails101.TaxCapacity, com.tools20022.repository.msg.SettlementDetails105.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails106.TaxCapacity, com.tools20022.repository.msg.SettlementDetails104.TaxCapacity, com.tools20022.repository.msg.SettlementDetails111.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails112.TaxCapacity, com.tools20022.repository.msg.SettlementDetails110.TaxCapacity, com.tools20022.repository.msg.SettlementDetails103.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails107.TaxCapacity, com.tools20022.repository.msg.SettlementDetails115.TaxCapacity, com.tools20022.repository.msg.SettlementDetails117.TaxCapacity,
					com.tools20022.repository.choice.TaxCapacityParty5Choice.Code, com.tools20022.repository.choice.TaxCapacityParty5Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails116.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails113.TaxCapacity, com.tools20022.repository.msg.SettlementDetails128.TaxCapacity, com.tools20022.repository.msg.SettlementDetails120.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails119.TaxCapacity, com.tools20022.repository.msg.SettlementDetails126.TaxCapacity, com.tools20022.repository.msg.SettlementDetails122.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails127.TaxCapacity, com.tools20022.repository.msg.SettlementDetails121.TaxCapacity, com.tools20022.repository.msg.SettlementDetails134.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails137.TaxCapacity, com.tools20022.repository.msg.SettlementDetails132.TaxCapacity, com.tools20022.repository.msg.SettlementDetails138.TaxCapacity,
					com.tools20022.repository.msg.SettlementDetails130.TaxCapacity, com.tools20022.repository.msg.SettlementDetails133.TaxCapacity, com.tools20022.repository.msg.SettlementDetails139.TaxCapacity);
			elementContext_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxCapacity";
			definition = "Tax role capacity of the instructing party.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxLiabilityCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementPartyRole";
				definition = "Role played by a party in the context of the settlement of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.PartyRole, com.tools20022.repository.entity.SecuritiesSettlementSystem.SettlementParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount7.Party1, com.tools20022.repository.msg.ReceivingPartiesAndAccount7.Party2,
						com.tools20022.repository.msg.SettlementParties32.Depository, com.tools20022.repository.msg.SettlementParties32.Party1, com.tools20022.repository.msg.SettlementParties32.Party2,
						com.tools20022.repository.msg.SettlementParties32.Party3, com.tools20022.repository.msg.SettlementParties32.Party4, com.tools20022.repository.msg.SettlementParties32.Party5,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount10.Party1, com.tools20022.repository.msg.ReceivingPartiesAndAccount10.Party2, com.tools20022.repository.msg.ReceivingPartiesAndAccount11.Party1,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount11.Party2, com.tools20022.repository.msg.InvestmentAccount54.SettlementPartiesDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount15.Party1,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount15.Party2);
				subType_lazy = () -> Arrays.asList(ReceivingSettlementParty.mmObject(), DeliveringSettlementParty.mmObject(), ReceivingAgent.mmObject(), LocalSettlementAgentRole.mmObject(), DeliverersCustodian.mmObject(),
						DeliverersIntermediary.mmObject(), DeliveringAgent.mmObject(), PlaceOfSettlement.mmObject(), ReceiversCustodian.mmObject(), ReceiversIntermediary.mmObject());
				superType_lazy = () -> SettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlementSystem,
						com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SettlingCapacity, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.TaxCapacity);
				derivationComponent_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount1.mmObject(), DeliveringPartiesAndAccount4.mmObject(), DeliveringPartiesAndAccount8.mmObject(), ReceivingPartiesAndAccount1.mmObject(),
						ReceivingPartiesAndAccount4.mmObject(), ReceivingPartiesAndAccount8.mmObject(), SettlementParties2.mmObject(), SettlementParties13.mmObject(), TaxCapacityParty1Choice.mmObject(), SettlementParties5.mmObject(),
						SettlementParties11.mmObject(), SettlementParties26.mmObject(), SettlementParties12.mmObject(), SettlementParties19.mmObject(), SettlementParties21.mmObject(), TaxCapacityParty2Choice.mmObject(),
						SettlementParties18.mmObject(), SettlementParties27.mmObject(), SettlementParties4.mmObject(), SettlementParties8.mmObject(), SettlementParties15.mmObject(), SettlementParties16.mmObject(),
						SettlementParties24.mmObject(), SettlementParties28.mmObject(), SettlementParties7.mmObject(), SettlementParties10.mmObject(), SettlementParties17.mmObject(), SettlementParties6.mmObject(),
						SettlementParties3.mmObject(), SettlementParties23.mmObject(), TaxCapacityParty3Choice.mmObject(), ReceivingPartiesAndAccount3.mmObject(), DeliveringPartiesAndAccount3.mmObject(), SettlementParties14.mmObject(),
						SettlementParties20.mmObject(), SettlementParties22.mmObject(), DeliveringPartiesAndAccount5.mmObject(), ReceivingPartiesAndAccount6.mmObject(), DeliveringPartiesAndAccount7.mmObject(),
						ReceivingPartiesAndAccount7.mmObject(), SettlementParties2Choice.mmObject(), DeliveringPartiesAndAccount6.mmObject(), ReceivingPartiesAndAccount5.mmObject(), ReceivingPartiesAndAccount9.mmObject(),
						DeliveringPartiesAndAccount9.mmObject(), SettlementParties32.mmObject(), DeliveringPartiesAndAccount10.mmObject(), ReceivingPartiesAndAccount10.mmObject(), SettlementParties3Choice.mmObject(),
						ReceivingPartiesAndAccount11.mmObject(), DeliveringPartiesAndAccount11.mmObject(), SettlementParties4Choice.mmObject(), SettlementParties36.mmObject(), SettlementParties39.mmObject(), SettlementParties40.mmObject(),
						TaxCapacityParty4Choice.mmObject(), SettlementParties42.mmObject(), DeliveringPartiesAndAccount14.mmObject(), DeliveringPartiesAndAccount13.mmObject(), ReceivingPartiesAndAccount14.mmObject(),
						ReceivingPartiesAndAccount13.mmObject(), SettlementParties5Choice.mmObject(), ReceivingPartiesAndAccount15.mmObject(), DeliveringPartiesAndAccount15.mmObject(), SettlementParties43.mmObject(),
						SettlementParties44.mmObject(), TaxCapacityParty5Choice.mmObject(), SettlementParties49.mmObject(), SettlementParties58.mmObject(), ReceivingPartiesAndAccount16.mmObject(), DeliveringPartiesAndAccount16.mmObject(),
						SettlementParties7Choice.mmObject(), SettlementParties61.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}