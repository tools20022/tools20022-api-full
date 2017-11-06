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
import com.tools20022.repository.codeset.ClearingSideCode;
import com.tools20022.repository.entity.SystemPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Member of an exchange's clearing corporation, responsible for executing
 * client trades and involved in the clearing of trades.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ClearingMemberRole" src="doc-files/ClearingMemberRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSystemMemberIdentification
 * ClearingMemberRole.mmClearingSystemMemberIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmSide
 * ClearingMemberRole.mmSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
 * ClearingMemberRole.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmMarginAccount
 * ClearingMemberRole.mmMarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
 * ClearingMemberRole.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDefaultFundAccount
 * ClearingMemberRole.mmDefaultFundAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
 * ClearingMemberRole.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
 * Account.mmDefaultFundAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
 * SecuritiesAccount.mmClearingAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
 * SecuritiesAccount.mmMarginAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
 * CashClearingSystemMember.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
 * ClearingMemberRole.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmNetServiceCounterpartyIdentification
 * NetObligation1.mmNetServiceCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CutOffData1#mmParticipantIdentification
 * CutOffData1.mmParticipantIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "ClearingMemberRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades."
 * </li>
 * </ul>
 */
public class ClearingMemberRole extends SystemPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashClearingSystemMember clearingSystemMemberIdentification;
	/**
	 * Unique and unambiguous identifier of a clearing system member, assigned
	 * by the system or system administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmClearingMember
	 * CashClearingSystemMember.mmClearingMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingSystemMemberIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Unique and unambiguous identifier of a clearing system member, assigned by the system or system administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmClearingMember;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
		}
	};
	protected ClearingSideCode side;
	/**
	 * Specifies the side of the clearing member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingSideCode
	 * ClearingSideCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmSide
	 * PartyIdentificationAndAccount78.mmSide}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Side"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the side of the clearing member."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSide = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndAccount78.mmSide);
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Side";
			definition = "Specifies the side of the clearing member.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingSideCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> clearingAccount;
	/**
	 * Identifies the clearing member account at the CCP through which the trade
	 * must be cleared (sometimes called position account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmClearingAccountOwner
	 * SecuritiesAccount.mmClearingAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78#mmClearingAccount
	 * PartyIdentificationAndAccount78.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31#mmClearingAccount
	 * PartyIdentificationAndAccount31.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmSafekeepingAccount
	 * SettlementObligation1.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmSafekeepingAccount
	 * SettlementObligation6.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLegStatement1#mmClearingAccount
	 * TradeLegStatement1.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLegStatement2#mmClearingAccount
	 * TradeLegStatement2.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#mmClearingAccount
	 * NetPosition1.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmClearingAccount
	 * NetPosition2.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingAccount
	 * TradeLeg8.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLegStatement3#mmClearingAccount
	 * TradeLegStatement3.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmSafekeepingAccount
	 * SettlementObligation7.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmClearingAccount
	 * NetPosition3.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmSafekeepingAccount
	 * TradeLeg10.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmSafekeepingAccount
	 * TradeLeg9.mmSafekeepingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation8#mmSafekeepingAccount
	 * SettlementObligation8.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndAccount78.mmClearingAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount31.mmClearingAccount,
					com.tools20022.repository.msg.SettlementObligation1.mmSafekeepingAccount, com.tools20022.repository.msg.SettlementObligation6.mmSafekeepingAccount, com.tools20022.repository.msg.TradeLegStatement1.mmClearingAccount,
					com.tools20022.repository.msg.TradeLegStatement2.mmClearingAccount, com.tools20022.repository.msg.NetPosition1.mmClearingAccount, com.tools20022.repository.msg.NetPosition2.mmClearingAccount,
					com.tools20022.repository.msg.TradeLeg8.mmSafekeepingAccount, com.tools20022.repository.msg.TradeLegStatement3.mmClearingAccount, com.tools20022.repository.msg.SettlementObligation7.mmSafekeepingAccount,
					com.tools20022.repository.msg.NetPosition3.mmClearingAccount, com.tools20022.repository.msg.TradeLeg10.mmSafekeepingAccount, com.tools20022.repository.msg.TradeLeg9.mmSafekeepingAccount,
					com.tools20022.repository.msg.SettlementObligation8.mmSafekeepingAccount);
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the CCP through which the trade must be cleared (sometimes called position account).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> marginAccount;
	/**
	 * Margin account where the negociation and liquidation risks will be
	 * calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmMarginAccountOwner
	 * SecuritiesAccount.mmMarginAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmMarginAccount
	 * TradeLeg3.mmMarginAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmMarginAccount
	 * TradeLeg6.mmMarginAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmMarginAccount
	 * TradeLeg9.mmMarginAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin account where the negociation and liquidation risks will be calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarginAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeLeg3.mmMarginAccount, com.tools20022.repository.msg.TradeLeg6.mmMarginAccount, com.tools20022.repository.msg.TradeLeg9.mmMarginAccount);
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginAccount";
			definition = "Margin account where the negociation and liquidation risks will be calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesAccount> deliveryAccount;
	/**
	 * Account opened by the central counterparty in the name of the clearing
	 * member within the account structure, for settlement purposes (gives
	 * information about the clearing member account at central counterparty).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmDeliveryAccountOwner
	 * SecuritiesAccount.mmDeliveryAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmDeliveryAccount
	 * SettlementObligation1.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmDeliveryAccount
	 * SettlementObligation6.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg3#mmDeliveryAccount
	 * TradeLeg3.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmDeliveryAccount
	 * TradeLeg6.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition1#mmDeliveryAccount
	 * NetPosition1.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmDeliveryAccount
	 * NetPosition2.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmDeliveryAccount
	 * SettlementObligation7.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmDeliveryAccount
	 * NetPosition3.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmDeliveryAccount
	 * TradeLeg9.mmDeliveryAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeliveryAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementObligation1.mmDeliveryAccount, com.tools20022.repository.msg.SettlementObligation6.mmDeliveryAccount,
					com.tools20022.repository.msg.TradeLeg3.mmDeliveryAccount, com.tools20022.repository.msg.TradeLeg6.mmDeliveryAccount, com.tools20022.repository.msg.NetPosition1.mmDeliveryAccount,
					com.tools20022.repository.msg.NetPosition2.mmDeliveryAccount, com.tools20022.repository.msg.SettlementObligation7.mmDeliveryAccount, com.tools20022.repository.msg.NetPosition3.mmDeliveryAccount,
					com.tools20022.repository.msg.TradeLeg9.mmDeliveryAccount);
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryAccount";
			definition = "Account opened by the central counterparty in the name of the clearing member within the account structure, for settlement purposes (gives information about the clearing member account at central counterparty).";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> defaultFundAccount;
	/**
	 * Specifies the account identification of the clearing member at the ICSD
	 * (International Central Securities Depository) or at the Central Bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmDefaultFundAccountOwner
	 * Account.mmDefaultFundAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDefaultFundAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccount";
			definition = "Specifies the account identification of the clearing member at the ICSD (International Central Securities Depository) or at the Central Bank.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmDefaultFundAccountOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected ClearingMemberRole clearingSegment;
	/**
	 * Clearing segment within a clearing organisation that allows the
	 * segregation of flows coming from clearing counterparty's clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmRelatedClearingMemberRole
	 * ClearingMemberRole.mmRelatedClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingSegment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing segment within a clearing organisation that allows the segregation of flows coming from clearing counterparty's clearing system. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmRelatedClearingMemberRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};
	protected ClearingMemberRole relatedClearingMemberRole;
	/**
	 * Clearing member for which a clearing segment is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingSegment
	 * ClearingMemberRole.mmClearingSegment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedClearingMemberRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing member for which a clearing segment is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedClearingMemberRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedClearingMemberRole";
			definition = "Clearing member for which a clearing segment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmClearingSegment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingMemberRole";
				definition = "Member of an exchange's clearing corporation, responsible for executing client trades and involved in the clearing of trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmDefaultFundAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmClearingAccountOwner,
						com.tools20022.repository.entity.SecuritiesAccount.mmMarginAccountOwner, com.tools20022.repository.entity.SecuritiesAccount.mmDeliveryAccountOwner,
						com.tools20022.repository.entity.CashClearingSystemMember.mmClearingMember, com.tools20022.repository.entity.ClearingMemberRole.mmClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.mmRelatedClearingMemberRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetObligation1.mmNetServiceCounterpartyIdentification, com.tools20022.repository.msg.CutOffData1.mmParticipantIdentification);
				superType_lazy = () -> SystemPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingMemberRole.mmClearingSystemMemberIdentification, com.tools20022.repository.entity.ClearingMemberRole.mmSide,
						com.tools20022.repository.entity.ClearingMemberRole.mmClearingAccount, com.tools20022.repository.entity.ClearingMemberRole.mmMarginAccount, com.tools20022.repository.entity.ClearingMemberRole.mmDeliveryAccount,
						com.tools20022.repository.entity.ClearingMemberRole.mmDefaultFundAccount, com.tools20022.repository.entity.ClearingMemberRole.mmClearingSegment,
						com.tools20022.repository.entity.ClearingMemberRole.mmRelatedClearingMemberRole);
			}
		});
		return mmObject_lazy.get();
	}

	public CashClearingSystemMember getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification;
	}

	public void setClearingSystemMemberIdentification(com.tools20022.repository.entity.CashClearingSystemMember clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
	}

	public ClearingSideCode getSide() {
		return side;
	}

	public void setSide(ClearingSideCode side) {
		this.side = side;
	}

	public List<SecuritiesAccount> getClearingAccount() {
		return clearingAccount;
	}

	public void setClearingAccount(List<com.tools20022.repository.entity.SecuritiesAccount> clearingAccount) {
		this.clearingAccount = clearingAccount;
	}

	public List<SecuritiesAccount> getMarginAccount() {
		return marginAccount;
	}

	public void setMarginAccount(List<com.tools20022.repository.entity.SecuritiesAccount> marginAccount) {
		this.marginAccount = marginAccount;
	}

	public List<SecuritiesAccount> getDeliveryAccount() {
		return deliveryAccount;
	}

	public void setDeliveryAccount(List<com.tools20022.repository.entity.SecuritiesAccount> deliveryAccount) {
		this.deliveryAccount = deliveryAccount;
	}

	public List<Account> getDefaultFundAccount() {
		return defaultFundAccount;
	}

	public void setDefaultFundAccount(List<com.tools20022.repository.entity.Account> defaultFundAccount) {
		this.defaultFundAccount = defaultFundAccount;
	}

	public ClearingMemberRole getClearingSegment() {
		return clearingSegment;
	}

	public void setClearingSegment(com.tools20022.repository.entity.ClearingMemberRole clearingSegment) {
		this.clearingSegment = clearingSegment;
	}

	public ClearingMemberRole getRelatedClearingMemberRole() {
		return relatedClearingMemberRole;
	}

	public void setRelatedClearingMemberRole(com.tools20022.repository.entity.ClearingMemberRole relatedClearingMemberRole) {
		this.relatedClearingMemberRole = relatedClearingMemberRole;
	}
}