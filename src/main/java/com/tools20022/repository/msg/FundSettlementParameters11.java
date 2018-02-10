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
import com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice;
import com.tools20022.repository.choice.SettlementTransactionCondition30Choice;
import com.tools20022.repository.choice.TradeTransactionCondition8Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlement;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementDate
 * FundSettlementParameters11.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementPlace
 * FundSettlementParameters11.mmSettlementPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSafekeepingPlace
 * FundSettlementParameters11.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSecuritiesSettlementSystemIdentification
 * FundSettlementParameters11.mmSecuritiesSettlementSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmTradeTransactionCondition
 * FundSettlementParameters11.mmTradeTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmSettlementTransactionCondition
 * FundSettlementParameters11.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmReceivingSideDetails
 * FundSettlementParameters11.mmReceivingSideDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11#mmDeliveringSideDetails
 * FundSettlementParameters11.mmDeliveringSideDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
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
 * "FundSettlementParameters11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4
 * FundSettlementParameters4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundSettlementParameters11", propOrder = {"settlementDate", "settlementPlace", "safekeepingPlace", "securitiesSettlementSystemIdentification", "tradeTransactionCondition", "settlementTransactionCondition",
		"receivingSideDetails", "deliveringSideDetails"})
public class FundSettlementParameters11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmDt")
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
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
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmSettlementDate
	 * FundSettlementParameters4.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			previousVersion_lazy = () -> FundSettlementParameters4.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "SttlmPlc", required = true)
	protected PartyIdentification113 settlementPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the settlement of the transaction will take place. In the context of investment funds, the place of settlement is the transfer agent, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmSettlementPlace
	 * FundSettlementParameters4.mmSettlementPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementPlace = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "SttlmPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPlace";
			definition = "Place where the settlement of the transaction will take place. In the context of investment funds, the place of settlement is the transfer agent, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			previousVersion_lazy = () -> FundSettlementParameters4.mmSettlementPlace;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification113.mmObject();
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat8Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice
	 * SafekeepingPlaceFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository or an International Central Securities Depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmSafekeepingPlace
	 * FundSettlementParameters4.mmSafekeepingPlace}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingPlace = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository or an International Central Securities Depository.";
			previousVersion_lazy = () -> FundSettlementParameters4.mmSafekeepingPlace;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingPlaceFormat8Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesSttlmSysId")
	protected Max35Text securitiesSettlementSystemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmSysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a specific system or set of rules and/or processes to be applied at the settlement place."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmSecuritiesSettlementSystemIdentification
	 * FundSettlementParameters4.mmSecuritiesSettlementSystemIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementSystemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystemIdentification";
			definition = "Identification of a specific system or set of rules and/or processes to be applied at the settlement place.";
			previousVersion_lazy = () -> FundSettlementParameters4.mmSecuritiesSettlementSystemIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TradTxCond")
	protected List<TradeTransactionCondition8Choice> tradeTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionCondition8Choice
	 * TradeTransactionCondition8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeTransactionCondition
	 * SecuritiesTrade.mmTradeTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Condition under which the order/trade is to be/was executed. This may be required for settlement through T2S."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeTransactionCondition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "TradTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionCondition";
			definition = "Condition under which the order/trade is to be/was executed. This may be required for settlement through T2S.";
			minOccurs = 0;
			complexType_lazy = () -> TradeTransactionCondition8Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmTxCond")
	protected List<SettlementTransactionCondition30Choice> settlementTransactionCondition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementTransactionCondition30Choice
	 * SettlementTransactionCondition30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
	 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTxCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Condition under which the order/trade is to be settled. This may be required for settlement through T2S."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTransactionCondition = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementTransactionCondition;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "SttlmTxCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Condition under which the order/trade is to be settled. This may be required for settlement through T2S.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTransactionCondition30Choice.mmObject();
		}
	};
	@XmlElement(name = "RcvgSdDtls", required = true)
	protected ReceivingPartiesAndAccount16 receivingSideDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction resulting in the movement of a security from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmReceivingSideDetails
	 * FundSettlementParameters4.mmReceivingSideDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSideDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "RcvgSdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSideDetails";
			definition = "Chain of parties involved in the settlement of a transaction resulting in the movement of a security from one account to another.";
			previousVersion_lazy = () -> FundSettlementParameters4.mmReceivingSideDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmObject();
		}
	};
	@XmlElement(name = "DlvrgSdDtls")
	protected DeliveringPartiesAndAccount16 deliveringSideDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSideDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction resulting in the movement of a security from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4#mmDeliveringSideDetails
	 * FundSettlementParameters4.mmDeliveringSideDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSideDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters11.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSideDetails";
			definition = "Chain of parties involved in the settlement of a transaction resulting in the movement of a security from one account to another.";
			previousVersion_lazy = () -> FundSettlementParameters4.mmDeliveringSideDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundSettlementParameters11.mmSettlementDate, com.tools20022.repository.msg.FundSettlementParameters11.mmSettlementPlace,
						com.tools20022.repository.msg.FundSettlementParameters11.mmSafekeepingPlace, com.tools20022.repository.msg.FundSettlementParameters11.mmSecuritiesSettlementSystemIdentification,
						com.tools20022.repository.msg.FundSettlementParameters11.mmTradeTransactionCondition, com.tools20022.repository.msg.FundSettlementParameters11.mmSettlementTransactionCondition,
						com.tools20022.repository.msg.FundSettlementParameters11.mmReceivingSideDetails, com.tools20022.repository.msg.FundSettlementParameters11.mmDeliveringSideDetails);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundSettlementParameters11";
				definition = "Parameters applied to the settlement of a security.";
				previousVersion_lazy = () -> FundSettlementParameters4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public FundSettlementParameters11 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public PartyIdentification113 getSettlementPlace() {
		return settlementPlace;
	}

	public FundSettlementParameters11 setSettlementPlace(com.tools20022.repository.msg.PartyIdentification113 settlementPlace) {
		this.settlementPlace = Objects.requireNonNull(settlementPlace);
		return this;
	}

	public Optional<SafekeepingPlaceFormat8Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public FundSettlementParameters11 setSafekeepingPlace(SafekeepingPlaceFormat8Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystemIdentification() {
		return securitiesSettlementSystemIdentification == null ? Optional.empty() : Optional.of(securitiesSettlementSystemIdentification);
	}

	public FundSettlementParameters11 setSecuritiesSettlementSystemIdentification(Max35Text securitiesSettlementSystemIdentification) {
		this.securitiesSettlementSystemIdentification = securitiesSettlementSystemIdentification;
		return this;
	}

	public List<TradeTransactionCondition8Choice> getTradeTransactionCondition() {
		return tradeTransactionCondition == null ? tradeTransactionCondition = new ArrayList<>() : tradeTransactionCondition;
	}

	public FundSettlementParameters11 setTradeTransactionCondition(List<TradeTransactionCondition8Choice> tradeTransactionCondition) {
		this.tradeTransactionCondition = Objects.requireNonNull(tradeTransactionCondition);
		return this;
	}

	public List<SettlementTransactionCondition30Choice> getSettlementTransactionCondition() {
		return settlementTransactionCondition == null ? settlementTransactionCondition = new ArrayList<>() : settlementTransactionCondition;
	}

	public FundSettlementParameters11 setSettlementTransactionCondition(List<SettlementTransactionCondition30Choice> settlementTransactionCondition) {
		this.settlementTransactionCondition = Objects.requireNonNull(settlementTransactionCondition);
		return this;
	}

	public ReceivingPartiesAndAccount16 getReceivingSideDetails() {
		return receivingSideDetails;
	}

	public FundSettlementParameters11 setReceivingSideDetails(com.tools20022.repository.msg.ReceivingPartiesAndAccount16 receivingSideDetails) {
		this.receivingSideDetails = Objects.requireNonNull(receivingSideDetails);
		return this;
	}

	public Optional<DeliveringPartiesAndAccount16> getDeliveringSideDetails() {
		return deliveringSideDetails == null ? Optional.empty() : Optional.of(deliveringSideDetails);
	}

	public FundSettlementParameters11 setDeliveringSideDetails(com.tools20022.repository.msg.DeliveringPartiesAndAccount16 deliveringSideDetails) {
		this.deliveringSideDetails = deliveringSideDetails;
		return this;
	}
}