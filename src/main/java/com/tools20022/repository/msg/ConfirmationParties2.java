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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parties used for acting parties that apply either to the whole message or to
 * individual sides.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmBuyer
 * ConfirmationParties2.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmBorrower
 * ConfirmationParties2.mmBorrower}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmSeller
 * ConfirmationParties2.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmLender
 * ConfirmationParties2.mmLender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmBrokerOfCredit
 * ConfirmationParties2.mmBrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmIntroducingFirm
 * ConfirmationParties2.mmIntroducingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmStepInFirm
 * ConfirmationParties2.mmStepInFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmStepOutFirm
 * ConfirmationParties2.mmStepOutFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmClearingFirm
 * ConfirmationParties2.mmClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmExecutingBroker
 * ConfirmationParties2.mmExecutingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmCMUParty
 * ConfirmationParties2.mmCMUParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmCMUCounterparty
 * ConfirmationParties2.mmCMUCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmAffirmingParty
 * ConfirmationParties2.mmAffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmTradeBeneficiaryParty
 * ConfirmationParties2.mmTradeBeneficiaryParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV01#mmConfirmationParties
 * SecuritiesTradeConfirmationV01.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV02#mmConfirmationParties
 * SecuritiesTradeConfirmationV02.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesEndOfProcessReportV01#mmConfirmationParties
 * SecuritiesEndOfProcessReportV01.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmConfirmationParties
 * SecuritiesTradeConfirmationV03.mmConfirmationParties}</li>
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
 * "ConfirmationParties2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parties used for acting parties that apply either to the whole message or to individual sides."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ConfirmationParties2", propOrder = {"buyer", "borrower", "seller", "lender", "brokerOfCredit", "introducingFirm", "stepInFirm", "stepOutFirm", "clearingFirm", "executingBroker", "CMUParty", "CMUCounterparty",
		"affirmingParty", "tradeBeneficiaryParty"})
public class ConfirmationParties2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ConfirmationPartyDetails2 buyer;
	/**
	 * Party that buys goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuyer = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 borrower;
	/**
	 * Party that has applied, met specific requirements, and received a
	 * monetary or securities loan from a lender. The party initiating the
	 * request signs a promissory note agreeing to pay the lien holder back
	 * during a specified timeframe for the entire loan amount plus any
	 * additional fees. The borrower is legally responsible for repayment of the
	 * loan and is subject to any penalties for not repaying the loan back based
	 * on the lending terms agreed upon.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Borrower Borrower}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brrwr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that has applied, met specific requirements, and received a monetary or securities loan from a lender. The party initiating the request signs a promissory note agreeing to pay the lien holder back during a specified timeframe for the entire loan amount plus any additional fees. The borrower is legally responsible for repayment of the loan and is subject to any penalties for not repaying the loan back based on the lending terms agreed upon."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBorrower = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Borrower.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Brrwr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrower";
			definition = "Party that has applied, met specific requirements, and received a monetary or securities loan from a lender. The party initiating the request signs a promissory note agreeing to pay the lien holder back during a specified timeframe for the entire loan amount plus any additional fees. The borrower is legally responsible for repayment of the loan and is subject to any penalties for not repaying the loan back based on the lending terms agreed upon.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 seller;
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeller = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails2 lender;
	/**
	 * A private, public or institutional entity which makes funds available to
	 * others to borrow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lender Lender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A private, public or institutional entity which makes funds available to others to borrow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLender = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Lender.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Lndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lender";
			definition = "A private, public or institutional entity which makes funds available to others to borrow.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails2.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 brokerOfCredit;
	/**
	 * Brokerage firm which is the commissioned broker in a multi-broker trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkrOfCdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Brokerage firm which is the commissioned broker in a multi-broker trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBrokerOfCredit = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Broker.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "BrkrOfCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Brokerage firm which is the commissioned broker in a multi-broker trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 introducingFirm;
	/**
	 * Broker or other intermediary with the closest association with the
	 * investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntroducingFirm
	 * IntroducingFirm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrdcgFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntroducingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Broker or other intermediary with the closest association with the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntroducingFirm = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> IntroducingFirm.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "IntrdcgFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Broker or other intermediary with the closest association with the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 stepInFirm;
	/**
	 * Brokerage firm assigned to take credit on the trade from the step-out
	 * brokerage firm.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StepInBroker StepInBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StepInFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepInFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Brokerage firm assigned to take credit on the trade from the step-out brokerage firm."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStepInFirm = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> StepInBroker.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "StepInFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInFirm";
			definition = "Brokerage firm assigned to take credit on the trade from the step-out brokerage firm.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 stepOutFirm;
	/**
	 * Brokerage firm that executes an order, but gives other firms credit and
	 * some of the commission for the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StepOutBroker StepOutBroker}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StepOutFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepOutFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Brokerage firm that executes an order, but gives other firms credit and some of the commission for the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStepOutFirm = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> StepOutBroker.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "StepOutFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepOutFirm";
			definition = "Brokerage firm that executes an order, but gives other firms credit and some of the commission for the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails5 clearingFirm;
	/**
	 * Party, also know as take up broker, that settles security transactions
	 * from another broker for a fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5
	 * ConfirmationPartyDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBroker
	 * ClearingBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingFirm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, also know as take up broker, that settles security transactions from another broker for a fee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingFirm = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ClearingBroker.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "ClrFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingFirm";
			definition = "Party, also know as take up broker, that settles security transactions from another broker for a fee.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails5.mmObject();
		}
	};
	protected ConfirmationPartyDetails5 executingBroker;
	/**
	 * Party responsible for executing an order (for example, an executing or
	 * give-up broker). Usually a commission is charged to the client for
	 * executing an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails5
	 * ConfirmationPartyDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole
	 * ExecutingBrokerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgBrkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party responsible for executing an order (for example, an executing or give-up broker).  Usually a commission is charged to the client for executing an order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutingBroker = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ExecutingBrokerRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBroker";
			definition = "Party responsible for executing an order (for example, an executing or give-up broker).  Usually a commission is charged to the client for executing an order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails5.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 cMUParty;
	/**
	 * Party sending the message to the CMU (Central Matching Utility) to
	 * identify the actual business unit as known to the CMU (Central Matching
	 * Utility).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CMUPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party sending the message to the CMU (Central Matching Utility) to identify the actual business unit as known to the CMU (Central Matching Utility)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCMUParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "CMUPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUParty";
			definition = "Party sending the message to the CMU (Central Matching Utility) to identify the actual business unit as known to the CMU (Central Matching Utility).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 cMUCounterparty;
	/**
	 * Actual business unit of the counterparty to the sender of the message to
	 * the CMU (Central Matching Utility) as known to the CMU (Central Matching
	 * Utility).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CMUCtrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual business unit of the counterparty to the sender of the  message to the CMU (Central Matching Utility) as known to the CMU (Central Matching Utility)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCMUCounterparty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "CMUCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUCounterparty";
			definition = "Actual business unit of the counterparty to the sender of the  message to the CMU (Central Matching Utility) as known to the CMU (Central Matching Utility).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails1 affirmingParty;
	/**
	 * Party (buyer or seller) that positively affirms the details of a
	 * previously agreed security trade confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails1
	 * ConfirmationPartyDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AffirmingPartyRole
	 * AffirmingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffrmgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAffirmingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AffirmingPartyRole.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "AffrmgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails1.mmObject();
		}
	};
	protected ConfirmationPartyDetails3 tradeBeneficiaryParty;
	/**
	 * Party involved in a legal proceeding, agreement or other transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails3
	 * ConfirmationPartyDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradBnfcryPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeBeneficiaryParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party involved  in a legal proceeding, agreement or other transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeBeneficiaryParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "TradBnfcryPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeBeneficiaryParty";
			definition = "Party involved  in a legal proceeding, agreement or other transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ConfirmationParties2.mmBuyer, ConfirmationParties2.mmBorrower, ConfirmationParties2.mmSeller, ConfirmationParties2.mmLender, ConfirmationParties2.mmBrokerOfCredit,
						ConfirmationParties2.mmIntroducingFirm, ConfirmationParties2.mmStepInFirm, ConfirmationParties2.mmStepOutFirm, ConfirmationParties2.mmClearingFirm, ConfirmationParties2.mmExecutingBroker,
						ConfirmationParties2.mmCMUParty, ConfirmationParties2.mmCMUCounterparty, ConfirmationParties2.mmAffirmingParty, ConfirmationParties2.mmTradeBeneficiaryParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmConfirmationParties, SecuritiesTradeConfirmationV02.mmConfirmationParties, SecuritiesEndOfProcessReportV01.mmConfirmationParties,
						SecuritiesTradeConfirmationV03.mmConfirmationParties);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationParties2";
				definition = "Parties used for acting parties that apply either to the whole message or to individual sides.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Buyr")
	public ConfirmationPartyDetails2 getBuyer() {
		return buyer;
	}

	public void setBuyer(com.tools20022.repository.msg.ConfirmationPartyDetails2 buyer) {
		this.buyer = buyer;
	}

	@XmlElement(name = "Brrwr")
	public ConfirmationPartyDetails2 getBorrower() {
		return borrower;
	}

	public void setBorrower(com.tools20022.repository.msg.ConfirmationPartyDetails2 borrower) {
		this.borrower = borrower;
	}

	@XmlElement(name = "Sellr")
	public ConfirmationPartyDetails2 getSeller() {
		return seller;
	}

	public void setSeller(com.tools20022.repository.msg.ConfirmationPartyDetails2 seller) {
		this.seller = seller;
	}

	@XmlElement(name = "Lndr")
	public ConfirmationPartyDetails2 getLender() {
		return lender;
	}

	public void setLender(com.tools20022.repository.msg.ConfirmationPartyDetails2 lender) {
		this.lender = lender;
	}

	@XmlElement(name = "BrkrOfCdt")
	public ConfirmationPartyDetails1 getBrokerOfCredit() {
		return brokerOfCredit;
	}

	public void setBrokerOfCredit(com.tools20022.repository.msg.ConfirmationPartyDetails1 brokerOfCredit) {
		this.brokerOfCredit = brokerOfCredit;
	}

	@XmlElement(name = "IntrdcgFirm")
	public ConfirmationPartyDetails1 getIntroducingFirm() {
		return introducingFirm;
	}

	public void setIntroducingFirm(com.tools20022.repository.msg.ConfirmationPartyDetails1 introducingFirm) {
		this.introducingFirm = introducingFirm;
	}

	@XmlElement(name = "StepInFirm")
	public ConfirmationPartyDetails1 getStepInFirm() {
		return stepInFirm;
	}

	public void setStepInFirm(com.tools20022.repository.msg.ConfirmationPartyDetails1 stepInFirm) {
		this.stepInFirm = stepInFirm;
	}

	@XmlElement(name = "StepOutFirm")
	public ConfirmationPartyDetails1 getStepOutFirm() {
		return stepOutFirm;
	}

	public void setStepOutFirm(com.tools20022.repository.msg.ConfirmationPartyDetails1 stepOutFirm) {
		this.stepOutFirm = stepOutFirm;
	}

	@XmlElement(name = "ClrFirm")
	public ConfirmationPartyDetails5 getClearingFirm() {
		return clearingFirm;
	}

	public void setClearingFirm(com.tools20022.repository.msg.ConfirmationPartyDetails5 clearingFirm) {
		this.clearingFirm = clearingFirm;
	}

	@XmlElement(name = "ExctgBrkr")
	public ConfirmationPartyDetails5 getExecutingBroker() {
		return executingBroker;
	}

	public void setExecutingBroker(com.tools20022.repository.msg.ConfirmationPartyDetails5 executingBroker) {
		this.executingBroker = executingBroker;
	}

	@XmlElement(name = "CMUPty")
	public ConfirmationPartyDetails1 getCMUParty() {
		return cMUParty;
	}

	public void setCMUParty(com.tools20022.repository.msg.ConfirmationPartyDetails1 cMUParty) {
		this.cMUParty = cMUParty;
	}

	@XmlElement(name = "CMUCtrPty")
	public ConfirmationPartyDetails1 getCMUCounterparty() {
		return cMUCounterparty;
	}

	public void setCMUCounterparty(com.tools20022.repository.msg.ConfirmationPartyDetails1 cMUCounterparty) {
		this.cMUCounterparty = cMUCounterparty;
	}

	@XmlElement(name = "AffrmgPty")
	public ConfirmationPartyDetails1 getAffirmingParty() {
		return affirmingParty;
	}

	public void setAffirmingParty(com.tools20022.repository.msg.ConfirmationPartyDetails1 affirmingParty) {
		this.affirmingParty = affirmingParty;
	}

	@XmlElement(name = "TradBnfcryPty")
	public ConfirmationPartyDetails3 getTradeBeneficiaryParty() {
		return tradeBeneficiaryParty;
	}

	public void setTradeBeneficiaryParty(com.tools20022.repository.msg.ConfirmationPartyDetails3 tradeBeneficiaryParty) {
		this.tradeBeneficiaryParty = tradeBeneficiaryParty;
	}
}