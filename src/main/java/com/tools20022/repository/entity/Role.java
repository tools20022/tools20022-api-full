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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmPlayer Role.mmPlayer}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
 * Role.mmContactPersonRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmPartyRole
 * Role.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmCounterpartyRisk
 * Role.mmCounterpartyRisk}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Role#mmEntry Role.mmEntry}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
 * RolePlayer.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entry#mmRole Entry.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
 * ContactPersonRole.mmRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
 * CounterpartyRisk.mmParty}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.RolePlayer> player;
	/**
	 * Entity which plays a role in the context of the business domain in which
	 * the role is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RolePlayer
	 * RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmCreditorTaxType
	 * TaxInformation2.mmCreditorTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OwnerType1#mmType
	 * OwnerType1.mmType}</li>
	 * </ul>
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
	public static final MMBusinessAssociationEnd mmPlayer = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation2.mmCreditorTaxType, com.tools20022.repository.msg.OwnerType1.mmType);
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Player";
			definition = "Entity which plays a role in the context of the business domain in which the role is defined.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RolePlayer.mmObject();
		}
	};
	protected ContactPersonRole contactPersonRole;
	/**
	 * Contact person in the context of a role played by an organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPersonRole#mmRole
	 * ContactPersonRole.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPersonRole
	 * ContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary10#mmContactPerson
	 * Intermediary10.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10#mmPartyContactNarrative
	 * CorporateActionNarrative10.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative19#mmPartyContactNarrative
	 * CorporateActionNarrative19.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative7#mmPartyContactNarrative
	 * CorporateActionNarrative7.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative12#mmPartyContactNarrative
	 * CorporateActionNarrative12.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative21#mmPartyContactNarrative
	 * CorporateActionNarrative21.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative23#mmPartyContactNarrative
	 * CorporateActionNarrative23.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmPartyContactNarrative
	 * CorporateActionNarrative4.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmPartyContactNarrative
	 * CorporateActionNarrative14.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmPartyContactNarrative
	 * CorporateActionNarrative6.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmPartyContactNarrative
	 * CorporateActionNarrative16.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmPartyContactNarrative
	 * CorporateActionNarrative11.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmPartyContactNarrative
	 * CorporateActionNarrative17.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson#mmContactPerson
	 * MeetingContactPerson.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson1#mmContactPerson
	 * MeetingContactPerson1.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmPartyContactNarrative
	 * CorporateActionNarrative9.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary26#mmContactPerson
	 * Intermediary26.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingContactPerson2#mmContactPerson
	 * MeetingContactPerson2.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmPartyContactNarrative
	 * CorporateActionNarrative27.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Intermediary34#mmContactPerson
	 * Intermediary34.mmContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative30#mmPartyContactNarrative
	 * CorporateActionNarrative30.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative31#mmPartyContactNarrative
	 * CorporateActionNarrative31.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmPartyContactNarrative
	 * CorporateActionNarrative28.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35#mmPartyContactNarrative
	 * CorporateActionNarrative35.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmPartyContactNarrative
	 * CorporateActionNarrative37.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative34#mmPartyContactNarrative
	 * CorporateActionNarrative34.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmPartyContactNarrative
	 * CorporateActionNarrative41.mmPartyContactNarrative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSeniorManagingOfficial
	 * AccountParties15.mmSeniorManagingOfficial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmProtector
	 * AccountParties15.mmProtector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmSeniorManagingOfficial
	 * AccountParties16.mmSeniorManagingOfficial}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmProtector
	 * AccountParties16.mmProtector}</li>
	 * </ul>
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
	public static final MMBusinessAssociationEnd mmContactPersonRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary10.mmContactPerson, com.tools20022.repository.msg.CorporateActionNarrative10.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative19.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative7.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative12.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative21.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative23.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative4.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative14.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative6.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative16.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative11.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative17.mmPartyContactNarrative, com.tools20022.repository.msg.MeetingContactPerson.mmContactPerson, com.tools20022.repository.msg.MeetingContactPerson1.mmContactPerson,
					com.tools20022.repository.msg.CorporateActionNarrative9.mmPartyContactNarrative, com.tools20022.repository.msg.Intermediary26.mmContactPerson, com.tools20022.repository.msg.MeetingContactPerson2.mmContactPerson,
					com.tools20022.repository.msg.CorporateActionNarrative27.mmPartyContactNarrative, com.tools20022.repository.msg.Intermediary34.mmContactPerson,
					com.tools20022.repository.msg.CorporateActionNarrative30.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative31.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative28.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative35.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative37.mmPartyContactNarrative, com.tools20022.repository.msg.CorporateActionNarrative34.mmPartyContactNarrative,
					com.tools20022.repository.msg.CorporateActionNarrative41.mmPartyContactNarrative, com.tools20022.repository.msg.AccountParties15.mmSeniorManagingOfficial, com.tools20022.repository.msg.AccountParties15.mmProtector,
					com.tools20022.repository.msg.AccountParties16.mmSeniorManagingOfficial, com.tools20022.repository.msg.AccountParties16.mmProtector);
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPersonRole";
			definition = "Contact person in the context of a role played by an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPersonRole.mmObject();
		}
	};
	protected PartyRoleCode partyRole;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Role Role}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Role2Choice#mmCode
	 * Role2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role2Choice#mmProprietary
	 * Role2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role3Choice#mmCode
	 * Role3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role3Choice#mmProprietary
	 * Role3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress#mmRole
	 * ContactIdentificationAndAddress.mmRole}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role1Choice#mmCode
	 * Role1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role1Choice#mmProprietary
	 * Role1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role4Choice#mmCode
	 * Role4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role4Choice#mmProprietary
	 * Role4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmInstalmentManagerRole
	 * InvestmentPlan10.mmInstalmentManagerRole}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27#mmRole
	 * Intermediary27.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmInstalmentManagerRole
	 * InvestmentPlan11.mmInstalmentManagerRole}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountRole1#mmOwnerType
	 * AccountRole1.mmOwnerType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role5Choice#mmCode
	 * Role5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role5Choice#mmProprietary
	 * Role5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role6Choice#mmCode
	 * Role6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role6Choice#mmProprietary
	 * Role6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInstalmentManagerRole
	 * InvestmentPlan12.mmInstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmInstalmentManagerRole
	 * InvestmentPlan13.mmInstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmCompanyLink
	 * InvestmentAccountOwnershipInformation12.mmCompanyLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmCompanyLink
	 * InvestmentAccountOwnershipInformation13.mmCompanyLink}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Role7Choice#mmCode
	 * Role7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Role7Choice#mmProprietary
	 * Role7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInstalmentManagerRole
	 * InvestmentPlan14.mmInstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmInstalmentManagerRole
	 * InvestmentPlan15.mmInstalmentManagerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCompanyLink
	 * InvestmentAccountOwnershipInformation15.mmCompanyLink}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCompanyLink
	 * InvestmentAccountOwnershipInformation14.mmCompanyLink}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmPartyRole = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Role2Choice.mmCode, com.tools20022.repository.choice.Role2Choice.mmProprietary, com.tools20022.repository.choice.Role3Choice.mmCode,
					com.tools20022.repository.choice.Role3Choice.mmProprietary, com.tools20022.repository.msg.ContactIdentificationAndAddress.mmRole, com.tools20022.repository.choice.Role1Choice.mmCode,
					com.tools20022.repository.choice.Role1Choice.mmProprietary, com.tools20022.repository.choice.Role4Choice.mmCode, com.tools20022.repository.choice.Role4Choice.mmProprietary,
					com.tools20022.repository.msg.InvestmentPlan10.mmInstalmentManagerRole, com.tools20022.repository.msg.Intermediary27.mmRole, com.tools20022.repository.msg.InvestmentPlan11.mmInstalmentManagerRole,
					com.tools20022.repository.msg.AccountRole1.mmOwnerType, com.tools20022.repository.choice.Role5Choice.mmCode, com.tools20022.repository.choice.Role5Choice.mmProprietary,
					com.tools20022.repository.choice.Role6Choice.mmCode, com.tools20022.repository.choice.Role6Choice.mmProprietary, com.tools20022.repository.msg.InvestmentPlan12.mmInstalmentManagerRole,
					com.tools20022.repository.msg.InvestmentPlan13.mmInstalmentManagerRole, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmCompanyLink,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmCompanyLink, com.tools20022.repository.choice.Role7Choice.mmCode, com.tools20022.repository.choice.Role7Choice.mmProprietary,
					com.tools20022.repository.msg.InvestmentPlan14.mmInstalmentManagerRole, com.tools20022.repository.msg.InvestmentPlan15.mmInstalmentManagerRole,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCompanyLink, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCompanyLink);
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of the party in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyRoleCode.mmObject();
		}
	};
	protected CounterpartyRisk counterpartyRisk;
	/**
	 * Specifies the risk which is related to the role played by a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
	 * CounterpartyRisk.mmParty}</li>
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
	public static final MMBusinessAssociationEnd mmCounterpartyRisk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyRisk";
			definition = "Specifies the risk which is related to the role played by a party.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CounterpartyRisk.mmObject();
		}
	};
	protected Entry entry;
	/**
	 * Entry for which a role is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Entry#mmRole
	 * Entry.mmRole}</li>
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
	public static final MMBusinessAssociationEnd mmEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Role.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry for which a role is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.mmRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Role";
				definition = "Role of a party in an activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RolePlayer.mmRole, com.tools20022.repository.entity.Entry.mmRole, com.tools20022.repository.entity.ContactPersonRole.mmRole,
						com.tools20022.repository.entity.CounterpartyRisk.mmParty);
				subType_lazy = () -> Arrays.asList(InformationPartyRole.mmObject(), AccountPartyRole.mmObject(), EmployingPartyRole.mmObject(), DocumentPartyRole.mmObject(), MandatePartyRole.mmObject(), CardPaymentPartyRole.mmObject(),
						InvestmentFundPartyRole.mmObject(), TradePartyRole.mmObject(), SystemPartyRole.mmObject(), PaymentPartyRole.mmObject(), AssetPartyRole.mmObject(), SettlementPartyRole.mmObject(),
						com.tools20022.repository.entity.ContactPersonRole.mmObject(), SecuritiesOrderPartyRole.mmObject(), SecurityCertificatePartyRole.mmObject(), InvoicePartyRole.mmObject(), TaxPartyRole.mmObject(),
						InvestigationPartyRole.mmObject(), ChargePartyRole.mmObject(), RegulatoryAuthorityRole.mmObject(), UndertakingPartyRole.mmObject(), CorporateActionPartyRole.mmObject(), TransportPartyRole.mmObject(),
						InsurancePartyRole.mmObject(), CollateralPartyRole.mmObject(), ReportingPartyRole.mmObject(), LegalRepresentative.mmObject(), ChequePartyRole.mmObject(), CommissionPartyRole.mmObject(), GoodsPartyRole.mmObject(),
						TradeCertificatePartyRole.mmObject(), MarketInfrastructure.mmObject(), GuaranteePartyRole.mmObject(), PaymentObligationPartyRole.mmObject(), RegulatoryReportingRole.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Role.mmPlayer, com.tools20022.repository.entity.Role.mmContactPersonRole, com.tools20022.repository.entity.Role.mmPartyRole,
						com.tools20022.repository.entity.Role.mmCounterpartyRisk, com.tools20022.repository.entity.Role.mmEntry);
				derivationComponent_lazy = () -> Arrays.asList(OtherParties2.mmObject(), OtherParties8.mmObject(), OtherParties19.mmObject(), OtherParties24.mmObject(), OtherParties7.mmObject(), OtherParties9.mmObject(),
						OtherParties14.mmObject(), OtherParties15.mmObject(), OtherParties18.mmObject(), OtherParties1.mmObject(), TransactionAgents1.mmObject(), TransactionAgents2.mmObject(), TransactionAgents3.mmObject(),
						OtherParties4.mmObject(), OtherParties10.mmObject(), OtherParties3.mmObject(), OtherParties11.mmObject(), OtherParties12.mmObject(), TradeParty1.mmObject(), OtherParties5.mmObject(), OtherParties16.mmObject(),
						OtherParties17.mmObject(), OtherParties6.mmObject(), OtherParties13.mmObject(), Role4Choice.mmObject(), OtherParties27.mmObject(), OtherParties26.mmObject(), TradeParty2.mmObject(), OtherParties28.mmObject(),
						OtherParties29.mmObject(), OtherParties31.mmObject(), OtherParties30.mmObject(), TradeParty3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<RolePlayer> getPlayer() {
		return player;
	}

	public void setPlayer(List<com.tools20022.repository.entity.RolePlayer> player) {
		this.player = player;
	}

	public ContactPersonRole getContactPersonRole() {
		return contactPersonRole;
	}

	public void setContactPersonRole(com.tools20022.repository.entity.ContactPersonRole contactPersonRole) {
		this.contactPersonRole = contactPersonRole;
	}

	public PartyRoleCode getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(PartyRoleCode partyRole) {
		this.partyRole = partyRole;
	}

	public CounterpartyRisk getCounterpartyRisk() {
		return counterpartyRisk;
	}

	public void setCounterpartyRisk(com.tools20022.repository.entity.CounterpartyRisk counterpartyRisk) {
		this.counterpartyRisk = counterpartyRisk;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(com.tools20022.repository.entity.Entry entry) {
		this.entry = entry;
	}
}