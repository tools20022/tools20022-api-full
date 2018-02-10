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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmInvestor
 * ConfirmationParties4.mmInvestor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmBuyer
 * ConfirmationParties4.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmBorrower
 * ConfirmationParties4.mmBorrower}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmSeller
 * ConfirmationParties4.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmLender
 * ConfirmationParties4.mmLender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmBrokerOfCredit
 * ConfirmationParties4.mmBrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmIntroducingFirm
 * ConfirmationParties4.mmIntroducingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmStepInFirm
 * ConfirmationParties4.mmStepInFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmStepOutFirm
 * ConfirmationParties4.mmStepOutFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmClearingFirm
 * ConfirmationParties4.mmClearingFirm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmExecutingBroker
 * ConfirmationParties4.mmExecutingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmAffirmingParty
 * ConfirmationParties4.mmAffirmingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmTradeBeneficiaryParty
 * ConfirmationParties4.mmTradeBeneficiaryParty}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV01#mmConfirmationParties
 * SecuritiesTradeConfirmationStatusAdviceV01.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmConfirmationParties
 * SecuritiesTradeConfirmationStatusAdviceV02.mmConfirmationParties}</li>
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
 * "ConfirmationParties4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parties used for acting parties that apply either to the whole message or to individual sides."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConfirmationParties4", propOrder = {"investor", "buyer", "borrower", "seller", "lender", "brokerOfCredit", "introducingFirm", "stepInFirm", "stepOutFirm", "clearingFirm", "executingBroker", "affirmingParty",
		"tradeBeneficiaryParty"})
public class ConfirmationParties4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Invstr")
	protected List<com.tools20022.repository.msg.PartyIdentificationAndAccount79> investor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount79
	 * PartyIdentificationAndAccount79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 452, FIXSynonym: 448, FIXSynonym: 447</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that identifies the underlying investor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "Invstr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "452"), new FIXSynonym(this, "448"), new FIXSynonym(this, "447"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party that identifies the underlying investor.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount79.mmObject();
		}
	};
	@XmlElement(name = "Buyr")
	protected ConfirmationPartyDetails2 buyer;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
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
	@XmlElement(name = "Brrwr")
	protected ConfirmationPartyDetails2 borrower;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
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
	@XmlElement(name = "Sellr")
	protected ConfirmationPartyDetails2 seller;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
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
	@XmlElement(name = "Lndr")
	protected ConfirmationPartyDetails2 lender;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
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
	@XmlElement(name = "BrkrOfCdt")
	protected ConfirmationPartyDetails3 brokerOfCredit;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "BrkrOfCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Brokerage firm which is the commissioned broker in a multi-broker trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails3.mmObject();
		}
	};
	@XmlElement(name = "IntrdcgFirm")
	protected ConfirmationPartyDetails3 introducingFirm;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.IntroducingFirm
	 * IntroducingFirm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "IntrdcgFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Broker or other intermediary with the closest association with the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails3.mmObject();
		}
	};
	@XmlElement(name = "StepInFirm")
	protected ConfirmationPartyDetails1 stepInFirm;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
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
	@XmlElement(name = "StepOutFirm")
	protected ConfirmationPartyDetails1 stepOutFirm;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
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
	@XmlElement(name = "ClrFirm")
	protected ConfirmationPartyDetails6 clearingFirm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6
	 * ConfirmationPartyDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBroker
	 * ClearingBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "ClrFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingFirm";
			definition = "Party, also know as take up broker, that settles security transactions from another broker for a fee.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails6.mmObject();
		}
	};
	@XmlElement(name = "ExctgBrkr")
	protected ConfirmationPartyDetails6 executingBroker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails6
	 * ConfirmationPartyDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole
	 * ExecutingBrokerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBroker";
			definition = "Party responsible for executing an order (for example, an executing or give-up broker).  Usually a commission is charged to the client for executing an order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails6.mmObject();
		}
	};
	@XmlElement(name = "AffrmgPty")
	protected ConfirmationPartyDetails3 affirmingParty;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.AffirmingPartyRole
	 * AffirmingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "AffrmgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails3.mmObject();
		}
	};
	@XmlElement(name = "TradBnfcryPty")
	protected ConfirmationPartyDetails3 tradeBeneficiaryParty;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4
	 * ConfirmationParties4}</li>
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
	 * "Party involved  in a legal proceeding, agreement, or other transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeBeneficiaryParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties4.mmObject();
			isDerived = false;
			xmlTag = "TradBnfcryPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeBeneficiaryParty";
			definition = "Party involved  in a legal proceeding, agreement, or other transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ConfirmationPartyDetails3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationParties4.mmInvestor, com.tools20022.repository.msg.ConfirmationParties4.mmBuyer,
						com.tools20022.repository.msg.ConfirmationParties4.mmBorrower, com.tools20022.repository.msg.ConfirmationParties4.mmSeller, com.tools20022.repository.msg.ConfirmationParties4.mmLender,
						com.tools20022.repository.msg.ConfirmationParties4.mmBrokerOfCredit, com.tools20022.repository.msg.ConfirmationParties4.mmIntroducingFirm, com.tools20022.repository.msg.ConfirmationParties4.mmStepInFirm,
						com.tools20022.repository.msg.ConfirmationParties4.mmStepOutFirm, com.tools20022.repository.msg.ConfirmationParties4.mmClearingFirm, com.tools20022.repository.msg.ConfirmationParties4.mmExecutingBroker,
						com.tools20022.repository.msg.ConfirmationParties4.mmAffirmingParty, com.tools20022.repository.msg.ConfirmationParties4.mmTradeBeneficiaryParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV01.mmConfirmationParties, SecuritiesTradeConfirmationStatusAdviceV02.mmConfirmationParties);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationParties4";
				definition = "Parties used for acting parties that apply either to the whole message or to individual sides.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentificationAndAccount79> getInvestor() {
		return investor == null ? investor = new ArrayList<>() : investor;
	}

	public ConfirmationParties4 setInvestor(List<com.tools20022.repository.msg.PartyIdentificationAndAccount79> investor) {
		this.investor = Objects.requireNonNull(investor);
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getBuyer() {
		return buyer == null ? Optional.empty() : Optional.of(buyer);
	}

	public ConfirmationParties4 setBuyer(com.tools20022.repository.msg.ConfirmationPartyDetails2 buyer) {
		this.buyer = buyer;
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getBorrower() {
		return borrower == null ? Optional.empty() : Optional.of(borrower);
	}

	public ConfirmationParties4 setBorrower(com.tools20022.repository.msg.ConfirmationPartyDetails2 borrower) {
		this.borrower = borrower;
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getSeller() {
		return seller == null ? Optional.empty() : Optional.of(seller);
	}

	public ConfirmationParties4 setSeller(com.tools20022.repository.msg.ConfirmationPartyDetails2 seller) {
		this.seller = seller;
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getLender() {
		return lender == null ? Optional.empty() : Optional.of(lender);
	}

	public ConfirmationParties4 setLender(com.tools20022.repository.msg.ConfirmationPartyDetails2 lender) {
		this.lender = lender;
		return this;
	}

	public Optional<ConfirmationPartyDetails3> getBrokerOfCredit() {
		return brokerOfCredit == null ? Optional.empty() : Optional.of(brokerOfCredit);
	}

	public ConfirmationParties4 setBrokerOfCredit(com.tools20022.repository.msg.ConfirmationPartyDetails3 brokerOfCredit) {
		this.brokerOfCredit = brokerOfCredit;
		return this;
	}

	public Optional<ConfirmationPartyDetails3> getIntroducingFirm() {
		return introducingFirm == null ? Optional.empty() : Optional.of(introducingFirm);
	}

	public ConfirmationParties4 setIntroducingFirm(com.tools20022.repository.msg.ConfirmationPartyDetails3 introducingFirm) {
		this.introducingFirm = introducingFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getStepInFirm() {
		return stepInFirm == null ? Optional.empty() : Optional.of(stepInFirm);
	}

	public ConfirmationParties4 setStepInFirm(com.tools20022.repository.msg.ConfirmationPartyDetails1 stepInFirm) {
		this.stepInFirm = stepInFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getStepOutFirm() {
		return stepOutFirm == null ? Optional.empty() : Optional.of(stepOutFirm);
	}

	public ConfirmationParties4 setStepOutFirm(com.tools20022.repository.msg.ConfirmationPartyDetails1 stepOutFirm) {
		this.stepOutFirm = stepOutFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails6> getClearingFirm() {
		return clearingFirm == null ? Optional.empty() : Optional.of(clearingFirm);
	}

	public ConfirmationParties4 setClearingFirm(com.tools20022.repository.msg.ConfirmationPartyDetails6 clearingFirm) {
		this.clearingFirm = clearingFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails6> getExecutingBroker() {
		return executingBroker == null ? Optional.empty() : Optional.of(executingBroker);
	}

	public ConfirmationParties4 setExecutingBroker(com.tools20022.repository.msg.ConfirmationPartyDetails6 executingBroker) {
		this.executingBroker = executingBroker;
		return this;
	}

	public Optional<ConfirmationPartyDetails3> getAffirmingParty() {
		return affirmingParty == null ? Optional.empty() : Optional.of(affirmingParty);
	}

	public ConfirmationParties4 setAffirmingParty(com.tools20022.repository.msg.ConfirmationPartyDetails3 affirmingParty) {
		this.affirmingParty = affirmingParty;
		return this;
	}

	public Optional<ConfirmationPartyDetails3> getTradeBeneficiaryParty() {
		return tradeBeneficiaryParty == null ? Optional.empty() : Optional.of(tradeBeneficiaryParty);
	}

	public ConfirmationParties4 setTradeBeneficiaryParty(com.tools20022.repository.msg.ConfirmationPartyDetails3 tradeBeneficiaryParty) {
		this.tradeBeneficiaryParty = tradeBeneficiaryParty;
		return this;
	}
}