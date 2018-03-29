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
import com.tools20022.repository.msg.ConfirmationPartyDetails1;
import com.tools20022.repository.msg.ConfirmationPartyDetails2;
import com.tools20022.repository.msg.ConfirmationPartyDetails3;
import com.tools20022.repository.msg.ConfirmationPartyDetails5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConfirmationParties2", propOrder = {"buyer", "borrower", "seller", "lender", "brokerOfCredit", "introducingFirm", "stepInFirm", "stepOutFirm", "clearingFirm", "executingBroker", "cMUParty", "cMUCounterparty",
		"affirmingParty", "tradeBeneficiaryParty"})
public class ConfirmationParties2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>> mmBuyer = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>>() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails2.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails2> getValue(ConfirmationParties2 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails2> value) {
			obj.setBuyer(value.orElse(null));
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>> mmBorrower = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>>() {
		{
			businessComponentTrace_lazy = () -> Borrower.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Brrwr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrower";
			definition = "Party that has applied, met specific requirements, and received a monetary or securities loan from a lender. The party initiating the request signs a promissory note agreeing to pay the lien holder back during a specified timeframe for the entire loan amount plus any additional fees. The borrower is legally responsible for repayment of the loan and is subject to any penalties for not repaying the loan back based on the lending terms agreed upon.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails2.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails2> getValue(ConfirmationParties2 obj) {
			return obj.getBorrower();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails2> value) {
			obj.setBorrower(value.orElse(null));
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>> mmSeller = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>>() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails2.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails2> getValue(ConfirmationParties2 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails2> value) {
			obj.setSeller(value.orElse(null));
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>> mmLender = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails2>>() {
		{
			businessComponentTrace_lazy = () -> Lender.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "Lndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lender";
			definition = "A private, public or institutional entity which makes funds available to others to borrow.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails2.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails2> getValue(ConfirmationParties2 obj) {
			return obj.getLender();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails2> value) {
			obj.setLender(value.orElse(null));
		}
	};
	@XmlElement(name = "BrkrOfCdt")
	protected ConfirmationPartyDetails1 brokerOfCredit;
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmBrokerOfCredit = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			businessComponentTrace_lazy = () -> Broker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "BrkrOfCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Brokerage firm which is the commissioned broker in a multi-broker trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getBrokerOfCredit();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setBrokerOfCredit(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrdcgFirm")
	protected ConfirmationPartyDetails1 introducingFirm;
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmIntroducingFirm = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			businessComponentTrace_lazy = () -> IntroducingFirm.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "IntrdcgFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Broker or other intermediary with the closest association with the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getIntroducingFirm();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setIntroducingFirm(value.orElse(null));
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmStepInFirm = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			businessComponentTrace_lazy = () -> StepInBroker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "StepInFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInFirm";
			definition = "Brokerage firm assigned to take credit on the trade from the step-out brokerage firm.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getStepInFirm();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setStepInFirm(value.orElse(null));
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmStepOutFirm = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			businessComponentTrace_lazy = () -> StepOutBroker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "StepOutFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepOutFirm";
			definition = "Brokerage firm that executes an order, but gives other firms credit and some of the commission for the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getStepOutFirm();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setStepOutFirm(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrFirm")
	protected ConfirmationPartyDetails5 clearingFirm;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails5>> mmClearingFirm = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails5>>() {
		{
			businessComponentTrace_lazy = () -> ClearingBroker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "ClrFirm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingFirm";
			definition = "Party, also know as take up broker, that settles security transactions from another broker for a fee.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails5.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails5> getValue(ConfirmationParties2 obj) {
			return obj.getClearingFirm();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails5> value) {
			obj.setClearingFirm(value.orElse(null));
		}
	};
	@XmlElement(name = "ExctgBrkr")
	protected ConfirmationPartyDetails5 executingBroker;
	/**
	 * 
	 <p>
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
	 * "Party responsible for executing an order (for example, an executing or give-up broker). Usually a commission is charged to the client for executing an order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails5>> mmExecutingBroker = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails5>>() {
		{
			businessComponentTrace_lazy = () -> ExecutingBrokerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "ExctgBrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingBroker";
			definition = "Party responsible for executing an order (for example, an executing or give-up broker). Usually a commission is charged to the client for executing an order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails5.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails5> getValue(ConfirmationParties2 obj) {
			return obj.getExecutingBroker();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails5> value) {
			obj.setExecutingBroker(value.orElse(null));
		}
	};
	@XmlElement(name = "CMUPty")
	protected ConfirmationPartyDetails1 cMUParty;
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmCMUParty = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "CMUPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUParty";
			definition = "Party sending the message to the CMU (Central Matching Utility) to identify the actual business unit as known to the CMU (Central Matching Utility).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getCMUParty();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setCMUParty(value.orElse(null));
		}
	};
	@XmlElement(name = "CMUCtrPty")
	protected ConfirmationPartyDetails1 cMUCounterparty;
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
	 * "Actual business unit of the counterparty to the sender of the message to the CMU (Central Matching Utility) as known to the CMU (Central Matching Utility)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmCMUCounterparty = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "CMUCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUCounterparty";
			definition = "Actual business unit of the counterparty to the sender of the message to the CMU (Central Matching Utility) as known to the CMU (Central Matching Utility).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getCMUCounterparty();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setCMUCounterparty(value.orElse(null));
		}
	};
	@XmlElement(name = "AffrmgPty")
	protected ConfirmationPartyDetails1 affirmingParty;
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
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>> mmAffirmingParty = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails1>>() {
		{
			businessComponentTrace_lazy = () -> AffirmingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "AffrmgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails1.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails1> getValue(ConfirmationParties2 obj) {
			return obj.getAffirmingParty();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails1> value) {
			obj.setAffirmingParty(value.orElse(null));
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
	 * "Party involved in a legal proceeding, agreement or other transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails3>> mmTradeBeneficiaryParty = new MMMessageAttribute<ConfirmationParties2, Optional<ConfirmationPartyDetails3>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationParties2.mmObject();
			isDerived = false;
			xmlTag = "TradBnfcryPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeBeneficiaryParty";
			definition = "Party involved in a legal proceeding, agreement or other transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationPartyDetails3.mmObject();
		}

		@Override
		public Optional<ConfirmationPartyDetails3> getValue(ConfirmationParties2 obj) {
			return obj.getTradeBeneficiaryParty();
		}

		@Override
		public void setValue(ConfirmationParties2 obj, Optional<ConfirmationPartyDetails3> value) {
			obj.setTradeBeneficiaryParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationParties2.mmBuyer, com.tools20022.repository.msg.ConfirmationParties2.mmBorrower,
						com.tools20022.repository.msg.ConfirmationParties2.mmSeller, com.tools20022.repository.msg.ConfirmationParties2.mmLender, com.tools20022.repository.msg.ConfirmationParties2.mmBrokerOfCredit,
						com.tools20022.repository.msg.ConfirmationParties2.mmIntroducingFirm, com.tools20022.repository.msg.ConfirmationParties2.mmStepInFirm, com.tools20022.repository.msg.ConfirmationParties2.mmStepOutFirm,
						com.tools20022.repository.msg.ConfirmationParties2.mmClearingFirm, com.tools20022.repository.msg.ConfirmationParties2.mmExecutingBroker, com.tools20022.repository.msg.ConfirmationParties2.mmCMUParty,
						com.tools20022.repository.msg.ConfirmationParties2.mmCMUCounterparty, com.tools20022.repository.msg.ConfirmationParties2.mmAffirmingParty, com.tools20022.repository.msg.ConfirmationParties2.mmTradeBeneficiaryParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationV01.mmConfirmationParties, SecuritiesTradeConfirmationV02.mmConfirmationParties, SecuritiesEndOfProcessReportV01.mmConfirmationParties,
						SecuritiesTradeConfirmationV03.mmConfirmationParties);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationParties2";
				definition = "Parties used for acting parties that apply either to the whole message or to individual sides.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ConfirmationPartyDetails2> getBuyer() {
		return buyer == null ? Optional.empty() : Optional.of(buyer);
	}

	public ConfirmationParties2 setBuyer(ConfirmationPartyDetails2 buyer) {
		this.buyer = buyer;
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getBorrower() {
		return borrower == null ? Optional.empty() : Optional.of(borrower);
	}

	public ConfirmationParties2 setBorrower(ConfirmationPartyDetails2 borrower) {
		this.borrower = borrower;
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getSeller() {
		return seller == null ? Optional.empty() : Optional.of(seller);
	}

	public ConfirmationParties2 setSeller(ConfirmationPartyDetails2 seller) {
		this.seller = seller;
		return this;
	}

	public Optional<ConfirmationPartyDetails2> getLender() {
		return lender == null ? Optional.empty() : Optional.of(lender);
	}

	public ConfirmationParties2 setLender(ConfirmationPartyDetails2 lender) {
		this.lender = lender;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getBrokerOfCredit() {
		return brokerOfCredit == null ? Optional.empty() : Optional.of(brokerOfCredit);
	}

	public ConfirmationParties2 setBrokerOfCredit(ConfirmationPartyDetails1 brokerOfCredit) {
		this.brokerOfCredit = brokerOfCredit;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getIntroducingFirm() {
		return introducingFirm == null ? Optional.empty() : Optional.of(introducingFirm);
	}

	public ConfirmationParties2 setIntroducingFirm(ConfirmationPartyDetails1 introducingFirm) {
		this.introducingFirm = introducingFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getStepInFirm() {
		return stepInFirm == null ? Optional.empty() : Optional.of(stepInFirm);
	}

	public ConfirmationParties2 setStepInFirm(ConfirmationPartyDetails1 stepInFirm) {
		this.stepInFirm = stepInFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getStepOutFirm() {
		return stepOutFirm == null ? Optional.empty() : Optional.of(stepOutFirm);
	}

	public ConfirmationParties2 setStepOutFirm(ConfirmationPartyDetails1 stepOutFirm) {
		this.stepOutFirm = stepOutFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails5> getClearingFirm() {
		return clearingFirm == null ? Optional.empty() : Optional.of(clearingFirm);
	}

	public ConfirmationParties2 setClearingFirm(ConfirmationPartyDetails5 clearingFirm) {
		this.clearingFirm = clearingFirm;
		return this;
	}

	public Optional<ConfirmationPartyDetails5> getExecutingBroker() {
		return executingBroker == null ? Optional.empty() : Optional.of(executingBroker);
	}

	public ConfirmationParties2 setExecutingBroker(ConfirmationPartyDetails5 executingBroker) {
		this.executingBroker = executingBroker;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getCMUParty() {
		return cMUParty == null ? Optional.empty() : Optional.of(cMUParty);
	}

	public ConfirmationParties2 setCMUParty(ConfirmationPartyDetails1 cMUParty) {
		this.cMUParty = cMUParty;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getCMUCounterparty() {
		return cMUCounterparty == null ? Optional.empty() : Optional.of(cMUCounterparty);
	}

	public ConfirmationParties2 setCMUCounterparty(ConfirmationPartyDetails1 cMUCounterparty) {
		this.cMUCounterparty = cMUCounterparty;
		return this;
	}

	public Optional<ConfirmationPartyDetails1> getAffirmingParty() {
		return affirmingParty == null ? Optional.empty() : Optional.of(affirmingParty);
	}

	public ConfirmationParties2 setAffirmingParty(ConfirmationPartyDetails1 affirmingParty) {
		this.affirmingParty = affirmingParty;
		return this;
	}

	public Optional<ConfirmationPartyDetails3> getTradeBeneficiaryParty() {
		return tradeBeneficiaryParty == null ? Optional.empty() : Optional.of(tradeBeneficiaryParty);
	}

	public ConfirmationParties2 setTradeBeneficiaryParty(ConfirmationPartyDetails3 tradeBeneficiaryParty) {
		this.tradeBeneficiaryParty = tradeBeneficiaryParty;
		return this;
	}
}