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
import com.tools20022.repository.choice.Role4Choice;
import com.tools20022.repository.codeset.PartyRoleCode;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role of a party in an activity.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Role" src="doc-files/Role.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Player Role.Player}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#ContactPersonRole
 * Role.ContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#PartyRole
 * Role.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#CounterpartyRisk
 * Role.CounterpartyRisk}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#Entry Role.Entry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#Role
 * RolePlayer.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#Role Entry.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#Role
 * ContactPersonRole.Role}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CounterpartyRisk#Party
 * CounterpartyRisk.Party}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole
 * AccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.EmployingPartyRole
 * EmployingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DocumentPartyRole
 * DocumentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandatePartyRole
 * MandatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole
 * AssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SettlementPartyRole
 * SettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole
 * ContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrderPartyRole
 * SecuritiesOrderPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole
 * SecurityCertificatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoicePartyRole
 * InvoicePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole TaxPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestigationPartyRole
 * InvestigationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChargePartyRole
 * ChargePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryAuthorityRole
 * RegulatoryAuthorityRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingPartyRole
 * UndertakingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
 * CorporateActionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportPartyRole
 * TransportPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InsurancePartyRole
 * InsurancePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralPartyRole
 * CollateralPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ReportingPartyRole
 * ReportingPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LegalRepresentative
 * LegalRepresentative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ChequePartyRole
 * ChequePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CommissionPartyRole
 * CommissionPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.GoodsPartyRole
 * GoodsPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeCertificatePartyRole
 * TradeCertificatePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarketInfrastructure
 * MarketInfrastructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.GuaranteePartyRole
 * GuaranteePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligationPartyRole
 * PaymentObligationPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegulatoryReportingRole
 * RegulatoryReportingRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties2 OtherParties2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties8 OtherParties8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties19 OtherParties19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties24 OtherParties24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties7 OtherParties7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties9 OtherParties9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties14 OtherParties14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties15 OtherParties15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties18 OtherParties18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties1 OtherParties1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionAgents1
 * TransactionAgents1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionAgents2
 * TransactionAgents2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionAgents3
 * TransactionAgents3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties4 OtherParties4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties10 OtherParties10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties3 OtherParties3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties11 OtherParties11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties12 OtherParties12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty1 TradeParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties5 OtherParties5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties16 OtherParties16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties17 OtherParties17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties6 OtherParties6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties13 OtherParties13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Role4Choice Role4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties27 OtherParties27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties26 OtherParties26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty2 TradeParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties28 OtherParties28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties29 OtherParties29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties31 OtherParties31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherParties30 OtherParties30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeParty3 TradeParty3}</li>
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
 * "Role"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role of a party in an activity."</li>
 * </ul>
 */
public class Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Entity which plays a role in the context of the business domain in which
	 * the role is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.RolePlayer#Role
	 * RolePlayer.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RolePlayer
	 * RolePlayer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#CreditorTaxType
	 * TaxInformation2.CreditorTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OwnerType1#Type
	 * OwnerType1.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Player"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity which plays a role in the context of the business domain in which the role is defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Player = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation2.CreditorTaxType, com.tools20022.repository.msg.OwnerType1.Type);
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Player";
			definition = "Entity which plays a role in the context of the business domain in which the role is defined.";
			minOccurs = 0;
			type_lazy = () -> RolePlayer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contact person in the context of a role played by an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#Role
	 * ContactPersonRole.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary10#ContactPerson
	 * Intermediary10.ContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10#PartyContactNarrative
	 * CorporateActionNarrative10.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative19#PartyContactNarrative
	 * CorporateActionNarrative19.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7#PartyContactNarrative
	 * CorporateActionNarrative7.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative12#PartyContactNarrative
	 * CorporateActionNarrative12.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#PartyContactNarrative
	 * CorporateActionNarrative21.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative23#PartyContactNarrative
	 * CorporateActionNarrative23.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#PartyContactNarrative
	 * CorporateActionNarrative4.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#PartyContactNarrative
	 * CorporateActionNarrative14.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#PartyContactNarrative
	 * CorporateActionNarrative6.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#PartyContactNarrative
	 * CorporateActionNarrative16.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#PartyContactNarrative
	 * CorporateActionNarrative11.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#PartyContactNarrative
	 * CorporateActionNarrative17.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson#ContactPerson
	 * MeetingContactPerson.ContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#ContactPerson
	 * MeetingContactPerson1.ContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#PartyContactNarrative
	 * CorporateActionNarrative9.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary26#ContactPerson
	 * Intermediary26.ContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#ContactPerson
	 * MeetingContactPerson2.ContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#PartyContactNarrative
	 * CorporateActionNarrative27.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary34#ContactPerson
	 * Intermediary34.ContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#PartyContactNarrative
	 * CorporateActionNarrative30.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative31#PartyContactNarrative
	 * CorporateActionNarrative31.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#PartyContactNarrative
	 * CorporateActionNarrative28.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35#PartyContactNarrative
	 * CorporateActionNarrative35.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#PartyContactNarrative
	 * CorporateActionNarrative37.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative34#PartyContactNarrative
	 * CorporateActionNarrative34.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#PartyContactNarrative
	 * CorporateActionNarrative41.PartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#SeniorManagingOfficial
	 * AccountParties15.SeniorManagingOfficial}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#Protector
	 * AccountParties15.Protector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties16#SeniorManagingOfficial
	 * AccountParties16.SeniorManagingOfficial}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#Protector
	 * AccountParties16.Protector}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact person in the context of a role played by an organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ContactPersonRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary10.ContactPerson, com.tools20022.repository.msg.CorporateActionNarrative10.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative19.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative7.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative12.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative21.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative23.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative4.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative14.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative6.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative16.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative11.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative17.PartyContactNarrative, com.tools20022.repository.msg.MeetingContactPerson.ContactPerson, com.tools20022.repository.msg.MeetingContactPerson1.ContactPerson,
					com.tools20022.repository.msg.CorporateActionNarrative9.PartyContactNarrative, com.tools20022.repository.msg.Intermediary26.ContactPerson, com.tools20022.repository.msg.MeetingContactPerson2.ContactPerson,
					com.tools20022.repository.msg.CorporateActionNarrative27.PartyContactNarrative, com.tools20022.repository.msg.Intermediary34.ContactPerson, com.tools20022.repository.msg.CorporateActionNarrative30.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative31.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative28.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative35.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative37.PartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative34.PartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative41.PartyContactNarrative,
					com.tools20022.repository.msg.AccountParties15.SeniorManagingOfficial, com.tools20022.repository.msg.AccountParties15.Protector, com.tools20022.repository.msg.AccountParties16.SeniorManagingOfficial,
					com.tools20022.repository.msg.AccountParties16.Protector);
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact person in the context of a role played by an organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the role of the party in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode
	 * PartyRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Role2Choice#Code
	 * Role2Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role2Choice#Proprietary
	 * Role2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role3Choice#Code
	 * Role3Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role3Choice#Proprietary
	 * Role3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#Role
	 * ContactIdentificationAndAddress.Role}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role1Choice#Code
	 * Role1Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role1Choice#Proprietary
	 * Role1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role4Choice#Code
	 * Role4Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role4Choice#Proprietary
	 * Role4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#InstalmentManagerRole
	 * InvestmentPlan10.InstalmentManagerRole}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27#Role
	 * Intermediary27.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#InstalmentManagerRole
	 * InvestmentPlan11.InstalmentManagerRole}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountRole1#OwnerType
	 * AccountRole1.OwnerType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role5Choice#Code
	 * Role5Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role5Choice#Proprietary
	 * Role5Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role6Choice#Code
	 * Role6Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role6Choice#Proprietary
	 * Role6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#InstalmentManagerRole
	 * InvestmentPlan12.InstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#InstalmentManagerRole
	 * InvestmentPlan13.InstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#CompanyLink
	 * InvestmentAccountOwnershipInformation12.CompanyLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#CompanyLink
	 * InvestmentAccountOwnershipInformation13.CompanyLink}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role7Choice#Code
	 * Role7Choice.Code}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role7Choice#Proprietary
	 * Role7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#InstalmentManagerRole
	 * InvestmentPlan14.InstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#InstalmentManagerRole
	 * InvestmentPlan15.InstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#CompanyLink
	 * InvestmentAccountOwnershipInformation15.CompanyLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#CompanyLink
	 * InvestmentAccountOwnershipInformation14.CompanyLink}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the role of the party in the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyRole = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Role2Choice.Code, com.tools20022.repository.choice.Role2Choice.Proprietary, com.tools20022.repository.choice.Role3Choice.Code,
					com.tools20022.repository.choice.Role3Choice.Proprietary, com.tools20022.repository.msg.ContactIdentificationAndAddress.Role, com.tools20022.repository.choice.Role1Choice.Code,
					com.tools20022.repository.choice.Role1Choice.Proprietary, com.tools20022.repository.choice.Role4Choice.Code, com.tools20022.repository.choice.Role4Choice.Proprietary,
					com.tools20022.repository.msg.InvestmentPlan10.InstalmentManagerRole, com.tools20022.repository.msg.Intermediary27.Role, com.tools20022.repository.msg.InvestmentPlan11.InstalmentManagerRole,
					com.tools20022.repository.msg.AccountRole1.OwnerType, com.tools20022.repository.choice.Role5Choice.Code, com.tools20022.repository.choice.Role5Choice.Proprietary, com.tools20022.repository.choice.Role6Choice.Code,
					com.tools20022.repository.choice.Role6Choice.Proprietary, com.tools20022.repository.msg.InvestmentPlan12.InstalmentManagerRole, com.tools20022.repository.msg.InvestmentPlan13.InstalmentManagerRole,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.CompanyLink, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.CompanyLink, com.tools20022.repository.choice.Role7Choice.Code,
					com.tools20022.repository.choice.Role7Choice.Proprietary, com.tools20022.repository.msg.InvestmentPlan14.InstalmentManagerRole, com.tools20022.repository.msg.InvestmentPlan15.InstalmentManagerRole,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.CompanyLink, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.CompanyLink);
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of the party in the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyRoleCode.mmObject();
		}
	};
	/**
	 * Specifies the risk which is related to the role played by a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#Party
	 * CounterpartyRisk.Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CounterpartyRisk
	 * CounterpartyRisk}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the risk which is related to the role played by a party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyRisk";
			definition = "Specifies the risk which is related to the role played by a party.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.Party;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry for which a role is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#Role
	 * Entry.Role}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entry Entry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry for which a role is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry for which a role is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Role;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Role";
				definition = "Role of a party in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.Role, com.tools20022.repository.entity.Entry.Role, com.tools20022.repository.entity.ContactPersonRole.Role,
						com.tools20022.repository.entity.CounterpartyRisk.Party);
				subType_lazy = () -> Arrays.asList(InformationPartyRole.mmObject(), AccountPartyRole.mmObject(), EmployingPartyRole.mmObject(), DocumentPartyRole.mmObject(), MandatePartyRole.mmObject(), CardPaymentPartyRole.mmObject(),
						InvestmentFundPartyRole.mmObject(), TradePartyRole.mmObject(), SystemPartyRole.mmObject(), PaymentPartyRole.mmObject(), AssetPartyRole.mmObject(), SettlementPartyRole.mmObject(),
						com.tools20022.repository.entity.ContactPersonRole.mmObject(), SecuritiesOrderPartyRole.mmObject(), SecurityCertificatePartyRole.mmObject(), InvoicePartyRole.mmObject(), TaxPartyRole.mmObject(),
						InvestigationPartyRole.mmObject(), ChargePartyRole.mmObject(), RegulatoryAuthorityRole.mmObject(), UndertakingPartyRole.mmObject(), CorporateActionPartyRole.mmObject(), TransportPartyRole.mmObject(),
						InsurancePartyRole.mmObject(), CollateralPartyRole.mmObject(), ReportingPartyRole.mmObject(), LegalRepresentative.mmObject(), ChequePartyRole.mmObject(), CommissionPartyRole.mmObject(), GoodsPartyRole.mmObject(),
						TradeCertificatePartyRole.mmObject(), MarketInfrastructure.mmObject(), GuaranteePartyRole.mmObject(), PaymentObligationPartyRole.mmObject(), RegulatoryReportingRole.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.Player, com.tools20022.repository.entity.Role.ContactPersonRole, com.tools20022.repository.entity.Role.PartyRole,
						com.tools20022.repository.entity.Role.CounterpartyRisk, com.tools20022.repository.entity.Role.Entry);
				derivationComponent_lazy = () -> Arrays.asList(OtherParties2.mmObject(), OtherParties8.mmObject(), OtherParties19.mmObject(), OtherParties24.mmObject(), OtherParties7.mmObject(), OtherParties9.mmObject(),
						OtherParties14.mmObject(), OtherParties15.mmObject(), OtherParties18.mmObject(), OtherParties1.mmObject(), TransactionAgents1.mmObject(), TransactionAgents2.mmObject(), TransactionAgents3.mmObject(),
						OtherParties4.mmObject(), OtherParties10.mmObject(), OtherParties3.mmObject(), OtherParties11.mmObject(), OtherParties12.mmObject(), TradeParty1.mmObject(), OtherParties5.mmObject(), OtherParties16.mmObject(),
						OtherParties17.mmObject(), OtherParties6.mmObject(), OtherParties13.mmObject(), Role4Choice.mmObject(), OtherParties27.mmObject(), OtherParties26.mmObject(), TradeParty2.mmObject(), OtherParties28.mmObject(),
						OtherParties29.mmObject(), OtherParties31.mmObject(), OtherParties30.mmObject(), TradeParty3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}