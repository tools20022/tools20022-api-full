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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.secl.NetPositionV03;
import com.tools20022.repository.choice.DateFormat15Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PartyIdentification34Choice;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.codeset.TradingCapacity5Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the net positions details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmClearingAccount
 * NetPosition3.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmNonClearingMember
 * NetPosition3.mmNonClearingMember}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmDeliveryAccount
 * NetPosition3.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmFinancialInstrumentIdentification
 * NetPosition3.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmInitialPositionAmount
 * NetPosition3.mmInitialPositionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmNetPositionAmount
 * NetPosition3.mmNetPositionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAccruedInterestAmount
 * NetPosition3.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAverageDealPrice
 * NetPosition3.mmAverageDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmNetQuantity
 * NetPosition3.mmNetQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmSecuritiesMovementType
 * NetPosition3.mmSecuritiesMovementType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmDepository
 * NetPosition3.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradingCapacity
 * NetPosition3.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmPlaceOfTrade
 * NetPosition3.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradeDate
 * NetPosition3.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmSettlementDate
 * NetPosition3.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetPosition3#mmTradeLegDetails
 * NetPosition3.mmTradeLegDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmNetPositionReport
 * NetPositionV03.mmNetPositionReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryOrPlaceOfListingPresenceRule#forNetPosition3
 * ConstraintDepositoryOrPlaceOfListingPresenceRule.forNetPosition3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetPosition3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the net positions details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.NetPosition2
 * NetPosition2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetPosition3", propOrder = {"clearingAccount", "nonClearingMember", "deliveryAccount", "financialInstrumentIdentification", "initialPositionAmount", "netPositionAmount", "accruedInterestAmount", "averageDealPrice",
		"netQuantity", "securitiesMovementType", "depository", "tradingCapacity", "placeOfTrade", "tradeDate", "settlementDate", "tradeLegDetails"})
public class NetPosition3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrAcct", required = true)
	protected SecuritiesAccount18 clearingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount18
	 * SecuritiesAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the Central counterparty through which the trade must be cleared (sometimes called position account)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmClearingAccount
	 * NetPosition2.mmClearingAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmClearingAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "ClrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the Central counterparty through which the trade must be cleared (sometimes called position account).";
			previousVersion_lazy = () -> NetPosition2.mmClearingAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount18.mmObject();
		}
	};
	@XmlElement(name = "NonClrMmb")
	protected PartyIdentificationAndAccount31 nonClearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification for the non-clearing member."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmNonClearingMember
	 * NetPosition2.mmNonClearingMember}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonClearingMember = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides the identification for the non-clearing member.";
			previousVersion_lazy = () -> NetPosition2.mmNonClearingMember;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount31.mmObject();
		}
	};
	@XmlElement(name = "DlvryAcct")
	protected SecuritiesAccount19 deliveryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmDeliveryAccount
	 * ClearingMemberRole.mmDeliveryAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmDeliveryAccount
	 * NetPosition2.mmDeliveryAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveryAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmDeliveryAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "DlvryAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAccount";
			definition = "An account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository).";
			previousVersion_lazy = () -> NetPosition2.mmDeliveryAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount19.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the security identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmFinancialInstrumentIdentification
	 * NetPosition2.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			previousVersion_lazy = () -> NetPosition2.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	@XmlElement(name = "InitlPosAmt")
	protected AmountAndDirection21 initialPositionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmInitialPositionAmount
	 * Position.mmInitialPositionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlPosAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialPositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the initial position amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmInitialPositionAmount
	 * NetPosition2.mmInitialPositionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitialPositionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Position.mmInitialPositionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "InitlPosAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialPositionAmount";
			definition = "Provides the initial position amount.";
			previousVersion_lazy = () -> NetPosition2.mmInitialPositionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	@XmlElement(name = "NetPosAmt", required = true)
	protected AmountAndDirection21 netPositionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmNetPositionAmount
	 * Position.mmNetPositionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPosAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPositionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the net position amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmNetPositionAmount
	 * NetPosition2.mmNetPositionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetPositionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Position.mmNetPositionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "NetPosAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPositionAmount";
			definition = "Provides the net position amount.";
			previousVersion_lazy = () -> NetPosition2.mmNetPositionAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection21 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmAccruedInterestAmount
	 * NetPosition2.mmAccruedInterestAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date.";
			previousVersion_lazy = () -> NetPosition2.mmAccruedInterestAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection21.mmObject();
		}
	};
	@XmlElement(name = "AvrgDealPric")
	protected Price4 averageDealPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgDealPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageDealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "This is the price of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmAverageDealPrice
	 * NetPosition2.mmAverageDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAverageDealPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "AvrgDealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDealPrice";
			definition = "This is the price of the trade.";
			previousVersion_lazy = () -> NetPosition2.mmAverageDealPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Price4.mmObject();
		}
	};
	@XmlElement(name = "NetQty", required = true)
	protected FinancialInstrumentQuantity1Choice netQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmNetQuantity
	 * Position.mmNetQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the quantity of the trade leg."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmNetQuantity
	 * NetPosition2.mmNetQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Position.mmNetQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "NetQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetQuantity";
			definition = "Identifies the quantity of the trade leg.";
			previousVersion_lazy = () -> NetPosition2.mmNetQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesMvmntTp", required = true)
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
	 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the securities movement direction, that is, whether this is a delivery or return."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmSecuritiesMovementType
	 * NetPosition2.mmSecuritiesMovementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesMovementType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Indicates the securities movement direction, that is, whether this is a delivery or return.";
			previousVersion_lazy = () -> NetPosition2.mmSecuritiesMovementType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}
	};
	@XmlElement(name = "Dpstry", required = true)
	protected PartyIdentification34Choice depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification34Choice
	 * PartyIdentification34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place at which a trade settles."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmDepository
	 * NetPosition2.mmDepository}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepository = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "Place at which a trade settles.";
			previousVersion_lazy = () -> NetPosition2.mmDepository;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification34Choice.mmObject();
		}
	};
	@XmlElement(name = "TradgCpcty")
	protected TradingCapacity5Code tradingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
	 * TradingCapacity5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the trading capacity of the seller."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmTradingCapacity
	 * NetPosition2.mmTradingCapacity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Identifies the trading capacity of the seller.";
			previousVersion_lazy = () -> NetPosition2.mmTradingCapacity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradingCapacity5Code.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected MarketIdentification20 placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification20
	 * MarketIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmMarket
	 * Trade.mmMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place at which the security is traded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmPlaceOfTrade
	 * NetPosition2.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmMarket;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place at which the security is traded.";
			previousVersion_lazy = () -> NetPosition2.mmPlaceOfTrade;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MarketIdentification20.mmObject();
		}
	};
	@XmlElement(name = "TradDt")
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmTradeDate
	 * NetPosition2.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Provides the date of the trade.";
			previousVersion_lazy = () -> NetPosition2.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt")
	protected DateFormat15Choice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat15Choice
	 * DateFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the contractual settlement date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmSettlementDate
	 * NetPosition2.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Provides the contractual settlement date.";
			previousVersion_lazy = () -> NetPosition2.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat15Choice.mmObject();
		}
	};
	@XmlElement(name = "TradLegDtls")
	protected List<com.tools20022.repository.msg.TradeLeg10> tradeLegDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeLeg10 TradeLeg10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition3 NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLegDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the trade leg details such as trade leg identification and trade type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NetPosition2#mmTradeLegDetails
	 * NetPosition2.mmTradeLegDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeLegDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NetPosition3.mmObject();
			isDerived = false;
			xmlTag = "TradLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegDetails";
			definition = "Provides the trade leg details such as trade leg identification and trade type.";
			previousVersion_lazy = () -> NetPosition2.mmTradeLegDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeLeg10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetPosition3.mmClearingAccount, com.tools20022.repository.msg.NetPosition3.mmNonClearingMember,
						com.tools20022.repository.msg.NetPosition3.mmDeliveryAccount, com.tools20022.repository.msg.NetPosition3.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.NetPosition3.mmInitialPositionAmount,
						com.tools20022.repository.msg.NetPosition3.mmNetPositionAmount, com.tools20022.repository.msg.NetPosition3.mmAccruedInterestAmount, com.tools20022.repository.msg.NetPosition3.mmAverageDealPrice,
						com.tools20022.repository.msg.NetPosition3.mmNetQuantity, com.tools20022.repository.msg.NetPosition3.mmSecuritiesMovementType, com.tools20022.repository.msg.NetPosition3.mmDepository,
						com.tools20022.repository.msg.NetPosition3.mmTradingCapacity, com.tools20022.repository.msg.NetPosition3.mmPlaceOfTrade, com.tools20022.repository.msg.NetPosition3.mmTradeDate,
						com.tools20022.repository.msg.NetPosition3.mmSettlementDate, com.tools20022.repository.msg.NetPosition3.mmTradeLegDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetPositionV03.mmNetPositionReport);
				trace_lazy = () -> Position.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryOrPlaceOfListingPresenceRule.forNetPosition3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetPosition3";
				definition = "Provides the net positions details.";
				previousVersion_lazy = () -> NetPosition2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount18 getClearingAccount() {
		return clearingAccount;
	}

	public NetPosition3 setClearingAccount(com.tools20022.repository.msg.SecuritiesAccount18 clearingAccount) {
		this.clearingAccount = Objects.requireNonNull(clearingAccount);
		return this;
	}

	public Optional<PartyIdentificationAndAccount31> getNonClearingMember() {
		return nonClearingMember == null ? Optional.empty() : Optional.of(nonClearingMember);
	}

	public NetPosition3 setNonClearingMember(com.tools20022.repository.msg.PartyIdentificationAndAccount31 nonClearingMember) {
		this.nonClearingMember = nonClearingMember;
		return this;
	}

	public Optional<SecuritiesAccount19> getDeliveryAccount() {
		return deliveryAccount == null ? Optional.empty() : Optional.of(deliveryAccount);
	}

	public NetPosition3 setDeliveryAccount(com.tools20022.repository.msg.SecuritiesAccount19 deliveryAccount) {
		this.deliveryAccount = deliveryAccount;
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public NetPosition3 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<AmountAndDirection21> getInitialPositionAmount() {
		return initialPositionAmount == null ? Optional.empty() : Optional.of(initialPositionAmount);
	}

	public NetPosition3 setInitialPositionAmount(com.tools20022.repository.msg.AmountAndDirection21 initialPositionAmount) {
		this.initialPositionAmount = initialPositionAmount;
		return this;
	}

	public AmountAndDirection21 getNetPositionAmount() {
		return netPositionAmount;
	}

	public NetPosition3 setNetPositionAmount(com.tools20022.repository.msg.AmountAndDirection21 netPositionAmount) {
		this.netPositionAmount = Objects.requireNonNull(netPositionAmount);
		return this;
	}

	public Optional<AmountAndDirection21> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public NetPosition3 setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection21 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<Price4> getAverageDealPrice() {
		return averageDealPrice == null ? Optional.empty() : Optional.of(averageDealPrice);
	}

	public NetPosition3 setAverageDealPrice(com.tools20022.repository.msg.Price4 averageDealPrice) {
		this.averageDealPrice = averageDealPrice;
		return this;
	}

	public FinancialInstrumentQuantity1Choice getNetQuantity() {
		return netQuantity;
	}

	public NetPosition3 setNetQuantity(FinancialInstrumentQuantity1Choice netQuantity) {
		this.netQuantity = Objects.requireNonNull(netQuantity);
		return this;
	}

	public ReceiveDelivery1Code getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public NetPosition3 setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public PartyIdentification34Choice getDepository() {
		return depository;
	}

	public NetPosition3 setDepository(PartyIdentification34Choice depository) {
		this.depository = Objects.requireNonNull(depository);
		return this;
	}

	public Optional<TradingCapacity5Code> getTradingCapacity() {
		return tradingCapacity == null ? Optional.empty() : Optional.of(tradingCapacity);
	}

	public NetPosition3 setTradingCapacity(TradingCapacity5Code tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
		return this;
	}

	public Optional<MarketIdentification20> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public NetPosition3 setPlaceOfTrade(com.tools20022.repository.msg.MarketIdentification20 placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODate> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public NetPosition3 setTradeDate(ISODate tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<DateFormat15Choice> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public NetPosition3 setSettlementDate(DateFormat15Choice settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public List<TradeLeg10> getTradeLegDetails() {
		return tradeLegDetails == null ? tradeLegDetails = new ArrayList<>() : tradeLegDetails;
	}

	public NetPosition3 setTradeLegDetails(List<com.tools20022.repository.msg.TradeLeg10> tradeLegDetails) {
		this.tradeLegDetails = Objects.requireNonNull(tradeLegDetails);
		return this;
	}
}